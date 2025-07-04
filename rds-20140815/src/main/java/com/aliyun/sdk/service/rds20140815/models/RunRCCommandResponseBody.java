// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link RunRCCommandResponseBody} extends {@link TeaModel}
 *
 * <p>RunRCCommandResponseBody</p>
 */
public class RunRCCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunRCCommandResponseBody(Builder builder) {
        this.commandId = builder.commandId;
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunRCCommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
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
        private String commandId; 
        private String invokeId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunRCCommandResponseBody model) {
            this.commandId = model.commandId;
            this.invokeId = model.invokeId;
            this.requestId = model.requestId;
        } 

        /**
         * CommandId.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * InvokeId.
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunRCCommandResponseBody build() {
            return new RunRCCommandResponseBody(this);
        } 

    } 

}
