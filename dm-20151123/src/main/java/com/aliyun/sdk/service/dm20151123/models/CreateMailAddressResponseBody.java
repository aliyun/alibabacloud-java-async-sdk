// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link CreateMailAddressResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMailAddressResponseBody</p>
 */
public class CreateMailAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MailAddressId")
    private String mailAddressId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateMailAddressResponseBody(Builder builder) {
        this.mailAddressId = builder.mailAddressId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMailAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mailAddressId
     */
    public String getMailAddressId() {
        return this.mailAddressId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mailAddressId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateMailAddressResponseBody model) {
            this.mailAddressId = model.mailAddressId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Mail address ID</p>
         * 
         * <strong>example:</strong>
         * <p>15123</p>
         */
        public Builder mailAddressId(String mailAddressId) {
            this.mailAddressId = mailAddressId;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>95A7D497-F8DD-4834-B81E-C1783236E55F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateMailAddressResponseBody build() {
            return new CreateMailAddressResponseBody(this);
        } 

    } 

}
