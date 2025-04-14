// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeElasticQpsRecordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticQpsRecordResponseBody</p>
 */
public class DescribeElasticQpsRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ElasticQpsList")
    private java.util.List<ElasticQpsList> elasticQpsList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return elasticQpsList
     */
    public java.util.List<ElasticQpsList> getElasticQpsList() {
        return this.elasticQpsList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ElasticQpsList> elasticQpsList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeElasticQpsRecordResponseBody model) {
            this.elasticQpsList = model.elasticQpsList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The QPS information about the instance.</p>
         */
        public Builder elasticQpsList(java.util.List<ElasticQpsList> elasticQpsList) {
            this.elasticQpsList = elasticQpsList;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>F68B34E2-570C-508D-95FD-DFB6611D518F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeElasticQpsRecordResponseBody build() {
            return new DescribeElasticQpsRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeElasticQpsRecordResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeElasticQpsRecordResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ElasticQpsList model) {
                this.date = model.date;
                this.instanceId = model.instanceId;
                this.ip = model.ip;
                this.opsElasticQps = model.opsElasticQps;
                this.opsQps = model.opsQps;
                this.originQps = model.originQps;
                this.qps = model.qps;
                this.qpsPeak = model.qpsPeak;
                this.status = model.status;
            } 

            /**
             * <p>The timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1688140799999</p>
             */
            public Builder date(Long date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The ID of the Anti-DDoS Proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-7e225i41****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The IP address of the Anti-DDoS Proxy instance.</p>
             * 
             * <strong>example:</strong>
             * <p>203.<em><strong>.</strong></em>.199</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The burstable QPS value. A value of 0 indicates that the burstable QPS feature is not enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>300000</p>
             */
            public Builder opsElasticQps(Long opsElasticQps) {
                this.opsElasticQps = opsElasticQps;
                return this;
            }

            /**
             * <p>The service QPS (active).</p>
             * 
             * <strong>example:</strong>
             * <p>1345</p>
             */
            public Builder opsQps(Long opsQps) {
                this.opsQps = opsQps;
                return this;
            }

            /**
             * <p>The service QPS (purchased).</p>
             * 
             * <strong>example:</strong>
             * <p>1345</p>
             */
            public Builder originQps(Long originQps) {
                this.originQps = originQps;
                return this;
            }

            /**
             * <p>The daily peak 95th percentile QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>4367</p>
             */
            public Builder qps(Long qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The daily peak traffic.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder qpsPeak(Long qpsPeak) {
                this.qpsPeak = qpsPeak;
                return this;
            }

            /**
             * <p>Indicates whether the instance has expired or is released. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The instance runs as expected.</li>
             * <li><strong>2</strong>: The instance has expired.</li>
             * <li><strong>4</strong>: The instance is released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
