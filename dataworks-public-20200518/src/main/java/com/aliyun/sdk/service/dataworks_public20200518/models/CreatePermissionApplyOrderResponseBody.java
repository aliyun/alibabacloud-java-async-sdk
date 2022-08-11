// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePermissionApplyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePermissionApplyOrderResponseBody</p>
 */
public class CreatePermissionApplyOrderResponseBody extends TeaModel {
    @NameInMap("FlowId")
    private java.util.List < String > flowId;

    @NameInMap("RequestId")
    private String requestId;

    private CreatePermissionApplyOrderResponseBody(Builder builder) {
        this.flowId = builder.flowId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePermissionApplyOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return flowId
     */
    public java.util.List < String > getFlowId() {
        return this.flowId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > flowId; 
        private String requestId; 

        /**
         * FlowId.
         */
        public Builder flowId(java.util.List < String > flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePermissionApplyOrderResponseBody build() {
            return new CreatePermissionApplyOrderResponseBody(this);
        } 

    } 

}
