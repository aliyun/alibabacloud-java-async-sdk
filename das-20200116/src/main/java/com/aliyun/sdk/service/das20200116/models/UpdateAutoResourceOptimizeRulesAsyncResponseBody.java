// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoResourceOptimizeRulesAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAutoResourceOptimizeRulesAsyncResponseBody</p>
 */
public class UpdateAutoResourceOptimizeRulesAsyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateAutoResourceOptimizeRulesAsyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoResourceOptimizeRulesAsyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateAutoResourceOptimizeRulesAsyncResponseBody build() {
            return new UpdateAutoResourceOptimizeRulesAsyncResponseBody(this);
        } 

    } 

    public static class ConfigFailInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSuccess")
        private Boolean configSuccess;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ConfigFailInstanceList(Builder builder) {
            this.configSuccess = builder.configSuccess;
            this.errorMessage = builder.errorMessage;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigFailInstanceList create() {
            return builder().build();
        }

        /**
         * @return configSuccess
         */
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean configSuccess; 
            private String errorMessage; 
            private String instanceId; 

            /**
             * Indicates whether the parameters are configured. Valid values:
             * <p>
             * 
             * * **true**
             * 
             * * **false**
             */
            public Builder configSuccess(Boolean configSuccess) {
                this.configSuccess = configSuccess;
                return this;
            }

            /**
             * The error message returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ConfigFailInstanceList build() {
                return new ConfigFailInstanceList(this);
            } 

        } 

    }
    public static class ConfigSuccessInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigSuccess")
        private Boolean configSuccess;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private ConfigSuccessInstanceList(Builder builder) {
            this.configSuccess = builder.configSuccess;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigSuccessInstanceList create() {
            return builder().build();
        }

        /**
         * @return configSuccess
         */
        public Boolean getConfigSuccess() {
            return this.configSuccess;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Boolean configSuccess; 
            private String instanceId; 

            /**
             * Indicates whether the parameters are configured. Valid values:
             * <p>
             * 
             * * **true**
             * 
             * * **false**
             */
            public Builder configSuccess(Boolean configSuccess) {
                this.configSuccess = configSuccess;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public ConfigSuccessInstanceList build() {
                return new ConfigSuccessInstanceList(this);
            } 

        } 

    }
    public static class ConfigResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigFailInstanceCount")
        private Long configFailInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ConfigFailInstanceList")
        private java.util.List < ConfigFailInstanceList> configFailInstanceList;

        @com.aliyun.core.annotation.NameInMap("ConfigSuccessInstanceCount")
        private Long configSuccessInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ConfigSuccessInstanceList")
        private java.util.List < ConfigSuccessInstanceList> configSuccessInstanceList;

        @com.aliyun.core.annotation.NameInMap("TotalInstanceCount")
        private Long totalInstanceCount;

        private ConfigResponse(Builder builder) {
            this.configFailInstanceCount = builder.configFailInstanceCount;
            this.configFailInstanceList = builder.configFailInstanceList;
            this.configSuccessInstanceCount = builder.configSuccessInstanceCount;
            this.configSuccessInstanceList = builder.configSuccessInstanceList;
            this.totalInstanceCount = builder.totalInstanceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigResponse create() {
            return builder().build();
        }

        /**
         * @return configFailInstanceCount
         */
        public Long getConfigFailInstanceCount() {
            return this.configFailInstanceCount;
        }

        /**
         * @return configFailInstanceList
         */
        public java.util.List < ConfigFailInstanceList> getConfigFailInstanceList() {
            return this.configFailInstanceList;
        }

        /**
         * @return configSuccessInstanceCount
         */
        public Long getConfigSuccessInstanceCount() {
            return this.configSuccessInstanceCount;
        }

        /**
         * @return configSuccessInstanceList
         */
        public java.util.List < ConfigSuccessInstanceList> getConfigSuccessInstanceList() {
            return this.configSuccessInstanceList;
        }

        /**
         * @return totalInstanceCount
         */
        public Long getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        public static final class Builder {
            private Long configFailInstanceCount; 
            private java.util.List < ConfigFailInstanceList> configFailInstanceList; 
            private Long configSuccessInstanceCount; 
            private java.util.List < ConfigSuccessInstanceList> configSuccessInstanceList; 
            private Long totalInstanceCount; 

            /**
             * The number of database instances for which the parameters failed to be configured.
             */
            public Builder configFailInstanceCount(Long configFailInstanceCount) {
                this.configFailInstanceCount = configFailInstanceCount;
                return this;
            }

            /**
             * The database instances for which the parameters failed to be configured.
             */
            public Builder configFailInstanceList(java.util.List < ConfigFailInstanceList> configFailInstanceList) {
                this.configFailInstanceList = configFailInstanceList;
                return this;
            }

            /**
             * The number of database instances for which the parameters are configured.
             */
            public Builder configSuccessInstanceCount(Long configSuccessInstanceCount) {
                this.configSuccessInstanceCount = configSuccessInstanceCount;
                return this;
            }

            /**
             * The database instances for which the parameters are configured.
             */
            public Builder configSuccessInstanceList(java.util.List < ConfigSuccessInstanceList> configSuccessInstanceList) {
                this.configSuccessInstanceList = configSuccessInstanceList;
                return this;
            }

            /**
             * The total number of database instances.
             */
            public Builder totalInstanceCount(Long totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            public ConfigResponse build() {
                return new ConfigResponse(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Complete")
        private Boolean complete;

        @com.aliyun.core.annotation.NameInMap("ConfigResponse")
        private ConfigResponse configResponse;

        @com.aliyun.core.annotation.NameInMap("Fail")
        private Boolean fail;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("ResultId")
        private String resultId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Data(Builder builder) {
            this.complete = builder.complete;
            this.configResponse = builder.configResponse;
            this.fail = builder.fail;
            this.isFinish = builder.isFinish;
            this.resultId = builder.resultId;
            this.state = builder.state;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return complete
         */
        public Boolean getComplete() {
            return this.complete;
        }

        /**
         * @return configResponse
         */
        public ConfigResponse getConfigResponse() {
            return this.configResponse;
        }

        /**
         * @return fail
         */
        public Boolean getFail() {
            return this.fail;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return resultId
         */
        public String getResultId() {
            return this.resultId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Boolean complete; 
            private ConfigResponse configResponse; 
            private Boolean fail; 
            private Boolean isFinish; 
            private String resultId; 
            private String state; 
            private Long timestamp; 

            /**
             * Indicates whether the asynchronous request was complete. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * The returned data of the configuration.
             * <p>
             * 
             * >  The data is returned only if the value of isFinish is **true**. This value indicates that the asynchronous request is complete.
             */
            public Builder configResponse(ConfigResponse configResponse) {
                this.configResponse = configResponse;
                return this;
            }

            /**
             * Indicates whether the asynchronous request failed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder fail(Boolean fail) {
                this.fail = fail;
                return this;
            }

            /**
             * Indicates whether the asynchronous request was complete. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * The ID of the asynchronous request.
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * The state of the asynchronous request. Valid values:
             * <p>
             * 
             * *   **RUNNING**
             * *   **SUCCESS**
             * *   **FAIL**
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
