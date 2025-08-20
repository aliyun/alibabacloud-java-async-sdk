// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

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
 * {@link GetPhoneNumberResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhoneNumberResponseBody</p>
 */
public class GetPhoneNumberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("phoneNumber")
    private String phoneNumber;

    private GetPhoneNumberResponseBody(Builder builder) {
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhoneNumberResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder {
        private String phoneNumber; 

        private Builder() {
        } 

        private Builder(GetPhoneNumberResponseBody model) {
            this.phoneNumber = model.phoneNumber;
        } 

        /**
         * phoneNumber.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public GetPhoneNumberResponseBody build() {
            return new GetPhoneNumberResponseBody(this);
        } 

    } 

}
