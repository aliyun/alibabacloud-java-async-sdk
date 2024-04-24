// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInvocationAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInvocationAttributeResponseBody</p>
 */
public class ModifyInvocationAttributeResponseBody extends TeaModel {
    @NameInMap("CommandId")
    private String commandId;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyInvocationAttributeResponseBody(Builder builder) {
        this.commandId = builder.commandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInvocationAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commandId; 
        private String requestId; 

        /**
         * The command ID.
         * <p>
         * 
         * *   A new command is added and the `CommandId` value of the new command is returned only when `CommandContent` is changed.
         * *   No new command is added and the `CommandId` value of the command that is running is returned if `CommandContent` is not changed.
         * *   If you set `KeepCommand` to `true` when you called the [InvokeCommand](~~64841~~) or [RunCommand](~~141751~~) operation, a new command is added and retained. Otherwise, commands related to the task are deleted after all executions of the task are complete or the task is manually stopped.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyInvocationAttributeResponseBody build() {
            return new ModifyInvocationAttributeResponseBody(this);
        } 

    } 

}
