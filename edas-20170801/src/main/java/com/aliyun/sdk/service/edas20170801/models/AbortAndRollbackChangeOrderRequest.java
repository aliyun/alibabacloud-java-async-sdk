// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AbortAndRollbackChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>AbortAndRollbackChangeOrderRequest</p>
 */
public class AbortAndRollbackChangeOrderRequest extends Request {
    @Query
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    private String changeOrderId;

    private AbortAndRollbackChangeOrderRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AbortAndRollbackChangeOrderRequest create() {
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

    public static final class Builder extends Request.Builder<AbortAndRollbackChangeOrderRequest, Builder> {
        private String changeOrderId; 

        private Builder() {
            super();
        } 

        private Builder(AbortAndRollbackChangeOrderRequest request) {
            super(request);
            this.changeOrderId = request.changeOrderId;
        } 

        /**
         * The ID of the change process.
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        @Override
        public AbortAndRollbackChangeOrderRequest build() {
            return new AbortAndRollbackChangeOrderRequest(this);
        } 

    } 

}
