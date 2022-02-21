// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobAnalyzeResultRequest} extends {@link RequestModel}
 *
 * <p>GetStructSyncJobAnalyzeResultRequest</p>
 */
public class GetStructSyncJobAnalyzeResultRequest extends Request {
    @Query
    @NameInMap("CompareType")
    private String compareType;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true, minimum = 1)
    private Long orderId;

    @Query
    @NameInMap("PageNumber")
    @Validation(minimum = 1)
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private GetStructSyncJobAnalyzeResultRequest(Builder builder) {
        super(builder);
        this.compareType = builder.compareType;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStructSyncJobAnalyzeResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compareType
     */
    public String getCompareType() {
        return this.compareType;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetStructSyncJobAnalyzeResultRequest, Builder> {
        private String compareType; 
        private Long orderId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetStructSyncJobAnalyzeResultRequest response) {
            super(response);
            this.compareType = response.compareType;
            this.orderId = response.orderId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.tid = response.tid;
        } 

        /**
         * CompareType.
         */
        public Builder compareType(String compareType) {
            this.putQueryParameter("CompareType", compareType);
            this.compareType = compareType;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
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
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetStructSyncJobAnalyzeResultRequest build() {
            return new GetStructSyncJobAnalyzeResultRequest(this);
        } 

    } 

}
