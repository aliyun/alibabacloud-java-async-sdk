// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowlogResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowlogResponseBody</p>
 */
public class CreateFlowlogResponseBody extends TeaModel {
    @NameInMap("FlowLogId")
    private String flowLogId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CreateFlowlogResponseBody(Builder builder) {
        this.flowLogId = builder.flowLogId;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowlogResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowLogId
     */
    public String getFlowLogId() {
        return this.flowLogId;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String flowLogId; 
        private String requestId; 
        private String success; 

        /**
         * FlowLogId.
         */
        public Builder flowLogId(String flowLogId) {
            this.flowLogId = flowLogId;
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateFlowlogResponseBody build() {
            return new CreateFlowlogResponseBody(this);
        } 

    } 

}
