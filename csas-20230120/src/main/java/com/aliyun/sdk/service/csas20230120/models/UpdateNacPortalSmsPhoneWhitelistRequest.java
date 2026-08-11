// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateNacPortalSmsPhoneWhitelistRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacPortalSmsPhoneWhitelistRequest</p>
 */
public class UpdateNacPortalSmsPhoneWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phones")
    private java.util.List<String> phones;

    private UpdateNacPortalSmsPhoneWhitelistRequest(Builder builder) {
        super(builder);
        this.phones = builder.phones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacPortalSmsPhoneWhitelistRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phones
     */
    public java.util.List<String> getPhones() {
        return this.phones;
    }

    public static final class Builder extends Request.Builder<UpdateNacPortalSmsPhoneWhitelistRequest, Builder> {
        private java.util.List<String> phones; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacPortalSmsPhoneWhitelistRequest request) {
            super(request);
            this.phones = request.phones;
        } 

        /**
         * Phones.
         */
        public Builder phones(java.util.List<String> phones) {
            this.putQueryParameter("Phones", phones);
            this.phones = phones;
            return this;
        }

        @Override
        public UpdateNacPortalSmsPhoneWhitelistRequest build() {
            return new UpdateNacPortalSmsPhoneWhitelistRequest(this);
        } 

    } 

}
