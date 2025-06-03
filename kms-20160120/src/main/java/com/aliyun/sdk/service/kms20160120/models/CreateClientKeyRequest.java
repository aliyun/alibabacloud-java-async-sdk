// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link CreateClientKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateClientKeyRequest</p>
 */
public class CreateClientKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AapName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aapName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotAfter")
    private String notAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotBefore")
    private String notBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    private CreateClientKeyRequest(Builder builder) {
        super(builder);
        this.aapName = builder.aapName;
        this.notAfter = builder.notAfter;
        this.notBefore = builder.notBefore;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aapName
     */
    public String getAapName() {
        return this.aapName;
    }

    /**
     * @return notAfter
     */
    public String getNotAfter() {
        return this.notAfter;
    }

    /**
     * @return notBefore
     */
    public String getNotBefore() {
        return this.notBefore;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    public static final class Builder extends Request.Builder<CreateClientKeyRequest, Builder> {
        private String aapName; 
        private String notAfter; 
        private String notBefore; 
        private String password; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientKeyRequest request) {
            super(request);
            this.aapName = request.aapName;
            this.notAfter = request.notAfter;
            this.notBefore = request.notBefore;
            this.password = request.password;
        } 

        /**
         * <p>The operation that you want to perform. Set the value to <strong>CreateClientKey</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aap_test</p>
         */
        public Builder aapName(String aapName) {
            this.putQueryParameter("AapName", aapName);
            this.aapName = aapName;
            return this;
        }

        /**
         * <p>The encryption password of the client key.</p>
         * <p>The password must be 8 to 64 characters in length and must contain at least two of the following types: digits, letters, and special characters. Special characters include <code>~ ! @ # $ % ^ &amp; * ? _ -</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2028-08-31T17:14:33Z</p>
         */
        public Builder notAfter(String notAfter) {
            this.putQueryParameter("NotAfter", notAfter);
            this.notAfter = notAfter;
            return this;
        }

        /**
         * <p>The end of the validity period of the client key.</p>
         * <p>Specify the time in the ISO 8601 standard. The time must be in UTC. The time must be in the yyyy-MM-ddTHH:mm:ssZ format.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If you do not configure NotAfter, the default value is the time when the client key was created plus five years.</li>
         * <li>If you configure NotAfter, you must configure NotBefore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2023-08-31T17:14:33Z</p>
         */
        public Builder notBefore(String notBefore) {
            this.putQueryParameter("NotBefore", notBefore);
            this.notBefore = notBefore;
            return this;
        }

        /**
         * <p>The name of the AAP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bcfefe15-46f0****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        @Override
        public CreateClientKeyRequest build() {
            return new CreateClientKeyRequest(this);
        } 

    } 

}
