// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorityTemplateItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorityTemplateItemResponseBody</p>
 */
public class GetAuthorityTemplateItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityTemplateItemList")
    private AuthorityTemplateItemList authorityTemplateItemList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private GetAuthorityTemplateItemResponseBody(Builder builder) {
        this.authorityTemplateItemList = builder.authorityTemplateItemList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorityTemplateItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorityTemplateItemList
     */
    public AuthorityTemplateItemList getAuthorityTemplateItemList() {
        return this.authorityTemplateItemList;
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

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder {
        private AuthorityTemplateItemList authorityTemplateItemList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long tid; 

        /**
         * The permission templates.
         */
        public Builder authorityTemplateItemList(AuthorityTemplateItemList authorityTemplateItemList) {
            this.authorityTemplateItemList = authorityTemplateItemList;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the tenant.
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        public GetAuthorityTemplateItemResponseBody build() {
            return new GetAuthorityTemplateItemResponseBody(this);
        } 

    } 

    public static class AuthorityTemplateItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("DbId")
        private Long dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private Long modifierId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
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
             * The additional information. For example, permissions to log on to an instance are added to the permission template.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * The ID of the database.
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The ID of the resource.
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * The ID of the user who modifies the resource.
             */
            public Builder modifierId(Long modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * The type of the resource. Valid values:
             * <p>
             * 
             * *   **INSTANCE**: instance
             * *   **LOGIC_DB**: logical database
             * *   **META_DB**: physical database
             * *   **LOGIC_TABLE**: logical table
             * *   **LOGIC_TABLE**: physical table
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The name of the table.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * The ID of the permission template.
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
        @com.aliyun.core.annotation.NameInMap("AuthorityTemplateItem")
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
}
