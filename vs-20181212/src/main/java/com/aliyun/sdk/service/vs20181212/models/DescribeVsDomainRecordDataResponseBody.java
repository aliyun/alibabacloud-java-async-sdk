// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainRecordDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainRecordDataResponseBody</p>
 */
public class DescribeVsDomainRecordDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordDataPerInterval")
    private RecordDataPerInterval recordDataPerInterval;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVsDomainRecordDataResponseBody(Builder builder) {
        this.recordDataPerInterval = builder.recordDataPerInterval;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainRecordDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return recordDataPerInterval
     */
    public RecordDataPerInterval getRecordDataPerInterval() {
        return this.recordDataPerInterval;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordDataPerInterval recordDataPerInterval; 
        private String requestId; 

        /**
         * RecordDataPerInterval.
         */
        public Builder recordDataPerInterval(RecordDataPerInterval recordDataPerInterval) {
            this.recordDataPerInterval = recordDataPerInterval;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVsDomainRecordDataResponseBody build() {
            return new DescribeVsDomainRecordDataResponseBody(this);
        } 

    } 

    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordValue")
        private String recordValue;

        @com.aliyun.core.annotation.NameInMap("StreamCountValue")
        private String streamCountValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.recordValue = builder.recordValue;
            this.streamCountValue = builder.streamCountValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return recordValue
         */
        public String getRecordValue() {
            return this.recordValue;
        }

        /**
         * @return streamCountValue
         */
        public String getStreamCountValue() {
            return this.streamCountValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String recordValue; 
            private String streamCountValue; 
            private String timeStamp; 

            /**
             * RecordValue.
             */
            public Builder recordValue(String recordValue) {
                this.recordValue = recordValue;
                return this;
            }

            /**
             * StreamCountValue.
             */
            public Builder streamCountValue(String streamCountValue) {
                this.streamCountValue = streamCountValue;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public DataModule build() {
                return new DataModule(this);
            } 

        } 

    }
    public static class RecordDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List < DataModule> dataModule;

        private RecordDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List < DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List < DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List < DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public RecordDataPerInterval build() {
                return new RecordDataPerInterval(this);
            } 

        } 

    }
}
