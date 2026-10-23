// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link RebootCloudPhoneNodesRequest} extends {@link RequestModel}
 *
 * <p>RebootCloudPhoneNodesRequest</p>
 */
public class RebootCloudPhoneNodesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private RebootCloudPhoneNodesRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RebootCloudPhoneNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<RebootCloudPhoneNodesRequest, Builder> {
        private Boolean force; 
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(RebootCloudPhoneNodesRequest request) {
            super(request);
            this.force = request.force;
            this.nodeIds = request.nodeIds;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putBodyParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * NodeIds.
         */
        public Builder nodeIds(java.util.List<String> nodeIds) {
            this.putBodyParameter("NodeIds", nodeIds);
            this.nodeIds = nodeIds;
            return this;
        }

        @Override
        public RebootCloudPhoneNodesRequest build() {
            return new RebootCloudPhoneNodesRequest(this);
        } 

    } 

}
