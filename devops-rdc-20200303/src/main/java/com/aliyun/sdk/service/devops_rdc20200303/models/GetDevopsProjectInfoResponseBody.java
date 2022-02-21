// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetDevopsProjectInfoResponseBody</p>
 */
public class GetDevopsProjectInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("Object")
    private Object object;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Successful")
    private Boolean successful;

    private GetDevopsProjectInfoResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.object = builder.object;
        this.requestId = builder.requestId;
        this.successful = builder.successful;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectInfoResponseBody create() {
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
     * @return object
     */
    public Object getObject() {
        return this.object;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successful
     */
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Object object; 
        private String requestId; 
        private Boolean successful; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Object.
         */
        public Builder object(Object object) {
            this.object = object;
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
         * Successful.
         */
        public Builder successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public GetDevopsProjectInfoResponseBody build() {
            return new GetDevopsProjectInfoResponseBody(this);
        } 

    } 

    public static class Object extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Created")
        private String created;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Customfields")
        private String customfields;

        @NameInMap("DefaultCollectionId")
        private String defaultCollectionId;

        @NameInMap("DefaultRoleId")
        private String defaultRoleId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsArchived")
        private Boolean isArchived;

        @NameInMap("IsDeleted")
        private Boolean isDeleted;

        @NameInMap("IsSuspended")
        private Boolean isSuspended;

        @NameInMap("IsTemplate")
        private Boolean isTemplate;

        @NameInMap("Logo")
        private String logo;

        @NameInMap("ModifierId")
        private String modifierId;

        @NameInMap("Name")
        private String name;

        @NameInMap("NextTaskUniqueId")
        private Integer nextTaskUniqueId;

        @NameInMap("NormalType")
        private String normalType;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("Pinyin")
        private String pinyin;

        @NameInMap("Py")
        private String py;

        @NameInMap("RootCollectionId")
        private String rootCollectionId;

        @NameInMap("SortMethod")
        private String sortMethod;

        @NameInMap("SourceId")
        private String sourceId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("UniqueIdPrefix")
        private String uniqueIdPrefix;

        @NameInMap("Updated")
        private String updated;

        @NameInMap("Visibility")
        private String visibility;

        private Object(Builder builder) {
            this.category = builder.category;
            this.created = builder.created;
            this.creatorId = builder.creatorId;
            this.customfields = builder.customfields;
            this.defaultCollectionId = builder.defaultCollectionId;
            this.defaultRoleId = builder.defaultRoleId;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.id = builder.id;
            this.isArchived = builder.isArchived;
            this.isDeleted = builder.isDeleted;
            this.isSuspended = builder.isSuspended;
            this.isTemplate = builder.isTemplate;
            this.logo = builder.logo;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.nextTaskUniqueId = builder.nextTaskUniqueId;
            this.normalType = builder.normalType;
            this.organizationId = builder.organizationId;
            this.pinyin = builder.pinyin;
            this.py = builder.py;
            this.rootCollectionId = builder.rootCollectionId;
            this.sortMethod = builder.sortMethod;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.startDate = builder.startDate;
            this.uniqueIdPrefix = builder.uniqueIdPrefix;
            this.updated = builder.updated;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Object create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return customfields
         */
        public String getCustomfields() {
            return this.customfields;
        }

        /**
         * @return defaultCollectionId
         */
        public String getDefaultCollectionId() {
            return this.defaultCollectionId;
        }

        /**
         * @return defaultRoleId
         */
        public String getDefaultRoleId() {
            return this.defaultRoleId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isArchived
         */
        public Boolean getIsArchived() {
            return this.isArchived;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return isSuspended
         */
        public Boolean getIsSuspended() {
            return this.isSuspended;
        }

        /**
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return logo
         */
        public String getLogo() {
            return this.logo;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextTaskUniqueId
         */
        public Integer getNextTaskUniqueId() {
            return this.nextTaskUniqueId;
        }

        /**
         * @return normalType
         */
        public String getNormalType() {
            return this.normalType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return pinyin
         */
        public String getPinyin() {
            return this.pinyin;
        }

        /**
         * @return py
         */
        public String getPy() {
            return this.py;
        }

        /**
         * @return rootCollectionId
         */
        public String getRootCollectionId() {
            return this.rootCollectionId;
        }

        /**
         * @return sortMethod
         */
        public String getSortMethod() {
            return this.sortMethod;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return uniqueIdPrefix
         */
        public String getUniqueIdPrefix() {
            return this.uniqueIdPrefix;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String category; 
            private String created; 
            private String creatorId; 
            private String customfields; 
            private String defaultCollectionId; 
            private String defaultRoleId; 
            private String description; 
            private String endDate; 
            private String id; 
            private Boolean isArchived; 
            private Boolean isDeleted; 
            private Boolean isSuspended; 
            private Boolean isTemplate; 
            private String logo; 
            private String modifierId; 
            private String name; 
            private Integer nextTaskUniqueId; 
            private String normalType; 
            private String organizationId; 
            private String pinyin; 
            private String py; 
            private String rootCollectionId; 
            private String sortMethod; 
            private String sourceId; 
            private String sourceType; 
            private String startDate; 
            private String uniqueIdPrefix; 
            private String updated; 
            private String visibility; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Customfields.
             */
            public Builder customfields(String customfields) {
                this.customfields = customfields;
                return this;
            }

            /**
             * DefaultCollectionId.
             */
            public Builder defaultCollectionId(String defaultCollectionId) {
                this.defaultCollectionId = defaultCollectionId;
                return this;
            }

            /**
             * DefaultRoleId.
             */
            public Builder defaultRoleId(String defaultRoleId) {
                this.defaultRoleId = defaultRoleId;
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
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
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
             * IsArchived.
             */
            public Builder isArchived(Boolean isArchived) {
                this.isArchived = isArchived;
                return this;
            }

            /**
             * IsDeleted.
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * IsSuspended.
             */
            public Builder isSuspended(Boolean isSuspended) {
                this.isSuspended = isSuspended;
                return this;
            }

            /**
             * IsTemplate.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * Logo.
             */
            public Builder logo(String logo) {
                this.logo = logo;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
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
             * NextTaskUniqueId.
             */
            public Builder nextTaskUniqueId(Integer nextTaskUniqueId) {
                this.nextTaskUniqueId = nextTaskUniqueId;
                return this;
            }

            /**
             * NormalType.
             */
            public Builder normalType(String normalType) {
                this.normalType = normalType;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * Pinyin.
             */
            public Builder pinyin(String pinyin) {
                this.pinyin = pinyin;
                return this;
            }

            /**
             * Py.
             */
            public Builder py(String py) {
                this.py = py;
                return this;
            }

            /**
             * RootCollectionId.
             */
            public Builder rootCollectionId(String rootCollectionId) {
                this.rootCollectionId = rootCollectionId;
                return this;
            }

            /**
             * SortMethod.
             */
            public Builder sortMethod(String sortMethod) {
                this.sortMethod = sortMethod;
                return this;
            }

            /**
             * SourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * UniqueIdPrefix.
             */
            public Builder uniqueIdPrefix(String uniqueIdPrefix) {
                this.uniqueIdPrefix = uniqueIdPrefix;
                return this;
            }

            /**
             * Updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public Object build() {
                return new Object(this);
            } 

        } 

    }
}
