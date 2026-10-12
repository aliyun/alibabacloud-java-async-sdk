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
 * {@link GetHiMarketConsumerRequest} extends {@link RequestModel}
 *
 * <p>GetHiMarketConsumerRequest</p>
 */
public class GetHiMarketConsumerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    private GetHiMarketConsumerRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHiMarketConsumerRequest create() {
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

    public static final class Builder extends Request.Builder<GetHiMarketConsumerRequest, Builder> {
        private String consumerId; 

        private Builder() {
            super();
        } 

        private Builder(GetHiMarketConsumerRequest request) {
            super(request);
            this.consumerId = request.consumerId;
        } 

        /**
         * <p>The consumer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-xxxxxxxxxxxx</p>
         */
        public Builder consumerId(String consumerId) {
            this.putPathParameter("consumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        @Override
        public GetHiMarketConsumerRequest build() {
            return new GetHiMarketConsumerRequest(this);
        } 

    } 

}
