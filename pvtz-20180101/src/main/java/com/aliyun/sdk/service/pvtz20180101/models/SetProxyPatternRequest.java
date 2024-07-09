// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetProxyPatternRequest} extends {@link RequestModel}
 *
 * <p>SetProxyPatternRequest</p>
 */
public class SetProxyPatternRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyPattern")
    @com.aliyun.core.annotation.Validation(required = true)
    private String proxyPattern;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private SetProxyPatternRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.lang = builder.lang;
        this.proxyPattern = builder.proxyPattern;
        this.userClientIp = builder.userClientIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetProxyPatternRequest create() {
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<SetProxyPatternRequest, Builder> {
        private String clientToken; 
        private String lang; 
        private String proxyPattern; 
        private String userClientIp; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(SetProxyPatternRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.lang = request.lang;
            this.proxyPattern = request.proxyPattern;
            this.userClientIp = request.userClientIp;
            this.zoneId = request.zoneId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to enable the recursive resolution proxy feature for the zone. Valid values:
         * <p>
         * 
         * *   **ZONE**: disables the recursive resolution proxy feature for the zone.
         * *   **RECORD**: enables the recursive resolution proxy feature for the zone.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.putQueryParameter("ProxyPattern", proxyPattern);
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The global ID of the zone.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public SetProxyPatternRequest build() {
            return new SetProxyPatternRequest(this);
        } 

    } 

}
