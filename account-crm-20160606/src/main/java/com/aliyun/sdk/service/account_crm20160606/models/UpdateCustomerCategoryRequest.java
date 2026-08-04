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
 * {@link UpdateCustomerCategoryRequest} extends {@link RequestModel}
 *
 * <p>UpdateCustomerCategoryRequest</p>
 */
public class UpdateCustomerCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String paramList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private UpdateCustomerCategoryRequest(Builder builder) {
        super(builder);
        this.paramList = builder.paramList;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomerCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramList
     */
    public String getParamList() {
        return this.paramList;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<UpdateCustomerCategoryRequest, Builder> {
        private String paramList; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateCustomerCategoryRequest request) {
            super(request);
            this.paramList = request.paramList;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder paramList(String paramList) {
            this.putQueryParameter("ParamList", paramList);
            this.paramList = paramList;
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
        public UpdateCustomerCategoryRequest build() {
            return new UpdateCustomerCategoryRequest(this);
        } 

    } 

}
