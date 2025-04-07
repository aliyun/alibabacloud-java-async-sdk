// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link GetUserPhoneResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserPhoneResponseBody</p>
 */
public class GetUserPhoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetUserPhoneResponseBody(Builder builder) {
        this.phone = builder.phone;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserPhoneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String phone; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetUserPhoneResponseBody model) {
            this.phone = model.phone;
            this.requestId = model.requestId;
        } 

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CEADB586-51CB-1B6B-95BD-AB85A7A08E97</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetUserPhoneResponseBody build() {
            return new GetUserPhoneResponseBody(this);
        } 

    } 

}
