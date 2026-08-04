// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link DeleteContacterRequest} extends {@link RequestModel}
 *
 * <p>DeleteContacterRequest</p>
 */
public class DeleteContacterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contacterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private DeleteContacterRequest(Builder builder) {
        super(builder);
        this.contacterId = builder.contacterId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContacterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contacterId
     */
    public Long getContacterId() {
        return this.contacterId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DeleteContacterRequest, Builder> {
        private Long contacterId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteContacterRequest request) {
            super(request);
            this.contacterId = request.contacterId;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contacterId(Long contacterId) {
            this.putQueryParameter("ContacterId", contacterId);
            this.contacterId = contacterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DeleteContacterRequest build() {
            return new DeleteContacterRequest(this);
        } 

    } 

}
