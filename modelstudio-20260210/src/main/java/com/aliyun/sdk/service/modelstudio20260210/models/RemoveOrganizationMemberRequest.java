// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link RemoveOrganizationMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveOrganizationMemberRequest</p>
 */
public class RemoveOrganizationMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountIds")
    private java.util.List<String> accountIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Locale")
    private String locale;

    private RemoveOrganizationMemberRequest(Builder builder) {
        super(builder);
        this.accountIds = builder.accountIds;
        this.locale = builder.locale;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveOrganizationMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountIds
     */
    public java.util.List<String> getAccountIds() {
        return this.accountIds;
    }

    /**
     * @return locale
     */
    public String getLocale() {
        return this.locale;
    }

    public static final class Builder extends Request.Builder<RemoveOrganizationMemberRequest, Builder> {
        private java.util.List<String> accountIds; 
        private String locale; 

        private Builder() {
            super();
        } 

        private Builder(RemoveOrganizationMemberRequest request) {
            super(request);
            this.accountIds = request.accountIds;
            this.locale = request.locale;
        } 

        /**
         * AccountIds.
         */
        public Builder accountIds(java.util.List<String> accountIds) {
            this.putQueryParameter("AccountIds", accountIds);
            this.accountIds = accountIds;
            return this;
        }

        /**
         * Locale.
         */
        public Builder locale(String locale) {
            this.putQueryParameter("Locale", locale);
            this.locale = locale;
            return this;
        }

        @Override
        public RemoveOrganizationMemberRequest build() {
            return new RemoveOrganizationMemberRequest(this);
        } 

    } 

}
