// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableFlowResponseBody} extends {@link TeaModel}
 *
 * <p>DisableFlowResponseBody</p>
 */
public class DisableFlowResponseBody extends TeaModel {
    @NameInMap("FlowStatus")
    private String flowStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DisableFlowResponseBody(Builder builder) {
        this.flowStatus = builder.flowStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowStatus
     */
    public String getFlowStatus() {
        return this.flowStatus;
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
        private String flowStatus; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status of the workflow.
         * <p>
         * 
         * *   **Enabled**: The workflow is enabled.
         * *   **Disabled**: The workflow is disabled.
         */
        public Builder flowStatus(String flowStatus) {
            this.flowStatus = flowStatus;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the operation was successful.
         * <p>
         * 
         * *   **true**: The operation was successful.
         * *   **false**: The operation failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DisableFlowResponseBody build() {
            return new DisableFlowResponseBody(this);
        } 

    } 

}
