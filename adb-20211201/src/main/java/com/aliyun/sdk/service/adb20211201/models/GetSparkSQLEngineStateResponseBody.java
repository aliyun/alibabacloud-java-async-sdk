// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
         * <p>The state information about the Spark SQL engine.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx-xxx-xx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSparkSQLEngineStateResponseBody build() {
            return new GetSparkSQLEngineStateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSparkSQLEngineStateResponseBody} extends {@link TeaModel}
     *
     * <p>GetSparkSQLEngineStateResponseBody</p>
     */
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
             * <p>The ID of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>s202207151211hz0c****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The configuration of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;key1&quot;: &quot;value1&quot;, &quot;key2&quot;: &quot;value2&quot;}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The third-party JAR package.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test.jar</p>
             */
            public Builder jars(String jars) {
                this.jars = jars;
                return this;
            }

            /**
             * <p>The maximum number of started Spark executors.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxExecutor(String maxExecutor) {
                this.maxExecutor = maxExecutor;
                return this;
            }

            /**
             * <p>The minimum number of started Spark executors.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minExecutor(String minExecutor) {
                this.minExecutor = minExecutor;
                return this;
            }

            /**
             * <p>The slot number of the Spark application.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder slotNum(String slotNum) {
                this.slotNum = slotNum;
                return this;
            }

            /**
             * <p>The execution state of the application. Valid values:</p>
             * <ul>
             * <li>SUBMITTED</li>
             * <li>STARTING</li>
             * <li>RUNNING</li>
             * <li>FAILING</li>
             * <li>FAILED</li>
             * <li>KILLING</li>
             * <li>KILLED</li>
             * <li>SUCCEEDING</li>
             * <li>COMPLETED</li>
             * <li>FATAL</li>
             * <li>UNKNOWN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The timestamp when the Spark SQL application was submitted. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1651213645000</p>
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
