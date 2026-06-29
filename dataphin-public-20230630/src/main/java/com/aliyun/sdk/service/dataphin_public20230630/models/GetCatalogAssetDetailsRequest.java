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
 * {@link GetCatalogAssetDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetCatalogAssetDetailsRequest</p>
 */
public class GetCatalogAssetDetailsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GetCatalogAssetDetailsQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetCatalogAssetDetailsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.getCatalogAssetDetailsQuery = builder.getCatalogAssetDetailsQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCatalogAssetDetailsRequest create() {
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
     * @return getCatalogAssetDetailsQuery
     */
    public GetCatalogAssetDetailsQuery getGetCatalogAssetDetailsQuery() {
        return this.getCatalogAssetDetailsQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetCatalogAssetDetailsRequest, Builder> {
        private String regionId; 
        private GetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetCatalogAssetDetailsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.getCatalogAssetDetailsQuery = request.getCatalogAssetDetailsQuery;
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
         * <p>This parameter is required.</p>
         */
        public Builder getCatalogAssetDetailsQuery(GetCatalogAssetDetailsQuery getCatalogAssetDetailsQuery) {
            String getCatalogAssetDetailsQueryShrink = shrink(getCatalogAssetDetailsQuery, "GetCatalogAssetDetailsQuery", "json");
            this.putBodyParameter("GetCatalogAssetDetailsQuery", getCatalogAssetDetailsQueryShrink);
            this.getCatalogAssetDetailsQuery = getCatalogAssetDetailsQuery;
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
        public GetCatalogAssetDetailsRequest build() {
            return new GetCatalogAssetDetailsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetCatalogAssetDetailsRequest} extends {@link TeaModel}
     *
     * <p>GetCatalogAssetDetailsRequest</p>
     */
    public static class GetCatalogAssetDetailsQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Guid")
        @com.aliyun.core.annotation.Validation(required = true)
        private String guid;

        @com.aliyun.core.annotation.NameInMap("IncludeColumns")
        private Boolean includeColumns;

        @com.aliyun.core.annotation.NameInMap("IncludeDetailedAttributes")
        private Boolean includeDetailedAttributes;

        private GetCatalogAssetDetailsQuery(Builder builder) {
            this.guid = builder.guid;
            this.includeColumns = builder.includeColumns;
            this.includeDetailedAttributes = builder.includeDetailedAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetCatalogAssetDetailsQuery create() {
            return builder().build();
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return includeColumns
         */
        public Boolean getIncludeColumns() {
            return this.includeColumns;
        }

        /**
         * @return includeDetailedAttributes
         */
        public Boolean getIncludeDetailedAttributes() {
            return this.includeDetailedAttributes;
        }

        public static final class Builder {
            private String guid; 
            private Boolean includeColumns; 
            private Boolean includeDetailedAttributes; 

            private Builder() {
            } 

            private Builder(GetCatalogAssetDetailsQuery model) {
                this.guid = model.guid;
                this.includeColumns = model.includeColumns;
                this.includeDetailedAttributes = model.includeDetailedAttributes;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * IncludeColumns.
             */
            public Builder includeColumns(Boolean includeColumns) {
                this.includeColumns = includeColumns;
                return this;
            }

            /**
             * IncludeDetailedAttributes.
             */
            public Builder includeDetailedAttributes(Boolean includeDetailedAttributes) {
                this.includeDetailedAttributes = includeDetailedAttributes;
                return this;
            }

            public GetCatalogAssetDetailsQuery build() {
                return new GetCatalogAssetDetailsQuery(this);
            } 

        } 

    }
}
