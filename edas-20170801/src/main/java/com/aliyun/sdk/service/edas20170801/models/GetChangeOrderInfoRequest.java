// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChangeOrderInfoRequest} extends {@link RequestModel}
 *
 * <p>GetChangeOrderInfoRequest</p>
 */
public class GetChangeOrderInfoRequest extends Request {
    @Query
    @NameInMap("ChangeOrderId")
    @Validation(required = true)
    private String changeOrderId;

    private GetChangeOrderInfoRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChangeOrderInfoRequest create() {
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

    public static final class Builder extends Request.Builder<GetChangeOrderInfoRequest, Builder> {
        private String changeOrderId; 

        private Builder() {
            super();
        } 

        private Builder(GetChangeOrderInfoRequest request) {
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
        public GetChangeOrderInfoRequest build() {
            return new GetChangeOrderInfoRequest(this);
        } 

    } 

}
