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
 * {@link DescribeAssetRiskListRequest} extends {@link RequestModel}
 *
 * <p>DescribeAssetRiskListRequest</p>
 */
public class DescribeAssetRiskListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpAddrList")
    private java.util.List<String> ipAddrList;

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
    public java.util.List<String> getIpAddrList() {
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
        private java.util.List<String> ipAddrList; 
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
         * <p>The list of IP addresses to query. Separate multiple IP addresses with commas (,). You can query up to 20 IP addresses at a time. This parameter is required in practice. If this parameter is not specified, the API returns a 400 error.</p>
         * <blockquote>
         * <ul>
         * <li>IPv4 example: 47.97.XX.XX.</li>
         * <li>IPv6 example: 2001:db8:ffff:ffff:ffff:XXXX:ffff.</li>
         * </ul>
         * </blockquote>
         */
        public Builder ipAddrList(java.util.List<String> ipAddrList) {
            this.putQueryParameter("IpAddrList", ipAddrList);
            this.ipAddrList = ipAddrList;
            return this;
        }

        /**
         * <p>The IP version of the assets protected by Cloud Firewall.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><strong>4</strong> (default): IPv4</p>
         * </li>
         * <li><p><strong>6</strong>: IPv6</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder ipVersion(Integer ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The language type of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
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
