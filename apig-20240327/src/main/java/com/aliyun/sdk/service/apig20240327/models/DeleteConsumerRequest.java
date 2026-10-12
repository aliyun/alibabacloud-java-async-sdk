// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link DeleteConsumerRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerRequest</p>
 */
public class DeleteConsumerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    private DeleteConsumerRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    public static final class Builder extends Request.Builder<DeleteConsumerRequest, Builder> {
        private String consumerId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumerRequest request) {
            super(request);
            this.consumerId = request.consumerId;
        } 

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-cv8em6um1hku2shkv19g</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        @Override
        public DeleteConsumerRequest build() {
            return new DeleteConsumerRequest(this);
        } 

    } 

}
