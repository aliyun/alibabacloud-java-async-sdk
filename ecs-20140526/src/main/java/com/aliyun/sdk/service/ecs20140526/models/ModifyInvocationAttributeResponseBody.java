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
         * CommandId.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * RequestId.
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
