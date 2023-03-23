// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorityTemplateResponseBody</p>
 */
public class GetAuthorityTemplateResponseBody extends TeaModel {
    @NameInMap("AuthorityTemplateView")
    private AuthorityTemplateView authorityTemplateView;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAuthorityTemplateResponseBody(Builder builder) {
        this.authorityTemplateView = builder.authorityTemplateView;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorityTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityTemplateView
     */
    public AuthorityTemplateView getAuthorityTemplateView() {
        return this.authorityTemplateView;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AuthorityTemplateView authorityTemplateView; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * AuthorityTemplateView.
         */
        public Builder authorityTemplateView(AuthorityTemplateView authorityTemplateView) {
            this.authorityTemplateView = authorityTemplateView;
            return this;
        }

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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAuthorityTemplateResponseBody build() {
            return new GetAuthorityTemplateResponseBody(this);
        } 

    } 

    public static class AuthorityTemplateItem extends TeaModel {
        @NameInMap("Attribute")
        private String attribute;

        @NameInMap("DbId")
        private Long dbId;

        @NameInMap("InstanceId")
        private Long instanceId;

        @NameInMap("ItemId")
        private Long itemId;

        @NameInMap("ModifierId")
        private Long modifierId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TemplateId")
        private Long templateId;

        private AuthorityTemplateItem(Builder builder) {
            this.attribute = builder.attribute;
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.itemId = builder.itemId;
            this.modifierId = builder.modifierId;
            this.resourceType = builder.resourceType;
            this.tableName = builder.tableName;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityTemplateItem create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return dbId
         */
        public Long getDbId() {
            return this.dbId;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return modifierId
         */
        public Long getModifierId() {
            return this.modifierId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String attribute; 
            private Long dbId; 
            private Long instanceId; 
            private Long itemId; 
            private Long modifierId; 
            private String resourceType; 
            private String tableName; 
            private Long templateId; 

            /**
             * Attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * DbId.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(Long modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public AuthorityTemplateItem build() {
                return new AuthorityTemplateItem(this);
            } 

        } 

    }
    public static class AuthorityTemplateItemList extends TeaModel {
        @NameInMap("AuthorityTemplateItem")
        private java.util.List < AuthorityTemplateItem> authorityTemplateItem;

        private AuthorityTemplateItemList(Builder builder) {
            this.authorityTemplateItem = builder.authorityTemplateItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityTemplateItemList create() {
            return builder().build();
        }

        /**
         * @return authorityTemplateItem
         */
        public java.util.List < AuthorityTemplateItem> getAuthorityTemplateItem() {
            return this.authorityTemplateItem;
        }

        public static final class Builder {
            private java.util.List < AuthorityTemplateItem> authorityTemplateItem; 

            /**
             * AuthorityTemplateItem.
             */
            public Builder authorityTemplateItem(java.util.List < AuthorityTemplateItem> authorityTemplateItem) {
                this.authorityTemplateItem = authorityTemplateItem;
                return this;
            }

            public AuthorityTemplateItemList build() {
                return new AuthorityTemplateItemList(this);
            } 

        } 

    }
    public static class AuthorityTemplateView extends TeaModel {
        @NameInMap("AuthorityTemplateItemList")
        private AuthorityTemplateItemList authorityTemplateItemList;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreatorId")
        private Long creatorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("TemplateId")
        private Long templateId;

        private AuthorityTemplateView(Builder builder) {
            this.authorityTemplateItemList = builder.authorityTemplateItemList;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.description = builder.description;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorityTemplateView create() {
            return builder().build();
        }

        /**
         * @return authorityTemplateItemList
         */
        public AuthorityTemplateItemList getAuthorityTemplateItemList() {
            return this.authorityTemplateItemList;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public Long getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private AuthorityTemplateItemList authorityTemplateItemList; 
            private String createTime; 
            private Long creatorId; 
            private String description; 
            private String name; 
            private Long templateId; 

            /**
             * AuthorityTemplateItemList.
             */
            public Builder authorityTemplateItemList(AuthorityTemplateItemList authorityTemplateItemList) {
                this.authorityTemplateItemList = authorityTemplateItemList;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public AuthorityTemplateView build() {
                return new AuthorityTemplateView(this);
            } 

        } 

    }
}
