// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandWidthDataRequest} extends {@link RequestModel}
 *
 * <p>DescribeEpnBandWidthDataRequest</p>
 */
public class DescribeEpnBandWidthDataRequest extends Request {
    @Query
    @NameInMap("EPNInstanceId")
    private String EPNInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("EnsRegionId")
    private String ensRegionId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Isp")
    private String isp;

    @Query
    @NameInMap("NetworkingModel")
    private String networkingModel;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private String period;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeEpnBandWidthDataRequest(Builder builder) {
        super(builder);
        this.EPNInstanceId = builder.EPNInstanceId;
        this.endTime = builder.endTime;
        this.ensRegionId = builder.ensRegionId;
        this.instanceId = builder.instanceId;
        this.isp = builder.isp;
        this.networkingModel = builder.networkingModel;
        this.period = builder.period;
        this.startTime = builder.startTime;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnBandWidthDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return EPNInstanceId
     */
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeEpnBandWidthDataRequest, Builder> {
        private String EPNInstanceId; 
        private String endTime; 
        private String ensRegionId; 
        private String instanceId; 
        private String isp; 
        private String networkingModel; 
        private String period; 
        private String startTime; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEpnBandWidthDataRequest response) {
            super(response);
            this.EPNInstanceId = response.EPNInstanceId;
            this.endTime = response.endTime;
            this.ensRegionId = response.ensRegionId;
            this.instanceId = response.instanceId;
            this.isp = response.isp;
            this.networkingModel = response.networkingModel;
            this.period = response.period;
            this.startTime = response.startTime;
            this.version = response.version;
        } 

        /**
         * EPNInstanceId.
         */
        public Builder EPNInstanceId(String EPNInstanceId) {
            this.putQueryParameter("EPNInstanceId", EPNInstanceId);
            this.EPNInstanceId = EPNInstanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * EnsRegionId.
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
            return this;
        }

        /**
         * NetworkingModel.
         */
        public Builder networkingModel(String networkingModel) {
            this.putQueryParameter("NetworkingModel", networkingModel);
            this.networkingModel = networkingModel;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeEpnBandWidthDataRequest build() {
            return new DescribeEpnBandWidthDataRequest(this);
        } 

    } 

}
