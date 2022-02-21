// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceUsageTotalRequest</p>
 */
public class DescribeResourceUsageTotalRequest extends Request {
    @Query
    @NameInMap("BillOwnerId")
    @Validation()
    private Long billOwnerId;

    @Query
    @NameInMap("EndPeriod")
    private String endPeriod;

    @Query
    @NameInMap("PeriodType")
    @Validation(required = true)
    private String periodType;

    @Query
    @NameInMap("ResourceType")
    @Validation(required = true)
    private String resourceType;

    @Query
    @NameInMap("StartPeriod")
    @Validation(required = true)
    private String startPeriod;

    private DescribeResourceUsageTotalRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.periodType = builder.periodType;
        this.resourceType = builder.resourceType;
        this.startPeriod = builder.startPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageTotalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billOwnerId
     */
    public Long getBillOwnerId() {
        return this.billOwnerId;
    }

    /**
     * @return endPeriod
     */
    public String getEndPeriod() {
        return this.endPeriod;
    }

    /**
     * @return periodType
     */
    public String getPeriodType() {
        return this.periodType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startPeriod
     */
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static final class Builder extends Request.Builder<DescribeResourceUsageTotalRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private String periodType; 
        private String resourceType; 
        private String startPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceUsageTotalRequest response) {
            super(response);
            this.billOwnerId = response.billOwnerId;
            this.endPeriod = response.endPeriod;
            this.periodType = response.periodType;
            this.resourceType = response.resourceType;
            this.startPeriod = response.startPeriod;
        } 

        /**
         * BillOwnerId.
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * EndPeriod.
         */
        public Builder endPeriod(String endPeriod) {
            this.putQueryParameter("EndPeriod", endPeriod);
            this.endPeriod = endPeriod;
            return this;
        }

        /**
         * PeriodType.
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartPeriod.
         */
        public Builder startPeriod(String startPeriod) {
            this.putQueryParameter("StartPeriod", startPeriod);
            this.startPeriod = startPeriod;
            return this;
        }

        @Override
        public DescribeResourceUsageTotalRequest build() {
            return new DescribeResourceUsageTotalRequest(this);
        } 

    } 

}
