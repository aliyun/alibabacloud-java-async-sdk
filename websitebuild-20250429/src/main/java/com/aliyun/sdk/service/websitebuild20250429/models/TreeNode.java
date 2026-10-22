// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link TreeNode} extends {@link TeaModel}
 *
 * <p>TreeNode</p>
 */
public class TreeNode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List<TreeNode> children;

    @com.aliyun.core.annotation.NameInMap("FinalStepNo")
    private Integer finalStepNo;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private Long finishTime;

    @com.aliyun.core.annotation.NameInMap("IsContainerNode")
    private Boolean isContainerNode;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("NodeStatus")
    private String nodeStatus;

    @com.aliyun.core.annotation.NameInMap("OperatorRole")
    private String operatorRole;

    @com.aliyun.core.annotation.NameInMap("ParentNodeId")
    private String parentNodeId;

    @com.aliyun.core.annotation.NameInMap("StepNo")
    private Integer stepNo;

    private TreeNode(Builder builder) {
        this.children = builder.children;
        this.finalStepNo = builder.finalStepNo;
        this.finishTime = builder.finishTime;
        this.isContainerNode = builder.isContainerNode;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.nodeStatus = builder.nodeStatus;
        this.operatorRole = builder.operatorRole;
        this.parentNodeId = builder.parentNodeId;
        this.stepNo = builder.stepNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TreeNode create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return children
     */
    public java.util.List<TreeNode> getChildren() {
        return this.children;
    }

    /**
     * @return finalStepNo
     */
    public Integer getFinalStepNo() {
        return this.finalStepNo;
    }

    /**
     * @return finishTime
     */
    public Long getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return isContainerNode
     */
    public Boolean getIsContainerNode() {
        return this.isContainerNode;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeStatus
     */
    public String getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * @return operatorRole
     */
    public String getOperatorRole() {
        return this.operatorRole;
    }

    /**
     * @return parentNodeId
     */
    public String getParentNodeId() {
        return this.parentNodeId;
    }

    /**
     * @return stepNo
     */
    public Integer getStepNo() {
        return this.stepNo;
    }

    public static final class Builder {
        private java.util.List<TreeNode> children; 
        private Integer finalStepNo; 
        private Long finishTime; 
        private Boolean isContainerNode; 
        private String nodeId; 
        private String nodeName; 
        private String nodeStatus; 
        private String operatorRole; 
        private String parentNodeId; 
        private Integer stepNo; 

        private Builder() {
        } 

        private Builder(TreeNode model) {
            this.children = model.children;
            this.finalStepNo = model.finalStepNo;
            this.finishTime = model.finishTime;
            this.isContainerNode = model.isContainerNode;
            this.nodeId = model.nodeId;
            this.nodeName = model.nodeName;
            this.nodeStatus = model.nodeStatus;
            this.operatorRole = model.operatorRole;
            this.parentNodeId = model.parentNodeId;
            this.stepNo = model.stepNo;
        } 

        /**
         * <p>The list of child nodes.</p>
         */
        public Builder children(java.util.List<TreeNode> children) {
            this.children = children;
            return this;
        }

        /**
         * <p>The final step number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder finalStepNo(Integer finalStepNo) {
            this.finalStepNo = finalStepNo;
            return this;
        }

        /**
         * <p>The completion time.</p>
         */
        public Builder finishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>Specifies whether the node is a container node.</p>
         */
        public Builder isContainerNode(Boolean isContainerNode) {
            this.isContainerNode = isContainerNode;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2927b500-c4e2-4241-bacf-0a2991c4be12</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The node name.</p>
         * 
         * <strong>example:</strong>
         * <p>Single output</p>
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The node status.</p>
         * 
         * <strong>example:</strong>
         * <p>UP</p>
         */
        public Builder nodeStatus(String nodeStatus) {
            this.nodeStatus = nodeStatus;
            return this;
        }

        /**
         * <p>The operator role.</p>
         * 
         * <strong>example:</strong>
         * <p>System</p>
         */
        public Builder operatorRole(String operatorRole) {
            this.operatorRole = operatorRole;
            return this;
        }

        /**
         * <p>The parent node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>dpYLaezmVNRMGX56Cg4gLjrrVrMqPxX6</p>
         */
        public Builder parentNodeId(String parentNodeId) {
            this.parentNodeId = parentNodeId;
            return this;
        }

        /**
         * <p>The step number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder stepNo(Integer stepNo) {
            this.stepNo = stepNo;
            return this;
        }

        public TreeNode build() {
            return new TreeNode(this);
        } 

    } 

}
