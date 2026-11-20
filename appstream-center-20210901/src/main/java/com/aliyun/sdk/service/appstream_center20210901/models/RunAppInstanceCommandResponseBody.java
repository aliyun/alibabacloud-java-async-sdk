// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link RunAppInstanceCommandResponseBody} extends {@link TeaModel}
 *
 * <p>RunAppInstanceCommandResponseBody</p>
 */
public class RunAppInstanceCommandResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CommandResultModel")
    private CommandResultModel commandResultModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RunAppInstanceCommandResponseBody(Builder builder) {
        this.commandResultModel = builder.commandResultModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAppInstanceCommandResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commandResultModel
     */
    public CommandResultModel getCommandResultModel() {
        return this.commandResultModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CommandResultModel commandResultModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RunAppInstanceCommandResponseBody model) {
            this.commandResultModel = model.commandResultModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The command issuance result.</p>
         */
        public Builder commandResultModel(CommandResultModel commandResultModel) {
            this.commandResultModel = commandResultModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RunAppInstanceCommandResponseBody build() {
            return new RunAppInstanceCommandResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunAppInstanceCommandResponseBody} extends {@link TeaModel}
     *
     * <p>RunAppInstanceCommandResponseBody</p>
     */
    public static class CommandResultModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InvocationId")
        private String invocationId;

        private CommandResultModel(Builder builder) {
            this.invocationId = builder.invocationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommandResultModel create() {
            return builder().build();
        }

        /**
         * @return invocationId
         */
        public String getInvocationId() {
            return this.invocationId;
        }

        public static final class Builder {
            private String invocationId; 

            private Builder() {
            } 

            private Builder(CommandResultModel model) {
                this.invocationId = model.invocationId;
            } 

            /**
             * <p>The command execution ID. Only one execution ID is returned even when commands are issued in batches to multiple delivery groups. You can use this ID to call ListCommandInvocationResults to query the command execution results on each session.</p>
             * 
             * <strong>example:</strong>
             * <p>t-hz0jdfwd9f****</p>
             */
            public Builder invocationId(String invocationId) {
                this.invocationId = invocationId;
                return this;
            }

            public CommandResultModel build() {
                return new CommandResultModel(this);
            } 

        } 

    }
}
