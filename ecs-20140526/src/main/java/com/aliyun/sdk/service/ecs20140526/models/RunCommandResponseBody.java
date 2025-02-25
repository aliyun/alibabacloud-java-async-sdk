// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.NameInMap("InvokeId")
    private String invokeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunCommandResponseBody(Builder builder) {
        this.commandId = builder.commandId;
        this.invokeId = builder.invokeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommandResponseBody create() {
        return builder().build();
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

        /**
         * <p>The command ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c-7d2a745b412b4601b2d47f6a768d****</p>
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            return this;
        }

        /**
         * <p>The command task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>t-7d2a745b412b4601b2d47f6a768d****</p>
         */
        public Builder invokeId(String invokeId) {
            this.invokeId = invokeId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
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
