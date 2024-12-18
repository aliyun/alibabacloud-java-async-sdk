// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DeleteDBInstanceEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteDBInstanceEndpointRequest</p>
 */
public class DeleteDBInstanceEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceEndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceEndpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DeleteDBInstanceEndpointRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBInstanceEndpointId = builder.DBInstanceEndpointId;
        this.DBInstanceId = builder.DBInstanceId;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDBInstanceEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceEndpointId
     */
    public String getDBInstanceEndpointId() {
        return this.DBInstanceEndpointId;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<DeleteDBInstanceEndpointRequest, Builder> {
        private String clientToken; 
        private String DBInstanceEndpointId; 
        private String DBInstanceId; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDBInstanceEndpointRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBInstanceEndpointId = request.DBInstanceEndpointId;
            this.DBInstanceId = request.DBInstanceId;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotency of requests. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The endpoint ID of the instance. You can call the DescribeDBInstanceEndpoints operation to query the endpoint ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ep-****</p>
         */
        public Builder DBInstanceEndpointId(String DBInstanceEndpointId) {
            this.putQueryParameter("DBInstanceEndpointId", DBInstanceEndpointId);
            this.DBInstanceEndpointId = DBInstanceEndpointId;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public DeleteDBInstanceEndpointRequest build() {
            return new DeleteDBInstanceEndpointRequest(this);
        } 

    } 

}
