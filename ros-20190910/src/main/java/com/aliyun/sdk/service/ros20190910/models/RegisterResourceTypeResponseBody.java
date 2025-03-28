// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
 * {@link RegisterResourceTypeResponseBody} extends {@link TeaModel}
 *
 * <p>RegisterResourceTypeResponseBody</p>
 */
public class RegisterResourceTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RegisterResourceTypeResponseBody(Builder builder) {
        this.registrationId = builder.registrationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterResourceTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String registrationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RegisterResourceTypeResponseBody model) {
            this.registrationId = model.registrationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the registration record. You can call the <a href="https://help.aliyun.com/document_detail/2330740.html">ListResourceTypeRegistrations</a> operation to query registration records.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RegisterResourceTypeResponseBody build() {
            return new RegisterResourceTypeResponseBody(this);
        } 

    } 

}
