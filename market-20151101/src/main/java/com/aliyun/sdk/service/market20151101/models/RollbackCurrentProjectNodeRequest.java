// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackCurrentProjectNodeRequest} extends {@link RequestModel}
 *
 * <p>RollbackCurrentProjectNodeRequest</p>
 */
public class RollbackCurrentProjectNodeRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private Long nodeId;

    @Query
    @NameInMap("Remark")
    private String remark;

    private RollbackCurrentProjectNodeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.nodeId = builder.nodeId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackCurrentProjectNodeRequest create() {
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
    public Long getNodeId() {
        return this.nodeId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<RollbackCurrentProjectNodeRequest, Builder> {
        private String instanceId; 
        private Long nodeId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(RollbackCurrentProjectNodeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.nodeId = request.nodeId;
            this.remark = request.remark;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(Long nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public RollbackCurrentProjectNodeRequest build() {
            return new RollbackCurrentProjectNodeRequest(this);
        } 

    } 

}
