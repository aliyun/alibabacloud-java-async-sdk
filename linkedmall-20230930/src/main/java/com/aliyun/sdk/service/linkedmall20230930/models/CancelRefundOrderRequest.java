// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link CancelRefundOrderRequest} extends {@link RequestModel}
 *
 * <p>CancelRefundOrderRequest</p>
 */
public class CancelRefundOrderRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("disputeId")
    private String disputeId;

    private CancelRefundOrderRequest(Builder builder) {
        super(builder);
        this.disputeId = builder.disputeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelRefundOrderRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disputeId
     */
    public String getDisputeId() {
        return this.disputeId;
    }

    public static final class Builder extends Request.Builder<CancelRefundOrderRequest, Builder> {
        private String disputeId; 

        private Builder() {
            super();
        } 

        private Builder(CancelRefundOrderRequest request) {
            super(request);
            this.disputeId = request.disputeId;
        } 

        /**
         * disputeId.
         */
        public Builder disputeId(String disputeId) {
            this.putPathParameter("disputeId", disputeId);
            this.disputeId = disputeId;
            return this;
        }

        @Override
        public CancelRefundOrderRequest build() {
            return new CancelRefundOrderRequest(this);
        } 

    } 

}
