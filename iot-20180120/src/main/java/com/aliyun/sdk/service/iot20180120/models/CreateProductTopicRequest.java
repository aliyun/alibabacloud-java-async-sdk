// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateProductTopicRequest</p>
 */
public class CreateProductTopicRequest extends Request {
    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("TopicShortName")
    @Validation(required = true)
    private String topicShortName;

    private CreateProductTopicRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.iotInstanceId = builder.iotInstanceId;
        this.operation = builder.operation;
        this.productKey = builder.productKey;
        this.topicShortName = builder.topicShortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return topicShortName
     */
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public static final class Builder extends Request.Builder<CreateProductTopicRequest, Builder> {
        private String desc; 
        private String iotInstanceId; 
        private String operation; 
        private String productKey; 
        private String topicShortName; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductTopicRequest response) {
            super(response);
            this.desc = response.desc;
            this.iotInstanceId = response.iotInstanceId;
            this.operation = response.operation;
            this.productKey = response.productKey;
            this.topicShortName = response.topicShortName;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
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
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
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

        /**
         * TopicShortName.
         */
        public Builder topicShortName(String topicShortName) {
            this.putQueryParameter("TopicShortName", topicShortName);
            this.topicShortName = topicShortName;
            return this;
        }

        @Override
        public CreateProductTopicRequest build() {
            return new CreateProductTopicRequest(this);
        } 

    } 

}
