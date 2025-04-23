// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SetDNSSLBStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDNSSLBStatusRequest</p>
 */
public class SetDNSSLBStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Open")
    private Boolean open;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
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
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The DNS resolution line. The line can be the default line, China Telecom, and China Mobile.</p>
         * 
         * <strong>example:</strong>
         * <p>China Mobile.</p>
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>Specifies whether to enable or disable weighted round-robin. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables weighted round-robin.</li>
         * <li><strong>false</strong>: disables weighted round-robin.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder open(Boolean open) {
            this.putQueryParameter("Open", open);
            this.open = open;
            return this;
        }

        /**
         * <p>The subdomain name for which you want to enable weighted round-robin. Set the parameter to @.example.com instead of example.com.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The type of the Domain Name System (DNS) record. Valid values: A and AAAA. Default value: A.</p>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0</p>
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
