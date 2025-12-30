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
 * {@link GetBizMetricByNameRequest} extends {@link RequestModel}
 *
 * <p>GetBizMetricByNameRequest</p>
 */
public class GetBizMetricByNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizMetricByNameQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private BizMetricByNameQuery bizMetricByNameQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetBizMetricByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizMetricByNameQuery = builder.bizMetricByNameQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBizMetricByNameRequest create() {
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
     * @return bizMetricByNameQuery
     */
    public BizMetricByNameQuery getBizMetricByNameQuery() {
        return this.bizMetricByNameQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetBizMetricByNameRequest, Builder> {
        private String regionId; 
        private BizMetricByNameQuery bizMetricByNameQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetBizMetricByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizMetricByNameQuery = request.bizMetricByNameQuery;
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
        public Builder bizMetricByNameQuery(BizMetricByNameQuery bizMetricByNameQuery) {
            String bizMetricByNameQueryShrink = shrink(bizMetricByNameQuery, "BizMetricByNameQuery", "json");
            this.putBodyParameter("BizMetricByNameQuery", bizMetricByNameQueryShrink);
            this.bizMetricByNameQuery = bizMetricByNameQuery;
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
        public GetBizMetricByNameRequest build() {
            return new GetBizMetricByNameRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetBizMetricByNameRequest} extends {@link TeaModel}
     *
     * <p>GetBizMetricByNameRequest</p>
     */
    public static class BizMetricByNameQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Draft")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean draft;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private BizMetricByNameQuery(Builder builder) {
            this.draft = builder.draft;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizMetricByNameQuery create() {
            return builder().build();
        }

        /**
         * @return draft
         */
        public Boolean getDraft() {
            return this.draft;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean draft; 
            private String name; 

            private Builder() {
            } 

            private Builder(BizMetricByNameQuery model) {
                this.draft = model.draft;
                this.name = model.name;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder draft(Boolean draft) {
                this.draft = draft;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Metric1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public BizMetricByNameQuery build() {
                return new BizMetricByNameQuery(this);
            } 

        } 

    }
}
