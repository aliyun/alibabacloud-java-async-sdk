// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link AbortChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>AbortChangeOrderRequest</p>
 */
public class AbortChangeOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the change process. You can call the <a href="https://help.aliyun.com/document_detail/62072.html">GetChangeOrderInfo</a> operation to query the change process ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4f038ddf-b27b-<strong><strong>-</strong></strong>-88e44375****</p>
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
