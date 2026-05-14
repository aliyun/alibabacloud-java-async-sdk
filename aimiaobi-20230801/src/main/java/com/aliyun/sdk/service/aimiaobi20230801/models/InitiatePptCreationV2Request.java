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
 * {@link InitiatePptCreationV2Request} extends {@link RequestModel}
 *
 * <p>InitiatePptCreationV2Request</p>
 */
public class InitiatePptCreationV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalUserId")
    private String externalUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsMobile")
    private Boolean isMobile;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Outline")
    private String outline;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptTemplateId")
    private Integer pptTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptTemplateType")
    private Integer pptTemplateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PptTitle")
    private String pptTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProcessType")
    private Integer processType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private InitiatePptCreationV2Request(Builder builder) {
        super(builder);
        this.externalUserId = builder.externalUserId;
        this.isMobile = builder.isMobile;
        this.outline = builder.outline;
        this.pptTemplateId = builder.pptTemplateId;
        this.pptTemplateType = builder.pptTemplateType;
        this.pptTitle = builder.pptTitle;
        this.processType = builder.processType;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitiatePptCreationV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalUserId
     */
    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * @return isMobile
     */
    public Boolean getIsMobile() {
        return this.isMobile;
    }

    /**
     * @return outline
     */
    public String getOutline() {
        return this.outline;
    }

    /**
     * @return pptTemplateId
     */
    public Integer getPptTemplateId() {
        return this.pptTemplateId;
    }

    /**
     * @return pptTemplateType
     */
    public Integer getPptTemplateType() {
        return this.pptTemplateType;
    }

    /**
     * @return pptTitle
     */
    public String getPptTitle() {
        return this.pptTitle;
    }

    /**
     * @return processType
     */
    public Integer getProcessType() {
        return this.processType;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<InitiatePptCreationV2Request, Builder> {
        private String externalUserId; 
        private Boolean isMobile; 
        private String outline; 
        private Integer pptTemplateId; 
        private Integer pptTemplateType; 
        private String pptTitle; 
        private Integer processType; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(InitiatePptCreationV2Request request) {
            super(request);
            this.externalUserId = request.externalUserId;
            this.isMobile = request.isMobile;
            this.outline = request.outline;
            this.pptTemplateId = request.pptTemplateId;
            this.pptTemplateType = request.pptTemplateType;
            this.pptTitle = request.pptTitle;
            this.processType = request.processType;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ExternalUserId.
         */
        public Builder externalUserId(String externalUserId) {
            this.putBodyParameter("ExternalUserId", externalUserId);
            this.externalUserId = externalUserId;
            return this;
        }

        /**
         * IsMobile.
         */
        public Builder isMobile(Boolean isMobile) {
            this.putBodyParameter("IsMobile", isMobile);
            this.isMobile = isMobile;
            return this;
        }

        /**
         * Outline.
         */
        public Builder outline(String outline) {
            this.putBodyParameter("Outline", outline);
            this.outline = outline;
            return this;
        }

        /**
         * PptTemplateId.
         */
        public Builder pptTemplateId(Integer pptTemplateId) {
            this.putBodyParameter("PptTemplateId", pptTemplateId);
            this.pptTemplateId = pptTemplateId;
            return this;
        }

        /**
         * PptTemplateType.
         */
        public Builder pptTemplateType(Integer pptTemplateType) {
            this.putBodyParameter("PptTemplateType", pptTemplateType);
            this.pptTemplateType = pptTemplateType;
            return this;
        }

        /**
         * PptTitle.
         */
        public Builder pptTitle(String pptTitle) {
            this.putBodyParameter("PptTitle", pptTitle);
            this.pptTitle = pptTitle;
            return this;
        }

        /**
         * ProcessType.
         */
        public Builder processType(Integer processType) {
            this.putBodyParameter("ProcessType", processType);
            this.processType = processType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8a7dfece-f204-4380-a7d0-a13d37de3924</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public InitiatePptCreationV2Request build() {
            return new InitiatePptCreationV2Request(this);
        } 

    } 

}
