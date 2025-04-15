// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link DeleteOuterAccountRequest} extends {@link RequestModel}
 *
 * <p>DeleteOuterAccountRequest</p>
 */
public class DeleteOuterAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterAccountId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OuterAccountType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outerAccountType;

    private DeleteOuterAccountRequest(Builder builder) {
        super(builder);
        this.outerAccountId = builder.outerAccountId;
        this.outerAccountType = builder.outerAccountType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOuterAccountRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return outerAccountId
     */
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    /**
     * @return outerAccountType
     */
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

    public static final class Builder extends Request.Builder<DeleteOuterAccountRequest, Builder> {
        private String outerAccountId; 
        private String outerAccountType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOuterAccountRequest request) {
            super(request);
            this.outerAccountId = request.outerAccountId;
            this.outerAccountType = request.outerAccountType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder outerAccountId(String outerAccountId) {
            this.putQueryParameter("OuterAccountId", outerAccountId);
            this.outerAccountId = outerAccountId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        public Builder outerAccountType(String outerAccountType) {
            this.putQueryParameter("OuterAccountType", outerAccountType);
            this.outerAccountType = outerAccountType;
            return this;
        }

        @Override
        public DeleteOuterAccountRequest build() {
            return new DeleteOuterAccountRequest(this);
        } 

    } 

}
