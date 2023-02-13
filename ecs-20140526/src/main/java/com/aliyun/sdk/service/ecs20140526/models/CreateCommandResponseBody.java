// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommandResponseBody</p>
 */
public class CreateCommandResponseBody extends TeaModel {
    @NameInMap("CommandId")
    private String commandId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateCommandResponseBody(Builder builder) {
        this.commandId = builder.commandId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommandResponseBody create() {
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
         * The ID of the command.
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCommandResponseBody build() {
            return new CreateCommandResponseBody(this);
        } 

    } 

}
