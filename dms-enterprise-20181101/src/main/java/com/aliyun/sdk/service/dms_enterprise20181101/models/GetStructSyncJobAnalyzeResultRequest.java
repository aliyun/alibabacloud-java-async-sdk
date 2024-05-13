// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStructSyncJobAnalyzeResultRequest} extends {@link RequestModel}
 *
 * <p>GetStructSyncJobAnalyzeResultRequest</p>
 */
public class GetStructSyncJobAnalyzeResultRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompareType")
    private String compareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetStructSyncJobAnalyzeResultRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.compareType = builder.compareType;
        this.orderId = builder.orderId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetStructSyncJobAnalyzeResultRequest, Builder> {
        private String regionId; 
        private String compareType; 
        private Long orderId; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetStructSyncJobAnalyzeResultRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.compareType = request.compareType;
            this.orderId = request.orderId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.tid = request.tid;
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
         * The type of the comparison. Valid values:
         * <p>
         * 
         * *   **CREATE_TABLE**: compares the created tables.
         * *   **ALTER_TABLE**: compares the modified tables.
         * *   **EQUAL_TABLE**: compares the identical tables.
         * *   **PASS_TABLE**: compares the tables that are skipped during schema synchronization.
         * *   **NOT_COMPARE**: does not compare tables.
         */
        public Builder compareType(String compareType) {
            this.putQueryParameter("CompareType", compareType);
            this.compareType = compareType;
            return this;
        }

        /**
         * The ID of the ticket.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).
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
