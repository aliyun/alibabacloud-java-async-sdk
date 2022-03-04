// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunCommandResponseBody} extends {@link TeaModel}
 *
 * <p>RunCommandResponseBody</p>
 */
public class RunCommandResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("CommandId")
    private String commandId;

    @NameInMap("InvokeId")
    private String invokeId;

    private RunCommandResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.commandId = builder.commandId;
        this.invokeId = builder.invokeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private String commandId; 
        private String invokeId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the command.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * The ID of the command execution.
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        public RunCommandResponseBody build() {
            return new RunCommandResponseBody(this);
        } 

    } 

}
