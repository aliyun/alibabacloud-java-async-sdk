// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTaskConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateTaskConfigRequest</p>
 */
public class UpdateTaskConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private UpdateTaskConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.nodeConfig = builder.nodeConfig;
        this.nodeId = builder.nodeId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return nodeConfig
     */
    public String getNodeConfig() {
        return this.nodeConfig;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<UpdateTaskConfigRequest, Builder> {
        private String regionId; 
        private String nodeConfig; 
        private String nodeId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.nodeConfig = request.nodeConfig;
            this.nodeId = request.nodeId;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The advanced configuration for the node. The value of this parameter must be a JSON string.
         */
        public Builder nodeConfig(String nodeConfig) {
            this.putQueryParameter("NodeConfig", nodeConfig);
            this.nodeConfig = nodeConfig;
            return this;
        }

        /**
         * The ID of the task node. You can call the [GetTaskInstanceRelation](~~424711~~) operation to query the node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to query the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public UpdateTaskConfigRequest build() {
            return new UpdateTaskConfigRequest(this);
        } 

    } 

}
