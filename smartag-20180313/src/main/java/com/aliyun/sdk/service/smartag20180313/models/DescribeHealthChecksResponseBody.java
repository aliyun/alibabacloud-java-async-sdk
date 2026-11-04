// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeHealthChecksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHealthChecksResponseBody</p>
 */
public class DescribeHealthChecksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HealthChecks")
    private HealthChecks healthChecks;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHealthChecksResponseBody(Builder builder) {
        this.healthChecks = builder.healthChecks;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHealthChecksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return healthChecks
     */
    public HealthChecks getHealthChecks() {
        return this.healthChecks;
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
        private HealthChecks healthChecks; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeHealthChecksResponseBody model) {
            this.healthChecks = model.healthChecks;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * HealthChecks.
         */
        public Builder healthChecks(HealthChecks healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }

        /**
         * <p>The page number of the returned page. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Default value: <strong>10</strong>. Maximum value: <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B275FE6-FC86-4921-BC70-1B3DF68B078F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHealthChecksResponseBody build() {
            return new DescribeHealthChecksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHealthChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthChecksResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DstIpAddr")
        private String dstIpAddr;

        @com.aliyun.core.annotation.NameInMap("DstPort")
        private Integer dstPort;

        @com.aliyun.core.annotation.NameInMap("FailCountThreshold")
        private Integer failCountThreshold;

        @com.aliyun.core.annotation.NameInMap("HcInstanceId")
        private String hcInstanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProbeCount")
        private Integer probeCount;

        @com.aliyun.core.annotation.NameInMap("ProbeInterval")
        private Integer probeInterval;

        @com.aliyun.core.annotation.NameInMap("ProbeTimeout")
        private Integer probeTimeout;

        @com.aliyun.core.annotation.NameInMap("RelationCount")
        private Integer relationCount;

        @com.aliyun.core.annotation.NameInMap("RttFailThreshold")
        private Integer rttFailThreshold;

        @com.aliyun.core.annotation.NameInMap("RttThreshold")
        private Integer rttThreshold;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        @com.aliyun.core.annotation.NameInMap("SrcIpAddr")
        private String srcIpAddr;

        @com.aliyun.core.annotation.NameInMap("SrcPort")
        private Integer srcPort;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HealthCheck(Builder builder) {
            this.description = builder.description;
            this.dstIpAddr = builder.dstIpAddr;
            this.dstPort = builder.dstPort;
            this.failCountThreshold = builder.failCountThreshold;
            this.hcInstanceId = builder.hcInstanceId;
            this.name = builder.name;
            this.probeCount = builder.probeCount;
            this.probeInterval = builder.probeInterval;
            this.probeTimeout = builder.probeTimeout;
            this.relationCount = builder.relationCount;
            this.rttFailThreshold = builder.rttFailThreshold;
            this.rttThreshold = builder.rttThreshold;
            this.smartAGId = builder.smartAGId;
            this.srcIpAddr = builder.srcIpAddr;
            this.srcPort = builder.srcPort;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dstIpAddr
         */
        public String getDstIpAddr() {
            return this.dstIpAddr;
        }

        /**
         * @return dstPort
         */
        public Integer getDstPort() {
            return this.dstPort;
        }

        /**
         * @return failCountThreshold
         */
        public Integer getFailCountThreshold() {
            return this.failCountThreshold;
        }

        /**
         * @return hcInstanceId
         */
        public String getHcInstanceId() {
            return this.hcInstanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return probeCount
         */
        public Integer getProbeCount() {
            return this.probeCount;
        }

        /**
         * @return probeInterval
         */
        public Integer getProbeInterval() {
            return this.probeInterval;
        }

        /**
         * @return probeTimeout
         */
        public Integer getProbeTimeout() {
            return this.probeTimeout;
        }

        /**
         * @return relationCount
         */
        public Integer getRelationCount() {
            return this.relationCount;
        }

        /**
         * @return rttFailThreshold
         */
        public Integer getRttFailThreshold() {
            return this.rttFailThreshold;
        }

        /**
         * @return rttThreshold
         */
        public Integer getRttThreshold() {
            return this.rttThreshold;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        /**
         * @return srcIpAddr
         */
        public String getSrcIpAddr() {
            return this.srcIpAddr;
        }

        /**
         * @return srcPort
         */
        public Integer getSrcPort() {
            return this.srcPort;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String dstIpAddr; 
            private Integer dstPort; 
            private Integer failCountThreshold; 
            private String hcInstanceId; 
            private String name; 
            private Integer probeCount; 
            private Integer probeInterval; 
            private Integer probeTimeout; 
            private Integer relationCount; 
            private Integer rttFailThreshold; 
            private Integer rttThreshold; 
            private String smartAGId; 
            private String srcIpAddr; 
            private Integer srcPort; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.description = model.description;
                this.dstIpAddr = model.dstIpAddr;
                this.dstPort = model.dstPort;
                this.failCountThreshold = model.failCountThreshold;
                this.hcInstanceId = model.hcInstanceId;
                this.name = model.name;
                this.probeCount = model.probeCount;
                this.probeInterval = model.probeInterval;
                this.probeTimeout = model.probeTimeout;
                this.relationCount = model.relationCount;
                this.rttFailThreshold = model.rttFailThreshold;
                this.rttThreshold = model.rttThreshold;
                this.smartAGId = model.smartAGId;
                this.srcIpAddr = model.srcIpAddr;
                this.srcPort = model.srcPort;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DstIpAddr.
             */
            public Builder dstIpAddr(String dstIpAddr) {
                this.dstIpAddr = dstIpAddr;
                return this;
            }

            /**
             * DstPort.
             */
            public Builder dstPort(Integer dstPort) {
                this.dstPort = dstPort;
                return this;
            }

            /**
             * FailCountThreshold.
             */
            public Builder failCountThreshold(Integer failCountThreshold) {
                this.failCountThreshold = failCountThreshold;
                return this;
            }

            /**
             * HcInstanceId.
             */
            public Builder hcInstanceId(String hcInstanceId) {
                this.hcInstanceId = hcInstanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProbeCount.
             */
            public Builder probeCount(Integer probeCount) {
                this.probeCount = probeCount;
                return this;
            }

            /**
             * ProbeInterval.
             */
            public Builder probeInterval(Integer probeInterval) {
                this.probeInterval = probeInterval;
                return this;
            }

            /**
             * ProbeTimeout.
             */
            public Builder probeTimeout(Integer probeTimeout) {
                this.probeTimeout = probeTimeout;
                return this;
            }

            /**
             * RelationCount.
             */
            public Builder relationCount(Integer relationCount) {
                this.relationCount = relationCount;
                return this;
            }

            /**
             * RttFailThreshold.
             */
            public Builder rttFailThreshold(Integer rttFailThreshold) {
                this.rttFailThreshold = rttFailThreshold;
                return this;
            }

            /**
             * RttThreshold.
             */
            public Builder rttThreshold(Integer rttThreshold) {
                this.rttThreshold = rttThreshold;
                return this;
            }

            /**
             * SmartAGId.
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            /**
             * SrcIpAddr.
             */
            public Builder srcIpAddr(String srcIpAddr) {
                this.srcIpAddr = srcIpAddr;
                return this;
            }

            /**
             * SrcPort.
             */
            public Builder srcPort(Integer srcPort) {
                this.srcPort = srcPort;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeHealthChecksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHealthChecksResponseBody</p>
     */
    public static class HealthChecks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private java.util.List<HealthCheck> healthCheck;

        private HealthChecks(Builder builder) {
            this.healthCheck = builder.healthCheck;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthChecks create() {
            return builder().build();
        }

        /**
         * @return healthCheck
         */
        public java.util.List<HealthCheck> getHealthCheck() {
            return this.healthCheck;
        }

        public static final class Builder {
            private java.util.List<HealthCheck> healthCheck; 

            private Builder() {
            } 

            private Builder(HealthChecks model) {
                this.healthCheck = model.healthCheck;
            } 

            /**
             * HealthCheck.
             */
            public Builder healthCheck(java.util.List<HealthCheck> healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            public HealthChecks build() {
                return new HealthChecks(this);
            } 

        } 

    }
}
