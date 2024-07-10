// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAvailabilityMetricResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvailabilityMetricResponseBody</p>
 */
public class GetAvailabilityMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAvailabilityMetricResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvailabilityMetricResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. The following limits are imposed on the ID:
         * <p>
         * 
         * *   **2xx**: The call was successful.
         * *   **3xx**: The call was redirected.
         * *   **4xx**: The call failed.
         * *   **5xx**: A server error occurred.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data entries returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The additional information that is returned. The following limits are imposed on the ID:
         * <p>
         * 
         * *   success: If the call is successful, **success** is returned.
         * *   An error code: If the call fails, an error code is returned.
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
         * Indicates whether the list of applications was obtained. The following limits are imposed on the ID:
         * <p>
         * 
         * *   **true**: The namespaces were obtained.
         * *   **false**: no
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAvailabilityMetricResponseBody build() {
            return new GetAvailabilityMetricResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("EnableAutoscale")
        private Long enableAutoscale;

        @com.aliyun.core.annotation.NameInMap("ErrorInstances")
        private Long errorInstances;

        @com.aliyun.core.annotation.NameInMap("Instances")
        private Long instances;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Runnings")
        private Long runnings;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.enableAutoscale = builder.enableAutoscale;
            this.errorInstances = builder.errorInstances;
            this.instances = builder.instances;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.runnings = builder.runnings;
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
         * @return enableAutoscale
         */
        public Long getEnableAutoscale() {
            return this.enableAutoscale;
        }

        /**
         * @return errorInstances
         */
        public Long getErrorInstances() {
            return this.errorInstances;
        }

        /**
         * @return instances
         */
        public Long getInstances() {
            return this.instances;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return runnings
         */
        public Long getRunnings() {
            return this.runnings;
        }

        public static final class Builder {
            private String appId; 
            private Long enableAutoscale; 
            private Long errorInstances; 
            private Long instances; 
            private String name; 
            private String regionId; 
            private Long runnings; 

            /**
             * The application ID.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Indicates whether an auto scaling policy is enabled. Valid values:
             * <p>
             * 
             * *   **1**: An auto scaling policy is enabled.
             * *   **0**: No auto scaling policy is enabled.
             */
            public Builder enableAutoscale(Long enableAutoscale) {
                this.enableAutoscale = enableAutoscale;
                return this;
            }

            /**
             * The number of abnormal instances.
             */
            public Builder errorInstances(Long errorInstances) {
                this.errorInstances = errorInstances;
                return this;
            }

            /**
             * The expected number of instances.
             */
            public Builder instances(Long instances) {
                this.instances = instances;
                return this;
            }

            /**
             * The application name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The current number of instances.
             */
            public Builder runnings(Long runnings) {
                this.runnings = runnings;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
