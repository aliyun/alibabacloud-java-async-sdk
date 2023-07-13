// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommandsResponseBody</p>
 */
public class ListCommandsResponseBody extends TeaModel {
    @NameInMap("Commands")
    private Commands commands;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListCommandsResponseBody(Builder builder) {
        this.commands = builder.commands;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return commands
     */
    public Commands getCommands() {
        return this.commands;
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
        private Commands commands; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The list of commands.
         */
        public Builder commands(Commands commands) {
            this.commands = commands;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCommandsResponseBody build() {
            return new ListCommandsResponseBody(this);
        } 

    } 

    public static class Command extends TeaModel {
        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("Timeout")
        private String timeout;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Command(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandId = builder.commandId;
            this.timeout = builder.timeout;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Command create() {
            return builder().build();
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandId; 
            private String timeout; 
            private String workingDir; 

            /**
             * The content of the command.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
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
             * The timeout period. Unit: seconds.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The working directory of the command.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Command build() {
                return new Command(this);
            } 

        } 

    }
    public static class Commands extends TeaModel {
        @NameInMap("Command")
        private java.util.List < Command> command;

        private Commands(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List < Command> getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List < Command> command; 

            /**
             * Command.
             */
            public Builder command(java.util.List < Command> command) {
                this.command = command;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
}
