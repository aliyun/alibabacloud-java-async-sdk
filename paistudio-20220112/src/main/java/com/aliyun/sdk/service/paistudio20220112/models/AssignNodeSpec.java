// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link AssignNodeSpec} extends {@link TeaModel}
 *
 * <p>AssignNodeSpec</p>
 */
public class AssignNodeSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AntiAffinityNodeNames")
    private String antiAffinityNodeNames;

    @com.aliyun.core.annotation.NameInMap("EnableAssignNode")
    private Boolean enableAssignNode;

    @com.aliyun.core.annotation.NameInMap("NodeNames")
    private String nodeNames;

    private AssignNodeSpec(Builder builder) {
        this.antiAffinityNodeNames = builder.antiAffinityNodeNames;
        this.enableAssignNode = builder.enableAssignNode;
        this.nodeNames = builder.nodeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssignNodeSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return antiAffinityNodeNames
     */
    public String getAntiAffinityNodeNames() {
        return this.antiAffinityNodeNames;
    }

    /**
     * @return enableAssignNode
     */
    public Boolean getEnableAssignNode() {
        return this.enableAssignNode;
    }

    /**
     * @return nodeNames
     */
    public String getNodeNames() {
        return this.nodeNames;
    }

    public static final class Builder {
        private String antiAffinityNodeNames; 
        private Boolean enableAssignNode; 
        private String nodeNames; 

        private Builder() {
        } 

        private Builder(AssignNodeSpec model) {
            this.antiAffinityNodeNames = model.antiAffinityNodeNames;
            this.enableAssignNode = model.enableAssignNode;
            this.nodeNames = model.nodeNames;
        } 

        /**
         * <p>The anti-affinity node names.</p>
         * 
         * <strong>example:</strong>
         * <p>node3</p>
         */
        public Builder antiAffinityNodeNames(String antiAffinityNodeNames) {
            this.antiAffinityNodeNames = antiAffinityNodeNames;
            return this;
        }

        /**
         * <p>Specifies whether to enable the specified node.</p>
         */
        public Builder enableAssignNode(Boolean enableAssignNode) {
            this.enableAssignNode = enableAssignNode;
            return this;
        }

        /**
         * <p>The node names.</p>
         * 
         * <strong>example:</strong>
         * <p>lingjxxxx</p>
         */
        public Builder nodeNames(String nodeNames) {
            this.nodeNames = nodeNames;
            return this;
        }

        public AssignNodeSpec build() {
            return new AssignNodeSpec(this);
        } 

    } 

}
