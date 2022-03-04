// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommandsResponseBody</p>
 */
public class DescribeCommandsResponseBody extends TeaModel {
    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("Commands")
    private Commands commands;

    private DescribeCommandsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.commands = builder.commands;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return commands
     */
    public Commands getCommands() {
        return this.commands;
    }

    public static final class Builder {
        private Long pageSize; 
        private String requestId; 
        private Long pageNumber; 
        private Long totalCount; 
        private Commands commands; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Long pageSize) {
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
         * The page number of the command list.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of commands.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The type of the command dataset.
         */
        public Builder commands(Commands commands) {
            this.commands = commands;
            return this;
        }

        public DescribeCommandsResponseBody build() {
            return new DescribeCommandsResponseBody(this);
        } 

    } 

    public static class ParameterNames extends TeaModel {
        @NameInMap("ParameterName")
        private java.util.List < String > parameterName;

        private ParameterNames(Builder builder) {
            this.parameterName = builder.parameterName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterNames create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public java.util.List < String > getParameterName() {
            return this.parameterName;
        }

        public static final class Builder {
            private java.util.List < String > parameterName; 

            /**
             * ParameterName.
             */
            public Builder parameterName(java.util.List < String > parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            public ParameterNames build() {
                return new ParameterNames(this);
            } 

        } 

    }
    public static class Command extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Type")
        private String type;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("InvokeTimes")
        private Integer invokeTimes;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("WorkingDir")
        private String workingDir;

        @NameInMap("Description")
        private String description;

        @NameInMap("Version")
        private Integer version;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("Category")
        private String category;

        @NameInMap("Latest")
        private Boolean latest;

        @NameInMap("Name")
        private String name;

        @NameInMap("EnableParameter")
        private Boolean enableParameter;

        @NameInMap("ParameterNames")
        private ParameterNames parameterNames;

        private Command(Builder builder) {
            this.creationTime = builder.creationTime;
            this.type = builder.type;
            this.timeout = builder.timeout;
            this.invokeTimes = builder.invokeTimes;
            this.commandId = builder.commandId;
            this.workingDir = builder.workingDir;
            this.description = builder.description;
            this.version = builder.version;
            this.provider = builder.provider;
            this.commandContent = builder.commandContent;
            this.category = builder.category;
            this.latest = builder.latest;
            this.name = builder.name;
            this.enableParameter = builder.enableParameter;
            this.parameterNames = builder.parameterNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Command create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return invokeTimes
         */
        public Integer getInvokeTimes() {
            return this.invokeTimes;
        }

        /**
         * @return commandId
         */
        public String getCommandId() {
            return this.commandId;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return commandContent
         */
        public String getCommandContent() {
            return this.commandContent;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return latest
         */
        public Boolean getLatest() {
            return this.latest;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return enableParameter
         */
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        /**
         * @return parameterNames
         */
        public ParameterNames getParameterNames() {
            return this.parameterNames;
        }

        public static final class Builder {
            private String creationTime; 
            private String type; 
            private Long timeout; 
            private Integer invokeTimes; 
            private String commandId; 
            private String workingDir; 
            private String description; 
            private Integer version; 
            private String provider; 
            private String commandContent; 
            private String category; 
            private Boolean latest; 
            private String name; 
            private Boolean enableParameter; 
            private ParameterNames parameterNames; 

            /**
             * The time when the command was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The type of the command.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The timeout period.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * The number of tasks created by using this command.
             */
            public Builder invokeTimes(Integer invokeTimes) {
                this.invokeTimes = invokeTimes;
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
             * The execution path.
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            /**
             * The description of the command.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The version of the common command. If multiple commands belong to the same "Provider" and have the same name and category, these commands belong to different versions of the same command. This value is not returned for manually created cloud assistant commands.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * The provider of public commands.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * The command content, which is Base64-encoded and then transmitted.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The category of the common command.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Indicates whether the public Command is the latest version. If multiple commands belong to the same "Provider" and have the same name and category, these commands belong to different versions of the same command. This value is not returned for manually created cloud assistant commands.
             */
            public Builder latest(Boolean latest) {
                this.latest = latest;
                return this;
            }

            /**
             * The name of the command.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether to enable custom parameters.
             * <p>
             * 
             */
            public Builder enableParameter(Boolean enableParameter) {
                this.enableParameter = enableParameter;
                return this;
            }

            /**
             * ParameterNames.
             */
            public Builder parameterNames(ParameterNames parameterNames) {
                this.parameterNames = parameterNames;
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
