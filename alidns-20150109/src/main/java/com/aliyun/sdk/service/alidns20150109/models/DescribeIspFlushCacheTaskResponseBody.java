// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeIspFlushCacheTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIspFlushCacheTaskResponseBody</p>
 */
public class DescribeIspFlushCacheTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("FlushCacheResults")
    private java.util.List<FlushCacheResults> flushCacheResults;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("Isp")
    private String isp;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private DescribeIspFlushCacheTaskResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.domainName = builder.domainName;
        this.flushCacheResults = builder.flushCacheResults;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.isp = builder.isp;
        this.requestId = builder.requestId;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIspFlushCacheTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return flushCacheResults
     */
    public java.util.List<FlushCacheResults> getFlushCacheResults() {
        return this.flushCacheResults;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isp
     */
    public String getIsp() {
        return this.isp;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder {
        private String createTime; 
        private Long createTimestamp; 
        private String domainName; 
        private java.util.List<FlushCacheResults> flushCacheResults; 
        private String instanceId; 
        private String instanceName; 
        private String isp; 
        private String requestId; 
        private String taskId; 
        private String taskStatus; 

        private Builder() {
        } 

        private Builder(DescribeIspFlushCacheTaskResponseBody model) {
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.domainName = model.domainName;
            this.flushCacheResults = model.flushCacheResults;
            this.instanceId = model.instanceId;
            this.instanceName = model.instanceName;
            this.isp = model.isp;
            this.requestId = model.requestId;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
        } 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * FlushCacheResults.
         */
        public Builder flushCacheResults(java.util.List<FlushCacheResults> flushCacheResults) {
            this.flushCacheResults = flushCacheResults;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Isp.
         */
        public Builder isp(String isp) {
            this.isp = isp;
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
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        public DescribeIspFlushCacheTaskResponseBody build() {
            return new DescribeIspFlushCacheTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIspFlushCacheTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspFlushCacheTaskResponseBody</p>
     */
    public static class Answers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Record")
        private String record;

        @com.aliyun.core.annotation.NameInMap("Ttl")
        private Long ttl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Answers(Builder builder) {
            this.name = builder.name;
            this.record = builder.record;
            this.ttl = builder.ttl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Answers create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return record
         */
        public String getRecord() {
            return this.record;
        }

        /**
         * @return ttl
         */
        public Long getTtl() {
            return this.ttl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String record; 
            private Long ttl; 
            private String type; 

            private Builder() {
            } 

            private Builder(Answers model) {
                this.name = model.name;
                this.record = model.record;
                this.ttl = model.ttl;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Record.
             */
            public Builder record(String record) {
                this.record = record;
                return this;
            }

            /**
             * Ttl.
             */
            public Builder ttl(Long ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Answers build() {
                return new Answers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIspFlushCacheTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspFlushCacheTaskResponseBody</p>
     */
    public static class DnsNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Answers")
        private java.util.List<Answers> answers;

        @com.aliyun.core.annotation.NameInMap("NodeIp")
        private String nodeIp;

        @com.aliyun.core.annotation.NameInMap("SpName")
        private String spName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private DnsNodes(Builder builder) {
            this.answers = builder.answers;
            this.nodeIp = builder.nodeIp;
            this.spName = builder.spName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsNodes create() {
            return builder().build();
        }

        /**
         * @return answers
         */
        public java.util.List<Answers> getAnswers() {
            return this.answers;
        }

        /**
         * @return nodeIp
         */
        public String getNodeIp() {
            return this.nodeIp;
        }

        /**
         * @return spName
         */
        public String getSpName() {
            return this.spName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List<Answers> answers; 
            private String nodeIp; 
            private String spName; 
            private String status; 

            private Builder() {
            } 

            private Builder(DnsNodes model) {
                this.answers = model.answers;
                this.nodeIp = model.nodeIp;
                this.spName = model.spName;
                this.status = model.status;
            } 

            /**
             * Answers.
             */
            public Builder answers(java.util.List<Answers> answers) {
                this.answers = answers;
                return this;
            }

            /**
             * NodeIp.
             */
            public Builder nodeIp(String nodeIp) {
                this.nodeIp = nodeIp;
                return this;
            }

            /**
             * SpName.
             */
            public Builder spName(String spName) {
                this.spName = spName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DnsNodes build() {
                return new DnsNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeIspFlushCacheTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIspFlushCacheTaskResponseBody</p>
     */
    public static class FlushCacheResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsNodes")
        private java.util.List<DnsNodes> dnsNodes;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        private FlushCacheResults(Builder builder) {
            this.dnsNodes = builder.dnsNodes;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlushCacheResults create() {
            return builder().build();
        }

        /**
         * @return dnsNodes
         */
        public java.util.List<DnsNodes> getDnsNodes() {
            return this.dnsNodes;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private java.util.List<DnsNodes> dnsNodes; 
            private String province; 

            private Builder() {
            } 

            private Builder(FlushCacheResults model) {
                this.dnsNodes = model.dnsNodes;
                this.province = model.province;
            } 

            /**
             * DnsNodes.
             */
            public Builder dnsNodes(java.util.List<DnsNodes> dnsNodes) {
                this.dnsNodes = dnsNodes;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public FlushCacheResults build() {
                return new FlushCacheResults(this);
            } 

        } 

    }
}
