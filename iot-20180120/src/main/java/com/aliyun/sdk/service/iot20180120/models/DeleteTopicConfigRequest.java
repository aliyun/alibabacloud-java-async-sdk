// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link DeleteTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicConfigRequest</p>
 */
public class DeleteTopicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFullName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicFullName;

    private DeleteTopicConfigRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.topicFullName = builder.topicFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTopicConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return topicFullName
     */
    public String getTopicFullName() {
        return this.topicFullName;
    }

    public static final class Builder extends Request.Builder<DeleteTopicConfigRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private String topicFullName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTopicConfigRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.topicFullName = request.topicFullName;
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
         * <p>This parameter is required.</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        @Override
        public DeleteTopicConfigRequest build() {
            return new DeleteTopicConfigRequest(this);
        } 

    } 

}
