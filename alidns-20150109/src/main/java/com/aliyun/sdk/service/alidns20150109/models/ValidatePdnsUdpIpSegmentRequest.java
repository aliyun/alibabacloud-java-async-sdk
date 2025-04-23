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
 * {@link ValidatePdnsUdpIpSegmentRequest} extends {@link RequestModel}
 *
 * <p>ValidatePdnsUdpIpSegmentRequest</p>
 */
public class ValidatePdnsUdpIpSegmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpToken")
    private String ipToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ValidatePdnsUdpIpSegmentRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.ipToken = builder.ipToken;
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
     * @return ipToken
     */
    public String getIpToken() {
        return this.ipToken;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ValidatePdnsUdpIpSegmentRequest, Builder> {
        private String ip; 
        private String ipToken; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ValidatePdnsUdpIpSegmentRequest request) {
            super(request);
            this.ip = request.ip;
            this.ipToken = request.ipToken;
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
         * IpToken.
         */
        public Builder ipToken(String ipToken) {
            this.putQueryParameter("IpToken", ipToken);
            this.ipToken = ipToken;
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
