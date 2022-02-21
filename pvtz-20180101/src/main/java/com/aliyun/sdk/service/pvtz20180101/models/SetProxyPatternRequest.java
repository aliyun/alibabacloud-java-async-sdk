// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetProxyPatternRequest} extends {@link RequestModel}
 *
 * <p>SetProxyPatternRequest</p>
 */
public class SetProxyPatternRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ProxyPattern")
    @Validation(required = true)
    private String proxyPattern;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private SetProxyPatternRequest(Builder builder) {
        super(builder);
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
        private String lang; 
        private String proxyPattern; 
        private String userClientIp; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(SetProxyPatternRequest response) {
            super(response);
            this.lang = response.lang;
            this.proxyPattern = response.proxyPattern;
            this.userClientIp = response.userClientIp;
            this.zoneId = response.zoneId;
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
         * ProxyPattern.
         */
        public Builder proxyPattern(String proxyPattern) {
            this.putQueryParameter("ProxyPattern", proxyPattern);
            this.proxyPattern = proxyPattern;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * ZoneId.
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
