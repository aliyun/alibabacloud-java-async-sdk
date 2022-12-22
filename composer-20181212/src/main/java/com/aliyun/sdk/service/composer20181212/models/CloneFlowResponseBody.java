// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneFlowResponseBody} extends {@link TeaModel}
 *
 * <p>CloneFlowResponseBody</p>
 */
public class CloneFlowResponseBody extends TeaModel {
    @NameInMap("FlowId")
    private String flowId;

    @NameInMap("RequestId")
    private String requestId;

    private CloneFlowResponseBody(Builder builder) {
        this.flowId = builder.flowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneFlowResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String flowId; 
        private String requestId; 

        /**
         * The ID of the cloned workflow.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneFlowResponseBody build() {
            return new CloneFlowResponseBody(this);
        } 

    } 

}
