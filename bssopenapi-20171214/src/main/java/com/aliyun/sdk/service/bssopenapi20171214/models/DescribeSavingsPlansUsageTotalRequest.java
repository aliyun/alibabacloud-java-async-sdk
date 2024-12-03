// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSavingsPlansUsageTotalRequest} extends {@link RequestModel}
 *
 * <p>DescribeSavingsPlansUsageTotalRequest</p>
 */
public class DescribeSavingsPlansUsageTotalRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillOwnerId")
    @com.aliyun.core.annotation.Validation()
    private Long billOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndPeriod")
    private String endPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PeriodType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String periodType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeSavingsPlansUsageTotalRequest request) {
            super(request);
            this.billOwnerId = request.billOwnerId;
            this.endPeriod = request.endPeriod;
            this.periodType = request.periodType;
            this.startPeriod = request.startPeriod;
        } 

        /**
         * <p>The ID of the account for which you want to query usage summary. If you do not set this parameter, the data of the current Alibaba Cloud account and its RAM users is queried. To query the data of a RAM user, specify the ID of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>123745698925000</p>
         */
        public Builder billOwnerId(Long billOwnerId) {
            this.putQueryParameter("BillOwnerId", billOwnerId);
            this.billOwnerId = billOwnerId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The end is excluded from the time range. If you do not set this parameter, the end time is the current time. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-02 00:00:00</p>
         */
        public Builder endPeriod(String endPeriod) {
            this.putQueryParameter("EndPeriod", endPeriod);
            this.endPeriod = endPeriod;
            return this;
        }

        /**
         * <p>The time granularity at which usage summary are queried. Valid values: MONTH, DAY, and HOUR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOUR</p>
         */
        public Builder periodType(String periodType) {
            this.putQueryParameter("PeriodType", periodType);
            this.periodType = periodType;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The beginning is included in the time range. Specify the time in the format of yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-01 00:00:00</p>
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
