// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerStackRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerStackRequest</p>
 */
public class GetConsumerStackRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientId;

    private GetConsumerStackRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerStackRequest create() {
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
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    public static final class Builder extends Request.Builder<GetConsumerStackRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 
        private String clientId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerStackRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
            this.clientId = request.clientId;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * consumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * clientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("clientId", clientId);
            this.clientId = clientId;
            return this;
        }

        @Override
        public GetConsumerStackRequest build() {
            return new GetConsumerStackRequest(this);
        } 

    } 

}
