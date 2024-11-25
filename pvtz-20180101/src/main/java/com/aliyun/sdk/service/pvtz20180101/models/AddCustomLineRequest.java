// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddCustomLineRequest} extends {@link RequestModel}
 *
 * <p>AddCustomLineRequest</p>
 */
public class AddCustomLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsCategory")
    private String dnsCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ipv4s")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ipv4s;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareScope")
    private String shareScope;

    private AddCustomLineRequest(Builder builder) {
        super(builder);
        this.dnsCategory = builder.dnsCategory;
        this.ipv4s = builder.ipv4s;
        this.lang = builder.lang;
        this.name = builder.name;
        this.shareScope = builder.shareScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCustomLineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsCategory
     */
    public String getDnsCategory() {
        return this.dnsCategory;
    }

    /**
     * @return ipv4s
     */
    public java.util.List < String > getIpv4s() {
        return this.ipv4s;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return shareScope
     */
    public String getShareScope() {
        return this.shareScope;
    }

    public static final class Builder extends Request.Builder<AddCustomLineRequest, Builder> {
        private String dnsCategory; 
        private java.util.List < String > ipv4s; 
        private String lang; 
        private String name; 
        private String shareScope; 

        private Builder() {
            super();
        } 

        private Builder(AddCustomLineRequest request) {
            super(request);
            this.dnsCategory = request.dnsCategory;
            this.ipv4s = request.ipv4s;
            this.lang = request.lang;
            this.name = request.name;
            this.shareScope = request.shareScope;
        } 

        /**
         * <p>This parameter is not available. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>INTRANET</p>
         */
        public Builder dnsCategory(String dnsCategory) {
            this.putQueryParameter("DnsCategory", dnsCategory);
            this.dnsCategory = dnsCategory;
            return this;
        }

        /**
         * <p>The IPv4 CIDR blocks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder ipv4s(java.util.List < String > ipv4s) {
            this.putQueryParameter("Ipv4s", ipv4s);
            this.ipv4s = ipv4s;
            return this;
        }

        /**
         * <p>The language.</p>
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
         * <p>The name of the custom line.</p>
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is not available. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>GLOBAL</p>
         */
        public Builder shareScope(String shareScope) {
            this.putQueryParameter("ShareScope", shareScope);
            this.shareScope = shareScope;
            return this;
        }

        @Override
        public AddCustomLineRequest build() {
            return new AddCustomLineRequest(this);
        } 

    } 

}
