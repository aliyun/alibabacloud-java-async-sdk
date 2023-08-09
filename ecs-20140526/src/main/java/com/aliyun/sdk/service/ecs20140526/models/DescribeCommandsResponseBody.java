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
         * The queried commands.
         */
        public Builder commands(Commands commands) {
            this.commands = commands;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
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
         * The total number of commands.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommandsResponseBody build() {
            return new DescribeCommandsResponseBody(this);
        } 

    } 

    public static class PossibleValues extends TeaModel {
        @NameInMap("PossibleValue")
        private java.util.List < String > possibleValue;

        private PossibleValues(Builder builder) {
            this.possibleValue = builder.possibleValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PossibleValues create() {
            return builder().build();
        }

        /**
         * @return possibleValue
         */
        public java.util.List < String > getPossibleValue() {
            return this.possibleValue;
        }

        public static final class Builder {
            private java.util.List < String > possibleValue; 

            /**
             * PossibleValue.
             */
            public Builder possibleValue(java.util.List < String > possibleValue) {
                this.possibleValue = possibleValue;
                return this;
            }

            public PossibleValues build() {
                return new PossibleValues(this);
            } 

        } 

    }
    public static class ParameterDefinition extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("PossibleValues")
        private PossibleValues possibleValues;

        @NameInMap("Required")
        private Boolean required;

        private ParameterDefinition(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.parameterName = builder.parameterName;
            this.possibleValues = builder.possibleValues;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDefinition create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return possibleValues
         */
        public PossibleValues getPossibleValues() {
            return this.possibleValues;
        }

        /**
         * @return required
         */
        public Boolean getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String defaultValue; 
            private String description; 
            private String parameterName; 
            private PossibleValues possibleValues; 
            private Boolean required; 

            /**
             * The default value of the custom parameter.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The description of the custom parameter.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the custom parameter.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * The valid values of the custom enumeration parameter.
             */
            public Builder possibleValues(PossibleValues possibleValues) {
                this.possibleValues = possibleValues;
                return this;
            }

            /**
             * Indicates whether the custom parameter is required. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * Default value: false.
             */
            public Builder required(Boolean required) {
                this.required = required;
                return this;
            }

            public ParameterDefinition build() {
                return new ParameterDefinition(this);
            } 

        } 

    }
    public static class ParameterDefinitions extends TeaModel {
        @NameInMap("ParameterDefinition")
        private java.util.List < ParameterDefinition> parameterDefinition;

        private ParameterDefinitions(Builder builder) {
            this.parameterDefinition = builder.parameterDefinition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDefinitions create() {
            return builder().build();
        }

        /**
         * @return parameterDefinition
         */
        public java.util.List < ParameterDefinition> getParameterDefinition() {
            return this.parameterDefinition;
        }

        public static final class Builder {
            private java.util.List < ParameterDefinition> parameterDefinition; 

            /**
             * ParameterDefinition.
             */
            public Builder parameterDefinition(java.util.List < ParameterDefinition> parameterDefinition) {
                this.parameterDefinition = parameterDefinition;
                return this;
            }

            public ParameterDefinitions build() {
                return new ParameterDefinitions(this);
            } 

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
             * The name of the custom parameter.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The key of the tag of the command.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The value of the tag of the command.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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

        @NameInMap("ParameterDefinitions")
        private ParameterDefinitions parameterDefinitions;

        @NameInMap("ParameterNames")
        private ParameterNames parameterNames;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("Tags")
        private Tags tags;

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
            this.parameterDefinitions = builder.parameterDefinitions;
            this.parameterNames = builder.parameterNames;
            this.provider = builder.provider;
            this.tags = builder.tags;
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
         * @return parameterDefinitions
         */
        public ParameterDefinitions getParameterDefinitions() {
            return this.parameterDefinitions;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private ParameterDefinitions parameterDefinitions; 
            private ParameterNames parameterNames; 
            private String provider; 
            private Tags tags; 
            private Long timeout; 
            private String type; 
            private Integer version; 
            private String workingDir; 

            /**
             * The category of the common command.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The Base64-encoded command content.
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * The command ID.
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
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
             * The command description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the custom parameter feature was enabled for the command.
             */
            public Builder enableParameter(Boolean enableParameter) {
                this.enableParameter = enableParameter;
                return this;
            }

            /**
             * The number of tasks created by using the command.
             */
            public Builder invokeTimes(Integer invokeTimes) {
                this.invokeTimes = invokeTimes;
                return this;
            }

            /**
             * Indicates whether the common command is of the latest version. If multiple common commands from the same provider (`Provider`) belong to the same category and share the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.
             */
            public Builder latest(Boolean latest) {
                this.latest = latest;
                return this;
            }

            /**
             * The command name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The custom parameters.
             */
            public Builder parameterDefinitions(ParameterDefinitions parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * The custom parameter names that are parsed from the command content specified when the command was being created. If the custom parameter feature is not enabled, an empty list is returned.
             */
            public Builder parameterNames(ParameterNames parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * The provider of the common command.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * The tags of the command.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
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
             * The command type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The version of the common command. If multiple common commands from the same provider (`Provider`) belong to the same category and share the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.
             */
            public Builder version(Integer version) {
                this.version = version;
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
