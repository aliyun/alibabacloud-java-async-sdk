// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePermissionApplyOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePermissionApplyOrderResponseBody</p>
 */
public class CreatePermissionApplyOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private java.util.List < String > flowId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The request order ID.</p>
         */
        public Builder flowId(java.util.List < String > flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376****</p>
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
