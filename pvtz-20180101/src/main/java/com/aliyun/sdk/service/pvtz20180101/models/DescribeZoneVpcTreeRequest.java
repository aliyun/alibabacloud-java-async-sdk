// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZoneVpcTreeRequest} extends {@link RequestModel}
 *
 * <p>DescribeZoneVpcTreeRequest</p>
 */
public class DescribeZoneVpcTreeRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private DescribeZoneVpcTreeRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneVpcTreeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeZoneVpcTreeRequest, Builder> {
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZoneVpcTreeRequest request) {
            super(request);
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public DescribeZoneVpcTreeRequest build() {
            return new DescribeZoneVpcTreeRequest(this);
        } 

    } 

}
