// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserConnectionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserConnectionRecordsResponseBody</p>
 */
public class DescribeUserConnectionRecordsResponseBody extends TeaModel {
    @NameInMap("ConnectionRecords")
    private java.util.List < ConnectionRecords> connectionRecords;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUserConnectionRecordsResponseBody(Builder builder) {
        this.connectionRecords = builder.connectionRecords;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserConnectionRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return connectionRecords
     */
    public java.util.List < ConnectionRecords> getConnectionRecords() {
        return this.connectionRecords;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ConnectionRecords> connectionRecords; 
        private String nextToken; 
        private String requestId; 

        /**
         * ConnectionRecords.
         */
        public Builder connectionRecords(java.util.List < ConnectionRecords> connectionRecords) {
            this.connectionRecords = connectionRecords;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserConnectionRecordsResponseBody build() {
            return new DescribeUserConnectionRecordsResponseBody(this);
        } 

    } 

    public static class ConnectionRecords extends TeaModel {
        @NameInMap("ConnectDuration")
        private String connectDuration;

        @NameInMap("ConnectEndTime")
        private String connectEndTime;

        @NameInMap("ConnectStartTime")
        private String connectStartTime;

        @NameInMap("ConnectionRecordId")
        private String connectionRecordId;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        private ConnectionRecords(Builder builder) {
            this.connectDuration = builder.connectDuration;
            this.connectEndTime = builder.connectEndTime;
            this.connectStartTime = builder.connectStartTime;
            this.connectionRecordId = builder.connectionRecordId;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionRecords create() {
            return builder().build();
        }

        /**
         * @return connectDuration
         */
        public String getConnectDuration() {
            return this.connectDuration;
        }

        /**
         * @return connectEndTime
         */
        public String getConnectEndTime() {
            return this.connectEndTime;
        }

        /**
         * @return connectStartTime
         */
        public String getConnectStartTime() {
            return this.connectStartTime;
        }

        /**
         * @return connectionRecordId
         */
        public String getConnectionRecordId() {
            return this.connectionRecordId;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        public static final class Builder {
            private String connectDuration; 
            private String connectEndTime; 
            private String connectStartTime; 
            private String connectionRecordId; 
            private String desktopId; 
            private String desktopName; 

            /**
             * ConnectDuration.
             */
            public Builder connectDuration(String connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * ConnectEndTime.
             */
            public Builder connectEndTime(String connectEndTime) {
                this.connectEndTime = connectEndTime;
                return this;
            }

            /**
             * ConnectStartTime.
             */
            public Builder connectStartTime(String connectStartTime) {
                this.connectStartTime = connectStartTime;
                return this;
            }

            /**
             * ConnectionRecordId.
             */
            public Builder connectionRecordId(String connectionRecordId) {
                this.connectionRecordId = connectionRecordId;
                return this;
            }

            /**
             * DesktopId.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * DesktopName.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            public ConnectionRecords build() {
                return new ConnectionRecords(this);
            } 

        } 

    }
}
