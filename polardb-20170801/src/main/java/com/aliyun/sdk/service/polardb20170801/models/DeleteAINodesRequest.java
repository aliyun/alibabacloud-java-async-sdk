// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DeleteAINodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteAINodesRequest</p>
 */
public class DeleteAINodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeId")
    private java.util.List<String> DBNodeId;

    private DeleteAINodesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.DBNodeId = builder.DBNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAINodesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBNodeId
     */
    public java.util.List<String> getDBNodeId() {
        return this.DBNodeId;
    }

    public static final class Builder extends Request.Builder<DeleteAINodesRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> DBNodeId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAINodesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.DBNodeId = request.DBNodeId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBNodeId.
         */
        public Builder DBNodeId(java.util.List<String> DBNodeId) {
            this.putQueryParameter("DBNodeId", DBNodeId);
            this.DBNodeId = DBNodeId;
            return this;
        }

        @Override
        public DeleteAINodesRequest build() {
            return new DeleteAINodesRequest(this);
        } 

    } 

}
