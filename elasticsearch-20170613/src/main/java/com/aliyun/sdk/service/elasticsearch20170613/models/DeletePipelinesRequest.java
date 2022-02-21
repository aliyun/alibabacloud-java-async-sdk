// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePipelinesRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelinesRequest</p>
 */
public class DeletePipelinesRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("pipelineIds")
    private String pipelineIds;

    private DeletePipelinesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.pipelineIds = builder.pipelineIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePipelinesRequest create() {
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
     * @return pipelineIds
     */
    public String getPipelineIds() {
        return this.pipelineIds;
    }

    public static final class Builder extends Request.Builder<DeletePipelinesRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String pipelineIds; 

        private Builder() {
            super();
        } 

        private Builder(DeletePipelinesRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.clientToken = response.clientToken;
            this.pipelineIds = response.pipelineIds;
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
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * pipelineIds.
         */
        public Builder pipelineIds(String pipelineIds) {
            this.putQueryParameter("pipelineIds", pipelineIds);
            this.pipelineIds = pipelineIds;
            return this;
        }

        @Override
        public DeletePipelinesRequest build() {
            return new DeletePipelinesRequest(this);
        } 

    } 

}
