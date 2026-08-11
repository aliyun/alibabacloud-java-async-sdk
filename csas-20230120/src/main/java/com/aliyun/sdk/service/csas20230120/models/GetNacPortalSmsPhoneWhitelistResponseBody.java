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
 * {@link GetNacPortalSmsPhoneWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>GetNacPortalSmsPhoneWhitelistResponseBody</p>
 */
public class GetNacPortalSmsPhoneWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Phones")
    private java.util.List<String> phones;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNacPortalSmsPhoneWhitelistResponseBody(Builder builder) {
        this.phones = builder.phones;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNacPortalSmsPhoneWhitelistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phones
     */
    public java.util.List<String> getPhones() {
        return this.phones;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> phones; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNacPortalSmsPhoneWhitelistResponseBody model) {
            this.phones = model.phones;
            this.requestId = model.requestId;
        } 

        /**
         * Phones.
         */
        public Builder phones(java.util.List<String> phones) {
            this.phones = phones;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNacPortalSmsPhoneWhitelistResponseBody build() {
            return new GetNacPortalSmsPhoneWhitelistResponseBody(this);
        } 

    } 

}
