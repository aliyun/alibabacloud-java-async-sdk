// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
 * {@link InvokeCommandResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeCommandResponseBody</p>
 */
public class InvokeCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InvokeCommandResponseBody(Builder builder) {
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return invokeId
     */
    public String getInvokeId() {
        return this.invokeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String invokeId; 
        private String requestId; 

        /**
         * <p>The execution ID of the command.</p>
         * 
         * <strong>example:</strong>
         * <p>t-bj02prjhw1n****</p>
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InvokeCommandResponseBody build() {
            return new InvokeCommandResponseBody(this);
        } 

    } 

}
