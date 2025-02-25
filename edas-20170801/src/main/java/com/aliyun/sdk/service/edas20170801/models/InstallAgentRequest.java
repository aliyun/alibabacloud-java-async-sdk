// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InstallAgentRequest} extends {@link RequestModel}
 *
 * <p>InstallAgentRequest</p>
 */
public class InstallAgentRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DoAsync")
    private Boolean doAsync;

    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
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
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * This parameter is discontinued.
         */
        public Builder doAsync(Boolean doAsync) {
            this.putQueryParameter("DoAsync", doAsync);
            this.doAsync = doAsync;
            return this;
        }

        /**
         * The ID of the ECS instance. Separate multiple IDs with commas (,). Example: instanceId1,instanceId2.
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
