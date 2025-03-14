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
 * {@link DescribeCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommandsResponseBody</p>
 */
public class DescribeCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commands")
    private java.util.List<Commands> commands;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commands
     */
    public java.util.List<Commands> getCommands() {
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
        private java.util.List<Commands> commands; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCommandsResponseBody model) {
            this.commands = model.commands;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The queried commands.</p>
         */
        public Builder commands(java.util.List<Commands> commands) {
            this.commands = commands;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of commands.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
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
    public static class ParameterDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("PossibleValues")
        private java.util.List<String> possibleValues;

        @com.aliyun.core.annotation.NameInMap("Required")
        private Boolean required;

        private ParameterDefinitions(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.description = builder.description;
            this.parameterName = builder.parameterName;
            this.possibleValues = builder.possibleValues;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParameterDefinitions create() {
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
        public java.util.List<String> getPossibleValues() {
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
            private java.util.List<String> possibleValues; 
            private Boolean required; 

            private Builder() {
            } 

            private Builder(ParameterDefinitions model) {
                this.defaultValue = model.defaultValue;
                this.description = model.description;
                this.parameterName = model.parameterName;
                this.possibleValues = model.possibleValues;
                this.required = model.required;
            } 

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
             * <p>Command Assistant Agent Installation Package Path</p>
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
             * <p>The valid values of the custom parameter.</p>
             */
            public Builder possibleValues(java.util.List<String> possibleValues) {
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
             * <p>false</p>
             */
            public Builder required(Boolean required) {
                this.required = required;
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
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
    public static class Commands extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParameterDefinitions")
        private java.util.List<ParameterDefinitions> parameterDefinitions;

        @com.aliyun.core.annotation.NameInMap("ParameterNames")
        private java.util.List<String> parameterNames;

        @com.aliyun.core.annotation.NameInMap("Provider")
        private String provider;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Long timeout;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("WorkingDir")
        private String workingDir;

        private Commands(Builder builder) {
            this.commandContent = builder.commandContent;
            this.commandId = builder.commandId;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.enableParameter = builder.enableParameter;
            this.name = builder.name;
            this.parameterDefinitions = builder.parameterDefinitions;
            this.parameterNames = builder.parameterNames;
            this.provider = builder.provider;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.timeout = builder.timeout;
            this.type = builder.type;
            this.workingDir = builder.workingDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameterDefinitions
         */
        public java.util.List<ParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        /**
         * @return parameterNames
         */
        public java.util.List<String> getParameterNames() {
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
        public java.util.List<Tags> getTags() {
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
         * @return workingDir
         */
        public String getWorkingDir() {
            return this.workingDir;
        }

        public static final class Builder {
            private String commandContent; 
            private String commandId; 
            private String creationTime; 
            private String description; 
            private Boolean enableParameter; 
            private String name; 
            private java.util.List<ParameterDefinitions> parameterDefinitions; 
            private java.util.List<String> parameterNames; 
            private String provider; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private Long timeout; 
            private String type; 
            private String workingDir; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.commandContent = model.commandContent;
                this.commandId = model.commandId;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.enableParameter = model.enableParameter;
                this.name = model.name;
                this.parameterDefinitions = model.parameterDefinitions;
                this.parameterNames = model.parameterNames;
                this.provider = model.provider;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.timeout = model.timeout;
                this.type = model.type;
                this.workingDir = model.workingDir;
            } 

            /**
             * <p>The content of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>cat /etc/ssh/sshd_config</p>
             */
            public Builder commandContent(String commandContent) {
                this.commandContent = commandContent;
                return this;
            }

            /**
             * <p>The command ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-gov1k1tqwi9****</p>
             */
            public Builder commandId(String commandId) {
                this.commandId = commandId;
                return this;
            }

            /**
             * <p>The time when the command was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-05T06:38:53Z</p>
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
             * <p>false</p>
             */
            public Builder enableParameter(Boolean enableParameter) {
                this.enableParameter = enableParameter;
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
             * <p>Details of the custom parameter.</p>
             */
            public Builder parameterDefinitions(java.util.List<ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * <p>The custom parameter names that are parsed from the command content specified when the command was created. The custom parameter names are returned in the list format. If the custom parameter feature is disabled, an empty list is returned.</p>
             */
            public Builder parameterNames(java.util.List<String> parameterNames) {
                this.parameterNames = parameterNames;
                return this;
            }

            /**
             * <p>The provider of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>User</p>
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2bti7cf7****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The tags that are bound to the command.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The timeout period of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
             * <p>The execution path of the command.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder workingDir(String workingDir) {
                this.workingDir = workingDir;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
}
