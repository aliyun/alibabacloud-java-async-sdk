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
 * {@link FindContacterRequest} extends {@link RequestModel}
 *
 * <p>FindContacterRequest</p>
 */
public class FindContacterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContacterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long contacterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocaleString")
    private String localeString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private FindContacterRequest(Builder builder) {
        super(builder);
        this.contacterId = builder.contacterId;
        this.localeString = builder.localeString;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindContacterRequest create() {
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
     * @return localeString
     */
    public String getLocaleString() {
        return this.localeString;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<FindContacterRequest, Builder> {
        private Long contacterId; 
        private String localeString; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(FindContacterRequest request) {
            super(request);
            this.contacterId = request.contacterId;
            this.localeString = request.localeString;
            this.type = request.type;
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
         * LocaleString.
         */
        public Builder localeString(String localeString) {
            this.putQueryParameter("LocaleString", localeString);
            this.localeString = localeString;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public FindContacterRequest build() {
            return new FindContacterRequest(this);
        } 

    } 

}
