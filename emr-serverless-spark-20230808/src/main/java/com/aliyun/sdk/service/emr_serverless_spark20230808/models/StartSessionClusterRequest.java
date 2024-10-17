// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link StartSessionClusterRequest} extends {@link RequestModel}
 *
 * <p>StartSessionClusterRequest</p>
 */
public class StartSessionClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("queueName")
    private String queueName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private StartSessionClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.queueName = builder.queueName;
        this.sessionClusterId = builder.sessionClusterId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartSessionClusterRequest create() {
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
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

    public static final class Builder extends Request.Builder<StartSessionClusterRequest, Builder> {
        private String workspaceId; 
        private String queueName; 
        private String sessionClusterId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartSessionClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.queueName = request.queueName;
            this.sessionClusterId = request.sessionClusterId;
            this.regionId = request.regionId;
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
         * queueName.
         */
        public Builder queueName(String queueName) {
            this.putBodyParameter("queueName", queueName);
            this.queueName = queueName;
            return this;
        }

        /**
         * sessionClusterId.
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.putBodyParameter("sessionClusterId", sessionClusterId);
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
        public StartSessionClusterRequest build() {
            return new StartSessionClusterRequest(this);
        } 

    } 

}
