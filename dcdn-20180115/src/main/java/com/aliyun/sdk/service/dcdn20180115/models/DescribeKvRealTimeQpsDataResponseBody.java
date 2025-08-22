// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeKvRealTimeQpsDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKvRealTimeQpsDataResponseBody</p>
 */
public class DescribeKvRealTimeQpsDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregateData")
    private java.util.List<AggregateData> aggregateData;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("KvQpsData")
    private java.util.List<KvQpsData> kvQpsData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeKvRealTimeQpsDataResponseBody(Builder builder) {
        this.aggregateData = builder.aggregateData;
        this.endTime = builder.endTime;
        this.kvQpsData = builder.kvQpsData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKvRealTimeQpsDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregateData
     */
    public java.util.List<AggregateData> getAggregateData() {
        return this.aggregateData;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return kvQpsData
     */
    public java.util.List<KvQpsData> getKvQpsData() {
        return this.kvQpsData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List<AggregateData> aggregateData; 
        private String endTime; 
        private java.util.List<KvQpsData> kvQpsData; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeKvRealTimeQpsDataResponseBody model) {
            this.aggregateData = model.aggregateData;
            this.endTime = model.endTime;
            this.kvQpsData = model.kvQpsData;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * AggregateData.
         */
        public Builder aggregateData(java.util.List<AggregateData> aggregateData) {
            this.aggregateData = aggregateData;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * KvQpsData.
         */
        public Builder kvQpsData(java.util.List<KvQpsData> kvQpsData) {
            this.kvQpsData = kvQpsData;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeKvRealTimeQpsDataResponseBody build() {
            return new DescribeKvRealTimeQpsDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKvRealTimeQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKvRealTimeQpsDataResponseBody</p>
     */
    public static class AggregateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Long acc;

        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("KeyAcc")
        private Long keyAcc;

        @com.aliyun.core.annotation.NameInMap("KeySuccAcc")
        private Long keySuccAcc;

        private AggregateData(Builder builder) {
            this.acc = builder.acc;
            this.accessType = builder.accessType;
            this.keyAcc = builder.keyAcc;
            this.keySuccAcc = builder.keySuccAcc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AggregateData create() {
            return builder().build();
        }

        /**
         * @return acc
         */
        public Long getAcc() {
            return this.acc;
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return keyAcc
         */
        public Long getKeyAcc() {
            return this.keyAcc;
        }

        /**
         * @return keySuccAcc
         */
        public Long getKeySuccAcc() {
            return this.keySuccAcc;
        }

        public static final class Builder {
            private Long acc; 
            private String accessType; 
            private Long keyAcc; 
            private Long keySuccAcc; 

            private Builder() {
            } 

            private Builder(AggregateData model) {
                this.acc = model.acc;
                this.accessType = model.accessType;
                this.keyAcc = model.keyAcc;
                this.keySuccAcc = model.keySuccAcc;
            } 

            /**
             * Acc.
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * KeyAcc.
             */
            public Builder keyAcc(Long keyAcc) {
                this.keyAcc = keyAcc;
                return this;
            }

            /**
             * KeySuccAcc.
             */
            public Builder keySuccAcc(Long keySuccAcc) {
                this.keySuccAcc = keySuccAcc;
                return this;
            }

            public AggregateData build() {
                return new AggregateData(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKvRealTimeQpsDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKvRealTimeQpsDataResponseBody</p>
     */
    public static class KvQpsData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("KeyQps")
        private Long keyQps;

        @com.aliyun.core.annotation.NameInMap("KeySuccQps")
        private Long keySuccQps;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Long qps;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private KvQpsData(Builder builder) {
            this.accessType = builder.accessType;
            this.keyQps = builder.keyQps;
            this.keySuccQps = builder.keySuccQps;
            this.namespaceId = builder.namespaceId;
            this.qps = builder.qps;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvQpsData create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return keyQps
         */
        public Long getKeyQps() {
            return this.keyQps;
        }

        /**
         * @return keySuccQps
         */
        public Long getKeySuccQps() {
            return this.keySuccQps;
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return qps
         */
        public Long getQps() {
            return this.qps;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String accessType; 
            private Long keyQps; 
            private Long keySuccQps; 
            private String namespaceId; 
            private Long qps; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(KvQpsData model) {
                this.accessType = model.accessType;
                this.keyQps = model.keyQps;
                this.keySuccQps = model.keySuccQps;
                this.namespaceId = model.namespaceId;
                this.qps = model.qps;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * KeyQps.
             */
            public Builder keyQps(Long keyQps) {
                this.keyQps = keyQps;
                return this;
            }

            /**
             * KeySuccQps.
             */
            public Builder keySuccQps(Long keySuccQps) {
                this.keySuccQps = keySuccQps;
                return this;
            }

            /**
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
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
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public KvQpsData build() {
                return new KvQpsData(this);
            } 

        } 

    }
}
