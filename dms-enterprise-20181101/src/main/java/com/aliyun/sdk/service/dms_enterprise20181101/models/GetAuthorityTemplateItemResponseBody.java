// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAuthorityTemplateItemResponseBody model) {
            this.authorityTemplateItemList = model.authorityTemplateItemList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.tid = model.tid;
        } 

        /**
         * <p>The permission templates.</p>
         */
        public Builder authorityTemplateItemList(AuthorityTemplateItemList authorityTemplateItemList) {
            this.authorityTemplateItemList = authorityTemplateItemList;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5B96E35F-A58E-5399-9041-09CF9A1E46EA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
         */
        public Builder tid(Long tid) {
            this.tid = tid;
            return this;
        }

        public GetAuthorityTemplateItemResponseBody build() {
            return new GetAuthorityTemplateItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthorityTemplateItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorityTemplateItemResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(AuthorityTemplateItem model) {
                this.attribute = model.attribute;
                this.dbId = model.dbId;
                this.instanceId = model.instanceId;
                this.itemId = model.itemId;
                this.modifierId = model.modifierId;
                this.resourceType = model.resourceType;
                this.tableName = model.tableName;
                this.templateId = model.templateId;
            } 

            /**
             * <p>The additional information. For example, permissions to log on to an instance are added to the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;permissionTypes&quot;: [
             *             &quot;LOGIN&quot;
             *           ]</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The ID of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>43***</p>
             */
            public Builder dbId(Long dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>188****</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>12***</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The ID of the user who modifies the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>51***</p>
             */
            public Builder modifierId(Long modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * <p>The type of the resource. Valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong>: instance</li>
             * <li><strong>LOGIC_DB</strong>: logical database</li>
             * <li><strong>META_DB</strong>: physical database</li>
             * <li><strong>LOGIC_TABLE</strong>: logical table</li>
             * <li><strong>LOGIC_TABLE</strong>: physical table</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>ExampleTable</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The ID of the permission template.</p>
             * 
             * <strong>example:</strong>
             * <p>1563</p>
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
    /**
     * 
     * {@link GetAuthorityTemplateItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthorityTemplateItemResponseBody</p>
     */
    public static class AuthorityTemplateItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorityTemplateItem")
        private java.util.List<AuthorityTemplateItem> authorityTemplateItem;

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
        public java.util.List<AuthorityTemplateItem> getAuthorityTemplateItem() {
            return this.authorityTemplateItem;
        }

        public static final class Builder {
            private java.util.List<AuthorityTemplateItem> authorityTemplateItem; 

            private Builder() {
            } 

            private Builder(AuthorityTemplateItemList model) {
                this.authorityTemplateItem = model.authorityTemplateItem;
            } 

            /**
             * AuthorityTemplateItem.
             */
            public Builder authorityTemplateItem(java.util.List<AuthorityTemplateItem> authorityTemplateItem) {
                this.authorityTemplateItem = authorityTemplateItem;
                return this;
            }

            public AuthorityTemplateItemList build() {
                return new AuthorityTemplateItemList(this);
            } 

        } 

    }
}
