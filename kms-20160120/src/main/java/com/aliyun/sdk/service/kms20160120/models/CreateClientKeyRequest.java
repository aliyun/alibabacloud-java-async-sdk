// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateClientKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateClientKeyRequest</p>
 */
public class CreateClientKeyRequest extends Request {
    @Query
    @NameInMap("AapName")
    @Validation(required = true)
    private String aapName;

    @Query
    @NameInMap("NotAfter")
    private String notAfter;

    @Query
    @NameInMap("NotBefore")
    private String notBefore;

    @Query
    @NameInMap("Password")
    @Validation(required = true)
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
         * AapName.
         */
        public Builder aapName(String aapName) {
            this.putQueryParameter("AapName", aapName);
            this.aapName = aapName;
            return this;
        }

        /**
         * NotAfter.
         */
        public Builder notAfter(String notAfter) {
            this.putQueryParameter("NotAfter", notAfter);
            this.notAfter = notAfter;
            return this;
        }

        /**
         * NotBefore.
         */
        public Builder notBefore(String notBefore) {
            this.putQueryParameter("NotBefore", notBefore);
            this.notBefore = notBefore;
            return this;
        }

        /**
         * Password.
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
