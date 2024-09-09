// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConsumerGroupLagRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerGroupLagRequest</p>
 */
public class GetConsumerGroupLagRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    private GetConsumerGroupLagRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerGroupLagRequest create() {
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

    public static final class Builder extends Request.Builder<GetConsumerGroupLagRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerGroupLagRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
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

        @Override
        public GetConsumerGroupLagRequest build() {
            return new GetConsumerGroupLagRequest(this);
        } 

    } 

}
