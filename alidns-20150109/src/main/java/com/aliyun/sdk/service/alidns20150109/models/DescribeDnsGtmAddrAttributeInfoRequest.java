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
 * {@link DescribeDnsGtmAddrAttributeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAddrAttributeInfoRequest</p>
 */
public class DescribeDnsGtmAddrAttributeInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Addrs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addrs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeDnsGtmAddrAttributeInfoRequest(Builder builder) {
        super(builder);
        this.addrs = builder.addrs;
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAddrAttributeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addrs
     */
    public String getAddrs() {
        return this.addrs;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDnsGtmAddrAttributeInfoRequest, Builder> {
        private String addrs; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAddrAttributeInfoRequest request) {
            super(request);
            this.addrs = request.addrs;
            this.lang = request.lang;
            this.type = request.type;
        } 

        /**
         * <p>The addresses.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;1.1.1.1&quot;]</p>
         */
        public Builder addrs(String addrs) {
            this.putQueryParameter("Addrs", addrs);
            this.addrs = addrs;
            return this;
        }

        /**
         * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
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
         * <p>The type of addresses. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address</li>
         * <li>IPv6: IPv6 address</li>
         * <li>DOMAIN: domain name</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDnsGtmAddrAttributeInfoRequest build() {
            return new DescribeDnsGtmAddrAttributeInfoRequest(this);
        } 

    } 

}
