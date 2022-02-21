// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteVehicleControlResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteVehicleControlResponseBody</p>
 */
public class ExecuteVehicleControlResponseBody extends TeaModel {
    @NameInMap("ExecutionInfo")
    private ExecutionInfo executionInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ExecuteVehicleControlResponseBody(Builder builder) {
        this.executionInfo = builder.executionInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteVehicleControlResponseBody create() {
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

        public ExecuteVehicleControlResponseBody build() {
            return new ExecuteVehicleControlResponseBody(this);
        } 

    } 

    public static class ExecutionInfo extends TeaModel {
        @NameInMap("ExecutionId")
        private String executionId;

        private ExecutionInfo(Builder builder) {
            this.executionId = builder.executionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExecutionInfo create() {
            return builder().build();
        }

        /**
         * @return executionId
         */
        public String getExecutionId() {
            return this.executionId;
        }

        public static final class Builder {
            private String executionId; 

            /**
             * ExecutionId.
             */
            public Builder executionId(String executionId) {
                this.executionId = executionId;
                return this;
            }

            public ExecutionInfo build() {
                return new ExecutionInfo(this);
            } 

        } 

    }
}
