// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDataShareInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>SetDataShareInstanceResponseBody</p>
 */
public class SetDataShareInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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
         * <p>The error message returned if the operation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>error message</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D5**********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The state of the operation. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The operation is successful.</li>
         * <li><strong>failed</strong>: The operation fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
