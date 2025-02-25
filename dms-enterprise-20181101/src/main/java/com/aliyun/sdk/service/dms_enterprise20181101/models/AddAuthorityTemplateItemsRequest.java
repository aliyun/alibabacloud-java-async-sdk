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
 * {@link AddAuthorityTemplateItemsRequest} extends {@link RequestModel}
 *
 * <p>AddAuthorityTemplateItemsRequest</p>
 */
public class AddAuthorityTemplateItemsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Items")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    private AddAuthorityTemplateItemsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.items = builder.items;
        this.templateId = builder.templateId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuthorityTemplateItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AddAuthorityTemplateItemsRequest, Builder> {
        private String regionId; 
        private java.util.List<Items> items; 
        private Long templateId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddAuthorityTemplateItemsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.items = request.items;
            this.templateId = request.templateId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder items(java.util.List<Items> items) {
            String itemsShrink = shrink(items, "Items", "json");
            this.putQueryParameter("Items", itemsShrink);
            this.items = items;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15***</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddAuthorityTemplateItemsRequest build() {
            return new AddAuthorityTemplateItemsRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAuthorityTemplateItemsRequest} extends {@link TeaModel}
     *
     * <p>AddAuthorityTemplateItemsRequest</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbId")
        private Integer dbId;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("PermissionTypes")
        private java.util.List<String> permissionTypes;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Items(Builder builder) {
            this.dbId = builder.dbId;
            this.instanceId = builder.instanceId;
            this.permissionTypes = builder.permissionTypes;
            this.resourceType = builder.resourceType;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return dbId
         */
        public Integer getDbId() {
            return this.dbId;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return permissionTypes
         */
        public java.util.List<String> getPermissionTypes() {
            return this.permissionTypes;
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

        public static final class Builder {
            private Integer dbId; 
            private Integer instanceId; 
            private java.util.List<String> permissionTypes; 
            private String resourceType; 
            private String tableName; 

            /**
             * DbId.
             */
            public Builder dbId(Integer dbId) {
                this.dbId = dbId;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * PermissionTypes.
             */
            public Builder permissionTypes(java.util.List<String> permissionTypes) {
                this.permissionTypes = permissionTypes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>INSTANCE</p>
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
