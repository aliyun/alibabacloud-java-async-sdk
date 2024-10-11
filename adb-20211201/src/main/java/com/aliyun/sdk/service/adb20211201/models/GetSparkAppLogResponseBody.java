// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkAppLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppLogResponseBody</p>
 */
public class GetSparkAppLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkAppLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * <p>The queried log.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3A9594F-1D40-4472-A96C-8FB8AA20D38C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppLogResponseBody build() {
            return new GetSparkAppLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkAppLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkAppLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("LogContent")
        private String logContent;

        @com.aliyun.core.annotation.NameInMap("LogSize")
        private Integer logSize;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Data(Builder builder) {
            this.DBClusterId = builder.DBClusterId;
            this.logContent = builder.logContent;
            this.logSize = builder.logSize;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return logContent
         */
        public String getLogContent() {
            return this.logContent;
        }

        /**
         * @return logSize
         */
        public Integer getLogSize() {
            return this.logSize;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String DBClusterId; 
            private String logContent; 
            private Integer logSize; 
            private String message; 

            /**
             * <p>The ID of the AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-clusterxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The content of the log.</p>
             * 
             * <strong>example:</strong>
             * <p>22/04/22 15:30:49 INFO Utils: Start the dump task because s202206061441hz22a35ab000****-0001 app end, the interval is 238141ms;22/04/22 15:30:49 INFO AbstractConnector: Stopped Spark@5e774d9d{HTTP/1.1, (http/1.1)}{0.0.0.0:4040}</p>
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * <p>The number of log entries. A value of 0 indicates that no valid logs are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3517972480</p>
             */
            public Builder logSize(Integer logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * <p>The alert message returned for the request, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>WARNING:  log file maybe deleted, please check oss path: oss://TestBucketName/applog/</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
