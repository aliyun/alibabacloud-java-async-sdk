// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link StopRayClusterRequest} extends {@link RequestModel}
 *
 * <p>StopRayClusterRequest</p>
 */
public class StopRayClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    private StopRayClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clusterId = builder.clusterId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopRayClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<StopRayClusterRequest, Builder> {
        private String workspaceId; 
        private String clusterId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(StopRayClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clusterId = request.clusterId;
            this.instanceId = request.instanceId;
        } 

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public StopRayClusterRequest build() {
            return new StopRayClusterRequest(this);
        } 

    } 

}
