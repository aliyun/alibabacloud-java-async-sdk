// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link InstallAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallAgentRequest</p>
 */
public class InstallAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DoAsync")
    private Boolean doAsync;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    private InstallAgentRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.doAsync = builder.doAsync;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InstallAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return doAsync
     */
    public Boolean getDoAsync() {
        return this.doAsync;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<InstallAgentRequest, Builder> {
        private String clusterId; 
        private Boolean doAsync; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(InstallAgentRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.doAsync = request.doAsync;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3e3f77b-462e-<strong><strong>-</strong></strong>-bec8727a4dc8</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is discontinued.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder doAsync(Boolean doAsync) {
            this.putQueryParameter("DoAsync", doAsync);
            this.doAsync = doAsync;
            return this;
        }

        /**
         * <p>The ID of the ECS instance. Separate multiple IDs with commas (,). Example: instanceId1,instanceId2.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2ze7s2v0b789k60pk1af</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public InstallAgentRequest build() {
            return new InstallAgentRequest(this);
        } 

    } 

}
