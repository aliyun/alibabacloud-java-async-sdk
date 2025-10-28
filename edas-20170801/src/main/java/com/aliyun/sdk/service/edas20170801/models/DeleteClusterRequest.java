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
 * {@link DeleteClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterRequest</p>
 */
public class DeleteClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private Integer mode;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterRequest create() {
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
     * @return mode
     */
    public Integer getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private Integer mode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.mode = request.mode;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8b96ade0-0a07-****-af9d-5ed83640d076</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The type of the cluster ID. Valid values:</p>
         * <ul>
         * <li>0: specifies the ID of the cluster in Enterprise Distributed Application Service (EDAS).</li>
         * <li>1: specifies the ID of the ACK cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder mode(Integer mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

}
