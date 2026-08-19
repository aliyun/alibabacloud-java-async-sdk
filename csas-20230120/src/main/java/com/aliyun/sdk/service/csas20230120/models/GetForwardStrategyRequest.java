// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link GetForwardStrategyRequest} extends {@link RequestModel}
 *
 * <p>GetForwardStrategyRequest</p>
 */
public class GetForwardStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardId;

    private GetForwardStrategyRequest(Builder builder) {
        super(builder);
        this.forwardId = builder.forwardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetForwardStrategyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardId
     */
    public String getForwardId() {
        return this.forwardId;
    }

    public static final class Builder extends Request.Builder<GetForwardStrategyRequest, Builder> {
        private String forwardId; 

        private Builder() {
            super();
        } 

        private Builder(GetForwardStrategyRequest request) {
            super(request);
            this.forwardId = request.forwardId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-651b975a22aa019c</p>
         */
        public Builder forwardId(String forwardId) {
            this.putQueryParameter("ForwardId", forwardId);
            this.forwardId = forwardId;
            return this;
        }

        @Override
        public GetForwardStrategyRequest build() {
            return new GetForwardStrategyRequest(this);
        } 

    } 

}
