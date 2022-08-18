// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePdnsUdpIpSegmentRequest} extends {@link RequestModel}
 *
 * <p>CreatePdnsUdpIpSegmentRequest</p>
 */
public class CreatePdnsUdpIpSegmentRequest extends Request {
    @Query
    @NameInMap("Ip")
    private String ip;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    private String name;

    private CreatePdnsUdpIpSegmentRequest(Builder builder) {
        super(builder);
        this.ip = builder.ip;
        this.lang = builder.lang;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePdnsUdpIpSegmentRequest create() {
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

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CreatePdnsUdpIpSegmentRequest, Builder> {
        private String ip; 
        private String lang; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CreatePdnsUdpIpSegmentRequest request) {
            super(request);
            this.ip = request.ip;
            this.lang = request.lang;
            this.name = request.name;
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

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public CreatePdnsUdpIpSegmentRequest build() {
            return new CreatePdnsUdpIpSegmentRequest(this);
        } 

    } 

}
