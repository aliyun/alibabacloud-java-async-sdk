// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowLogResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFlowLogResponseBody</p>
 */
public class CreateFlowLogResponseBody extends TeaModel {
    @NameInMap("FlowLogId")
    private String flowLogId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("Success")
    private String success;

    private CreateFlowLogResponseBody(Builder builder) {
        this.flowLogId = builder.flowLogId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFlowLogResponseBody create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private String resourceGroupId; 
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateFlowLogResponseBody build() {
            return new CreateFlowLogResponseBody(this);
        } 

    } 

}
