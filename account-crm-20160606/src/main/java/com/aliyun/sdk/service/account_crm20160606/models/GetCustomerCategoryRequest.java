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
 * {@link GetCustomerCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetCustomerCategoryRequest</p>
 */
public class GetCustomerCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocaleString")
    private String localeString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private GetCustomerCategoryRequest(Builder builder) {
        super(builder);
        this.localeString = builder.localeString;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return localeString
     */
    public String getLocaleString() {
        return this.localeString;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetCustomerCategoryRequest, Builder> {
        private String localeString; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomerCategoryRequest request) {
            super(request);
            this.localeString = request.localeString;
            this.userId = request.userId;
        } 

        /**
         * LocaleString.
         */
        public Builder localeString(String localeString) {
            this.putQueryParameter("LocaleString", localeString);
            this.localeString = localeString;
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
        public GetCustomerCategoryRequest build() {
            return new GetCustomerCategoryRequest(this);
        } 

    } 

}
