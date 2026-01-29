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
 * {@link GetRayClusterRequest} extends {@link RequestModel}
 *
 * <p>GetRayClusterRequest</p>
 */
public class GetRayClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    private GetRayClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayClusterRequest create() {
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

    public static final class Builder extends Request.Builder<GetRayClusterRequest, Builder> {
        private String workspaceId; 
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(GetRayClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clusterId = request.clusterId;
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

        @Override
        public GetRayClusterRequest build() {
            return new GetRayClusterRequest(this);
        } 

    } 

}
