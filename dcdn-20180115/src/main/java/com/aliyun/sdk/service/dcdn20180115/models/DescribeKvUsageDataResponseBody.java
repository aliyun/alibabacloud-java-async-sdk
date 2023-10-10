// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKvUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKvUsageDataResponseBody</p>
 */
public class DescribeKvUsageDataResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("KvUsageData")
    private java.util.List < KvUsageData> kvUsageData;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * KvUsageData.
         */
        public Builder kvUsageData(java.util.List < KvUsageData> kvUsageData) {
            this.kvUsageData = kvUsageData;
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

        public DescribeKvUsageDataResponseBody build() {
            return new DescribeKvUsageDataResponseBody(this);
        } 

    } 

    public static class KvUsageData extends TeaModel {
        @NameInMap("Acc")
        private Long acc;

        @NameInMap("AccessType")
        private String accessType;

        @NameInMap("NamespaceId")
        private String namespaceId;

        @NameInMap("TimeStamp")
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
             * NamespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * TimeStamp.
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
