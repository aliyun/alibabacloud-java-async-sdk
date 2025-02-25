// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeKvUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKvUsageDataResponseBody</p>
 */
public class DescribeKvUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("KvUsageData")
    private java.util.List < KvUsageData> kvUsageData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeKvUsageDataResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.kvUsageData = builder.kvUsageData;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKvUsageDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return kvUsageData
     */
    public java.util.List < KvUsageData> getKvUsageData() {
        return this.kvUsageData;
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
        private String endTime; 
        private java.util.List < KvUsageData> kvUsageData; 
        private String requestId; 
        private String startTime; 

        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-18T15:59:59Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The usage details.</p>
         */
        public Builder kvUsageData(java.util.List < KvUsageData> kvUsageData) {
            this.kvUsageData = kvUsageData;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9732E117-8A37-49FD-A36F-ABBB87556CA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-06T16:00:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeKvUsageDataResponseBody build() {
            return new DescribeKvUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKvUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKvUsageDataResponseBody</p>
     */
    public static class KvUsageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acc")
        private Long acc;

        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("NamespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private KvUsageData(Builder builder) {
            this.acc = builder.acc;
            this.accessType = builder.accessType;
            this.namespaceId = builder.namespaceId;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KvUsageData create() {
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
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long acc; 
            private String accessType; 
            private String namespaceId; 
            private String timeStamp; 

            /**
             * <p>The number of visits.</p>
             * 
             * <strong>example:</strong>
             * <p>1340000</p>
             */
            public Builder acc(Long acc) {
                this.acc = acc;
                return this;
            }

            /**
             * <p>The request method. This parameter is available only when the <strong>SplitBy</strong> parameter is set to <strong>type</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>The namespace ID. This parameter is available only when the <strong>SplitBy</strong> parameter is set to <strong>namespace</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>534167033424646144</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The timestamp of the data returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-11-14T15:00:03Z</p>
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public KvUsageData build() {
                return new KvUsageData(this);
            } 

        } 

    }
}
