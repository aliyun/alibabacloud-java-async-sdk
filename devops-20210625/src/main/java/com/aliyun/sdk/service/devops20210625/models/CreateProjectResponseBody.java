// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProjectResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProjectResponseBody</p>
 */
public class CreateProjectResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("project")
    private Project project;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private CreateProjectResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.project = builder.project;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return project
     */
    public Project getProject() {
        return this.project;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Project project; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * 项目信息
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateProjectResponseBody build() {
            return new CreateProjectResponseBody(this);
        } 

    } 

    public static class Project extends TeaModel {
        @NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("creator")
        private String creator;

        @NameInMap("customCode")
        private String customCode;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("icon")
        private String icon;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("logicalStatus")
        private String logicalStatus;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("organizationIdentifier")
        private String organizationIdentifier;

        @NameInMap("scope")
        private String scope;

        @NameInMap("statusIdentifier")
        private String statusIdentifier;

        @NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @NameInMap("typeIdentifier")
        private String typeIdentifier;

        private Project(Builder builder) {
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.customCode = builder.customCode;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icon = builder.icon;
            this.identifier = builder.identifier;
            this.logicalStatus = builder.logicalStatus;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.organizationIdentifier = builder.organizationIdentifier;
            this.scope = builder.scope;
            this.statusIdentifier = builder.statusIdentifier;
            this.statusStageIdentifier = builder.statusStageIdentifier;
            this.typeIdentifier = builder.typeIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return customCode
         */
        public String getCustomCode() {
            return this.customCode;
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
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return logicalStatus
         */
        public String getLogicalStatus() {
            return this.logicalStatus;
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
         * @return organizationIdentifier
         */
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return statusIdentifier
         */
        public String getStatusIdentifier() {
            return this.statusIdentifier;
        }

        /**
         * @return statusStageIdentifier
         */
        public String getStatusStageIdentifier() {
            return this.statusStageIdentifier;
        }

        /**
         * @return typeIdentifier
         */
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

        public static final class Builder {
            private String categoryIdentifier; 
            private String creator; 
            private String customCode; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String icon; 
            private String identifier; 
            private String logicalStatus; 
            private String modifier; 
            private String name; 
            private String organizationIdentifier; 
            private String scope; 
            private String statusIdentifier; 
            private String statusStageIdentifier; 
            private String typeIdentifier; 

            /**
             * 空间大类id
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * 创建人id
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * 自定义编号
             */
            public Builder customCode(String customCode) {
                this.customCode = customCode;
                return this;
            }

            /**
             * 描述信息
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
             * 修改时间
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * 图标
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * 项目唯一标识符
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 项目状态
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
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
             * 项目名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 企业id
             */
            public Builder organizationIdentifier(String organizationIdentifier) {
                this.organizationIdentifier = organizationIdentifier;
                return this;
            }

            /**
             * 可见范围
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 状态id
             */
            public Builder statusIdentifier(String statusIdentifier) {
                this.statusIdentifier = statusIdentifier;
                return this;
            }

            /**
             * 状态阶段
             */
            public Builder statusStageIdentifier(String statusStageIdentifier) {
                this.statusStageIdentifier = statusStageIdentifier;
                return this;
            }

            /**
             * 空间小类id
             */
            public Builder typeIdentifier(String typeIdentifier) {
                this.typeIdentifier = typeIdentifier;
                return this;
            }

            public Project build() {
                return new Project(this);
            } 

        } 

    }
}
