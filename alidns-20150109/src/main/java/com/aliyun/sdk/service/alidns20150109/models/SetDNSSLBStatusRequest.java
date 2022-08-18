// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDNSSLBStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDNSSLBStatusRequest</p>
 */
public class SetDNSSLBStatusRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Line")
    private String line;

    @Query
    @NameInMap("Open")
    private Boolean open;

    @Query
    @NameInMap("SubDomain")
    @Validation(required = true)
    private String subDomain;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SetDNSSLBStatusRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.line = builder.line;
        this.open = builder.open;
        this.subDomain = builder.subDomain;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDNSSLBStatusRequest create() {
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
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return open
     */
    public Boolean getOpen() {
        return this.open;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
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

    public static final class Builder extends Request.Builder<SetDNSSLBStatusRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String line; 
        private Boolean open; 
        private String subDomain; 
        private String type; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SetDNSSLBStatusRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.line = request.line;
            this.open = request.open;
            this.subDomain = request.subDomain;
            this.type = request.type;
            this.userClientIp = request.userClientIp;
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
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * Open.
         */
        public Builder open(Boolean open) {
            this.putQueryParameter("Open", open);
            this.open = open;
            return this;
        }

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
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
        public SetDNSSLBStatusRequest build() {
            return new SetDNSSLBStatusRequest(this);
        } 

    } 

}
