// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeSelector} extends {@link TeaModel}
 *
 * <p>NodeSelector</p>
 */
public class NodeSelector extends TeaModel {
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("NodeGroupName")
    private String nodeGroupName;

    @NameInMap("NodeGroupTypes")
    private java.util.List < String > nodeGroupTypes;

    @NameInMap("NodeNames")
    private java.util.List < String > nodeNames;

    @NameInMap("NodeSelectType")
    @Validation(required = true)
    private String nodeSelectType;

    private NodeSelector(Builder builder) {
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupTypes = builder.nodeGroupTypes;
        this.nodeNames = builder.nodeNames;
        this.nodeSelectType = builder.nodeSelectType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeSelector create() {
        return builder().build();
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
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

    public static final class Builder {
        private String nodeGroupId; 
        private String nodeGroupName; 
        private java.util.List < String > nodeGroupTypes; 
        private java.util.List < String > nodeNames; 
        private String nodeSelectType; 

        /**
         * 节点组ID。当NodeSelectType取值NodeGroup时，该参数生效。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点组名称。当NodeSelectType取值NodeGroup，且参数NodeGroupId为空时生效，该参数生效。
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * 节点组类型。当NodeSelectType取值NodeGroup，且参数NodeGroupId为空时生效。数组元数个数N取值范围：0~10。
         */
        public Builder nodeGroupTypes(java.util.List < String > nodeGroupTypes) {
            this.nodeGroupTypes = nodeGroupTypes;
            return this;
        }

        /**
         * 节点名称列表。当NodeSelectType取值Node时，该参数生效。
         */
        public Builder nodeNames(java.util.List < String > nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }

        /**
         * 节点选择类型。取值范围：
         * <p>
         * - CLUSTER：集群。
         * - NODE_GROUP：节点组。
         * - NODE：节点。
         */
        public Builder nodeSelectType(String nodeSelectType) {
            this.nodeSelectType = nodeSelectType;
            return this;
        }

        public NodeSelector build() {
            return new NodeSelector(this);
        } 

    } 

}
