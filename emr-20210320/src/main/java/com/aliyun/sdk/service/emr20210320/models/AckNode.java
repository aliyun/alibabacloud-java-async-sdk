// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AckNode} extends {@link TeaModel}
 *
 * <p>AckNode</p>
 */
public class AckNode extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("NodeSelector")
    private AckNodeSelector nodeSelector;

    private AckNode(Builder builder) {
        this.nodeId = builder.nodeId;
        this.nodeSelector = builder.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AckNode create() {
        return builder().build();
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeSelector
     */
    public AckNodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static final class Builder {
        private String nodeId; 
        private AckNodeSelector nodeSelector; 

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

        /**
         * <p>ACK节点选择器。</p>
         */
        public Builder nodeSelector(AckNodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public AckNode build() {
            return new AckNode(this);
        } 

    } 

}
