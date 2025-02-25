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
 * {@link ModifyInvocationAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInvocationAttributeResponseBody</p>
 */
public class ModifyInvocationAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandId")
    private String commandId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The command ID.</p>
         * <ul>
         * <li>A new command is added and the <code>CommandId</code> value of the new command is returned only when <code>CommandContent</code> is changed.</li>
         * <li>No new command is added and the <code>CommandId</code> value of the command that is running is returned if <code>CommandContent</code> is not changed.</li>
         * <li>If you set <code>KeepCommand</code> to <code>true</code> when you called the <a href="https://help.aliyun.com/document_detail/64841.html">InvokeCommand</a> or <a href="https://help.aliyun.com/document_detail/141751.html">RunCommand</a> operation, a new command is added and retained. Otherwise, commands related to the task are deleted after all executions of the task are complete or the task is manually stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>c-hz01272yr52****</p>
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
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

        public ModifyInvocationAttributeResponseBody build() {
            return new ModifyInvocationAttributeResponseBody(this);
        } 

    } 

}
