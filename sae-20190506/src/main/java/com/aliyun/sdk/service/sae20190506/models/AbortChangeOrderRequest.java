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
 * {@link AbortChangeOrderRequest} extends {@link RequestModel}
 *
 * <p>AbortChangeOrderRequest</p>
 */
public class AbortChangeOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String changeOrderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rollback")
    private Boolean rollback;

    private AbortChangeOrderRequest(Builder builder) {
        super(builder);
        this.changeOrderId = builder.changeOrderId;
        this.rollback = builder.rollback;
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

    /**
     * @return rollback
     */
    public Boolean getRollback() {
        return this.rollback;
    }

    public static final class Builder extends Request.Builder<AbortChangeOrderRequest, Builder> {
        private String changeOrderId; 
        private Boolean rollback; 

        private Builder() {
            super();
        } 

        private Builder(AbortChangeOrderRequest request) {
            super(request);
            this.changeOrderId = request.changeOrderId;
            this.rollback = request.rollback;
        } 

        /**
         * <p>The ID of the change order.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>be2e1c76-682b-4897-98d3-1d8d6478****</p>
         */
        public Builder changeOrderId(String changeOrderId) {
            this.putQueryParameter("ChangeOrderId", changeOrderId);
            this.changeOrderId = changeOrderId;
            return this;
        }

        /**
         * Rollback.
         */
        public Builder rollback(Boolean rollback) {
            this.putQueryParameter("Rollback", rollback);
            this.rollback = rollback;
            return this;
        }

        @Override
        public AbortChangeOrderRequest build() {
            return new AbortChangeOrderRequest(this);
        } 

    } 

}
