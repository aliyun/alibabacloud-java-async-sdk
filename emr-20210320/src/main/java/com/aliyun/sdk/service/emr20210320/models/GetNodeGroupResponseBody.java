// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetNodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeGroupResponseBody</p>
 */
public class GetNodeGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeGroup")
    private NodeGroup nodeGroup;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNodeGroupResponseBody(Builder builder) {
        this.nodeGroup = builder.nodeGroup;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeGroup
     */
    public NodeGroup getNodeGroup() {
        return this.nodeGroup;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NodeGroup nodeGroup; 
        private String requestId; 

        /**
         * <p>The node group.</p>
         */
        public Builder nodeGroup(NodeGroup nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodeGroupResponseBody build() {
            return new GetNodeGroupResponseBody(this);
        } 

    } 

}
