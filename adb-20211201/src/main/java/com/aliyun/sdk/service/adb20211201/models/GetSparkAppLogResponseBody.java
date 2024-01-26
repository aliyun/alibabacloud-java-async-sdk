// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppLogResponseBody</p>
 */
public class GetSparkAppLogResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * The queried log.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppLogResponseBody build() {
            return new GetSparkAppLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("LogContent")
        private String logContent;

        @NameInMap("LogSize")
        private Integer logSize;

        @NameInMap("Message")
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
             * The ID of the Data Lakehouse Edition (V3.0) cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The content of the log.
             */
            public Builder logContent(String logContent) {
                this.logContent = logContent;
                return this;
            }

            /**
             * LogSize.
             */
            public Builder logSize(Integer logSize) {
                this.logSize = logSize;
                return this;
            }

            /**
             * The alert message returned for the request, such as task execution failure or insufficient resources. If no alert occurs, null is returned.
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
