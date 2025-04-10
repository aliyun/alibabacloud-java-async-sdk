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
 * {@link CreateNodeGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNodeGroupResponseBody</p>
 */
public class CreateNodeGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNodeGroupResponseBody(Builder builder) {
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNodeGroupResponseBody model) {
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupName = model.nodeGroupName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Node group ID</p>
         * 
         * <strong>example:</strong>
         * <p>ng-ec3c96ff0aa4c60d</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>Node group name</p>
         * 
         * <strong>example:</strong>
         * <p>emr-default</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
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
