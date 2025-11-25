// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeControlPolicyDomainResolveRequest} extends {@link RequestModel}
 *
 * <p>DescribeControlPolicyDomainResolveRequest</p>
 */
public class DescribeControlPolicyDomainResolveRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private Integer ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionNo")
    private String regionNo;

    private DescribeControlPolicyDomainResolveRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.firewallType = builder.firewallType;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.regionNo = builder.regionNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeControlPolicyDomainResolveRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    public static final class Builder extends Request.Builder<DescribeControlPolicyDomainResolveRequest, Builder> {
        private String domain; 
        private String firewallType; 
        private Integer ipVersion; 
        private String lang; 
        private String regionNo; 

        private Builder() {
            super();
        } 

        private Builder(DescribeControlPolicyDomainResolveRequest request) {
            super(request);
            this.domain = request.domain;
            this.firewallType = request.firewallType;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.regionNo = request.regionNo;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * FirewallType.
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * IpVersion.
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
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
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        @Override
        public DescribeControlPolicyDomainResolveRequest build() {
            return new DescribeControlPolicyDomainResolveRequest(this);
        } 

    } 

}
