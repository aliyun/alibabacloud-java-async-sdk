// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAssetRiskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetRiskListRequest</p>
 */
public class DescribeAssetRiskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAddrList")
    private java.util.List < String > ipAddrList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeAssetRiskListRequest(Builder builder) {
        super(builder);
        this.ipAddrList = builder.ipAddrList;
        this.ipVersion = builder.ipVersion;
        this.lang = builder.lang;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAssetRiskListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipAddrList
     */
    public java.util.List < String > getIpAddrList() {
        return this.ipAddrList;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeAssetRiskListRequest, Builder> {
        private java.util.List < String > ipAddrList; 
        private Integer ipVersion; 
        private String lang; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAssetRiskListRequest request) {
            super(request);
            this.ipAddrList = request.ipAddrList;
            this.ipVersion = request.ipVersion;
            this.lang = request.lang;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * The IP addresses to query. Separate the IP addresses with commas (,). You can specify up to 20 IP addresses at a time.
         * <p>
         * 
         * > 
         * 
         * *   Example of an IPv4 address: 47.97.XX.XX
         * 
         * *   Example of an IPv6 address: 2001:db8:ffff:ffff:ffff:XXXX:ffff
         */
        public Builder ipAddrList(java.util.List < String > ipAddrList) {
            this.putQueryParameter("IpAddrList", ipAddrList);
            this.ipAddrList = ipAddrList;
            return this;
        }

        /**
         * The IP version of the asset that is protected by Cloud Firewall.
         * <p>
         * 
         * Valid values:
         * 
         * *   **4** (default): IPv4
         * *   **6**: IPv6
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeAssetRiskListRequest build() {
            return new DescribeAssetRiskListRequest(this);
        } 

    } 

}
