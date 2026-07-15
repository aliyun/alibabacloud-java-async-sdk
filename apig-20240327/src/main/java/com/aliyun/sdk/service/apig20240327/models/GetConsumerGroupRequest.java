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
 * {@link GetConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerGroupRequest</p>
 */
public class GetConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    private String consumerGroupId;

    private GetConsumerGroupRequest(Builder builder) {
        super(builder);
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
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    public static final class Builder extends Request.Builder<GetConsumerGroupRequest, Builder> {
        private String consumerGroupId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerGroupRequest request) {
            super(request);
            this.consumerGroupId = request.consumerGroupId;
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
        public GetConsumerGroupRequest build() {
            return new GetConsumerGroupRequest(this);
        } 

    } 

}
