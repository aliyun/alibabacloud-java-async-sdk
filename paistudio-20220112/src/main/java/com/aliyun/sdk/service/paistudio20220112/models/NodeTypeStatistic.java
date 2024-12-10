// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeTypeStatistic} extends {@link TeaModel}
 *
 * <p>NodeTypeStatistic</p>
 */
public class NodeTypeStatistic extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanBeBoundCount")
    private Integer canBeBoundCount;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private NodeTypeStatistic(Builder builder) {
        this.canBeBoundCount = builder.canBeBoundCount;
        this.nodeType = builder.nodeType;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeTypeStatistic create() {
        return builder().build();
    }

    /**
     * @return canBeBoundCount
     */
    public Integer getCanBeBoundCount() {
        return this.canBeBoundCount;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer canBeBoundCount; 
        private String nodeType; 
        private Integer totalCount; 

        /**
         * CanBeBoundCount.
         */
        public Builder canBeBoundCount(Integer canBeBoundCount) {
            this.canBeBoundCount = canBeBoundCount;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public NodeTypeStatistic build() {
            return new NodeTypeStatistic(this);
        } 

    } 

}
