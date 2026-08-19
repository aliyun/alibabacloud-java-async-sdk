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
 * {@link DeleteForwardStrategyRequest} extends {@link RequestModel}
 *
 * <p>DeleteForwardStrategyRequest</p>
 */
public class DeleteForwardStrategyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForwardId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardId;

    private DeleteForwardStrategyRequest(Builder builder) {
        super(builder);
        this.forwardId = builder.forwardId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteForwardStrategyRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteForwardStrategyRequest, Builder> {
        private String forwardId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteForwardStrategyRequest request) {
            super(request);
            this.forwardId = request.forwardId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-3fb9b5ae28ee5416</p>
         */
        public Builder forwardId(String forwardId) {
            this.putBodyParameter("ForwardId", forwardId);
            this.forwardId = forwardId;
            return this;
        }

        @Override
        public DeleteForwardStrategyRequest build() {
            return new DeleteForwardStrategyRequest(this);
        } 

    } 

}
