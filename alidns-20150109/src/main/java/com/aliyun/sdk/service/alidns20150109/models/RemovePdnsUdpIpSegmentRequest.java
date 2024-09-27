// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemovePdnsUdpIpSegmentRequest} extends {@link RequestModel}
 *
 * <p>RemovePdnsUdpIpSegmentRequest</p>
 */
public class RemovePdnsUdpIpSegmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private RemovePdnsUdpIpSegmentRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePdnsUdpIpSegmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<RemovePdnsUdpIpSegmentRequest, Builder> {
        private String ip; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(RemovePdnsUdpIpSegmentRequest request) {
            super(request);
            this.ip = request.ip;
            this.lang = request.lang;
        } 

        /**
         * Ip.
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
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

        @Override
        public RemovePdnsUdpIpSegmentRequest build() {
            return new RemovePdnsUdpIpSegmentRequest(this);
        } 

    } 

}
