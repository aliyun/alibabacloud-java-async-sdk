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
 * {@link GetClusterCheckRequest} extends {@link RequestModel}
 *
 * <p>GetClusterCheckRequest</p>
 */
public class GetClusterCheckRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("check_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String checkId;

    private GetClusterCheckRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.checkId = builder.checkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterCheckRequest create() {
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
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    public static final class Builder extends Request.Builder<GetClusterCheckRequest, Builder> {
        private String clusterId; 
        private String checkId; 

        private Builder() {
            super();
        } 

        private Builder(GetClusterCheckRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.checkId = request.checkId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce0da5a1d627e4e9e9f96cae8ad07****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the cluster check task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1697100584236600453-ce0da5a1d627e4e9e9f96cae8ad07****-clustercheck-lboto</p>
         */
        public Builder checkId(String checkId) {
            this.putPathParameter("check_id", checkId);
            this.checkId = checkId;
            return this;
        }

        @Override
        public GetClusterCheckRequest build() {
            return new GetClusterCheckRequest(this);
        } 

    } 

}
