// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidatePdnsUdpIpSegmentRequest} extends {@link RequestModel}
 *
 * <p>ValidatePdnsUdpIpSegmentRequest</p>
 */
public class ValidatePdnsUdpIpSegmentRequest extends Request {
    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("Lang")
    private String lang;

    private ValidatePdnsUdpIpSegmentRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidatePdnsUdpIpSegmentRequest create() {
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

    public static final class Builder extends Request.Builder<ValidatePdnsUdpIpSegmentRequest, Builder> {
        private String ip; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ValidatePdnsUdpIpSegmentRequest response) {
            super(response);
            this.ip = response.ip;
            this.lang = response.lang;
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
        public ValidatePdnsUdpIpSegmentRequest build() {
            return new ValidatePdnsUdpIpSegmentRequest(this);
        } 

    } 

}
