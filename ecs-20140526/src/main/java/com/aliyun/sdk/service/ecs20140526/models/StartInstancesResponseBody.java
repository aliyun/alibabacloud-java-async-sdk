// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>StartInstancesResponseBody</p>
 */
public class StartInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceResponses")
    private InstanceResponses instanceResponses;

    @NameInMap("RequestId")
    private String requestId;

    private StartInstancesResponseBody(Builder builder) {
        this.instanceResponses = builder.instanceResponses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceResponses
     */
    public InstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceResponses instanceResponses; 
        private String requestId; 

        /**
         * The information about the ECS instance. The information contains the status of each instance before and after the operation is called and the operation results.
         */
        public Builder instanceResponses(InstanceResponses instanceResponses) {
            this.instanceResponses = instanceResponses;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartInstancesResponseBody build() {
            return new StartInstancesResponseBody(this);
        } 

    } 

    public static class InstanceResponse extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CurrentStatus")
        private String currentStatus;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("PreviousStatus")
        private String previousStatus;

        private InstanceResponse(Builder builder) {
            this.code = builder.code;
            this.currentStatus = builder.currentStatus;
            this.instanceId = builder.instanceId;
            this.message = builder.message;
            this.previousStatus = builder.previousStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResponse create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return previousStatus
         */
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public static final class Builder {
            private String code; 
            private String currentStatus; 
            private String instanceId; 
            private String message; 
            private String previousStatus; 

            /**
             * The error code that is returned for the operation on the ECS instance. A return value of 200 indicates that the operation is successful. For more information, see the "Error codes" section in this topic.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The status of the ECS instance after the operation is called.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * The ID of the ECS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The error message that is returned for the operation on the ECS instance. A return value of success indicates that the operation is successful. For more information, see the "Error codes" section in this topic.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The status of the ECS instance before the operation is called.
             */
            public Builder previousStatus(String previousStatus) {
                this.previousStatus = previousStatus;
                return this;
            }

            public InstanceResponse build() {
                return new InstanceResponse(this);
            } 

        } 

    }
    public static class InstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        private java.util.List < InstanceResponse> instanceResponse;

        private InstanceResponses(Builder builder) {
            this.instanceResponse = builder.instanceResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceResponses create() {
            return builder().build();
        }

        /**
         * @return instanceResponse
         */
        public java.util.List < InstanceResponse> getInstanceResponse() {
            return this.instanceResponse;
        }

        public static final class Builder {
            private java.util.List < InstanceResponse> instanceResponse; 

            /**
             * InstanceResponse.
             */
            public Builder instanceResponse(java.util.List < InstanceResponse> instanceResponse) {
                this.instanceResponse = instanceResponse;
                return this;
            }

            public InstanceResponses build() {
                return new InstanceResponses(this);
            } 

        } 

    }
}
