// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link UpdateAssetAttributesRequest} extends {@link RequestModel}
 *
 * <p>UpdateAssetAttributesRequest</p>
 */
public class UpdateAssetAttributesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateAssetAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAssetAttributesRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateAssetAttributesRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAssetAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.updateCommand = request.updateCommand;
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
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update command.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateAssetAttributesRequest build() {
            return new UpdateAssetAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAssetAttributesRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetAttributesRequest</p>
     */
    public static class AttributeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String attributeCode;

        @com.aliyun.core.annotation.NameInMap("Values")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> values;

        private AttributeList(Builder builder) {
            this.attributeCode = builder.attributeCode;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttributeList create() {
            return builder().build();
        }

        /**
         * @return attributeCode
         */
        public String getAttributeCode() {
            return this.attributeCode;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String attributeCode; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(AttributeList model) {
                this.attributeCode = model.attributeCode;
                this.values = model.values;
            } 

            /**
             * <p>The property code. This value must match the AttributeCode returned by the GetAssetTypeAttributeCodes operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>data_level</p>
             */
            public Builder attributeCode(String attributeCode) {
                this.attributeCode = attributeCode;
                return this;
            }

            /**
             * <p>The list of property values. For a single-value property, pass one element. For a multi-value property, pass multiple elements. Pass an empty array [] to clear the property value.</p>
             * <p>This parameter is required.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public AttributeList build() {
                return new AttributeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAssetAttributesRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetAttributesRequest</p>
     */
    public static class AssetAttributeUpdateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttributeList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<AttributeList> attributeList;

        @com.aliyun.core.annotation.NameInMap("Guid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String guid;

        private AssetAttributeUpdateList(Builder builder) {
            this.attributeList = builder.attributeList;
            this.guid = builder.guid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetAttributeUpdateList create() {
            return builder().build();
        }

        /**
         * @return attributeList
         */
        public java.util.List<AttributeList> getAttributeList() {
            return this.attributeList;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        public static final class Builder {
            private java.util.List<AttributeList> attributeList; 
            private String guid; 

            private Builder() {
            } 

            private Builder(AssetAttributeUpdateList model) {
                this.attributeList = model.attributeList;
                this.guid = model.guid;
            } 

            /**
             * <p>The list of properties to update.</p>
             * <p>This parameter is required.</p>
             */
            public Builder attributeList(java.util.List<AttributeList> attributeList) {
                this.attributeList = attributeList;
                return this;
            }

            /**
             * <p>The globally unique identifier (GUID) of the asset. You can obtain this value by calling operations such as ListCatalogAssets and GetTableColumnByTableGuids.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.project_a.table_orders</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            public AssetAttributeUpdateList build() {
                return new AssetAttributeUpdateList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAssetAttributesRequest} extends {@link TeaModel}
     *
     * <p>UpdateAssetAttributesRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetAttributeUpdateList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<AssetAttributeUpdateList> assetAttributeUpdateList;

        private UpdateCommand(Builder builder) {
            this.assetAttributeUpdateList = builder.assetAttributeUpdateList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return assetAttributeUpdateList
         */
        public java.util.List<AssetAttributeUpdateList> getAssetAttributeUpdateList() {
            return this.assetAttributeUpdateList;
        }

        public static final class Builder {
            private java.util.List<AssetAttributeUpdateList> assetAttributeUpdateList; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.assetAttributeUpdateList = model.assetAttributeUpdateList;
            } 

            /**
             * <p>The list of asset property updates. A maximum of 50 entries can be specified in a single request.</p>
             * <p>This parameter is required.</p>
             */
            public Builder assetAttributeUpdateList(java.util.List<AssetAttributeUpdateList> assetAttributeUpdateList) {
                this.assetAttributeUpdateList = assetAttributeUpdateList;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
