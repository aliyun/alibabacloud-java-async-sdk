// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEpnMeasurementDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnMeasurementDataRequest</p>
 */
public class DescribeEpnMeasurementDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startDate;

    private DescribeEpnMeasurementDataRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnMeasurementDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<DescribeEpnMeasurementDataRequest, Builder> {
        private String endDate; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnMeasurementDataRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.startDate = request.startDate;
        } 

        /**
         * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-30T16:00:00Z</p>
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. Specify the time in the yyyy-mm-ddthh:mm:ssz format. The time must be in UTC.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T16:00:00Z</p>
         */
        public Builder startDate(String startDate) {
            this.putQueryParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public DescribeEpnMeasurementDataRequest build() {
            return new DescribeEpnMeasurementDataRequest(this);
        } 

    } 

}
