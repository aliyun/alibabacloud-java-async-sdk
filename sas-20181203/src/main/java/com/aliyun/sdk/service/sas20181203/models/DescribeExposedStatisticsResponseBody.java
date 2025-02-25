// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeExposedStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExposedStatisticsResponseBody</p>
 */
public class DescribeExposedStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExposedAsapVulCount")
    private Integer exposedAsapVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedComponentCount")
    private Integer exposedComponentCount;

    @com.aliyun.core.annotation.NameInMap("ExposedDdsCount")
    private Integer exposedDdsCount;

    @com.aliyun.core.annotation.NameInMap("ExposedEcsCount")
    private Integer exposedEcsCount;

    @com.aliyun.core.annotation.NameInMap("ExposedInstanceCount")
    private Integer exposedInstanceCount;

    @com.aliyun.core.annotation.NameInMap("ExposedIpCount")
    private Integer exposedIpCount;

    @com.aliyun.core.annotation.NameInMap("ExposedKvstoreCount")
    private Integer exposedKvstoreCount;

    @com.aliyun.core.annotation.NameInMap("ExposedLaterVulCount")
    private Integer exposedLaterVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedNntfVulCount")
    private Integer exposedNntfVulCount;

    @com.aliyun.core.annotation.NameInMap("ExposedPortCount")
    private Integer exposedPortCount;

    @com.aliyun.core.annotation.NameInMap("ExposedRdsCount")
    private Integer exposedRdsCount;

    @com.aliyun.core.annotation.NameInMap("ExposedWeekPasswordMachineCount")
    private Integer exposedWeekPasswordMachineCount;

    @com.aliyun.core.annotation.NameInMap("GatewayAssetCount")
    private Integer gatewayAssetCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExposedStatisticsResponseBody(Builder builder) {
        this.exposedAsapVulCount = builder.exposedAsapVulCount;
        this.exposedComponentCount = builder.exposedComponentCount;
        this.exposedDdsCount = builder.exposedDdsCount;
        this.exposedEcsCount = builder.exposedEcsCount;
        this.exposedInstanceCount = builder.exposedInstanceCount;
        this.exposedIpCount = builder.exposedIpCount;
        this.exposedKvstoreCount = builder.exposedKvstoreCount;
        this.exposedLaterVulCount = builder.exposedLaterVulCount;
        this.exposedNntfVulCount = builder.exposedNntfVulCount;
        this.exposedPortCount = builder.exposedPortCount;
        this.exposedRdsCount = builder.exposedRdsCount;
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
     * @return exposedDdsCount
     */
    public Integer getExposedDdsCount() {
        return this.exposedDdsCount;
    }

    /**
     * @return exposedEcsCount
     */
    public Integer getExposedEcsCount() {
        return this.exposedEcsCount;
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
     * @return exposedKvstoreCount
     */
    public Integer getExposedKvstoreCount() {
        return this.exposedKvstoreCount;
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
     * @return exposedRdsCount
     */
    public Integer getExposedRdsCount() {
        return this.exposedRdsCount;
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
        private Integer exposedDdsCount; 
        private Integer exposedEcsCount; 
        private Integer exposedInstanceCount; 
        private Integer exposedIpCount; 
        private Integer exposedKvstoreCount; 
        private Integer exposedLaterVulCount; 
        private Integer exposedNntfVulCount; 
        private Integer exposedPortCount; 
        private Integer exposedRdsCount; 
        private Integer exposedWeekPasswordMachineCount; 
        private Integer gatewayAssetCount; 
        private String requestId; 

        /**
         * <p>The total number of high-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder exposedAsapVulCount(Integer exposedAsapVulCount) {
            this.exposedAsapVulCount = exposedAsapVulCount;
            return this;
        }

        /**
         * <p>The total number of system components that are exposed on the Internet. The components include OpenSSL and OpenSSH.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder exposedComponentCount(Integer exposedComponentCount) {
            this.exposedComponentCount = exposedComponentCount;
            return this;
        }

        /**
         * <p>The number of ApsaraDB for MongoDB instances that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder exposedDdsCount(Integer exposedDdsCount) {
            this.exposedDdsCount = exposedDdsCount;
            return this;
        }

        /**
         * <p>The number of Elastic Compute Service (ECS) instances that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder exposedEcsCount(Integer exposedEcsCount) {
            this.exposedEcsCount = exposedEcsCount;
            return this;
        }

        /**
         * <p>The total number of assets that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder exposedInstanceCount(Integer exposedInstanceCount) {
            this.exposedInstanceCount = exposedInstanceCount;
            return this;
        }

        /**
         * <p>The total number of IP addresses that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder exposedIpCount(Integer exposedIpCount) {
            this.exposedIpCount = exposedIpCount;
            return this;
        }

        /**
         * <p>The number of ApsaraDB for Redis instances that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder exposedKvstoreCount(Integer exposedKvstoreCount) {
            this.exposedKvstoreCount = exposedKvstoreCount;
            return this;
        }

        /**
         * <p>The total number of medium-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder exposedLaterVulCount(Integer exposedLaterVulCount) {
            this.exposedLaterVulCount = exposedLaterVulCount;
            return this;
        }

        /**
         * <p>The total number of low-risk vulnerabilities that are exposed on the Internet and can be exploited by attackers.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder exposedNntfVulCount(Integer exposedNntfVulCount) {
            this.exposedNntfVulCount = exposedNntfVulCount;
            return this;
        }

        /**
         * <p>The total number of ports that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder exposedPortCount(Integer exposedPortCount) {
            this.exposedPortCount = exposedPortCount;
            return this;
        }

        /**
         * <p>The number of ApsaraDB RDS instances that are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder exposedRdsCount(Integer exposedRdsCount) {
            this.exposedRdsCount = exposedRdsCount;
            return this;
        }

        /**
         * <p>The total number of system keys that are detected on your servers and are exposed on the Internet.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder exposedWeekPasswordMachineCount(Integer exposedWeekPasswordMachineCount) {
            this.exposedWeekPasswordMachineCount = exposedWeekPasswordMachineCount;
            return this;
        }

        /**
         * <p>The total number of gateway assets that are exposed on the Internet. The gateway assets include NAT gateways and Server Load Balancer (SLB) instances.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder gatewayAssetCount(Integer gatewayAssetCount) {
            this.gatewayAssetCount = gatewayAssetCount;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4B897D10-B3CD-4A93-A5FA-591F3ED12A86</p>
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
