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
 * {@link ListNodeTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeTypesResponseBody</p>
 */
public class ListNodeTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeTypes")
    private java.util.List<NodeType> nodeTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Statistics")
    private java.util.List<NodeTypeStatistic> statistics;

    private ListNodeTypesResponseBody(Builder builder) {
        this.nodeTypes = builder.nodeTypes;
        this.requestId = builder.requestId;
        this.statistics = builder.statistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeTypes
     */
    public java.util.List<NodeType> getNodeTypes() {
        return this.nodeTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statistics
     */
    public java.util.List<NodeTypeStatistic> getStatistics() {
        return this.statistics;
    }

    public static final class Builder {
        private java.util.List<NodeType> nodeTypes; 
        private String requestId; 
        private java.util.List<NodeTypeStatistic> statistics; 

        private Builder() {
        } 

        private Builder(ListNodeTypesResponseBody model) {
            this.nodeTypes = model.nodeTypes;
            this.requestId = model.requestId;
            this.statistics = model.statistics;
        } 

        /**
         * NodeTypes.
         */
        public Builder nodeTypes(java.util.List<NodeType> nodeTypes) {
            this.nodeTypes = nodeTypes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Statistics.
         */
        public Builder statistics(java.util.List<NodeTypeStatistic> statistics) {
            this.statistics = statistics;
            return this;
        }

        public ListNodeTypesResponseBody build() {
            return new ListNodeTypesResponseBody(this);
        } 

    } 

}
