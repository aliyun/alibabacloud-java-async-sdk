// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmAddrAttributeInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmAddrAttributeInfoRequest</p>
 */
public class DescribeDnsGtmAddrAttributeInfoRequest extends Request {
    @Query
    @NameInMap("Addrs")
    @Validation(required = true)
    private String addrs;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeDnsGtmAddrAttributeInfoRequest(Builder builder) {
        super(builder);
        this.addrs = builder.addrs;
        this.lang = builder.lang;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmAddrAttributeInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addrs
     */
    public String getAddrs() {
        return this.addrs;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeDnsGtmAddrAttributeInfoRequest, Builder> {
        private String addrs; 
        private String lang; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmAddrAttributeInfoRequest request) {
            super(request);
            this.addrs = request.addrs;
            this.lang = request.lang;
            this.type = request.type;
        } 

        /**
         * Addrs.
         */
        public Builder addrs(String addrs) {
            this.putQueryParameter("Addrs", addrs);
            this.addrs = addrs;
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
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeDnsGtmAddrAttributeInfoRequest build() {
            return new DescribeDnsGtmAddrAttributeInfoRequest(this);
        } 

    } 

}
