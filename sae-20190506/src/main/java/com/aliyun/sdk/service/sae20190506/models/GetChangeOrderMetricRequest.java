// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeOrderMetricRequest} extends {@link RequestModel}
 *
 * <p>GetChangeOrderMetricRequest</p>
 */
public class GetChangeOrderMetricRequest extends Request {
    @Query
    @NameInMap("CreateTime")
    @Validation(required = true)
    private String createTime;

    @Query
    @NameInMap("Limit")
    @Validation(required = true)
    private Long limit;

    @Query
    @NameInMap("OrderBy")
    @Validation(required = true)
    private String orderBy;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private GetChangeOrderMetricRequest(Builder builder) {
        super(builder);
        this.createTime = builder.createTime;
        this.limit = builder.limit;
        this.orderBy = builder.orderBy;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeOrderMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetChangeOrderMetricRequest, Builder> {
        private String createTime; 
        private Long limit; 
        private String orderBy; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetChangeOrderMetricRequest request) {
            super(request);
            this.createTime = request.createTime;
            this.limit = request.limit;
            this.orderBy = request.orderBy;
            this.regionId = request.regionId;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("CreateTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetChangeOrderMetricRequest build() {
            return new GetChangeOrderMetricRequest(this);
        } 

    } 

}
