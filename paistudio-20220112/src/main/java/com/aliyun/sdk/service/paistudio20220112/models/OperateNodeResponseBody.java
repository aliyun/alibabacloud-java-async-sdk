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
 * {@link OperateNodeResponseBody} extends {@link TeaModel}
 *
 * <p>OperateNodeResponseBody</p>
 */
public class OperateNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private OperateNodeResponseBody(Builder builder) {
        this.nodeId = builder.nodeId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OperateNodeResponseBody model) {
            this.nodeId = model.nodeId;
            this.requestId = model.requestId;
        } 

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>96496E6E-00B4-5F55-80F6-1844FA9E92DC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OperateNodeResponseBody build() {
            return new OperateNodeResponseBody(this);
        } 

    } 

}
