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
 * {@link GetBelongAssetMappingRequest} extends {@link RequestModel}
 *
 * <p>GetBelongAssetMappingRequest</p>
 */
public class GetBelongAssetMappingRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssetMappingQuery")
    private AssetMappingQuery assetMappingQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetBelongAssetMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.assetMappingQuery = builder.assetMappingQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBelongAssetMappingRequest create() {
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
     * @return assetMappingQuery
     */
    public AssetMappingQuery getAssetMappingQuery() {
        return this.assetMappingQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetBelongAssetMappingRequest, Builder> {
        private String regionId; 
        private AssetMappingQuery assetMappingQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetBelongAssetMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.assetMappingQuery = request.assetMappingQuery;
            this.opTenantId = request.opTenantId;
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
         * AssetMappingQuery.
         */
        public Builder assetMappingQuery(AssetMappingQuery assetMappingQuery) {
            String assetMappingQueryShrink = shrink(assetMappingQuery, "AssetMappingQuery", "json");
            this.putBodyParameter("AssetMappingQuery", assetMappingQueryShrink);
            this.assetMappingQuery = assetMappingQuery;
            return this;
        }

        /**
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

        @Override
        public GetBelongAssetMappingRequest build() {
            return new GetBelongAssetMappingRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetBelongAssetMappingRequest} extends {@link TeaModel}
     *
     * <p>GetBelongAssetMappingRequest</p>
     */
    public static class AssetMappingQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongGuid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String belongGuid;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        private AssetMappingQuery(Builder builder) {
            this.belongGuid = builder.belongGuid;
            this.relationType = builder.relationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetMappingQuery create() {
            return builder().build();
        }

        /**
         * @return belongGuid
         */
        public String getBelongGuid() {
            return this.belongGuid;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        public static final class Builder {
            private String belongGuid; 
            private String relationType; 

            private Builder() {
            } 

            private Builder(AssetMappingQuery model) {
                this.belongGuid = model.belongGuid;
                this.relationType = model.relationType;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1121</p>
             */
            public Builder belongGuid(String belongGuid) {
                this.belongGuid = belongGuid;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            public AssetMappingQuery build() {
                return new AssetMappingQuery(this);
            } 

        } 

    }
}
