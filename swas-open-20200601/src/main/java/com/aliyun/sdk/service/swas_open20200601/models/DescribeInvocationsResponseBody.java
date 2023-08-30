// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInvocationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvocationsResponseBody</p>
 */
public class DescribeInvocationsResponseBody extends TeaModel {
    @NameInMap("Invocations")
    private java.util.List < Invocations> invocations;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInvocationsResponseBody(Builder builder) {
        this.invocations = builder.invocations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvocationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invocations
     */
    public java.util.List < Invocations> getInvocations() {
        return this.invocations;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Invocations> invocations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The command name.
         */
        public Builder invocations(java.util.List < Invocations> invocations) {
            this.invocations = invocations;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInvocationsResponseBody build() {
            return new DescribeInvocationsResponseBody(this);
        } 

    } 

    public static class Invocations extends TeaModel {
        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandName")
        private String commandName;

        @NameInMap("CommandType")
        private String commandType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("InvocationStatus")
        private String invocationStatus;

        @NameInMap("InvokeId")
        private String invokeId;

        @NameInMap("InvokeStatus")
        private String invokeStatus;

        @NameInMap("Parameters")
        private java.util.Map < String, ? > parameters;

        private Invocations(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandName = builder.commandName;
            this.commandType = builder.commandType;
            this.creationTime = builder.creationTime;
            this.invocationStatus = builder.invocationStatus;
            this.invokeId = builder.invokeId;
            this.invokeStatus = builder.invokeStatus;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Invocations create() {
            return builder().build();
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return commandName
         */
        public String getCommandName() {
            return this.commandName;
        }

        /**
         * @return commandType
         */
        public String getCommandType() {
            return this.commandType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return invocationStatus
         */
        public String getInvocationStatus() {
            return this.invocationStatus;
        }

        /**
         * @return invokeId
         */
        public String getInvokeId() {
            return this.invokeId;
        }

        /**
         * @return invokeStatus
         */
        public String getInvokeStatus() {
            return this.invokeStatus;
        }

        /**
         * @return parameters
         */
        public java.util.Map < String, ? > getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandName; 
            private String commandType; 
            private String creationTime; 
            private String invocationStatus; 
            private String invokeId; 
            private String invokeStatus; 
            private java.util.Map < String, ? > parameters; 

            /**
             * The content of the command, which is Base64-encoded.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The name of the command.
             */
            public Builder commandName(String commandName) {
                this.commandName = commandName;
                return this;
            }

            /**
             * The type of the command. Valid values:
             * <p>
             * 
             * *   RunBatScript: batch command (applicable to Windows instances).
             * *   RunPowerShellScript: PowerShell command (applicable to Windows instances).
             * *   RunShellScript: shell command (applicable to Linux instances).
             */
            public Builder commandType(String commandType) {
                this.commandType = commandType;
                return this;
            }

            /**
             * The time when the command was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The status of the command. Valid values:
             * <p>
             * 
             * *   Pending: The command is being verified or sent.
             * *   Invalid: The specified command type or parameter is invalid.
             * *   Aborted: The command failed to be sent. To send a command to an instance, make sure that the instance is in the Running state and the command is sent to the instance within 1 minute.
             * *   Running: The command is being run on the instance.
             * *   Success: The command finishes running, and the exit code is 0.
             * *   Failed: The command finishes running, but the exit code is not 0.
             * *   Error: The running of the command cannot proceed due to an exception.
             * *   Timeout: The running of the command times out.
             * *   Cancelled: The running is canceled, and the command is not run.
             * *   Stopping: The command that is running is being stopped.
             * *   Terminated: The command is terminated while it is being run.
             */
            public Builder invocationStatus(String invocationStatus) {
                this.invocationStatus = invocationStatus;
                return this;
            }

            /**
             * The ID of the command task.
             */
            public Builder invokeId(String invokeId) {
                this.invokeId = invokeId;
                return this;
            }

            /**
             * The status of the command. Valid values:
             * <p>
             * 
             * *   Running: The command is running.
             * *   Finished: The command finishes running.
             * *   Failed: The running of the command failed.
             * *   Stopped: The running is stopped.
             */
            public Builder invokeStatus(String invokeStatus) {
                this.invokeStatus = invokeStatus;
                return this;
            }

            /**
             * The custom parameters in the command. If no custom parameter exists in the command, the default value is {}.
             */
            public Builder parameters(java.util.Map < String, ? > parameters) {
                this.parameters = parameters;
                return this;
            }

            public Invocations build() {
                return new Invocations(this);
            } 

        } 

    }
}
