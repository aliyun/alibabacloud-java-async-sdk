// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribePostpayTrafficDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayTrafficDetailResponseBody</p>
 */
public class DescribePostpayTrafficDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficList")
    private java.util.List<TrafficList> trafficList;

    private DescribePostpayTrafficDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficList = builder.trafficList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficList
     */
    public java.util.List<TrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<TrafficList> trafficList; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0525EADE-C112-5702-A5BC-0E2F6F94DB23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>132</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The statistics on traffic.</p>
         */
        public Builder trafficList(java.util.List<TrafficList> trafficList) {
            this.trafficList = trafficList;
            return this;
        }

        public DescribePostpayTrafficDetailResponseBody build() {
            return new DescribePostpayTrafficDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePostpayTrafficDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePostpayTrafficDetailResponseBody</p>
     */
    public static class TrafficList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InBytes")
        private Long inBytes;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OutBytes")
        private Long outBytes;

        @com.aliyun.core.annotation.NameInMap("ProtectionDuration")
        private Long protectionDuration;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("TotalBytes")
        private Long totalBytes;

        @com.aliyun.core.annotation.NameInMap("TrafficDay")
        private String trafficDay;

        @com.aliyun.core.annotation.NameInMap("TrafficType")
        private String trafficType;

        private TrafficList(Builder builder) {
            this.inBytes = builder.inBytes;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.outBytes = builder.outBytes;
            this.protectionDuration = builder.protectionDuration;
            this.regionNo = builder.regionNo;
            this.resourceId = builder.resourceId;
            this.totalBytes = builder.totalBytes;
            this.trafficDay = builder.trafficDay;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficList create() {
            return builder().build();
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return protectionDuration
         */
        public Long getProtectionDuration() {
            return this.protectionDuration;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return trafficDay
         */
        public String getTrafficDay() {
            return this.trafficDay;
        }

        /**
         * @return trafficType
         */
        public String getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private Long inBytes; 
            private String instanceId; 
            private String instanceType; 
            private Long outBytes; 
            private Long protectionDuration; 
            private String regionNo; 
            private String resourceId; 
            private Long totalBytes; 
            private String trafficDay; 
            private String trafficType; 

            /**
             * <p>The inbound network throughput, which indicates the total number of bytes that are received Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1115096939</p>
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>i-8vb2d7c9mtn0bo9qcraq</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The asset type. This value takes effect only for the Internet firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsPublicIP</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The outbound network throughput, which indicates the total number of bytes that are sent. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100000000</p>
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * <p>Protection duration. Unit: hours.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder protectionDuration(Long protectionDuration) {
                this.protectionDuration = protectionDuration;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The resource ID. The resource ID for the Internet firewall is the public IP address that is protected the Internet firewall, and the resource ID for a NAT firewall is the instance ID of the NAT firewall.</p>
             * 
             * <strong>example:</strong>
             * <p>39.106.146.214</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The total inbound and outbound network throughput, which indicates the total number of bytes that are received and sent. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1215096939</p>
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * <p>The date on which the statistics are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>20231001</p>
             */
            public Builder trafficDay(String trafficDay) {
                this.trafficDay = trafficDay;
                return this;
            }

            /**
             * <p>The traffic type. Valid values:</p>
             * <ul>
             * <li><strong>EIP_TRAFFIC</strong>: traffic for the Internet firewall</li>
             * <li><strong>NatGateway_TRAFFIC</strong>: traffic for NAT firewalls</li>
             * <li><strong>VPC_TRAFFIC</strong>: traffic for VPC firewalls</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>EIP_TRAFFIC</p>
             */
            public Builder trafficType(String trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public TrafficList build() {
                return new TrafficList(this);
            } 

        } 

    }
}
