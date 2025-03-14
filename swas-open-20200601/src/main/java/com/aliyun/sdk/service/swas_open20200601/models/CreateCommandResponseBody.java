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
 * {@link CreateCommandResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCommandResponseBody</p>
 */
public class CreateCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String commandId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCommandResponseBody model) {
            this.commandId = model.commandId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-sh02yh0932w****</p>
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4****</p>
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
