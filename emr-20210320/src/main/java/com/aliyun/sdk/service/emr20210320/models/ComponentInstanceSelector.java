// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ComponentInstanceSelector} extends {@link TeaModel}
 *
 * <p>ComponentInstanceSelector</p>
 */
public class ComponentInstanceSelector extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActionScope")
    @Deprecated
    private String actionScope;

    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.NameInMap("ComponentInstances")
    private java.util.List<ComponentInstances> componentInstances;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("RunActionScope")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runActionScope;

    private ComponentInstanceSelector(Builder builder) {
        this.actionScope = builder.actionScope;
        this.applicationName = builder.applicationName;
        this.componentInstances = builder.componentInstances;
        this.components = builder.components;
        this.runActionScope = builder.runActionScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentInstanceSelector create() {
        return builder().build();
    }

    /**
     * @return actionScope
     */
    public String getActionScope() {
        return this.actionScope;
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return componentInstances
     */
    public java.util.List<ComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return runActionScope
     */
    public String getRunActionScope() {
        return this.runActionScope;
    }

    public static final class Builder {
        private String actionScope; 
        private String applicationName; 
        private java.util.List<ComponentInstances> componentInstances; 
        private java.util.List<Components> components; 
        private String runActionScope; 

        /**
         * ActionScope.
         */
        public Builder actionScope(String actionScope) {
            this.actionScope = actionScope;
            return this;
        }

        /**
         * <p>应用名称。</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>组件实例列表。actionScope为COPONENT_INSTANCE时使用。</p>
         */
        public Builder componentInstances(java.util.List<ComponentInstances> componentInstances) {
            this.componentInstances = componentInstances;
            return this;
        }

        /**
         * <p>组件列表。
         * actionScope为COPONENT时使用。</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>动作执行范围。取值范围：</p>
         * <ul>
         * <li>APPLICATION：应用级别。</li>
         * <li>COMPONENT：组件级别。</li>
         * <li>COMPONENT_INSTANCE：组件实例级别。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>APPLICATION</p>
         */
        public Builder runActionScope(String runActionScope) {
            this.runActionScope = runActionScope;
            return this;
        }

        public ComponentInstanceSelector build() {
            return new ComponentInstanceSelector(this);
        } 

    } 

    /**
     * 
     * {@link ComponentInstanceSelector} extends {@link TeaModel}
     *
     * <p>ComponentInstanceSelector</p>
     */
    public static class ComponentInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private ComponentInstances(Builder builder) {
            this.applicationName = builder.applicationName;
            this.componentName = builder.componentName;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInstances create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String applicationName; 
            private String componentName; 
            private String nodeId; 

            /**
             * <p>应用名称。</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>组件名称。</p>
             * 
             * <strong>example:</strong>
             * <p>DataNode</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>节点ID。</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp1cudc25w2bfwl5****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public ComponentInstances build() {
                return new ComponentInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link ComponentInstanceSelector} extends {@link TeaModel}
     *
     * <p>ComponentInstanceSelector</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        private Components(Builder builder) {
            this.applicationName = builder.applicationName;
            this.componentName = builder.componentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        public static final class Builder {
            private String applicationName; 
            private String componentName; 

            /**
             * <p>应用名称。</p>
             * 
             * <strong>example:</strong>
             * <p>HDFS</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>组件名称。</p>
             * 
             * <strong>example:</strong>
             * <p>DataNode</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
