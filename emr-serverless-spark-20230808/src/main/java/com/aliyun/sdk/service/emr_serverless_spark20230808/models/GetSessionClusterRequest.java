// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSessionClusterRequest} extends {@link RequestModel}
 *
 * <p>GetSessionClusterRequest</p>
 */
public class GetSessionClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private GetSessionClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.sessionClusterId = builder.sessionClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionClusterRequest create() {
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
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetSessionClusterRequest, Builder> {
        private String workspaceId; 
        private String sessionClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSessionClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.sessionClusterId = request.sessionClusterId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>工作空间id。</p>
         * 
         * <strong>example:</strong>
         * <p>w-1234abcd</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>作业名称。</p>
         * 
         * <strong>example:</strong>
         * <p>emr-spark-demo-job</p>
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.putPathParameter("sessionClusterId", sessionClusterId);
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetSessionClusterRequest build() {
            return new GetSessionClusterRequest(this);
        } 

    } 

}
