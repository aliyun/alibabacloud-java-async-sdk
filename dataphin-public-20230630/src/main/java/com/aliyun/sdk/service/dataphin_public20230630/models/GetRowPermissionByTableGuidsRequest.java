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
 * {@link GetRowPermissionByTableGuidsRequest} extends {@link RequestModel}
 *
 * <p>GetRowPermissionByTableGuidsRequest</p>
 */
public class GetRowPermissionByTableGuidsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GetRowPermissionByTableGuidsQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetRowPermissionByTableGuidsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.getRowPermissionByTableGuidsQuery = builder.getRowPermissionByTableGuidsQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRowPermissionByTableGuidsRequest create() {
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
     * @return getRowPermissionByTableGuidsQuery
     */
    public GetRowPermissionByTableGuidsQuery getGetRowPermissionByTableGuidsQuery() {
        return this.getRowPermissionByTableGuidsQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetRowPermissionByTableGuidsRequest, Builder> {
        private String regionId; 
        private GetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetRowPermissionByTableGuidsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.getRowPermissionByTableGuidsQuery = request.getRowPermissionByTableGuidsQuery;
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
        public Builder getRowPermissionByTableGuidsQuery(GetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery) {
            String getRowPermissionByTableGuidsQueryShrink = shrink(getRowPermissionByTableGuidsQuery, "GetRowPermissionByTableGuidsQuery", "json");
            this.putBodyParameter("GetRowPermissionByTableGuidsQuery", getRowPermissionByTableGuidsQueryShrink);
            this.getRowPermissionByTableGuidsQuery = getRowPermissionByTableGuidsQuery;
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
        public GetRowPermissionByTableGuidsRequest build() {
            return new GetRowPermissionByTableGuidsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetRowPermissionByTableGuidsRequest} extends {@link TeaModel}
     *
     * <p>GetRowPermissionByTableGuidsRequest</p>
     */
    public static class GetRowPermissionByTableGuidsQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableGuids")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> tableGuids;

        private GetRowPermissionByTableGuidsQuery(Builder builder) {
            this.tableGuids = builder.tableGuids;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetRowPermissionByTableGuidsQuery create() {
            return builder().build();
        }

        /**
         * @return tableGuids
         */
        public java.util.List<String> getTableGuids() {
            return this.tableGuids;
        }

        public static final class Builder {
            private java.util.List<String> tableGuids; 

            private Builder() {
            } 

            private Builder(GetRowPermissionByTableGuidsQuery model) {
                this.tableGuids = model.tableGuids;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder tableGuids(java.util.List<String> tableGuids) {
                this.tableGuids = tableGuids;
                return this;
            }

            public GetRowPermissionByTableGuidsQuery build() {
                return new GetRowPermissionByTableGuidsQuery(this);
            } 

        } 

    }
}
