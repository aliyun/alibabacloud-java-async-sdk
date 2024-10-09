// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommandsResponseBody</p>
 */
public class DescribeCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commands")
    private Commands commands;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCommandsResponseBody(Builder builder) {
        this.commands = builder.commands;
        this.nextToken = builder.nextToken;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The queried commands.</p>
         */
        public Builder commands(Commands commands) {
            this.commands = commands;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdDWBF2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of commands.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommandsResponseBody build() {
            return new DescribeCommandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class PossibleValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PossibleValue")
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class ParameterDefinition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("PossibleValues")
        private PossibleValues possibleValues;

        @com.aliyun.core.annotation.NameInMap("Required")
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
             * <p>The default value of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun-client-assist.oss-accelerate.aliyuncs.com/linux/aliyun_assist_latest.rpm">https://aliyun-client-assist.oss-accelerate.aliyuncs.com/linux/aliyun_assist_latest.rpm</a></p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The description of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Download path of the Cloud Assistant Agent installation package.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * <p>The valid values of the custom parameter of the enumeration type.</p>
             */
            public Builder possibleValues(PossibleValues possibleValues) {
                this.possibleValues = possibleValues;
                return this;
            }

            /**
             * <p>Indicates whether the custom parameter is required. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class ParameterDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterDefinition")
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class ParameterNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
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
             * <p>The name of the custom parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>DownloadUrl</p>
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>The tag key of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>owner</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangsan</p>
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class Command extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CommandContent")
        private String commandContent;

        @com.aliyun.core.annotation.NameInMap("CommandId")
        private String commandId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EnableParameter")
        private Boolean enableParameter;

        @com.aliyun.core.annotation.NameInMap("InvokeTimes")
        private Integer invokeTimes;

        @com.aliyun.core.annotation.NameInMap("Latest")
        private Boolean latest;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterDefinitions")
        private ParameterDefinitions parameterDefinitions;

        @com.aliyun.core.annotation.NameInMap("ParameterNames")
        private ParameterNames parameterNames;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
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
            this.resourceGroupId = builder.resourceGroupId;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
            private String resourceGroupId; 
            private Tags tags; 
            private Long timeout; 
            private String type; 
            private Integer version; 
            private String workingDir; 

            /**
             * <p>The category of the common command.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The content of the command, which is Base64-encoded.</p>
             * <ul>
             * <li>If ContentEncoding is set to PlainText in the request, the original command content is returned.</li>
             * <li>If ContentEncoding is set to Base64 in the request, the Base64-encoded command content is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Y2QgL3Jvb3Q=</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The command ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-hz01272yr52****</p>
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * <p>The time when the command was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-17T06:52Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>testDescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the custom parameter feature is enabled for the command.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableParameter(Boolean enableParameter) {
                this.enableParameter = enableParameter;
                return this;
            }

            /**
             * <p>The number of tasks created by using the command.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder invokeTimes(Integer invokeTimes) {
                this.invokeTimes = invokeTimes;
                return this;
            }

            /**
             * <p>Indicates whether the common command is of the latest version. If multiple common commands from the same provider (<code>Provider</code>) belong to the same category and have the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder latest(Boolean latest) {
                this.latest = latest;
                return this;
            }

            /**
             * <p>The name of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The custom parameters.</p>
             */
            public Builder parameterDefinitions(ParameterDefinitions parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * <p>The custom parameter names that are parsed from the command content specified when the command was created. If the custom parameter feature is disabled, an empty list is returned.</p>
             */
            public Builder parameterNames(ParameterNames parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * <p>The provider of the common command.</p>
             * 
             * <strong>example:</strong>
             * <p>AlibabaCloud.ECS.GuestOS</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the command belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-123******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags of the command.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder timeout(Long timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The type of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>RunShellScript</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version of the common command. If multiple common commands from the same provider (<code>Provider</code>) belong to the same category and have the same name, these commands are different versions of the same command. This parameter is not returned for the Cloud Assistant commands that you created.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The execution path of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/</p>
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
    /**
     * 
     * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommandsResponseBody</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
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
