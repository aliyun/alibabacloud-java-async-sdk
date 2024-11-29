// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateAutoThrottleRulesAsyncResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAutoThrottleRulesAsyncResponseBody</p>
 */
public class UpdateAutoThrottleRulesAsyncResponseBody extends TeaModel {
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

    private UpdateAutoThrottleRulesAsyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAutoThrottleRulesAsyncResponseBody create() {
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
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateAutoThrottleRulesAsyncResponseBody build() {
            return new UpdateAutoThrottleRulesAsyncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAutoThrottleRulesAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAutoThrottleRulesAsyncResponseBody</p>
     */
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
             * <p>Indicates whether the parameters are configured. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder configSuccess(Boolean configSuccess) {
                this.configSuccess = configSuccess;
                return this;
            }

            /**
             * <p>The error message returned.</p>
             * 
             * <strong>example:</strong>
             * <p>instance das autonomy service is off or can not find instance</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze9xrhze0709****</p>
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
    /**
     * 
     * {@link UpdateAutoThrottleRulesAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAutoThrottleRulesAsyncResponseBody</p>
     */
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
             * <p>Indicates whether the parameters are configured. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder configSuccess(Boolean configSuccess) {
                this.configSuccess = configSuccess;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
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
    /**
     * 
     * {@link UpdateAutoThrottleRulesAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAutoThrottleRulesAsyncResponseBody</p>
     */
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
             * <p>The number of database instances for which the parameters failed to be configured.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configFailInstanceCount(Long configFailInstanceCount) {
                this.configFailInstanceCount = configFailInstanceCount;
                return this;
            }

            /**
             * <p>The database instances for which the parameters failed to be configured.</p>
             */
            public Builder configFailInstanceList(java.util.List < ConfigFailInstanceList> configFailInstanceList) {
                this.configFailInstanceList = configFailInstanceList;
                return this;
            }

            /**
             * <p>The number of database instances for which the parameters are configured.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configSuccessInstanceCount(Long configSuccessInstanceCount) {
                this.configSuccessInstanceCount = configSuccessInstanceCount;
                return this;
            }

            /**
             * <p>The database instances for which the parameters are configured.</p>
             */
            public Builder configSuccessInstanceList(java.util.List < ConfigSuccessInstanceList> configSuccessInstanceList) {
                this.configSuccessInstanceList = configSuccessInstanceList;
                return this;
            }

            /**
             * <p>The total number of database instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link UpdateAutoThrottleRulesAsyncResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateAutoThrottleRulesAsyncResponseBody</p>
     */
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
             * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder complete(Boolean complete) {
                this.complete = complete;
                return this;
            }

            /**
             * <p>The returned data of the configuration.</p>
             * <blockquote>
             * <p> The data is returned only if the value of isFinish is <strong>true</strong>. This value indicates that the asynchronous request is complete.</p>
             * </blockquote>
             */
            public Builder configResponse(ConfigResponse configResponse) {
                this.configResponse = configResponse;
                return this;
            }

            /**
             * <p>Indicates whether the asynchronous request failed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder fail(Boolean fail) {
                this.fail = fail;
                return this;
            }

            /**
             * <p>Indicates whether the asynchronous request was complete. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>The ID of the asynchronous request.</p>
             * 
             * <strong>example:</strong>
             * <p>async__665ee69612f1627c7fd9f3c85075****</p>
             */
            public Builder resultId(String resultId) {
                this.resultId = resultId;
                return this;
            }

            /**
             * <p>The state of the asynchronous request. Valid values:</p>
             * <ul>
             * <li><strong>RUNNING</strong></li>
             * <li><strong>SUCCESS</strong></li>
             * <li><strong>FAIL</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the asynchronous request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1645668213000</p>
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
