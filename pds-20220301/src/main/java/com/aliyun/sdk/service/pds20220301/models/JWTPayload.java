// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link JWTPayload} extends {@link TeaModel}
 *
 * <p>JWTPayload</p>
 */
public class JWTPayload extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aud")
    private String aud;

    @com.aliyun.core.annotation.NameInMap("auto_create")
    private Boolean autoCreate;

    @com.aliyun.core.annotation.NameInMap("exp")
    private Long exp;

    @com.aliyun.core.annotation.NameInMap("iat")
    private Long iat;

    @com.aliyun.core.annotation.NameInMap("iss")
    private String iss;

    @com.aliyun.core.annotation.NameInMap("jti")
    private String jti;

    @com.aliyun.core.annotation.NameInMap("nbf")
    private Long nbf;

    @com.aliyun.core.annotation.NameInMap("sub")
    private String sub;

    @com.aliyun.core.annotation.NameInMap("sub_type")
    private String subType;

    private JWTPayload(Builder builder) {
        this.aud = builder.aud;
        this.autoCreate = builder.autoCreate;
        this.exp = builder.exp;
        this.iat = builder.iat;
        this.iss = builder.iss;
        this.jti = builder.jti;
        this.nbf = builder.nbf;
        this.sub = builder.sub;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JWTPayload create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aud
     */
    public String getAud() {
        return this.aud;
    }

    /**
     * @return autoCreate
     */
    public Boolean getAutoCreate() {
        return this.autoCreate;
    }

    /**
     * @return exp
     */
    public Long getExp() {
        return this.exp;
    }

    /**
     * @return iat
     */
    public Long getIat() {
        return this.iat;
    }

    /**
     * @return iss
     */
    public String getIss() {
        return this.iss;
    }

    /**
     * @return jti
     */
    public String getJti() {
        return this.jti;
    }

    /**
     * @return nbf
     */
    public Long getNbf() {
        return this.nbf;
    }

    /**
     * @return sub
     */
    public String getSub() {
        return this.sub;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder {
        private String aud; 
        private Boolean autoCreate; 
        private Long exp; 
        private Long iat; 
        private String iss; 
        private String jti; 
        private Long nbf; 
        private String sub; 
        private String subType; 

        private Builder() {
        } 

        private Builder(JWTPayload model) {
            this.aud = model.aud;
            this.autoCreate = model.autoCreate;
            this.exp = model.exp;
            this.iat = model.iat;
            this.iss = model.iss;
            this.jti = model.jti;
            this.nbf = model.nbf;
            this.sub = model.sub;
            this.subType = model.subType;
        } 

        /**
         * aud.
         */
        public Builder aud(String aud) {
            this.aud = aud;
            return this;
        }

        /**
         * auto_create.
         */
        public Builder autoCreate(Boolean autoCreate) {
            this.autoCreate = autoCreate;
            return this;
        }

        /**
         * exp.
         */
        public Builder exp(Long exp) {
            this.exp = exp;
            return this;
        }

        /**
         * iat.
         */
        public Builder iat(Long iat) {
            this.iat = iat;
            return this;
        }

        /**
         * iss.
         */
        public Builder iss(String iss) {
            this.iss = iss;
            return this;
        }

        /**
         * jti.
         */
        public Builder jti(String jti) {
            this.jti = jti;
            return this;
        }

        /**
         * nbf.
         */
        public Builder nbf(Long nbf) {
            this.nbf = nbf;
            return this;
        }

        /**
         * sub.
         */
        public Builder sub(String sub) {
            this.sub = sub;
            return this;
        }

        /**
         * sub_type.
         */
        public Builder subType(String subType) {
            this.subType = subType;
            return this;
        }

        public JWTPayload build() {
            return new JWTPayload(this);
        } 

    } 

}
