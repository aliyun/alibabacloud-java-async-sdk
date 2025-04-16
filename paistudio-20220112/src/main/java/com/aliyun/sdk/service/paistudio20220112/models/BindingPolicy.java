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
 * {@link BindingPolicy} extends {@link TeaModel}
 *
 * <p>BindingPolicy</p>
 */
public class BindingPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExcludeNodes")
    private java.util.List<String> excludeNodes;

    @com.aliyun.core.annotation.NameInMap("IncludeNodes")
    private java.util.List<String> includeNodes;

    @com.aliyun.core.annotation.NameInMap("NodeSpecCount")
    private Long nodeSpecCount;

    private BindingPolicy(Builder builder) {
        this.excludeNodes = builder.excludeNodes;
        this.includeNodes = builder.includeNodes;
        this.nodeSpecCount = builder.nodeSpecCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindingPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return excludeNodes
     */
    public java.util.List<String> getExcludeNodes() {
        return this.excludeNodes;
    }

    /**
     * @return includeNodes
     */
    public java.util.List<String> getIncludeNodes() {
        return this.includeNodes;
    }

    /**
     * @return nodeSpecCount
     */
    public Long getNodeSpecCount() {
        return this.nodeSpecCount;
    }

    public static final class Builder {
        private java.util.List<String> excludeNodes; 
        private java.util.List<String> includeNodes; 
        private Long nodeSpecCount; 

        private Builder() {
        } 

        private Builder(BindingPolicy model) {
            this.excludeNodes = model.excludeNodes;
            this.includeNodes = model.includeNodes;
            this.nodeSpecCount = model.nodeSpecCount;
        } 

        /**
         * ExcludeNodes.
         */
        public Builder excludeNodes(java.util.List<String> excludeNodes) {
            this.excludeNodes = excludeNodes;
            return this;
        }

        /**
         * IncludeNodes.
         */
        public Builder includeNodes(java.util.List<String> includeNodes) {
            this.includeNodes = includeNodes;
            return this;
        }

        /**
         * NodeSpecCount.
         */
        public Builder nodeSpecCount(Long nodeSpecCount) {
            this.nodeSpecCount = nodeSpecCount;
            return this;
        }

        public BindingPolicy build() {
            return new BindingPolicy(this);
        } 

    } 

}
