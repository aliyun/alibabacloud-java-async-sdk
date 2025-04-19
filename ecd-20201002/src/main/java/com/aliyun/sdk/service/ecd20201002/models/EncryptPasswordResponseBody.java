// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link EncryptPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>EncryptPasswordResponseBody</p>
 */
public class EncryptPasswordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EncryptedPassword")
    private String encryptedPassword;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EncryptPasswordResponseBody(Builder builder) {
        this.encryptedPassword = builder.encryptedPassword;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptPasswordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encryptedPassword
     */
    public String getEncryptedPassword() {
        return this.encryptedPassword;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String encryptedPassword; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(EncryptPasswordResponseBody model) {
            this.encryptedPassword = model.encryptedPassword;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The encrypted password.</p>
         * 
         * <strong>example:</strong>
         * <p>d34601bc-e6b1-4433-b0cc-8f6c5e52;n4apvGub3OBoj4Grwg==;thhO4UEomJfdvwnwlA==</p>
         */
        public Builder encryptedPassword(String encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AF538DA8-FFC6-52DA-8FF8-7B92579F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EncryptPasswordResponseBody build() {
            return new EncryptPasswordResponseBody(this);
        } 

    } 

}
