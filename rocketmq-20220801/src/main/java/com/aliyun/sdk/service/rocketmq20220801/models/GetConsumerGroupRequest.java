// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerGroupRequest</p>
 */
public class GetConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerGroupId;

    private GetConsumerGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.consumerGroupId = builder.consumerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerGroupRequest create() {
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

    public static final class Builder extends Request.Builder<GetConsumerGroupRequest, Builder> {
        private String instanceId; 
        private String consumerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.consumerGroupId = request.consumerGroupId;
        } 

        /**
         * <p>The ID of the instance to which the consumer group belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-7e22ody****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the consumer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CID-TEST</p>
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putPathParameter("consumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        @Override
        public GetConsumerGroupRequest build() {
            return new GetConsumerGroupRequest(this);
        } 

    } 

}
