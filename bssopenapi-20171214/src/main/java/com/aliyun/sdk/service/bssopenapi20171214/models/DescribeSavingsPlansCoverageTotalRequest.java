// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSavingsPlansCoverageTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlansCoverageTotalRequest</p>
 */
public class DescribeSavingsPlansCoverageTotalRequest extends Request {
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

    private DescribeSavingsPlansCoverageTotalRequest(Builder builder) {
        super(builder);
        this.billOwnerId = builder.billOwnerId;
        this.endPeriod = builder.endPeriod;
        this.periodType = builder.periodType;
        this.startPeriod = builder.startPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSavingsPlansCoverageTotalRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSavingsPlansCoverageTotalRequest, Builder> {
        private Long billOwnerId; 
        private String endPeriod; 
        private String periodType; 
        private String startPeriod; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSavingsPlansCoverageTotalRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.endPeriod = request.endPeriod;
            this.periodType = request.periodType;
            this.startPeriod = request.startPeriod;
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
        public DescribeSavingsPlansCoverageTotalRequest build() {
            return new DescribeSavingsPlansCoverageTotalRequest(this);
        } 

    } 

}
