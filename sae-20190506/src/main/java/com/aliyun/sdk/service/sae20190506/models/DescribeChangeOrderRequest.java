// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>DescribeChangeOrderRequest</p>
 */
public class DescribeChangeOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeOrderId;

    private DescribeChangeOrderRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChangeOrderRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeChangeOrderRequest, Builder> {
        private String changeOrderId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChangeOrderRequest request) {
            super(request);
            this.changeOrderId = request.changeOrderId;
        } 

        /**
         * <p>The ID of the change order. You can call the <a href="https://help.aliyun.com/document_detail/126615.html">ListChangeOrders</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>76fa5c0-9ebb-4bb4-b383-1f885447****</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        @Override
        public DescribeChangeOrderRequest build() {
            return new DescribeChangeOrderRequest(this);
        } 

    } 

}
