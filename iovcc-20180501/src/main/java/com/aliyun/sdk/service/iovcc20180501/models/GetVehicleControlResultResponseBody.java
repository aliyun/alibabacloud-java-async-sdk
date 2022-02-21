// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVehicleControlResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVehicleControlResultResponseBody</p>
 */
public class GetVehicleControlResultResponseBody extends TeaModel {
    @NameInMap("ExecutionInfo")
    private ExecutionInfo executionInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetVehicleControlResultResponseBody(Builder builder) {
        this.executionInfo = builder.executionInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVehicleControlResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return executionInfo
     */
    public ExecutionInfo getExecutionInfo() {
        return this.executionInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExecutionInfo executionInfo; 
        private String requestId; 

        /**
         * ExecutionInfo.
         */
        public Builder executionInfo(ExecutionInfo executionInfo) {
            this.executionInfo = executionInfo;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetVehicleControlResultResponseBody build() {
            return new GetVehicleControlResultResponseBody(this);
        } 

    } 

    public static class ExecutionInfo extends TeaModel {
        @NameInMap("Status")
        private String status;

        @NameInMap("SubStatus")
        private String subStatus;

        private ExecutionInfo(Builder builder) {
            this.status = builder.status;
            this.subStatus = builder.subStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionInfo create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subStatus
         */
        public String getSubStatus() {
            return this.subStatus;
        }

        public static final class Builder {
            private String status; 
            private String subStatus; 

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubStatus.
             */
            public Builder subStatus(String subStatus) {
                this.subStatus = subStatus;
                return this;
            }

            public ExecutionInfo build() {
                return new ExecutionInfo(this);
            } 

        } 

    }
}
