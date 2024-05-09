// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkSQLEngineStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkSQLEngineStateResponseBody</p>
 */
public class GetSparkSQLEngineStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkSQLEngineStateResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkSQLEngineStateResponseBody create() {
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
         * The state information about the Spark SQL engine.
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

        public GetSparkSQLEngineStateResponseBody build() {
            return new GetSparkSQLEngineStateResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Jars")
        private String jars;

        @com.aliyun.core.annotation.NameInMap("MaxExecutor")
        private String maxExecutor;

        @com.aliyun.core.annotation.NameInMap("MinExecutor")
        private String minExecutor;

        @com.aliyun.core.annotation.NameInMap("SlotNum")
        private String slotNum;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SubmittedTimeInMillis")
        private String submittedTimeInMillis;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.config = builder.config;
            this.jars = builder.jars;
            this.maxExecutor = builder.maxExecutor;
            this.minExecutor = builder.minExecutor;
            this.slotNum = builder.slotNum;
            this.state = builder.state;
            this.submittedTimeInMillis = builder.submittedTimeInMillis;
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
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return jars
         */
        public String getJars() {
            return this.jars;
        }

        /**
         * @return maxExecutor
         */
        public String getMaxExecutor() {
            return this.maxExecutor;
        }

        /**
         * @return minExecutor
         */
        public String getMinExecutor() {
            return this.minExecutor;
        }

        /**
         * @return slotNum
         */
        public String getSlotNum() {
            return this.slotNum;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return submittedTimeInMillis
         */
        public String getSubmittedTimeInMillis() {
            return this.submittedTimeInMillis;
        }

        public static final class Builder {
            private String appId; 
            private String config; 
            private String jars; 
            private String maxExecutor; 
            private String minExecutor; 
            private String slotNum; 
            private String state; 
            private String submittedTimeInMillis; 

            /**
             * The ID of the Spark application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The configuration of the Spark application.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The third-party JAR package.
             */
            public Builder jars(String jars) {
                this.jars = jars;
                return this;
            }

            /**
             * The maximum number of started Spark executors.
             */
            public Builder maxExecutor(String maxExecutor) {
                this.maxExecutor = maxExecutor;
                return this;
            }

            /**
             * The minimum number of started Spark executors.
             */
            public Builder minExecutor(String minExecutor) {
                this.minExecutor = minExecutor;
                return this;
            }

            /**
             * The slot number of the Spark application.
             */
            public Builder slotNum(String slotNum) {
                this.slotNum = slotNum;
                return this;
            }

            /**
             * The execution state of the application. Valid values:
             * <p>
             * 
             * *   SUBMITTED
             * *   STARTING
             * *   RUNNING
             * *   FAILING
             * *   FAILED
             * *   KILLING
             * *   KILLED
             * *   SUCCEEDING
             * *   COMPLETED
             * *   FATAL
             * *   UNKNOWN
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The timestamp when the Spark SQL application was submitted. Unit: milliseconds.
             */
            public Builder submittedTimeInMillis(String submittedTimeInMillis) {
                this.submittedTimeInMillis = submittedTimeInMillis;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
