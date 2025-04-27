// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link DeletePipelinesRequest} extends {@link RequestModel}
 *
 * <p>DeletePipelinesRequest</p>
 */
public class DeletePipelinesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pipelineIds")
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

        private Builder(DeletePipelinesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.pipelineIds = request.pipelineIds;
        } 

        /**
         * <p>The ID of the Logstash cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-oew1qbgl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the pipeline.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline-test</p>
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
