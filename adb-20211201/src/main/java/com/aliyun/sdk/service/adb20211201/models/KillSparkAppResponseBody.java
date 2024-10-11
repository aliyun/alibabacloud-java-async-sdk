// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link KillSparkAppResponseBody} extends {@link TeaModel}
 *
 * <p>KillSparkAppResponseBody</p>
 */
public class KillSparkAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private KillSparkAppResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static KillSparkAppResponseBody create() {
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>69D0810B-F9F5-5F4C-A57F-DF36133B63C9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public KillSparkAppResponseBody build() {
            return new KillSparkAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link KillSparkAppResponseBody} extends {@link TeaModel}
     *
     * <p>KillSparkAppResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The Spark application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>s202204132018hzprec1ac****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>LAKEHOUSE-1-1</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-bp1c3em7b2e****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>[Advisor] Advisor feature is not available for instance: am-2ze292w4fyglwxxxx</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The execution state of the Spark application. Valid values:</p>
             * <ul>
             * <li><strong>SUBMITTED</strong></li>
             * <li><strong>STARTING</strong></li>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>FAILING</strong></li>
             * <li><strong>FAILED</strong></li>
             * <li><strong>KILLING</strong></li>
             * <li><strong>KILLED</strong></li>
             * <li><strong>SUCCEEDING</strong></li>
             * <li><strong>COMPLETED</strong></li>
             * <li><strong>FATAL</strong></li>
             * <li><strong>UNKNOWN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
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
