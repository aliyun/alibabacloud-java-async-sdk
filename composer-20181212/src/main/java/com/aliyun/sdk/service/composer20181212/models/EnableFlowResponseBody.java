// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableFlowResponseBody} extends {@link TeaModel}
 *
 * <p>EnableFlowResponseBody</p>
 */
public class EnableFlowResponseBody extends TeaModel {
    @NameInMap("FlowStatus")
    private String flowStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private EnableFlowResponseBody(Builder builder) {
        this.flowStatus = builder.flowStatus;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableFlowResponseBody create() {
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
         * The status of the workflow. Valid values:
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
         * Indicates whether the operation was successful. Valid values:
         * <p>
         * 
         * *   **true**: The operation was successful.
         * *   **false**: The operation failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnableFlowResponseBody build() {
            return new EnableFlowResponseBody(this);
        } 

    } 

}
