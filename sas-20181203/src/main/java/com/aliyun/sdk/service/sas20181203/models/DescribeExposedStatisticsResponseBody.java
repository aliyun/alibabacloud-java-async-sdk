// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedStatisticsResponseBody</p>
 */
public class DescribeExposedStatisticsResponseBody extends TeaModel {
    @NameInMap("ExposedAsapVulCount")
    private Integer exposedAsapVulCount;

    @NameInMap("ExposedComponentCount")
    private Integer exposedComponentCount;

    @NameInMap("ExposedInstanceCount")
    private Integer exposedInstanceCount;

    @NameInMap("ExposedIpCount")
    private Integer exposedIpCount;

    @NameInMap("ExposedLaterVulCount")
    private Integer exposedLaterVulCount;

    @NameInMap("ExposedNntfVulCount")
    private Integer exposedNntfVulCount;

    @NameInMap("ExposedPortCount")
    private Integer exposedPortCount;

    @NameInMap("ExposedWeekPasswordMachineCount")
    private Integer exposedWeekPasswordMachineCount;

    @NameInMap("GatewayAssetCount")
    private Integer gatewayAssetCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeExposedStatisticsResponseBody(Builder builder) {
        this.exposedAsapVulCount = builder.exposedAsapVulCount;
        this.exposedComponentCount = builder.exposedComponentCount;
        this.exposedInstanceCount = builder.exposedInstanceCount;
        this.exposedIpCount = builder.exposedIpCount;
        this.exposedLaterVulCount = builder.exposedLaterVulCount;
        this.exposedNntfVulCount = builder.exposedNntfVulCount;
        this.exposedPortCount = builder.exposedPortCount;
        this.exposedWeekPasswordMachineCount = builder.exposedWeekPasswordMachineCount;
        this.gatewayAssetCount = builder.gatewayAssetCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExposedStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return exposedAsapVulCount
     */
    public Integer getExposedAsapVulCount() {
        return this.exposedAsapVulCount;
    }

    /**
     * @return exposedComponentCount
     */
    public Integer getExposedComponentCount() {
        return this.exposedComponentCount;
    }

    /**
     * @return exposedInstanceCount
     */
    public Integer getExposedInstanceCount() {
        return this.exposedInstanceCount;
    }

    /**
     * @return exposedIpCount
     */
    public Integer getExposedIpCount() {
        return this.exposedIpCount;
    }

    /**
     * @return exposedLaterVulCount
     */
    public Integer getExposedLaterVulCount() {
        return this.exposedLaterVulCount;
    }

    /**
     * @return exposedNntfVulCount
     */
    public Integer getExposedNntfVulCount() {
        return this.exposedNntfVulCount;
    }

    /**
     * @return exposedPortCount
     */
    public Integer getExposedPortCount() {
        return this.exposedPortCount;
    }

    /**
     * @return exposedWeekPasswordMachineCount
     */
    public Integer getExposedWeekPasswordMachineCount() {
        return this.exposedWeekPasswordMachineCount;
    }

    /**
     * @return gatewayAssetCount
     */
    public Integer getGatewayAssetCount() {
        return this.gatewayAssetCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer exposedAsapVulCount; 
        private Integer exposedComponentCount; 
        private Integer exposedInstanceCount; 
        private Integer exposedIpCount; 
        private Integer exposedLaterVulCount; 
        private Integer exposedNntfVulCount; 
        private Integer exposedPortCount; 
        private Integer exposedWeekPasswordMachineCount; 
        private Integer gatewayAssetCount; 
        private String requestId; 

        /**
         * ExposedAsapVulCount.
         */
        public Builder exposedAsapVulCount(Integer exposedAsapVulCount) {
            this.exposedAsapVulCount = exposedAsapVulCount;
            return this;
        }

        /**
         * ExposedComponentCount.
         */
        public Builder exposedComponentCount(Integer exposedComponentCount) {
            this.exposedComponentCount = exposedComponentCount;
            return this;
        }

        /**
         * ExposedInstanceCount.
         */
        public Builder exposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }

        /**
         * ExposedIpCount.
         */
        public Builder exposedIpCount(Integer exposedIpCount) {
            this.exposedIpCount = exposedIpCount;
            return this;
        }

        /**
         * ExposedLaterVulCount.
         */
        public Builder exposedLaterVulCount(Integer exposedLaterVulCount) {
            this.exposedLaterVulCount = exposedLaterVulCount;
            return this;
        }

        /**
         * ExposedNntfVulCount.
         */
        public Builder exposedNntfVulCount(Integer exposedNntfVulCount) {
            this.exposedNntfVulCount = exposedNntfVulCount;
            return this;
        }

        /**
         * ExposedPortCount.
         */
        public Builder exposedPortCount(Integer exposedPortCount) {
            this.exposedPortCount = exposedPortCount;
            return this;
        }

        /**
         * ExposedWeekPasswordMachineCount.
         */
        public Builder exposedWeekPasswordMachineCount(Integer exposedWeekPasswordMachineCount) {
            this.exposedWeekPasswordMachineCount = exposedWeekPasswordMachineCount;
            return this;
        }

        /**
         * GatewayAssetCount.
         */
        public Builder gatewayAssetCount(Integer gatewayAssetCount) {
            this.gatewayAssetCount = gatewayAssetCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExposedStatisticsResponseBody build() {
            return new DescribeExposedStatisticsResponseBody(this);
        } 

    } 

}
