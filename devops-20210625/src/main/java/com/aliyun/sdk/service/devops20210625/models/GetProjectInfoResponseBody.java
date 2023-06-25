// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjectInfoResponseBody</p>
 */
public class GetProjectInfoResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("project")
    private Project project;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetProjectInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.project = builder.project;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectInfoResponseBody create() {
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
        private String errorMessage; 
        private Project project; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * project.
         */
        public Builder project(Project project) {
            this.project = project;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProjectInfoResponseBody build() {
            return new GetProjectInfoResponseBody(this);
        } 

    } 

    public static class Project extends TeaModel {
        @NameInMap("category")
        private String category;

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

        @NameInMap("iconBig")
        private String iconBig;

        @NameInMap("iconGroup")
        private String iconGroup;

        @NameInMap("iconSmall")
        private String iconSmall;

        @NameInMap("id")
        private String id;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("identifierPath")
        private String identifierPath;

        @NameInMap("logicalStatus")
        private String logicalStatus;

        @NameInMap("modifier")
        private String modifier;

        @NameInMap("name")
        private String name;

        @NameInMap("organizationIdentifier")
        private String organizationIdentifier;

        @NameInMap("parentIdentifier")
        private String parentIdentifier;

        @NameInMap("scope")
        private String scope;

        @NameInMap("statusIdentifier")
        private String statusIdentifier;

        @NameInMap("statusStageIdentifier")
        private String statusStageIdentifier;

        @NameInMap("subType")
        private String subType;

        @NameInMap("typeIdentifier")
        private String typeIdentifier;

        private Project(Builder builder) {
            this.category = builder.category;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.customCode = builder.customCode;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.icon = builder.icon;
            this.iconBig = builder.iconBig;
            this.iconGroup = builder.iconGroup;
            this.iconSmall = builder.iconSmall;
            this.id = builder.id;
            this.identifier = builder.identifier;
            this.identifierPath = builder.identifierPath;
            this.logicalStatus = builder.logicalStatus;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.organizationIdentifier = builder.organizationIdentifier;
            this.parentIdentifier = builder.parentIdentifier;
            this.scope = builder.scope;
            this.statusIdentifier = builder.statusIdentifier;
            this.statusStageIdentifier = builder.statusStageIdentifier;
            this.subType = builder.subType;
            this.typeIdentifier = builder.typeIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Project create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return iconBig
         */
        public String getIconBig() {
            return this.iconBig;
        }

        /**
         * @return iconGroup
         */
        public String getIconGroup() {
            return this.iconGroup;
        }

        /**
         * @return iconSmall
         */
        public String getIconSmall() {
            return this.iconSmall;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return identifierPath
         */
        public String getIdentifierPath() {
            return this.identifierPath;
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
         * @return parentIdentifier
         */
        public String getParentIdentifier() {
            return this.parentIdentifier;
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
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return typeIdentifier
         */
        public String getTypeIdentifier() {
            return this.typeIdentifier;
        }

        public static final class Builder {
            private String category; 
            private String categoryIdentifier; 
            private String creator; 
            private String customCode; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String icon; 
            private String iconBig; 
            private String iconGroup; 
            private String iconSmall; 
            private String id; 
            private String identifier; 
            private String identifierPath; 
            private String logicalStatus; 
            private String modifier; 
            private String name; 
            private String organizationIdentifier; 
            private String parentIdentifier; 
            private String scope; 
            private String statusIdentifier; 
            private String statusStageIdentifier; 
            private String subType; 
            private String typeIdentifier; 

            /**
             * category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * categoryIdentifier.
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * customCode.
             */
            public Builder customCode(String customCode) {
                this.customCode = customCode;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * iconBig.
             */
            public Builder iconBig(String iconBig) {
                this.iconBig = iconBig;
                return this;
            }

            /**
             * iconGroup.
             */
            public Builder iconGroup(String iconGroup) {
                this.iconGroup = iconGroup;
                return this;
            }

            /**
             * iconSmall.
             */
            public Builder iconSmall(String iconSmall) {
                this.iconSmall = iconSmall;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * identifierPath.
             */
            public Builder identifierPath(String identifierPath) {
                this.identifierPath = identifierPath;
                return this;
            }

            /**
             * logicalStatus.
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * organizationIdentifier.
             */
            public Builder organizationIdentifier(String organizationIdentifier) {
                this.organizationIdentifier = organizationIdentifier;
                return this;
            }

            /**
             * parentIdentifier.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * statusIdentifier.
             */
            public Builder statusIdentifier(String statusIdentifier) {
                this.statusIdentifier = statusIdentifier;
                return this;
            }

            /**
             * statusStageIdentifier.
             */
            public Builder statusStageIdentifier(String statusStageIdentifier) {
                this.statusStageIdentifier = statusStageIdentifier;
                return this;
            }

            /**
             * subType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * typeIdentifier.
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
