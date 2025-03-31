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
 * {@link DeleteCloudPhoneNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteCloudPhoneNodesRequest</p>
 */
public class DeleteCloudPhoneNodesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeIds")
    private java.util.List<String> nodeIds;

    private DeleteCloudPhoneNodesRequest(Builder builder) {
        super(builder);
        this.nodeIds = builder.nodeIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCloudPhoneNodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeIds
     */
    public java.util.List<String> getNodeIds() {
        return this.nodeIds;
    }

    public static final class Builder extends Request.Builder<DeleteCloudPhoneNodesRequest, Builder> {
        private java.util.List<String> nodeIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCloudPhoneNodesRequest request) {
            super(request);
            this.nodeIds = request.nodeIds;
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
        public DeleteCloudPhoneNodesRequest build() {
            return new DeleteCloudPhoneNodesRequest(this);
        } 

    } 

}
