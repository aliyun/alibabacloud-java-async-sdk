// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotNodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteHoneypotNodeRequest</p>
 */
public class DeleteHoneypotNodeRequest extends Request {
    @Query
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    private DeleteHoneypotNodeRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHoneypotNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<DeleteHoneypotNodeRequest, Builder> {
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHoneypotNodeRequest request) {
            super(request);
            this.nodeId = request.nodeId;
        } 

        /**
         * The ID of the management node.
         * <p>
         * 
         * >  You can call the [ListHoneypotNode](~~ListHoneypotNode~~) operation to obtain the IDs of management nodes.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public DeleteHoneypotNodeRequest build() {
            return new DeleteHoneypotNodeRequest(this);
        } 

    } 

}
