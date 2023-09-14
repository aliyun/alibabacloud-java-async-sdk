// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeGroupResponseBody</p>
 */
public class GetNodeGroupResponseBody extends TeaModel {
    @NameInMap("NodeGroup")
    private NodeGroup nodeGroup;

    @NameInMap("RequestId")
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
         * The node group.
         */
        public Builder nodeGroup(NodeGroup nodeGroup) {
            this.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * The ID of the request.
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
