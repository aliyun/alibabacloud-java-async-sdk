// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExposedStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedStatisticsResponseBody</p>
 */
public class DescribeExposedStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExposedAsapVulCount")
    private Integer exposedAsapVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedComponentCount")
    private Integer exposedComponentCount;

    @com.aliyun.core.annotation.NameInMap("ExposedInstanceCount")
    private Integer exposedInstanceCount;

    @com.aliyun.core.annotation.NameInMap("ExposedIpCount")
    private Integer exposedIpCount;

    @com.aliyun.core.annotation.NameInMap("ExposedLaterVulCount")
    private Integer exposedLaterVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedNntfVulCount")
    private Integer exposedNntfVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedPortCount")
    private Integer exposedPortCount;

    @com.aliyun.core.annotation.NameInMap("ExposedWeekPasswordMachineCount")
    private Integer exposedWeekPasswordMachineCount;

    @com.aliyun.core.annotation.NameInMap("GatewayAssetCount")
    private Integer gatewayAssetCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The total number of high-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.
         */
        public Builder exposedAsapVulCount(Integer exposedAsapVulCount) {
            this.exposedAsapVulCount = exposedAsapVulCount;
            return this;
        }

        /**
         * The total number of system components that are exposed on the Internet. The components include OpenSSL and OpenSSH.
         */
        public Builder exposedComponentCount(Integer exposedComponentCount) {
            this.exposedComponentCount = exposedComponentCount;
            return this;
        }

        /**
         * The total number of servers that are exposed on the Internet.
         */
        public Builder exposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }

        /**
         * The total number of IP addresses that are exposed on the Internet.
         */
        public Builder exposedIpCount(Integer exposedIpCount) {
            this.exposedIpCount = exposedIpCount;
            return this;
        }

        /**
         * The total number of medium-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.
         */
        public Builder exposedLaterVulCount(Integer exposedLaterVulCount) {
            this.exposedLaterVulCount = exposedLaterVulCount;
            return this;
        }

        /**
         * The total number of low-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.
         */
        public Builder exposedNntfVulCount(Integer exposedNntfVulCount) {
            this.exposedNntfVulCount = exposedNntfVulCount;
            return this;
        }

        /**
         * The total number of ports that are exposed on the Internet.
         */
        public Builder exposedPortCount(Integer exposedPortCount) {
            this.exposedPortCount = exposedPortCount;
            return this;
        }

        /**
         * The total number of system keys that are detected on your servers and are exposed on the Internet.
         */
        public Builder exposedWeekPasswordMachineCount(Integer exposedWeekPasswordMachineCount) {
            this.exposedWeekPasswordMachineCount = exposedWeekPasswordMachineCount;
            return this;
        }

        /**
         * The total number of gateway assets that are exposed on the Internet. The gateway assets include NAT gateways and Server Load Balancer (SLB) instances.
         */
        public Builder gatewayAssetCount(Integer gatewayAssetCount) {
            this.gatewayAssetCount = gatewayAssetCount;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
