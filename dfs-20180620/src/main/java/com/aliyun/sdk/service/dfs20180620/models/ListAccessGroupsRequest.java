// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dfs20180620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListAccessGroupsRequest</p>
 */
public class ListAccessGroupsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("InputRegionId")
    @Validation(required = true)
    private String inputRegionId;

    @Query
    @NameInMap("Limit")
    @Validation(maximum = 1000, minimum = 1)
    private Integer limit;

    @Query
    @NameInMap("OrderBy")
    private String orderBy;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("StartOffset")
    @Validation(maximum = 100000, minimum = 1)
    private Integer startOffset;

    private ListAccessGroupsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.inputRegionId = builder.inputRegionId;
        this.limit = builder.limit;
        this.orderBy = builder.orderBy;
        this.orderType = builder.orderType;
        this.startOffset = builder.startOffset;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccessGroupsRequest create() {
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
     * @return inputRegionId
     */
    public String getInputRegionId() {
        return this.inputRegionId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return startOffset
     */
    public Integer getStartOffset() {
        return this.startOffset;
    }

    public static final class Builder extends Request.Builder<ListAccessGroupsRequest, Builder> {
        private String regionId; 
        private String inputRegionId; 
        private Integer limit; 
        private String orderBy; 
        private String orderType; 
        private Integer startOffset; 

        private Builder() {
            super();
        } 

        private Builder(ListAccessGroupsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.inputRegionId = request.inputRegionId;
            this.limit = request.limit;
            this.orderBy = request.orderBy;
            this.orderType = request.orderType;
            this.startOffset = request.startOffset;
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
         * InputRegionId.
         */
        public Builder inputRegionId(String inputRegionId) {
            this.putQueryParameter("InputRegionId", inputRegionId);
            this.inputRegionId = inputRegionId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
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
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * StartOffset.
         */
        public Builder startOffset(Integer startOffset) {
            this.putQueryParameter("StartOffset", startOffset);
            this.startOffset = startOffset;
            return this;
        }

        @Override
        public ListAccessGroupsRequest build() {
            return new ListAccessGroupsRequest(this);
        } 

    } 

}
