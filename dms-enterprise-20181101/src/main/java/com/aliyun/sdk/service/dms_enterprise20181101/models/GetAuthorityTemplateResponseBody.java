// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorityTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorityTemplateResponseBody</p>
 */
public class GetAuthorityTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorityTemplateView")
    private AuthorityTemplateView authorityTemplateView;

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

    private GetAuthorityTemplateResponseBody(Builder builder) {
        this.authorityTemplateView = builder.authorityTemplateView;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tid = builder.tid;
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

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder {
        private AuthorityTemplateView authorityTemplateView; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long tid; 

        /**
         * The details of the permission template.
         */
        public Builder authorityTemplateView(AuthorityTemplateView authorityTemplateView) {
            this.authorityTemplateView = authorityTemplateView;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
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

        public GetAuthorityTemplateResponseBody build() {
            return new GetAuthorityTemplateResponseBody(this);
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
             * Other information. For example, you can add the logon permission on an instance to the permission template.
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
             * The ID of the user who modified the resource.
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
             * *   **SINGLE_TABLE**: physical table
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
    public static class AuthorityTemplateView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorityTemplateItemList")
        private AuthorityTemplateItemList authorityTemplateItemList;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private Long creatorId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
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
             * The resource information in the permission template.
             */
            public Builder authorityTemplateItemList(AuthorityTemplateItemList authorityTemplateItemList) {
                this.authorityTemplateItemList = authorityTemplateItemList;
                return this;
            }

            /**
             * The time when the permission template was created. The time is in the yyyy-MM-DD HH:mm:ss format.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the user who created the permission template.
             */
            public Builder creatorId(Long creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * The description of the permission template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the permission template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the permission template.
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
