// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The addresses whose source regions you want to query.
         */
        public Builder addrs(String addrs) {
            this.putQueryParameter("Addrs", addrs);
            this.addrs = addrs;
            return this;
        }

        /**
         * The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The type of the addresses. Valid values:
         * <p>
         * 
         * *   IPV4: IPv4 address
         * *   IPV6: IPv6 address
         * *   DOMAIN: domain name
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
