// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticQpsRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticQpsRecordResponseBody</p>
 */
public class DescribeElasticQpsRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticQpsList")
    private java.util.List < ElasticQpsList> elasticQpsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeElasticQpsRecordResponseBody(Builder builder) {
        this.elasticQpsList = builder.elasticQpsList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticQpsRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return elasticQpsList
     */
    public java.util.List < ElasticQpsList> getElasticQpsList() {
        return this.elasticQpsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ElasticQpsList> elasticQpsList; 
        private String requestId; 

        /**
         * The QPS information about the instance.
         */
        public Builder elasticQpsList(java.util.List < ElasticQpsList> elasticQpsList) {
            this.elasticQpsList = elasticQpsList;
            return this;
        }

        /**
         * The request ID, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticQpsRecordResponseBody build() {
            return new DescribeElasticQpsRecordResponseBody(this);
        } 

    } 

    public static class ElasticQpsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private Long date;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("OpsElasticQps")
        private Long opsElasticQps;

        @com.aliyun.core.annotation.NameInMap("OpsQps")
        private Long opsQps;

        @com.aliyun.core.annotation.NameInMap("OriginQps")
        private Long originQps;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("QpsPeak")
        private Long qpsPeak;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        private ElasticQpsList(Builder builder) {
            this.date = builder.date;
            this.instanceId = builder.instanceId;
            this.ip = builder.ip;
            this.opsElasticQps = builder.opsElasticQps;
            this.opsQps = builder.opsQps;
            this.originQps = builder.originQps;
            this.qps = builder.qps;
            this.qpsPeak = builder.qpsPeak;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticQpsList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public Long getDate() {
            return this.date;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return opsElasticQps
         */
        public Long getOpsElasticQps() {
            return this.opsElasticQps;
        }

        /**
         * @return opsQps
         */
        public Long getOpsQps() {
            return this.opsQps;
        }

        /**
         * @return originQps
         */
        public Long getOriginQps() {
            return this.originQps;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return qpsPeak
         */
        public Long getQpsPeak() {
            return this.qpsPeak;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long date; 
            private String instanceId; 
            private String ip; 
            private Long opsElasticQps; 
            private Long opsQps; 
            private Long originQps; 
            private Long qps; 
            private Long qpsPeak; 
            private Long status; 

            /**
             * The timestamp. Unit: milliseconds.
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * The ID of the Anti-DDoS Proxy instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The IP address of the Anti-DDoS Proxy instance.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The burstable QPS value. A value of 0 indicates that the burstable QPS feature is not enabled.
             */
            public Builder opsElasticQps(Long opsElasticQps) {
                this.opsElasticQps = opsElasticQps;
                return this;
            }

            /**
             * The service QPS (active).
             */
            public Builder opsQps(Long opsQps) {
                this.opsQps = opsQps;
                return this;
            }

            /**
             * The service QPS (purchased).
             */
            public Builder originQps(Long originQps) {
                this.originQps = originQps;
                return this;
            }

            /**
             * The daily peak 95th percentile QPS.
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The daily peak traffic.
             */
            public Builder qpsPeak(Long qpsPeak) {
                this.qpsPeak = qpsPeak;
                return this;
            }

            /**
             * Indicates whether the instance has expired or is released. Valid values:
             * <p>
             * 
             * *   **1**: The instance runs as expected.
             * *   **2**: The instance has expired.
             * *   **4**: The instance is released.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public ElasticQpsList build() {
                return new ElasticQpsList(this);
            } 

        } 

    }
}
