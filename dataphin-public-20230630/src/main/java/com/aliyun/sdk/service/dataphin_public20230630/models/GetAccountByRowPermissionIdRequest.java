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
 * {@link GetAccountByRowPermissionIdRequest} extends {@link RequestModel}
 *
 * <p>GetAccountByRowPermissionIdRequest</p>
 */
public class GetAccountByRowPermissionIdRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GetAccountByRowPermissionIdQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private GetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetAccountByRowPermissionIdRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.getAccountByRowPermissionIdQuery = builder.getAccountByRowPermissionIdQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountByRowPermissionIdRequest create() {
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
     * @return getAccountByRowPermissionIdQuery
     */
    public GetAccountByRowPermissionIdQuery getGetAccountByRowPermissionIdQuery() {
        return this.getAccountByRowPermissionIdQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetAccountByRowPermissionIdRequest, Builder> {
        private String regionId; 
        private GetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetAccountByRowPermissionIdRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.getAccountByRowPermissionIdQuery = request.getAccountByRowPermissionIdQuery;
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
        public Builder getAccountByRowPermissionIdQuery(GetAccountByRowPermissionIdQuery getAccountByRowPermissionIdQuery) {
            String getAccountByRowPermissionIdQueryShrink = shrink(getAccountByRowPermissionIdQuery, "GetAccountByRowPermissionIdQuery", "json");
            this.putBodyParameter("GetAccountByRowPermissionIdQuery", getAccountByRowPermissionIdQueryShrink);
            this.getAccountByRowPermissionIdQuery = getAccountByRowPermissionIdQuery;
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
        public GetAccountByRowPermissionIdRequest build() {
            return new GetAccountByRowPermissionIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountByRowPermissionIdRequest} extends {@link TeaModel}
     *
     * <p>GetAccountByRowPermissionIdRequest</p>
     */
    public static class GetAccountByRowPermissionIdQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RowPermissionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long rowPermissionId;

        @com.aliyun.core.annotation.NameInMap("RuleIds")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Long> ruleIds;

        private GetAccountByRowPermissionIdQuery(Builder builder) {
            this.rowPermissionId = builder.rowPermissionId;
            this.ruleIds = builder.ruleIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GetAccountByRowPermissionIdQuery create() {
            return builder().build();
        }

        /**
         * @return rowPermissionId
         */
        public Long getRowPermissionId() {
            return this.rowPermissionId;
        }

        /**
         * @return ruleIds
         */
        public java.util.List<Long> getRuleIds() {
            return this.ruleIds;
        }

        public static final class Builder {
            private Long rowPermissionId; 
            private java.util.List<Long> ruleIds; 

            private Builder() {
            } 

            private Builder(GetAccountByRowPermissionIdQuery model) {
                this.rowPermissionId = model.rowPermissionId;
                this.ruleIds = model.ruleIds;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>300001234</p>
             */
            public Builder rowPermissionId(Long rowPermissionId) {
                this.rowPermissionId = rowPermissionId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder ruleIds(java.util.List<Long> ruleIds) {
                this.ruleIds = ruleIds;
                return this;
            }

            public GetAccountByRowPermissionIdQuery build() {
                return new GetAccountByRowPermissionIdQuery(this);
            } 

        } 

    }
}
