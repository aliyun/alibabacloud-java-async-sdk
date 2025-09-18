// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeHybridCloudSdkServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudSdkServersResponseBody</p>
 */
public class DescribeHybridCloudSdkServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SdkServers")
    private java.util.List<SdkServers> sdkServers;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudSdkServersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sdkServers = builder.sdkServers;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudSdkServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sdkServers
     */
    public java.util.List<SdkServers> getSdkServers() {
        return this.sdkServers;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SdkServers> sdkServers; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudSdkServersResponseBody model) {
            this.requestId = model.requestId;
            this.sdkServers = model.sdkServers;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SdkServers.
         */
        public Builder sdkServers(java.util.List<SdkServers> sdkServers) {
            this.sdkServers = sdkServers;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudSdkServersResponseBody build() {
            return new DescribeHybridCloudSdkServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudSdkServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudSdkServersResponseBody</p>
     */
    public static class SdkServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Mid")
        private String mid;

        @com.aliyun.core.annotation.NameInMap("ProtectionGroupAddress")
        private String protectionGroupAddress;

        @com.aliyun.core.annotation.NameInMap("PullinStatus")
        private String pullinStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private SdkServers(Builder builder) {
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.mid = builder.mid;
            this.protectionGroupAddress = builder.protectionGroupAddress;
            this.pullinStatus = builder.pullinStatus;
            this.resourceId = builder.resourceId;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SdkServers create() {
            return builder().build();
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hostName
         */
        public String getHostName() {
            return this.hostName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return mid
         */
        public String getMid() {
            return this.mid;
        }

        /**
         * @return protectionGroupAddress
         */
        public String getProtectionGroupAddress() {
            return this.protectionGroupAddress;
        }

        /**
         * @return pullinStatus
         */
        public String getPullinStatus() {
            return this.pullinStatus;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String clusterName; 
            private Long createTime; 
            private String hostName; 
            private String ip; 
            private String mid; 
            private String protectionGroupAddress; 
            private String pullinStatus; 
            private String resourceId; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(SdkServers model) {
                this.clusterName = model.clusterName;
                this.createTime = model.createTime;
                this.hostName = model.hostName;
                this.ip = model.ip;
                this.mid = model.mid;
                this.protectionGroupAddress = model.protectionGroupAddress;
                this.pullinStatus = model.pullinStatus;
                this.resourceId = model.resourceId;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HostName.
             */
            public Builder hostName(String hostName) {
                this.hostName = hostName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>SDKID。</p>
             * 
             * <strong>example:</strong>
             * <p>b11327c21790846374051d5d**83c</p>
             */
            public Builder mid(String mid) {
                this.mid = mid;
                return this;
            }

            /**
             * ProtectionGroupAddress.
             */
            public Builder protectionGroupAddress(String protectionGroupAddress) {
                this.protectionGroupAddress = protectionGroupAddress;
                return this;
            }

            /**
             * PullinStatus.
             */
            public Builder pullinStatus(String pullinStatus) {
                this.pullinStatus = pullinStatus;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SdkServers build() {
                return new SdkServers(this);
            } 

        } 

    }
}
