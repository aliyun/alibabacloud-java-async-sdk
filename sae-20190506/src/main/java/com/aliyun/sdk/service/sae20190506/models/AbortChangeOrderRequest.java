// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>AbortChangeOrderRequest</p>
 */
public class AbortChangeOrderRequest extends Request {
    @Query
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    private String changeOrderId;

    private AbortChangeOrderRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortChangeOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeOrderId
     */
    public String getChangeOrderId() {
        return this.changeOrderId;
    }

    public static final class Builder extends Request.Builder<AbortChangeOrderRequest, Builder> {
        private String changeOrderId; 

        private Builder() {
            super();
        } 

        private Builder(AbortChangeOrderRequest request) {
            super(request);
            this.changeOrderId = request.changeOrderId;
        } 

        /**
         * The ID of the request.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        @Override
        public AbortChangeOrderRequest build() {
            return new AbortChangeOrderRequest(this);
        } 

    } 

}
