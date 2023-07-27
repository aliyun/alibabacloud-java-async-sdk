// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkAppStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkAppStateResponseBody</p>
 */
public class GetSparkAppStateResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkAppStateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkAppStateResponseBody create() {
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkAppStateResponseBody build() {
            return new GetSparkAppStateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("Message")
        private String message;

        @NameInMap("State")
        private String state;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.DBClusterId = builder.DBClusterId;
            this.message = builder.message;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String DBClusterId; 
            private String message; 
            private String state; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The name of the application.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the Database.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The alert message returned for the operation, such as task execution failure or insufficient resources. Null is returned if no alert occurs.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The execution state of the application. Valid values:
             * <p>
             * 
             * *   **SUBMITTED**: The application is submitted.
             * *   **STARTING**: The application task is starting.
             * *   **RUNNING**: The application task is being executed.
             * *   **FAILING**: The application task failed, and the environment is being cleared.
             * *   **FAILED**: The application task failed.
             * *   **KILLING**: The application task is terminated, and the environment is being cleared.
             * *   **KILLED**: The application task is terminated.
             * *   **SUCCEEDING**: The application task is completed, and the environment is being cleared.
             * *   **COMPLETED**: The application task is completed.
             * *   **FATAL**: An unexpected failure occurred.
             * *   **UNKNOWN**: An unknown error occurred.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
