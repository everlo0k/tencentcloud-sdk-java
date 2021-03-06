/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cmq.v20190304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicDetailRequest extends AbstractModel{

    /**
    * Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 目前只支持过滤TopicName ， 且只能填一个过滤值
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * TagKey
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 精确匹配TopicName
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
     * Get Offset 
     * @return Offset Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset
     * @param Offset Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 
     * @return Limit Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit
     * @param Limit Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 目前只支持过滤TopicName ， 且只能填一个过滤值 
     * @return Filters 目前只支持过滤TopicName ， 且只能填一个过滤值
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 目前只支持过滤TopicName ， 且只能填一个过滤值
     * @param Filters 目前只支持过滤TopicName ， 且只能填一个过滤值
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get TagKey 
     * @return TagKey TagKey
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * Set TagKey
     * @param TagKey TagKey
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * Get 精确匹配TopicName 
     * @return TopicName 精确匹配TopicName
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set 精确匹配TopicName
     * @param TopicName 精确匹配TopicName
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);

    }
}

