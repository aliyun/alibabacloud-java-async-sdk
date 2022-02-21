// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConsumerGroupSubscribeRelationRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerGroupSubscribeRelationRequest</p>
 */
public class DeleteConsumerGroupSubscribeRelationRequest extends Request {
    @Query
    @NameInMap("ConsumerGroupId")
    @Validation(required = true)
    private String consumerGroupId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private DeleteConsumerGroupSubscribeRelationRequest(Builder builder) {
        super(builder);
        this.consumerGroupId = builder.consumerGroupId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumerGroupSubscribeRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<DeleteConsumerGroupSubscribeRelationRequest, Builder> {
        private String consumerGroupId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumerGroupSubscribeRelationRequest response) {
            super(response);
            this.consumerGroupId = response.consumerGroupId;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
        } 

        /**
         * ConsumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.putQueryParameter("ConsumerGroupId", consumerGroupId);
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public DeleteConsumerGroupSubscribeRelationRequest build() {
            return new DeleteConsumerGroupSubscribeRelationRequest(this);
        } 

    } 

}
