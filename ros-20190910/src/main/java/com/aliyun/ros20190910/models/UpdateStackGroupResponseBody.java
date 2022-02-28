// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateStackGroupResponseBody</p>
 */
public class UpdateStackGroupResponseBody extends TeaModel {
    @NameInMap("OperationId")
    private String operationId;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateStackGroupResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStackGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String operationId; 
        private String requestId; 

        /**
         * OperationId.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateStackGroupResponseBody build() {
            return new UpdateStackGroupResponseBody(this);
        } 

    } 

}
