// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link RemoveClusterRequest} extends {@link RequestModel}
 *
 * <p>RemoveClusterRequest</p>
 */
public class RemoveClusterRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    private RemoveClusterRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveClusterRequest create() {
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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<RemoveClusterRequest, Builder> {
        private String instanceId; 
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveClusterRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clusterName = request.clusterName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2iv7sq01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the cluster</p>
         * 
         * <strong>example:</strong>
         * <p>bj_vpc_domain_2</p>
         */
        public Builder clusterName(String clusterName) {
            this.putPathParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public RemoveClusterRequest build() {
            return new RemoveClusterRequest(this);
        } 

    } 

}
