// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkItemWorkFlowStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkItemWorkFlowStatusResponseBody</p>
 */
public class ListWorkItemWorkFlowStatusResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("statuses")
    private java.util.List < Statuses> statuses;

    @NameInMap("success")
    private Boolean success;

    private ListWorkItemWorkFlowStatusResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.statuses = builder.statuses;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkItemWorkFlowStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statuses
     */
    public java.util.List < Statuses> getStatuses() {
        return this.statuses;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < Statuses> statuses; 
        private Boolean success; 

        /**
         * 错误返回码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误返回信息
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * openapi平台的request id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 工作流状态
         */
        public Builder statuses(java.util.List < Statuses> statuses) {
            this.statuses = statuses;
            return this;
        }

        /**
         * 接口是否正常返回
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListWorkItemWorkFlowStatusResponseBody build() {
            return new ListWorkItemWorkFlowStatusResponseBody(this);
        } 

    } 

    public static class Statuses extends TeaModel {
        @NameInMap("creator")
        private String creator;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("resourceType")
        private String resourceType;

        @NameInMap("source")
        private String source;

        @NameInMap("workflowStageIdentifier")
        private String workflowStageIdentifier;

        @NameInMap("workflowStageName")
        private String workflowStageName;

        private Statuses(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.resourceType = builder.resourceType;
            this.source = builder.source;
            this.workflowStageIdentifier = builder.workflowStageIdentifier;
            this.workflowStageName = builder.workflowStageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statuses create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return workflowStageIdentifier
         */
        public String getWorkflowStageIdentifier() {
            return this.workflowStageIdentifier;
        }

        /**
         * @return workflowStageName
         */
        public String getWorkflowStageName() {
            return this.workflowStageName;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String modifier; 
            private String name; 
            private String resourceType; 
            private String source; 
            private String workflowStageIdentifier; 
            private String workflowStageName; 

            /**
             * 状态的创建人
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 工作流状态id
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 修改人
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * 工作流状态名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 状态作用的资源类型
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * 状态来源
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * 阶段信息-阶段的唯一标识
             */
            public Builder workflowStageIdentifier(String workflowStageIdentifier) {
                this.workflowStageIdentifier = workflowStageIdentifier;
                return this;
            }

            /**
             * 阶段信息-名称
             */
            public Builder workflowStageName(String workflowStageName) {
                this.workflowStageName = workflowStageName;
                return this;
            }

            public Statuses build() {
                return new Statuses(this);
            } 

        } 

    }
}
