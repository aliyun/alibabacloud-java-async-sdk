// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandwitdhByInternetChargeTypeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnBandwitdhByInternetChargeTypeRequest</p>
 */
public class DescribeEpnBandwitdhByInternetChargeTypeRequest extends Request {
    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("NetworkingModel")
    private String networkingModel;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    private DescribeEpnBandwitdhByInternetChargeTypeRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.isp = builder.isp;
        this.networkingModel = builder.networkingModel;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnBandwitdhByInternetChargeTypeRequest create() {
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
     * @return networkingModel
     */
    public String getNetworkingModel() {
        return this.networkingModel;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<DescribeEpnBandwitdhByInternetChargeTypeRequest, Builder> {
        private String endTime; 
        private String ensRegionId; 
        private String isp; 
        private String networkingModel; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnBandwitdhByInternetChargeTypeRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.ensRegionId = request.ensRegionId;
            this.isp = request.isp;
            this.networkingModel = request.networkingModel;
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
         * The ID of the Edge Node Service (ENS) node.
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
         * The networking mode. Valid values:
         * <p>
         * 
         * *   **SpeedUp**: intelligent acceleration network (Internet)
         * *   **Connection**: internal network
         * *   **SpeedUpAndConnection**: intelligent acceleration network and internal network
         */
        public Builder networkingModel(String networkingModel) {
            this.putQueryParameter("NetworkingModel", networkingModel);
            this.networkingModel = networkingModel;
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
        public DescribeEpnBandwitdhByInternetChargeTypeRequest build() {
            return new DescribeEpnBandwitdhByInternetChargeTypeRequest(this);
        } 

    } 

}
