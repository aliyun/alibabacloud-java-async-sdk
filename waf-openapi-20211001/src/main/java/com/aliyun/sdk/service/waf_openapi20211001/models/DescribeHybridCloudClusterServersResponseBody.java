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
 * {@link DescribeHybridCloudClusterServersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudClusterServersResponseBody</p>
 */
public class DescribeHybridCloudClusterServersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterServers")
    private java.util.List<ClusterServers> clusterServers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudClusterServersResponseBody(Builder builder) {
        this.clusterServers = builder.clusterServers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudClusterServersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterServers
     */
    public java.util.List<ClusterServers> getClusterServers() {
        return this.clusterServers;
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
        private java.util.List<ClusterServers> clusterServers; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudClusterServersResponseBody model) {
            this.clusterServers = model.clusterServers;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * ClusterServers.
         */
        public Builder clusterServers(java.util.List<ClusterServers> clusterServers) {
            this.clusterServers = clusterServers;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudClusterServersResponseBody build() {
            return new DescribeHybridCloudClusterServersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHybridCloudClusterServersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHybridCloudClusterServersResponseBody</p>
     */
    public static class ClusterServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Continents")
        private String continents;

        @com.aliyun.core.annotation.NameInMap("ContinentsValue")
        private Integer continentsValue;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("CustomName")
        private String customName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("HostName")
        private String hostName;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("JobStatus")
        private String jobStatus;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Long memory;

        @com.aliyun.core.annotation.NameInMap("Mid")
        private String mid;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("OperatorValue")
        private Integer operatorValue;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("RegionCodeValue")
        private Integer regionCodeValue;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private ClusterServers(Builder builder) {
            this.continents = builder.continents;
            this.continentsValue = builder.continentsValue;
            this.cpu = builder.cpu;
            this.createTimestamp = builder.createTimestamp;
            this.customName = builder.customName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.hostName = builder.hostName;
            this.ip = builder.ip;
            this.jobStatus = builder.jobStatus;
            this.mac = builder.mac;
            this.memory = builder.memory;
            this.mid = builder.mid;
            this.operator = builder.operator;
            this.operatorValue = builder.operatorValue;
            this.regionCode = builder.regionCode;
            this.regionCodeValue = builder.regionCodeValue;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterServers create() {
            return builder().build();
        }

        /**
         * @return continents
         */
        public String getContinents() {
            return this.continents;
        }

        /**
         * @return continentsValue
         */
        public Integer getContinentsValue() {
            return this.continentsValue;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return customName
         */
        public String getCustomName() {
            return this.customName;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
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
         * @return jobStatus
         */
        public String getJobStatus() {
            return this.jobStatus;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return memory
         */
        public Long getMemory() {
            return this.memory;
        }

        /**
         * @return mid
         */
        public String getMid() {
            return this.mid;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return operatorValue
         */
        public Integer getOperatorValue() {
            return this.operatorValue;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return regionCodeValue
         */
        public Integer getRegionCodeValue() {
            return this.regionCodeValue;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String continents; 
            private Integer continentsValue; 
            private Integer cpu; 
            private Long createTimestamp; 
            private String customName; 
            private Long groupId; 
            private String groupName; 
            private String groupType; 
            private String hostName; 
            private String ip; 
            private String jobStatus; 
            private String mac; 
            private Long memory; 
            private String mid; 
            private String operator; 
            private Integer operatorValue; 
            private String regionCode; 
            private Integer regionCodeValue; 
            private String status; 
            private Long updateTimestamp; 

            private Builder() {
            } 

            private Builder(ClusterServers model) {
                this.continents = model.continents;
                this.continentsValue = model.continentsValue;
                this.cpu = model.cpu;
                this.createTimestamp = model.createTimestamp;
                this.customName = model.customName;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.hostName = model.hostName;
                this.ip = model.ip;
                this.jobStatus = model.jobStatus;
                this.mac = model.mac;
                this.memory = model.memory;
                this.mid = model.mid;
                this.operator = model.operator;
                this.operatorValue = model.operatorValue;
                this.regionCode = model.regionCode;
                this.regionCodeValue = model.regionCodeValue;
                this.status = model.status;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * Continents.
             */
            public Builder continents(String continents) {
                this.continents = continents;
                return this;
            }

            /**
             * ContinentsValue.
             */
            public Builder continentsValue(Integer continentsValue) {
                this.continentsValue = continentsValue;
                return this;
            }

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * CustomName.
             */
            public Builder customName(String customName) {
                this.customName = customName;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
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
             * JobStatus.
             */
            public Builder jobStatus(String jobStatus) {
                this.jobStatus = jobStatus;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(Long memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Mid.
             */
            public Builder mid(String mid) {
                this.mid = mid;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorValue.
             */
            public Builder operatorValue(Integer operatorValue) {
                this.operatorValue = operatorValue;
                return this;
            }

            /**
             * RegionCode.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * RegionCodeValue.
             */
            public Builder regionCodeValue(Integer regionCodeValue) {
                this.regionCodeValue = regionCodeValue;
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
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public ClusterServers build() {
                return new ClusterServers(this);
            } 

        } 

    }
}
