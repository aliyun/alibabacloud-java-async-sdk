// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeVsDomainSnapshotDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVsDomainSnapshotDataResponseBody</p>
 */
public class DescribeVsDomainSnapshotDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotDataPerInterval")
    private SnapshotDataPerInterval snapshotDataPerInterval;

    private DescribeVsDomainSnapshotDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotDataPerInterval = builder.snapshotDataPerInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainSnapshotDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotDataPerInterval
     */
    public SnapshotDataPerInterval getSnapshotDataPerInterval() {
        return this.snapshotDataPerInterval;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotDataPerInterval snapshotDataPerInterval; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotDataPerInterval.
         */
        public Builder snapshotDataPerInterval(SnapshotDataPerInterval snapshotDataPerInterval) {
            this.snapshotDataPerInterval = snapshotDataPerInterval;
            return this;
        }

        public DescribeVsDomainSnapshotDataResponseBody build() {
            return new DescribeVsDomainSnapshotDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVsDomainSnapshotDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainSnapshotDataResponseBody</p>
     */
    public static class DataModule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotValue")
        private String snapshotValue;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private DataModule(Builder builder) {
            this.snapshotValue = builder.snapshotValue;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataModule create() {
            return builder().build();
        }

        /**
         * @return snapshotValue
         */
        public String getSnapshotValue() {
            return this.snapshotValue;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String snapshotValue; 
            private String timeStamp; 

            /**
             * SnapshotValue.
             */
            public Builder snapshotValue(String snapshotValue) {
                this.snapshotValue = snapshotValue;
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
    /**
     * 
     * {@link DescribeVsDomainSnapshotDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVsDomainSnapshotDataResponseBody</p>
     */
    public static class SnapshotDataPerInterval extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataModule")
        private java.util.List<DataModule> dataModule;

        private SnapshotDataPerInterval(Builder builder) {
            this.dataModule = builder.dataModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotDataPerInterval create() {
            return builder().build();
        }

        /**
         * @return dataModule
         */
        public java.util.List<DataModule> getDataModule() {
            return this.dataModule;
        }

        public static final class Builder {
            private java.util.List<DataModule> dataModule; 

            /**
             * DataModule.
             */
            public Builder dataModule(java.util.List<DataModule> dataModule) {
                this.dataModule = dataModule;
                return this;
            }

            public SnapshotDataPerInterval build() {
                return new SnapshotDataPerInterval(this);
            } 

        } 

    }
}
