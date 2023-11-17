// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DisableAutoResourceOptimizeRulesResponseBody</p>
 */
public class DisableAutoResourceOptimizeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DisableAutoResourceOptimizeRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAutoResourceOptimizeRulesResponseBody create() {
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

        public DisableAutoResourceOptimizeRulesResponseBody build() {
            return new DisableAutoResourceOptimizeRulesResponseBody(this);
        } 

    } 

    public static class ConfigFailInstanceList extends TeaModel {
        @NameInMap("ConfigSuccess")
        private Boolean configSuccess;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("InstanceId")
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
             * Indicates whether the automatic tablespace fragment recycling feature is disabled. Valid values:
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
             * The error message returned if the request failed.
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
        @NameInMap("ConfigSuccess")
        private Boolean configSuccess;

        @NameInMap("InstanceId")
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
             * Indicates whether the automatic tablespace fragment recycling feature is disabled. Valid values:
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
    public static class Data extends TeaModel {
        @NameInMap("ConfigFailInstanceCount")
        private Long configFailInstanceCount;

        @NameInMap("ConfigFailInstanceList")
        private java.util.List < ConfigFailInstanceList> configFailInstanceList;

        @NameInMap("ConfigSuccessInstanceCount")
        private Long configSuccessInstanceCount;

        @NameInMap("ConfigSuccessInstanceList")
        private java.util.List < ConfigSuccessInstanceList> configSuccessInstanceList;

        @NameInMap("TotalInstanceCount")
        private Long totalInstanceCount;

        private Data(Builder builder) {
            this.configFailInstanceCount = builder.configFailInstanceCount;
            this.configFailInstanceList = builder.configFailInstanceList;
            this.configSuccessInstanceCount = builder.configSuccessInstanceCount;
            this.configSuccessInstanceList = builder.configSuccessInstanceList;
            this.totalInstanceCount = builder.totalInstanceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
             * The number of database instances for which the automatic tablespace fragment recycling feature failed to be disabled.
             */
            public Builder configFailInstanceCount(Long configFailInstanceCount) {
                this.configFailInstanceCount = configFailInstanceCount;
                return this;
            }

            /**
             * The list of database instances for which the automatic tablespace fragment recycling feature failed to be disabled.
             */
            public Builder configFailInstanceList(java.util.List < ConfigFailInstanceList> configFailInstanceList) {
                this.configFailInstanceList = configFailInstanceList;
                return this;
            }

            /**
             * The number of database instances for which the automatic tablespace fragment recycling feature is disabled.
             */
            public Builder configSuccessInstanceCount(Long configSuccessInstanceCount) {
                this.configSuccessInstanceCount = configSuccessInstanceCount;
                return this;
            }

            /**
             * The list of database instances for which the automatic tablespace fragment recycling feature is disabled.
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
