// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

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
 * {@link RunNetworkContentAuditRequest} extends {@link RequestModel}
 *
 * <p>RunNetworkContentAuditRequest</p>
 */
public class RunNetworkContentAuditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputFormat")
    private String outputFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("taskDescription")
    private String taskDescription;

    private RunNetworkContentAuditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.businessType = builder.businessType;
        this.content = builder.content;
        this.extraInfo = builder.extraInfo;
        this.modelId = builder.modelId;
        this.outputFormat = builder.outputFormat;
        this.tags = builder.tags;
        this.taskDescription = builder.taskDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunNetworkContentAuditRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return outputFormat
     */
    public String getOutputFormat() {
        return this.outputFormat;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return taskDescription
     */
    public String getTaskDescription() {
        return this.taskDescription;
    }

    public static final class Builder extends Request.Builder<RunNetworkContentAuditRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String businessType; 
        private String content; 
        private String extraInfo; 
        private String modelId; 
        private String outputFormat; 
        private java.util.List<Tags> tags; 
        private String taskDescription; 

        private Builder() {
            super();
        } 

        private Builder(RunNetworkContentAuditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.businessType = request.businessType;
            this.content = request.content;
            this.extraInfo = request.extraInfo;
            this.modelId = request.modelId;
            this.outputFormat = request.outputFormat;
            this.tags = request.tags;
            this.taskDescription = request.taskDescription;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * businessType.
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("businessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>待分析文本</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * extraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("extraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * outputFormat.
         */
        public Builder outputFormat(String outputFormat) {
            this.putBodyParameter("outputFormat", outputFormat);
            this.outputFormat = outputFormat;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putBodyParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * taskDescription.
         */
        public Builder taskDescription(String taskDescription) {
            this.putBodyParameter("taskDescription", taskDescription);
            this.taskDescription = taskDescription;
            return this;
        }

        @Override
        public RunNetworkContentAuditRequest build() {
            return new RunNetworkContentAuditRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunNetworkContentAuditRequest} extends {@link TeaModel}
     *
     * <p>RunNetworkContentAuditRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tagDefinePrompt")
        private String tagDefinePrompt;

        @com.aliyun.core.annotation.NameInMap("tagName")
        private String tagName;

        private Tags(Builder builder) {
            this.tagDefinePrompt = builder.tagDefinePrompt;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagDefinePrompt
         */
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private String tagDefinePrompt; 
            private String tagName; 

            /**
             * tagDefinePrompt.
             */
            public Builder tagDefinePrompt(String tagDefinePrompt) {
                this.tagDefinePrompt = tagDefinePrompt;
                return this;
            }

            /**
             * tagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
