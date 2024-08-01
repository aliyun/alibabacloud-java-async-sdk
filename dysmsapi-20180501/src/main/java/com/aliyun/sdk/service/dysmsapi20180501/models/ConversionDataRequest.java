// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ConversionDataRequest} extends {@link RequestModel}
 *
 * <p>ConversionDataRequest</p>
 */
public class ConversionDataRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversionRate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversionRate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportTime")
    private Long reportTime;

    private ConversionDataRequest(Builder builder) {
        super(builder);
        this.conversionRate = builder.conversionRate;
        this.reportTime = builder.reportTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConversionDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversionRate
     */
    public String getConversionRate() {
        return this.conversionRate;
    }

    /**
     * @return reportTime
     */
    public Long getReportTime() {
        return this.reportTime;
    }

    public static final class Builder extends Request.Builder<ConversionDataRequest, Builder> {
        private String conversionRate; 
        private Long reportTime; 

        private Builder() {
            super();
        } 

        private Builder(ConversionDataRequest request) {
            super(request);
            this.conversionRate = request.conversionRate;
            this.reportTime = request.reportTime;
        } 

        /**
         * Conversion rate monitoring return value.
         * <p>
         * 
         * >  The value of this parameter is of type double, and the value is between \[0,1].
         */
        public Builder conversionRate(String conversionRate) {
            this.putBodyParameter("ConversionRate", conversionRate);
            this.conversionRate = conversionRate;
            return this;
        }

        /**
         * Timestamp of the conversion rate observation should be a Unix timestamp, a millisecond-level long integer.
         * <p>
         * 
         * >  If this field is not specified: the current timestamp is the default.
         */
        public Builder reportTime(Long reportTime) {
            this.putBodyParameter("ReportTime", reportTime);
            this.reportTime = reportTime;
            return this;
        }

        @Override
        public ConversionDataRequest build() {
            return new ConversionDataRequest(this);
        } 

    } 

}
