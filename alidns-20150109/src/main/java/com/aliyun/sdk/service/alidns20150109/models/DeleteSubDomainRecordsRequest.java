// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSubDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DeleteSubDomainRecordsRequest</p>
 */
public class DeleteSubDomainRecordsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RR")
    @Validation(required = true)
    private String RR;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private DeleteSubDomainRecordsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.RR = builder.RR;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSubDomainRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return RR
     */
    public String getRR() {
        return this.RR;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<DeleteSubDomainRecordsRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String RR; 
        private String type; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSubDomainRecordsRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.lang = response.lang;
            this.RR = response.RR;
            this.type = response.type;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RR.
         */
        public Builder RR(String RR) {
            this.putQueryParameter("RR", RR);
            this.RR = RR;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public DeleteSubDomainRecordsRequest build() {
            return new DeleteSubDomainRecordsRequest(this);
        } 

    } 

}
