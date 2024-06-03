// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetApplicationResponseBody</p>
 */
public class GetApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private Application application;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetApplicationResponseBody(Builder builder) {
        this.application = builder.application;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return application
     */
    public Application getApplication() {
        return this.application;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Application application; 
        private String requestId; 

        /**
         * Application.
         */
        public Builder application(Application application) {
            this.application = application;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetApplicationResponseBody build() {
            return new GetApplicationResponseBody(this);
        } 

    } 

    public static class ValueAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ValueIncrementStep")
        private String valueIncrementStep;

        @com.aliyun.core.annotation.NameInMap("ValueMaximum")
        private String valueMaximum;

        @com.aliyun.core.annotation.NameInMap("ValueMinimum")
        private String valueMinimum;

        @com.aliyun.core.annotation.NameInMap("ValueType")
        private String valueType;

        @com.aliyun.core.annotation.NameInMap("ValueUnit")
        private String valueUnit;

        private ValueAttribute(Builder builder) {
            this.description = builder.description;
            this.valueIncrementStep = builder.valueIncrementStep;
            this.valueMaximum = builder.valueMaximum;
            this.valueMinimum = builder.valueMinimum;
            this.valueType = builder.valueType;
            this.valueUnit = builder.valueUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueAttribute create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return valueIncrementStep
         */
        public String getValueIncrementStep() {
            return this.valueIncrementStep;
        }

        /**
         * @return valueMaximum
         */
        public String getValueMaximum() {
            return this.valueMaximum;
        }

        /**
         * @return valueMinimum
         */
        public String getValueMinimum() {
            return this.valueMinimum;
        }

        /**
         * @return valueType
         */
        public String getValueType() {
            return this.valueType;
        }

        /**
         * @return valueUnit
         */
        public String getValueUnit() {
            return this.valueUnit;
        }

        public static final class Builder {
            private String description; 
            private String valueIncrementStep; 
            private String valueMaximum; 
            private String valueMinimum; 
            private String valueType; 
            private String valueUnit; 

            /**
             * 值表述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 值步长。
             */
            public Builder valueIncrementStep(String valueIncrementStep) {
                this.valueIncrementStep = valueIncrementStep;
                return this;
            }

            /**
             * 最大值。
             */
            public Builder valueMaximum(String valueMaximum) {
                this.valueMaximum = valueMaximum;
                return this;
            }

            /**
             * 最小值。
             */
            public Builder valueMinimum(String valueMinimum) {
                this.valueMinimum = valueMinimum;
                return this;
            }

            /**
             * 属性值类型。
             */
            public Builder valueType(String valueType) {
                this.valueType = valueType;
                return this;
            }

            /**
             * 值单位。
             */
            public Builder valueUnit(String valueUnit) {
                this.valueUnit = valueUnit;
                return this;
            }

            public ValueAttribute build() {
                return new ValueAttribute(this);
            } 

        } 

    }
    public static class ActionParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ValueAttribute")
        private ValueAttribute valueAttribute;

        private ActionParams(Builder builder) {
            this.description = builder.description;
            this.key = builder.key;
            this.valueAttribute = builder.valueAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionParams create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return valueAttribute
         */
        public ValueAttribute getValueAttribute() {
            return this.valueAttribute;
        }

        public static final class Builder {
            private String description; 
            private String key; 
            private ValueAttribute valueAttribute; 

            /**
             * 动作参数描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 动作参数KEY。
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 动作参数属性。
             */
            public Builder valueAttribute(ValueAttribute valueAttribute) {
                this.valueAttribute = valueAttribute;
                return this;
            }

            public ActionParams build() {
                return new ActionParams(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("ActionParams")
        private java.util.List < ActionParams> actionParams;

        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RunActionScope")
        private String runActionScope;

        private Actions(Builder builder) {
            this.actionName = builder.actionName;
            this.actionParams = builder.actionParams;
            this.command = builder.command;
            this.componentName = builder.componentName;
            this.description = builder.description;
            this.runActionScope = builder.runActionScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return actionParams
         */
        public java.util.List < ActionParams> getActionParams() {
            return this.actionParams;
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return runActionScope
         */
        public String getRunActionScope() {
            return this.runActionScope;
        }

        public static final class Builder {
            private String actionName; 
            private java.util.List < ActionParams> actionParams; 
            private String command; 
            private String componentName; 
            private String description; 
            private String runActionScope; 

            /**
             * 操作名称。
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * 操作参数。
             */
            public Builder actionParams(java.util.List < ActionParams> actionParams) {
                this.actionParams = actionParams;
                return this;
            }

            /**
             * 命令。
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * 组件名称。
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * 操作描述。
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 执行范围。
             */
            public Builder runActionScope(String runActionScope) {
                this.runActionScope = runActionScope;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class Application extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List < Actions> actions;

        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ApplicationState")
        private String applicationState;

        @com.aliyun.core.annotation.NameInMap("ApplicationVersion")
        private String applicationVersion;

        @com.aliyun.core.annotation.NameInMap("CommunityVersion")
        private String communityVersion;

        private Application(Builder builder) {
            this.actions = builder.actions;
            this.applicationName = builder.applicationName;
            this.applicationState = builder.applicationState;
            this.applicationVersion = builder.applicationVersion;
            this.communityVersion = builder.communityVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Application create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return applicationState
         */
        public String getApplicationState() {
            return this.applicationState;
        }

        /**
         * @return applicationVersion
         */
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        /**
         * @return communityVersion
         */
        public String getCommunityVersion() {
            return this.communityVersion;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private String applicationName; 
            private String applicationState; 
            private String applicationVersion; 
            private String communityVersion; 

            /**
             * 操作列表。
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * 应用名称。
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * 应用操作状态。
             */
            public Builder applicationState(String applicationState) {
                this.applicationState = applicationState;
                return this;
            }

            /**
             * 应用版本。
             */
            public Builder applicationVersion(String applicationVersion) {
                this.applicationVersion = applicationVersion;
                return this;
            }

            /**
             * 社区版本。
             */
            public Builder communityVersion(String communityVersion) {
                this.communityVersion = communityVersion;
                return this;
            }

            public Application build() {
                return new Application(this);
            } 

        } 

    }
}
