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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiAnalysisTaskTagOutput  extends AbstractModel{

    /**
    * 视频智能标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisTagItem [] TagSet;

    /**
     * 获取视频智能标签列表。
     * @return TagSet 视频智能标签列表。
     */
    public MediaAiAnalysisTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置视频智能标签列表。
     * @param TagSet 视频智能标签列表。
     */
    public void setTagSet(MediaAiAnalysisTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}
