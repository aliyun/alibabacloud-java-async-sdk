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
    @NameInMap("Commands")
    private Commands commands;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCommandsResponseBody(Builder builder) {
        this.commands = builder.commands;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommandsResponseBody create() {
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
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Commands commands; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Commands.
         */
        public Builder commands(Commands commands) {
            this.commands = commands;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
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
        @NameInMap("Category")
        private String category;

        @NameInMap("CommandContent")
        private String commandContent;

        @NameInMap("CommandId")
        private String commandId;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EnableParameter")
        private Boolean enableParameter;

        @NameInMap("InvokeTimes")
        private Integer invokeTimes;

        @NameInMap("Latest")
        private Boolean latest;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterNames")
        private ParameterNames parameterNames;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("Type")
        private String type;

        @NameInMap("Version")
        private Integer version;

        @NameInMap("WorkingDir")
        private String workingDir;

        private Command(Builder builder) {
            this.category = builder.category;
            this.commandContent = builder.commandContent;
            this.commandId = builder.commandId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.enableParameter = builder.enableParameter;
            this.invokeTimes = builder.invokeTimes;
            this.latest = builder.latest;
            this.name = builder.name;
            this.parameterNames = builder.parameterNames;
            this.provider = builder.provider;
            this.timeout = builder.timeout;
            this.type = builder.type;
            this.version = builder.version;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Command create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return enableParameter
         */
        public Boolean getEnableParameter() {
            return this.enableParameter;
        }

        /**
         * @return invokeTimes
         */
        public Integer getInvokeTimes() {
            return this.invokeTimes;
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
         * @return parameterNames
         */
        public ParameterNames getParameterNames() {
            return this.parameterNames;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        /**
         * @return timeout
         */
        public Long getTimeout() {
            return this.timeout;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        /**
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String category; 
            private String commandContent; 
            private String commandId; 
            private String creationTime; 
            private String description; 
            private Boolean enableParameter; 
            private Integer invokeTimes; 
            private Boolean latest; 
            private String name; 
            private ParameterNames parameterNames; 
            private String provider; 
            private Long timeout; 
            private String type; 
            private Integer version; 
            private String workingDir; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CommandContent.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * CommandId.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EnableParameter.
             */
            public Builder enableParameter(Boolean enableParameter) {
                this.enableParameter = enableParameter;
                return this;
            }

            /**
             * InvokeTimes.
             */
            public Builder invokeTimes(Integer invokeTimes) {
                this.invokeTimes = invokeTimes;
                return this;
            }

            /**
             * Latest.
             */
            public Builder latest(Boolean latest) {
                this.latest = latest;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParameterNames.
             */
            public Builder parameterNames(ParameterNames parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * Provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * WorkingDir.
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
