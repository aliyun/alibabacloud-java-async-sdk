// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckZoneNameRequest} extends {@link RequestModel}
 *
 * <p>CheckZoneNameRequest</p>
 */
public class CheckZoneNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private CheckZoneNameRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckZoneNameRequest create() {
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
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<CheckZoneNameRequest, Builder> {
        private String lang; 
        private String userClientIp; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(CheckZoneNameRequest request) {
            super(request);
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
            this.zoneName = request.zoneName;
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
         * The IP address of the client.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * The name of the zone. This parameter is required.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public CheckZoneNameRequest build() {
            return new CheckZoneNameRequest(this);
        } 

    } 

}
