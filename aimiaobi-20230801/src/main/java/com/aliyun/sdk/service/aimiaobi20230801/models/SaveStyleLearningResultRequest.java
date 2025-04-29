// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveStyleLearningResultRequest} extends {@link RequestModel}
 *
 * <p>SaveStyleLearningResultRequest</p>
 */
public class SaveStyleLearningResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AigcResult")
    private String aigcResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustomTextIdList")
    private java.util.List<Long> customTextIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaterialIdList")
    private java.util.List<Long> materialIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RewriteResult")
    private String rewriteResult;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StyleName")
    private String styleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    private SaveStyleLearningResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.aigcResult = builder.aigcResult;
        this.customTextIdList = builder.customTextIdList;
        this.materialIdList = builder.materialIdList;
        this.rewriteResult = builder.rewriteResult;
        this.styleName = builder.styleName;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveStyleLearningResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return aigcResult
     */
    public String getAigcResult() {
        return this.aigcResult;
    }

    /**
     * @return customTextIdList
     */
    public java.util.List<Long> getCustomTextIdList() {
        return this.customTextIdList;
    }

    /**
     * @return materialIdList
     */
    public java.util.List<Long> getMaterialIdList() {
        return this.materialIdList;
    }

    /**
     * @return rewriteResult
     */
    public String getRewriteResult() {
        return this.rewriteResult;
    }

    /**
     * @return styleName
     */
    public String getStyleName() {
        return this.styleName;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SaveStyleLearningResultRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String aigcResult; 
        private java.util.List<Long> customTextIdList; 
        private java.util.List<Long> materialIdList; 
        private String rewriteResult; 
        private String styleName; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(SaveStyleLearningResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.aigcResult = request.aigcResult;
            this.customTextIdList = request.customTextIdList;
            this.materialIdList = request.materialIdList;
            this.rewriteResult = request.rewriteResult;
            this.styleName = request.styleName;
            this.taskId = request.taskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putBodyParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * AigcResult.
         */
        public Builder aigcResult(String aigcResult) {
            this.putBodyParameter("AigcResult", aigcResult);
            this.aigcResult = aigcResult;
            return this;
        }

        /**
         * CustomTextIdList.
         */
        public Builder customTextIdList(java.util.List<Long> customTextIdList) {
            String customTextIdListShrink = shrink(customTextIdList, "CustomTextIdList", "json");
            this.putBodyParameter("CustomTextIdList", customTextIdListShrink);
            this.customTextIdList = customTextIdList;
            return this;
        }

        /**
         * MaterialIdList.
         */
        public Builder materialIdList(java.util.List<Long> materialIdList) {
            String materialIdListShrink = shrink(materialIdList, "MaterialIdList", "json");
            this.putBodyParameter("MaterialIdList", materialIdListShrink);
            this.materialIdList = materialIdList;
            return this;
        }

        /**
         * RewriteResult.
         */
        public Builder rewriteResult(String rewriteResult) {
            this.putBodyParameter("RewriteResult", rewriteResult);
            this.rewriteResult = rewriteResult;
            return this;
        }

        /**
         * StyleName.
         */
        public Builder styleName(String styleName) {
            this.putBodyParameter("StyleName", styleName);
            this.styleName = styleName;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public SaveStyleLearningResultRequest build() {
            return new SaveStyleLearningResultRequest(this);
        } 

    } 

}
