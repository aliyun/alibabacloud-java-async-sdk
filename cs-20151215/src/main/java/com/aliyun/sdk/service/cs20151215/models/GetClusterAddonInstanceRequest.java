// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterAddonInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetClusterAddonInstanceRequest</p>
 */
public class GetClusterAddonInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    private GetClusterAddonInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterAddonInstanceRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<GetClusterAddonInstanceRequest, Builder> {
        private String clusterId; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterAddonInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c02b3e03be10643e8a644a843ffcb****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the component instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ack-node-problem-detector</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public GetClusterAddonInstanceRequest build() {
            return new GetClusterAddonInstanceRequest(this);
        } 

    } 

}
