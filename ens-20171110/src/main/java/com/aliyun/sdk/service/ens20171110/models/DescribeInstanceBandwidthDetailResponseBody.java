// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeInstanceBandwidthDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceBandwidthDetailResponseBody</p>
 */
public class DescribeInstanceBandwidthDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bandwidths")
    private java.util.List<Bandwidths> bandwidths;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstanceBandwidthDetailResponseBody(Builder builder) {
        this.bandwidths = builder.bandwidths;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceBandwidthDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bandwidths
     */
    public java.util.List<Bandwidths> getBandwidths() {
        return this.bandwidths;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder {
        private java.util.List<Bandwidths> bandwidths; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeInstanceBandwidthDetailResponseBody model) {
            this.bandwidths = model.bandwidths;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the maximum public bandwidth.</p>
         */
        public Builder bandwidths(java.util.List<Bandwidths> bandwidths) {
            this.bandwidths = bandwidths;
            return this;
        }

        /**
         * <p>The page number of the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C0003E8B-B930-4F59-ADC0-0E209A9012A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstanceBandwidthDetailResponseBody build() {
            return new DescribeInstanceBandwidthDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceBandwidthDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceBandwidthDetailResponseBody</p>
     */
    public static class Bandwidths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliUid")
        private Long aliUid;

        @com.aliyun.core.annotation.NameInMap("BizTime")
        private String bizTime;

        @com.aliyun.core.annotation.NameInMap("EnsRegionId")
        private String ensRegionId;

        @com.aliyun.core.annotation.NameInMap("FlowType")
        private Integer flowType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Isp")
        private String isp;

        @com.aliyun.core.annotation.NameInMap("RxBw")
        private Long rxBw;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("TxBw")
        private Long txBw;

        private Bandwidths(Builder builder) {
            this.aliUid = builder.aliUid;
            this.bizTime = builder.bizTime;
            this.ensRegionId = builder.ensRegionId;
            this.flowType = builder.flowType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.ip = builder.ip;
            this.isp = builder.isp;
            this.rxBw = builder.rxBw;
            this.serviceType = builder.serviceType;
            this.txBw = builder.txBw;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bandwidths create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return bizTime
         */
        public String getBizTime() {
            return this.bizTime;
        }

        /**
         * @return ensRegionId
         */
        public String getEnsRegionId() {
            return this.ensRegionId;
        }

        /**
         * @return flowType
         */
        public Integer getFlowType() {
            return this.flowType;
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
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return isp
         */
        public String getIsp() {
            return this.isp;
        }

        /**
         * @return rxBw
         */
        public Long getRxBw() {
            return this.rxBw;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return txBw
         */
        public Long getTxBw() {
            return this.txBw;
        }

        public static final class Builder {
            private Long aliUid; 
            private String bizTime; 
            private String ensRegionId; 
            private Integer flowType; 
            private String instanceId; 
            private String instanceType; 
            private String ip; 
            private String isp; 
            private Long rxBw; 
            private String serviceType; 
            private Long txBw; 

            private Builder() {
            } 

            private Builder(Bandwidths model) {
                this.aliUid = model.aliUid;
                this.bizTime = model.bizTime;
                this.ensRegionId = model.ensRegionId;
                this.flowType = model.flowType;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.ip = model.ip;
                this.isp = model.isp;
                this.rxBw = model.rxBw;
                this.serviceType = model.serviceType;
                this.txBw = model.txBw;
            } 

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1972653484384661</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>The bandwidth service time. The data granularity is 5 minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-01-11 00:00:00</p>
             */
            public Builder bizTime(String bizTime) {
                this.bizTime = bizTime;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-yichang-2</p>
             */
            public Builder ensRegionId(String ensRegionId) {
                this.ensRegionId = ensRegionId;
                return this;
            }

            /**
             * <p>The type of the bandwidth. Valid values: 1, which indicates public network bandwidth. 2, which indicates internal network bandwidth.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder flowType(Integer flowType) {
                this.flowType = flowType;
                return this;
            }

            /**
             * <p>The plan ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-6ecpqvkicnchxccozrpxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The type of the instance, such as vm, eip, single_tenant, and nc.</p>
             * 
             * <strong>example:</strong>
             * <p>vm</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>203.107.***</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The Internet service provider to which the IP address belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cmcc</p>
             */
            public Builder isp(String isp) {
                this.isp = isp;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>43795230</p>
             */
            public Builder rxBw(Long rxBw) {
                this.rxBw = rxBw;
                return this;
            }

            /**
             * <p>The type of the service, such as vm, eip, esk, and meta.</p>
             * 
             * <strong>example:</strong>
             * <p>vm</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>null</p>
             * 
             * <strong>example:</strong>
             * <p>25415638</p>
             */
            public Builder txBw(Long txBw) {
                this.txBw = txBw;
                return this;
            }

            public Bandwidths build() {
                return new Bandwidths(this);
            } 

        } 

    }
}
