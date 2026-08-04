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
 * {@link FindBizCategoryConfigRequest} extends {@link RequestModel}
 *
 * <p>FindBizCategoryConfigRequest</p>
 */
public class FindBizCategoryConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocaleString")
    private String localeString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    private FindBizCategoryConfigRequest(Builder builder) {
        super(builder);
        this.localeString = builder.localeString;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindBizCategoryConfigRequest create() {
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

    public static final class Builder extends Request.Builder<FindBizCategoryConfigRequest, Builder> {
        private String localeString; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(FindBizCategoryConfigRequest request) {
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
        public FindBizCategoryConfigRequest build() {
            return new FindBizCategoryConfigRequest(this);
        } 

    } 

}
