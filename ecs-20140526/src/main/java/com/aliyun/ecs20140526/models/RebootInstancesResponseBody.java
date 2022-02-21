// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>RebootInstancesResponseBody</p>
 */
public class RebootInstancesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("InstanceResponses")
    private InstanceResponses instanceResponses;

    private RebootInstancesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.instanceResponses = builder.instanceResponses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return instanceResponses
     */
    public InstanceResponses getInstanceResponses() {
        return this.instanceResponses;
    }

    public static final class Builder {
        private String requestId; 
        private InstanceResponses instanceResponses; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array consisting of InstanceResposne, which returns the status and result of each instance operation.
         */
        public Builder instanceResponses(InstanceResponses instanceResponses) {
            this.instanceResponses = instanceResponses;
            return this;
        }

        public RebootInstancesResponseBody build() {
            return new RebootInstancesResponseBody(this);
        } 

    } 

    public static class InstanceResponse extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Message")
        private String message;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("CurrentStatus")
        private String currentStatus;

        @NameInMap("PreviousStatus")
        private String previousStatus;

        private InstanceResponse(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.instanceId = builder.instanceId;
            this.currentStatus = builder.currentStatus;
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
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return currentStatus
         */
        public String getCurrentStatus() {
            return this.currentStatus;
        }

        /**
         * @return previousStatus
         */
        public String getPreviousStatus() {
            return this.previousStatus;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String instanceId; 
            private String currentStatus; 
            private String previousStatus; 

            /**
             * The error code of the instance operation result. The return value 200 is successful. For more information, see the following error codes.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The error message returned for the instance operation. The Success returned value is successful. For more information, see the following error codes.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The current status of the instance.
             */
            public Builder currentStatus(String currentStatus) {
                this.currentStatus = currentStatus;
                return this;
            }

            /**
             * The status of the instance before the operation.
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
