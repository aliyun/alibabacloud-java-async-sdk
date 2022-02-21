// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjextByIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetProjextByIdResponseBody</p>
 */
public class GetProjextByIdResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private GetProjextByIdResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjextByIdResponseBody create() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
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
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetProjextByIdResponseBody build() {
            return new GetProjextByIdResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CategoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("CustomCode")
        private String customCode;

        @NameInMap("Description")
        private String description;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("IconBig")
        private String iconBig;

        @NameInMap("IconGroup")
        private String iconGroup;

        @NameInMap("IconSmall")
        private String iconSmall;

        @NameInMap("Id")
        private String id;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("IdentifierPath")
        private String identifierPath;

        @NameInMap("LogicalStatus")
        private String logicalStatus;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("Name")
        private String name;

        @NameInMap("OrganizationIdentifier")
        private String organizationIdentifier;

        @NameInMap("ParentIdentifier")
        private String parentIdentifier;

        @NameInMap("Scope")
        private String scope;

        @NameInMap("StatusIdentifier")
        private String statusIdentifier;

        @NameInMap("StatusStageIdentifier")
        private String statusStageIdentifier;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("TypeIdentifier")
        private String typeIdentifier;

        private Result(Builder builder) {
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

        public static Result create() {
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
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CategoryIdentifier.
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CustomCode.
             */
            public Builder customCode(String customCode) {
                this.customCode = customCode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * IconBig.
             */
            public Builder iconBig(String iconBig) {
                this.iconBig = iconBig;
                return this;
            }

            /**
             * IconGroup.
             */
            public Builder iconGroup(String iconGroup) {
                this.iconGroup = iconGroup;
                return this;
            }

            /**
             * IconSmall.
             */
            public Builder iconSmall(String iconSmall) {
                this.iconSmall = iconSmall;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * IdentifierPath.
             */
            public Builder identifierPath(String identifierPath) {
                this.identifierPath = identifierPath;
                return this;
            }

            /**
             * LogicalStatus.
             */
            public Builder logicalStatus(String logicalStatus) {
                this.logicalStatus = logicalStatus;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OrganizationIdentifier.
             */
            public Builder organizationIdentifier(String organizationIdentifier) {
                this.organizationIdentifier = organizationIdentifier;
                return this;
            }

            /**
             * ParentIdentifier.
             */
            public Builder parentIdentifier(String parentIdentifier) {
                this.parentIdentifier = parentIdentifier;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * StatusIdentifier.
             */
            public Builder statusIdentifier(String statusIdentifier) {
                this.statusIdentifier = statusIdentifier;
                return this;
            }

            /**
             * StatusStageIdentifier.
             */
            public Builder statusStageIdentifier(String statusStageIdentifier) {
                this.statusStageIdentifier = statusStageIdentifier;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * TypeIdentifier.
             */
            public Builder typeIdentifier(String typeIdentifier) {
                this.typeIdentifier = typeIdentifier;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
