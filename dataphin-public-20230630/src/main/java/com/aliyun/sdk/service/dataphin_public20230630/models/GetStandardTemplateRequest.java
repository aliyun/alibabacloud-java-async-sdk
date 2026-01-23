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
 * {@link GetStandardTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetStandardTemplateRequest</p>
 */
public class GetStandardTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterQuery")
    private FilterQuery filterQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Nullable")
    private Boolean nullable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private GetStandardTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filterQuery = builder.filterQuery;
        this.id = builder.id;
        this.nullable = builder.nullable;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStandardTemplateRequest create() {
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
     * @return filterQuery
     */
    public FilterQuery getFilterQuery() {
        return this.filterQuery;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return nullable
     */
    public Boolean getNullable() {
        return this.nullable;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<GetStandardTemplateRequest, Builder> {
        private String regionId; 
        private FilterQuery filterQuery; 
        private Long id; 
        private Boolean nullable; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetStandardTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filterQuery = request.filterQuery;
            this.id = request.id;
            this.nullable = request.nullable;
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
         * FilterQuery.
         */
        public Builder filterQuery(FilterQuery filterQuery) {
            String filterQueryShrink = shrink(filterQuery, "FilterQuery", "json");
            this.putBodyParameter("FilterQuery", filterQueryShrink);
            this.filterQuery = filterQuery;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Nullable.
         */
        public Builder nullable(Boolean nullable) {
            this.putQueryParameter("Nullable", nullable);
            this.nullable = nullable;
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
        public GetStandardTemplateRequest build() {
            return new GetStandardTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetStandardTemplateRequest} extends {@link TeaModel}
     *
     * <p>GetStandardTemplateRequest</p>
     */
    public static class FilterQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private FilterQuery(Builder builder) {
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterQuery create() {
            return builder().build();
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Integer version; 

            private Builder() {
            } 

            private Builder(FilterQuery model) {
                this.version = model.version;
            } 

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public FilterQuery build() {
                return new FilterQuery(this);
            } 

        } 

    }
}
