// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticQpsRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticQpsRecordResponseBody</p>
 */
public class DescribeElasticQpsRecordResponseBody extends TeaModel {
    @NameInMap("ElasticQpsList")
    private java.util.List < ElasticQpsList> elasticQpsList;

    @NameInMap("RequestId")
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
         * ElasticQpsList.
         */
        public Builder elasticQpsList(java.util.List < ElasticQpsList> elasticQpsList) {
            this.elasticQpsList = elasticQpsList;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Date")
        private Long date;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("OpsElasticQps")
        private Long opsElasticQps;

        @NameInMap("OpsQps")
        private Long opsQps;

        @NameInMap("OriginQps")
        private Long originQps;

        @NameInMap("Qps")
        private Long qps;

        @NameInMap("QpsPeak")
        private Long qpsPeak;

        @NameInMap("Status")
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
             * Date.
             */
            public Builder date(Long date) {
                this.date = date;
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
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * OpsElasticQps.
             */
            public Builder opsElasticQps(Long opsElasticQps) {
                this.opsElasticQps = opsElasticQps;
                return this;
            }

            /**
             * OpsQps.
             */
            public Builder opsQps(Long opsQps) {
                this.opsQps = opsQps;
                return this;
            }

            /**
             * OriginQps.
             */
            public Builder originQps(Long originQps) {
                this.originQps = originQps;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * QpsPeak.
             */
            public Builder qpsPeak(Long qpsPeak) {
                this.qpsPeak = qpsPeak;
                return this;
            }

            /**
             * Status.
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
