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
         * <p>The name of the attached application access point (AAP).</p>
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
         * <p>The end time of the validity period of the ClientKey.</p>
         * <p>The time is specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify NotAfter, the default value is the creation time of the ClientKey plus 5 years.</li>
         * <li>If you specify NotAfter, you must also specify NotBefore.</li>
         * </ul>
         * </blockquote>
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
         * <p>The start time of the validity period of the ClientKey.</p>
         * <p>The time is specified in the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify NotBefore, the default value is the creation time of the ClientKey.</li>
         * <li>If you specify NotBefore, you must also specify NotAfter.</li>
         * </ul>
         * </blockquote>
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
         * <p>The passphrase of the ClientKey.</p>
         * <p>The passphrase must be 8 to 64 characters in length and can contain digits, uppercase and lowercase letters, and special characters such as <code>~!@#$%^&amp;*?_-</code>. It must contain at least two of these character types.</p>
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
