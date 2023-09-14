// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNodeGroupResponseBody</p>
 */
public class CreateNodeGroupResponseBody extends TeaModel {
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNodeGroupResponseBody(Builder builder) {
        this.nodeGroupId = builder.nodeGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeGroupId; 
        private String requestId; 

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNodeGroupResponseBody build() {
            return new CreateNodeGroupResponseBody(this);
        } 

    } 

}
