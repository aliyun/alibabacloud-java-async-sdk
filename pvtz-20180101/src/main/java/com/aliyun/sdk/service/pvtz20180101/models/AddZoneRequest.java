// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddZoneRequest} extends {@link RequestModel}
 *
 * <p>AddZoneRequest</p>
 */
public class AddZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnsGroup")
    private String dnsGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyPattern")
    private String proxyPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneTag")
    private String zoneTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneType")
    private String zoneType;

    private AddZoneRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dnsGroup = builder.dnsGroup;
        this.lang = builder.lang;
        this.proxyPattern = builder.proxyPattern;
        this.resourceGroupId = builder.resourceGroupId;
        this.zoneName = builder.zoneName;
        this.zoneTag = builder.zoneTag;
        this.zoneType = builder.zoneType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddZoneRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dnsGroup
     */
    public String getDnsGroup() {
        return this.dnsGroup;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return proxyPattern
     */
    public String getProxyPattern() {
        return this.proxyPattern;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    /**
     * @return zoneTag
     */
    public String getZoneTag() {
        return this.zoneTag;
    }

    /**
     * @return zoneType
     */
    public String getZoneType() {
        return this.zoneType;
    }

    public static final class Builder extends Request.Builder<AddZoneRequest, Builder> {
        private String clientToken; 
        private String dnsGroup; 
        private String lang; 
        private String proxyPattern; 
        private String resourceGroupId; 
        private String zoneName; 
        private String zoneTag; 
        private String zoneType; 

        private Builder() {
            super();
        } 

        private Builder(AddZoneRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dnsGroup = request.dnsGroup;
            this.lang = request.lang;
            this.proxyPattern = request.proxyPattern;
            this.resourceGroupId = request.resourceGroupId;
            this.zoneName = request.zoneName;
            this.zoneTag = request.zoneTag;
            this.zoneType = request.zoneType;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>21079fa016944979537637959d09bc</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The logical location type of the built-in authoritative module in which the zone is added. Valid values:</p>
         * <ul>
         * <li><strong>NORMAL_ZONE</strong>: the regular module. DNS results are stored in the cache module and DNS requests are sent to the regular module if the DNS requests do not match the DNS records in the cache module. DNS record updates take effect based on the time to live (TTL) value. The regular module does not support DNS resolution over user-defined lines or based on weight values.</li>
         * <li><strong>FAST_ZONE</strong>: the acceleration module. It directly responds to DNS requests with the lowest latency and updates DNS records in real time. The acceleration module supports DNS resolution over user-defined lines or based on weight values.</li>
         * </ul>
         * <p>Default value: <strong>NORMAL_ZONE</strong>.</p>
         * <blockquote>
         * <p> The DNS results returned by the built-in authoritative acceleration module are not stored in the cache module because the built-in authoritative acceleration module is located before the cache module. As a result, you are charged more for DNS requests.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>FAST_ZONE</p>
         */
        public Builder dnsGroup(String dnsGroup) {
            this.putQueryParameter("DnsGroup", dnsGroup);
            this.dnsGroup = dnsGroup;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
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
         * <p>Specifies whether to enable the recursive resolution proxy for subdomain names. Valid values:</p>
         * <ul>
         * <li><strong>ZONE</strong>: disables the recursive resolution proxy for subdomain names. In this case, NXDOMAIN is returned if the queried subdomain name does not exist in the zone.</li>
         * <li><strong>RECORD</strong>: enables the recursive resolution proxy for subdomain names. In this case, if the queried subdomain name does not exist in the zone, DNS requests are recursively forwarded to the forward module and then to the recursion module until DNS results are returned.</li>
         * </ul>
         * <p>Default value: <strong>ZONE</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ZONE</p>
         */
        public Builder proxyPattern(String proxyPattern) {
            this.putQueryParameter("ProxyPattern", proxyPattern);
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmykd63gt****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the zone to be added.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        /**
         * <p>This parameter is not available. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>BLINK</p>
         */
        public Builder zoneTag(String zoneTag) {
            this.putQueryParameter("ZoneTag", zoneTag);
            this.zoneTag = zoneTag;
            return this;
        }

        /**
         * <p>This parameter is not available. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_PRODUCT_ZONE</p>
         */
        public Builder zoneType(String zoneType) {
            this.putQueryParameter("ZoneType", zoneType);
            this.zoneType = zoneType;
            return this;
        }

        @Override
        public AddZoneRequest build() {
            return new AddZoneRequest(this);
        } 

    } 

}
