// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
    private java.util.List < Commands> commands;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return commands
     */
    public java.util.List < Commands> getCommands() {
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
        private java.util.List < Commands> commands; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Commands.
         */
        public Builder commands(java.util.List < Commands> commands) {
            this.commands = commands;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
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
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCommandsResponseBody build() {
            return new DescribeCommandsResponseBody(this);
        } 

    } 

    public static class ParameterDefinitions extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Description")
        private String description;

        @NameInMap("ParameterName")
        private String parameterName;

        @NameInMap("PossibleValues")
        private java.util.List < String > possibleValues;

        @NameInMap("Required")
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
        public java.util.List < String > getPossibleValues() {
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
            private java.util.List < String > possibleValues; 
            private Boolean required; 

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
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
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * PossibleValues.
             */
            public Builder possibleValues(java.util.List < String > possibleValues) {
                this.possibleValues = possibleValues;
                return this;
            }

            /**
             * Required.
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
    public static class Commands extends TeaModel {
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

        @NameInMap("Name")
        private String name;

        @NameInMap("ParameterDefinitions")
        private java.util.List < ParameterDefinitions> parameterDefinitions;

        @NameInMap("ParameterNames")
        private java.util.List < String > parameterNames;

        @NameInMap("Provider")
        private String provider;

        @NameInMap("Timeout")
        private Long timeout;

        @NameInMap("Type")
        private String type;

        @NameInMap("WorkingDir")
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
        public java.util.List < ParameterDefinitions> getParameterDefinitions() {
            return this.parameterDefinitions;
        }

        /**
         * @return parameterNames
         */
        public java.util.List < String > getParameterNames() {
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
            private java.util.List < ParameterDefinitions> parameterDefinitions; 
            private java.util.List < String > parameterNames; 
            private String provider; 
            private Long timeout; 
            private String type; 
            private String workingDir; 

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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParameterDefinitions.
             */
            public Builder parameterDefinitions(java.util.List < ParameterDefinitions> parameterDefinitions) {
                this.parameterDefinitions = parameterDefinitions;
                return this;
            }

            /**
             * ParameterNames.
             */
            public Builder parameterNames(java.util.List < String > parameterNames) {
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
             * WorkingDir.
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
