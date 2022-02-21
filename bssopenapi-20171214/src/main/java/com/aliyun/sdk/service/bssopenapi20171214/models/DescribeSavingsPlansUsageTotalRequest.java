// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansUsageTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlansUsageTotalRequest</p>
 */
public class DescribeSavingsPlansUsageTotalRequest extends Request {
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
    @NameInMap("StartPeriod")
    @Validation(required = true)
    private String startPeriod;

    private DescribeSavingsPlansUsageTotalRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.periodType = builder.periodType;
        this.startPeriod = builder.startPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansUsageTotalRequest create() {
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
     * @return startPeriod
     */
    public String getStartPeriod() {
        return this.startPeriod;
    }

    public static final class Builder extends Request.Builder<DescribeSavingsPlansUsageTotalRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private String periodType; 
        private String startPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSavingsPlansUsageTotalRequest response) {
            super(response);
            this.billOwnerId = response.billOwnerId;
            this.endPeriod = response.endPeriod;
            this.periodType = response.periodType;
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
         * StartPeriod.
         */
        public Builder startPeriod(String startPeriod) {
            this.putQueryParameter("StartPeriod", startPeriod);
            this.startPeriod = startPeriod;
            return this;
        }

        @Override
        public DescribeSavingsPlansUsageTotalRequest build() {
            return new DescribeSavingsPlansUsageTotalRequest(this);
        } 

    } 

}
