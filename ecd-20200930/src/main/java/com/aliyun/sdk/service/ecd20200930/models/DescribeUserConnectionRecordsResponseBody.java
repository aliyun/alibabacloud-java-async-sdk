// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserConnectionRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserConnectionRecordsResponseBody</p>
 */
public class DescribeUserConnectionRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConnectionRecords")
    private java.util.List < ConnectionRecords> connectionRecords;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Details about connection records of the end user.</p>
         */
        public Builder connectionRecords(java.util.List < ConnectionRecords> connectionRecords) {
            this.connectionRecords = connectionRecords;
            return this;
        }

        /**
         * <p>The token that is used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2CC66B0A-BA3B-5D87-BFBE-11AAAD7A8E03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUserConnectionRecordsResponseBody build() {
            return new DescribeUserConnectionRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUserConnectionRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUserConnectionRecordsResponseBody</p>
     */
    public static class ConnectionRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectDuration")
        private String connectDuration;

        @com.aliyun.core.annotation.NameInMap("ConnectEndTime")
        private String connectEndTime;

        @com.aliyun.core.annotation.NameInMap("ConnectStartTime")
        private String connectStartTime;

        @com.aliyun.core.annotation.NameInMap("ConnectionRecordId")
        private String connectionRecordId;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
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
             * <p>The duration for which the end user is connected to the cloud computer. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3405035000</p>
             */
            public Builder connectDuration(String connectDuration) {
                this.connectDuration = connectDuration;
                return this;
            }

            /**
             * <p>The time when the end user disconnected from the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-02-27T20:03:13Z</p>
             */
            public Builder connectEndTime(String connectEndTime) {
                this.connectEndTime = connectEndTime;
                return this;
            }

            /**
             * <p>The time when the end user connected to the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-19T10:12:38Z</p>
             */
            public Builder connectStartTime(String connectStartTime) {
                this.connectStartTime = connectStartTime;
                return this;
            }

            /**
             * <p>The ID of the connection record.</p>
             * 
             * <strong>example:</strong>
             * <p>528</p>
             */
            public Builder connectionRecordId(String connectionRecordId) {
                this.connectionRecordId = connectionRecordId;
                return this;
            }

            /**
             * <p>The ID of the cloud computer to which the end user connected.</p>
             * 
             * <strong>example:</strong>
             * <p>ud-2hawufy3uedi1****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer to which the end user connected.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
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
