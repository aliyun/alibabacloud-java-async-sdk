// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSchedulerInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListSchedulerInstancesResponseBody</p>
 */
public class ListSchedulerInstancesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SchedulerInstances")
    private java.util.List < SchedulerInstances> schedulerInstances;

    @NameInMap("Success")
    private Boolean success;

    private ListSchedulerInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.schedulerInstances = builder.schedulerInstances;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSchedulerInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return schedulerInstances
     */
    public java.util.List < SchedulerInstances> getSchedulerInstances() {
        return this.schedulerInstances;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List < SchedulerInstances> schedulerInstances; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SchedulerInstances.
         */
        public Builder schedulerInstances(java.util.List < SchedulerInstances> schedulerInstances) {
            this.schedulerInstances = schedulerInstances;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListSchedulerInstancesResponseBody build() {
            return new ListSchedulerInstancesResponseBody(this);
        } 

    } 

    public static class SchedulerInstances extends TeaModel {
        @NameInMap("BaseStrategy")
        private String baseStrategy;

        @NameInMap("Business")
        private String business;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MaxConcurrency")
        private Integer maxConcurrency;

        @NameInMap("OwnerId")
        private String ownerId;

        private SchedulerInstances(Builder builder) {
            this.baseStrategy = builder.baseStrategy;
            this.business = builder.business;
            this.instanceId = builder.instanceId;
            this.maxConcurrency = builder.maxConcurrency;
            this.ownerId = builder.ownerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulerInstances create() {
            return builder().build();
        }

        /**
         * @return baseStrategy
         */
        public String getBaseStrategy() {
            return this.baseStrategy;
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maxConcurrency
         */
        public Integer getMaxConcurrency() {
            return this.maxConcurrency;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        public static final class Builder {
            private String baseStrategy; 
            private String business; 
            private String instanceId; 
            private Integer maxConcurrency; 
            private String ownerId; 

            /**
             * BaseStrategy.
             */
            public Builder baseStrategy(String baseStrategy) {
                this.baseStrategy = baseStrategy;
                return this;
            }

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MaxConcurrency.
             */
            public Builder maxConcurrency(Integer maxConcurrency) {
                this.maxConcurrency = maxConcurrency;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            public SchedulerInstances build() {
                return new SchedulerInstances(this);
            } 

        } 

    }
}
