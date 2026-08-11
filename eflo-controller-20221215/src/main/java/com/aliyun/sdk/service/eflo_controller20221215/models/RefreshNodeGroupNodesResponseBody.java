// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link RefreshNodeGroupNodesResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshNodeGroupNodesResponseBody</p>
 */
public class RefreshNodeGroupNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeGroupRefreshTaskId")
    private String nodeGroupRefreshTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RefreshNodeGroupNodesResponseBody(Builder builder) {
        this.nodeGroupRefreshTaskId = builder.nodeGroupRefreshTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshNodeGroupNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeGroupRefreshTaskId
     */
    public String getNodeGroupRefreshTaskId() {
        return this.nodeGroupRefreshTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeGroupRefreshTaskId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RefreshNodeGroupNodesResponseBody model) {
            this.nodeGroupRefreshTaskId = model.nodeGroupRefreshTaskId;
            this.requestId = model.requestId;
        } 

        /**
         * NodeGroupRefreshTaskId.
         */
        public Builder nodeGroupRefreshTaskId(String nodeGroupRefreshTaskId) {
            this.nodeGroupRefreshTaskId = nodeGroupRefreshTaskId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RefreshNodeGroupNodesResponseBody build() {
            return new RefreshNodeGroupNodesResponseBody(this);
        } 

    } 

}
