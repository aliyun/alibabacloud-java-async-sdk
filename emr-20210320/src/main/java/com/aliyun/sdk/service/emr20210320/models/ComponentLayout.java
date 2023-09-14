// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ComponentLayout} extends {@link TeaModel}
 *
 * <p>ComponentLayout</p>
 */
public class ComponentLayout extends TeaModel {
    @NameInMap("ApplicationName")
    private String applicationName;

    @NameInMap("ComponentName")
    private String componentName;

    @NameInMap("NodeSelector")
    private NodeSelector nodeSelector;

    private ComponentLayout(Builder builder) {
        this.applicationName = builder.applicationName;
        this.componentName = builder.componentName;
        this.nodeSelector = builder.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentLayout create() {
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
     * @return nodeSelector
     */
    public NodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static final class Builder {
        private String applicationName; 
        private String componentName; 
        private NodeSelector nodeSelector; 

        /**
         * 应用名称。
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
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
         * 节点选择器。
         */
        public Builder nodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public ComponentLayout build() {
            return new ComponentLayout(this);
        } 

    } 

    public static class NodeSelector extends TeaModel {
        @NameInMap("NodeEndIndex")
        private Integer nodeEndIndex;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("NodeGroupIndex")
        private Integer nodeGroupIndex;

        @NameInMap("NodeGroupName")
        private String nodeGroupName;

        @NameInMap("NodeGroupTypes")
        private java.util.List < String > nodeGroupTypes;

        @NameInMap("NodeNames")
        private java.util.List < String > nodeNames;

        @NameInMap("NodeSelectType")
        @Validation(required = true)
        private String nodeSelectType;

        @NameInMap("NodeStartIndex")
        private Integer nodeStartIndex;

        private NodeSelector(Builder builder) {
            this.nodeEndIndex = builder.nodeEndIndex;
            this.nodeGroupId = builder.nodeGroupId;
            this.nodeGroupIndex = builder.nodeGroupIndex;
            this.nodeGroupName = builder.nodeGroupName;
            this.nodeGroupTypes = builder.nodeGroupTypes;
            this.nodeNames = builder.nodeNames;
            this.nodeSelectType = builder.nodeSelectType;
            this.nodeStartIndex = builder.nodeStartIndex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeSelector create() {
            return builder().build();
        }

        /**
         * @return nodeEndIndex
         */
        public Integer getNodeEndIndex() {
            return this.nodeEndIndex;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return nodeGroupIndex
         */
        public Integer getNodeGroupIndex() {
            return this.nodeGroupIndex;
        }

        /**
         * @return nodeGroupName
         */
        public String getNodeGroupName() {
            return this.nodeGroupName;
        }

        /**
         * @return nodeGroupTypes
         */
        public java.util.List < String > getNodeGroupTypes() {
            return this.nodeGroupTypes;
        }

        /**
         * @return nodeNames
         */
        public java.util.List < String > getNodeNames() {
            return this.nodeNames;
        }

        /**
         * @return nodeSelectType
         */
        public String getNodeSelectType() {
            return this.nodeSelectType;
        }

        /**
         * @return nodeStartIndex
         */
        public Integer getNodeStartIndex() {
            return this.nodeStartIndex;
        }

        public static final class Builder {
            private Integer nodeEndIndex; 
            private String nodeGroupId; 
            private Integer nodeGroupIndex; 
            private String nodeGroupName; 
            private java.util.List < String > nodeGroupTypes; 
            private java.util.List < String > nodeNames; 
            private String nodeSelectType; 
            private Integer nodeStartIndex; 

            /**
             * 节点结束编号，包含结束编号。
             */
            public Builder nodeEndIndex(Integer nodeEndIndex) {
                this.nodeEndIndex = nodeEndIndex;
                return this;
            }

            /**
             * 节点组ID。
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * 机器组下标编号。
             */
            public Builder nodeGroupIndex(Integer nodeGroupIndex) {
                this.nodeGroupIndex = nodeGroupIndex;
                return this;
            }

            /**
             * 机器组名。
             */
            public Builder nodeGroupName(String nodeGroupName) {
                this.nodeGroupName = nodeGroupName;
                return this;
            }

            /**
             * SelectType = NODE_GROUP 且 nodeGroupId 不存在时使用
             */
            public Builder nodeGroupTypes(java.util.List < String > nodeGroupTypes) {
                this.nodeGroupTypes = nodeGroupTypes;
                return this;
            }

            /**
             * 节点名称列表。
             */
            public Builder nodeNames(java.util.List < String > nodeNames) {
                this.nodeNames = nodeNames;
                return this;
            }

            /**
             * 节点选择类型。
             */
            public Builder nodeSelectType(String nodeSelectType) {
                this.nodeSelectType = nodeSelectType;
                return this;
            }

            /**
             * 节点开始编号，包含开始编号。
             */
            public Builder nodeStartIndex(Integer nodeStartIndex) {
                this.nodeStartIndex = nodeStartIndex;
                return this;
            }

            public NodeSelector build() {
                return new NodeSelector(this);
            } 

        } 

    }
}
