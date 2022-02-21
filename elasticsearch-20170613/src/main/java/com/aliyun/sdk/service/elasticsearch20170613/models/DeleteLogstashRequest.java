// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogstashRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogstashRequest</p>
 */
public class DeleteLogstashRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("clientToken")
    private String clientToken;

    @Query
    @NameInMap("deleteType")
    private String deleteType;

    private DeleteLogstashRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.deleteType = builder.deleteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogstashRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteType
     */
    public String getDeleteType() {
        return this.deleteType;
    }

    public static final class Builder extends Request.Builder<DeleteLogstashRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String deleteType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogstashRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.deleteType = response.deleteType;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * deleteType.
         */
        public Builder deleteType(String deleteType) {
            this.putQueryParameter("deleteType", deleteType);
            this.deleteType = deleteType;
            return this;
        }

        @Override
        public DeleteLogstashRequest build() {
            return new DeleteLogstashRequest(this);
        } 

    } 

}
