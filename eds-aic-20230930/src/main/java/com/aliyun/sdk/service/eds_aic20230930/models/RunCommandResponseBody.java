// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RunCommandResponseBody} extends {@link TeaModel}
 *
 * <p>RunCommandResponseBody</p>
 */
public class RunCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunCommandResponseBody(Builder builder) {
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RunCommandResponseBody model) {
            this.invokeId = model.invokeId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the command execution. You can use the command execution ID to query the output of a command.</p>
         * 
         * <strong>example:</strong>
         * <p>t-gov2ujrk32v4****</p>
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>440D7342-5E7C-B2DB-D0B4EAC2BDF1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunCommandResponseBody build() {
            return new RunCommandResponseBody(this);
        } 

    } 

}
