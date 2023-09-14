// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AckNodePool} extends {@link TeaModel}
 *
 * <p>AckNodePool</p>
 */
public class AckNodePool extends TeaModel {
    @NameInMap("NodePoolId")
    private String nodePoolId;

    @NameInMap("NodeSelector")
    private AckNodeSelector nodeSelector;

    private AckNodePool(Builder builder) {
        this.nodePoolId = builder.nodePoolId;
        this.nodeSelector = builder.nodeSelector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AckNodePool create() {
        return builder().build();
    }

    /**
     * @return nodePoolId
     */
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    /**
     * @return nodeSelector
     */
    public AckNodeSelector getNodeSelector() {
        return this.nodeSelector;
    }

    public static final class Builder {
        private String nodePoolId; 
        private AckNodeSelector nodeSelector; 

        /**
         * 节点池ID。
         */
        public Builder nodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }

        /**
         * ACK节点选择器。
         */
        public Builder nodeSelector(AckNodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public AckNodePool build() {
            return new AckNodePool(this);
        } 

    } 

}
