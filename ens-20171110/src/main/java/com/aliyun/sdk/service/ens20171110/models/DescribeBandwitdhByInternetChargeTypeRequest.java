// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwitdhByInternetChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeBandwitdhByInternetChargeTypeRequest</p>
 */
public class DescribeBandwitdhByInternetChargeTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private DescribeBandwitdhByInternetChargeTypeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBandwitdhByInternetChargeTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeBandwitdhByInternetChargeTypeRequest, Builder> {
        private String endTime; 
        private String ensRegionId; 
        private String isp; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBandwitdhByInternetChargeTypeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ensRegionId = request.ensRegionId;
            this.isp = request.isp;
            this.startTime = request.startTime;
        } 

        /**
         * The end of the time range to query.
         * <p>
         * 
         * *   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * *   If the value of the seconds place is not 00, the start time is automatically set to the next minute.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * The Internet service provider (ISP). Valid values:
         * <p>
         * 
         * *   cmcc: China Mobile
         * *   telecom: China Telecom
         * *   unicom: China Unicom
         * *   multiCarrier: multi-line ISP
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * The beginning of the time range to query.
         * <p>
         * 
         * *   Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.
         * *   If the value of the seconds place is not 00, the start time is automatically set to the next minute.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public DescribeBandwitdhByInternetChargeTypeRequest build() {
            return new DescribeBandwitdhByInternetChargeTypeRequest(this);
        } 

    } 

}
