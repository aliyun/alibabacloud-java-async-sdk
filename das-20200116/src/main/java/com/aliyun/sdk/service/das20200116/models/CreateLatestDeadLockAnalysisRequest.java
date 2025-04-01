// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateLatestDeadLockAnalysisRequest} extends {@link RequestModel}
 *
 * <p>CreateLatestDeadLockAnalysisRequest</p>
 */
public class CreateLatestDeadLockAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private CreateLatestDeadLockAnalysisRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLatestDeadLockAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<CreateLatestDeadLockAnalysisRequest, Builder> {
        private String instanceId; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLatestDeadLockAnalysisRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1u5mas9exx7****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public CreateLatestDeadLockAnalysisRequest build() {
            return new CreateLatestDeadLockAnalysisRequest(this);
        } 

    } 

}
