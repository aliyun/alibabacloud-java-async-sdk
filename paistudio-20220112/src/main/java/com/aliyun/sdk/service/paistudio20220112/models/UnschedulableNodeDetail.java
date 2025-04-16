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
 * {@link UnschedulableNodeDetail} extends {@link TeaModel}
 *
 * <p>UnschedulableNodeDetail</p>
 */
public class UnschedulableNodeDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<String> nodes;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    private UnschedulableNodeDetail(Builder builder) {
        this.nodes = builder.nodes;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnschedulableNodeDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodes
     */
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private java.util.List<String> nodes; 
        private String reason; 

        private Builder() {
        } 

        private Builder(UnschedulableNodeDetail model) {
            this.nodes = model.nodes;
            this.reason = model.reason;
        } 

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List<String> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public UnschedulableNodeDetail build() {
            return new UnschedulableNodeDetail(this);
        } 

    } 

}
