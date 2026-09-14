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
 * {@link StartRayClusterRequest} extends {@link RequestModel}
 *
 * <p>StartRayClusterRequest</p>
 */
public class StartRayClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private StartRayClusterRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.clusterId = builder.clusterId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRayClusterRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<StartRayClusterRequest, Builder> {
        private String workspaceId; 
        private String clusterId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(StartRayClusterRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.clusterId = request.clusterId;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The Ray cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ray-uiulagow9xljimm0</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("clusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The token used to ensure idempotence.</p>
         * 
         * <strong>example:</strong>
         * <p>c533e141-bf99-4236-8b6b-30e133db113c</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public StartRayClusterRequest build() {
            return new StartRayClusterRequest(this);
        } 

    } 

}
