// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataShareInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>SetDataShareInstanceResponseBody</p>
 */
public class SetDataShareInstanceResponseBody extends TeaModel {
    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private SetDataShareInstanceResponseBody(Builder builder) {
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataShareInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errMessage; 
        private String requestId; 
        private String status; 

        /**
         * The error message returned if the operation fails.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * The state of the operation. Valid values:
         * <p>
         * 
         * *   **success**: The operation is successful.
         * *   **failed**: The operation fails.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public SetDataShareInstanceResponseBody build() {
            return new SetDataShareInstanceResponseBody(this);
        } 

    } 

}
