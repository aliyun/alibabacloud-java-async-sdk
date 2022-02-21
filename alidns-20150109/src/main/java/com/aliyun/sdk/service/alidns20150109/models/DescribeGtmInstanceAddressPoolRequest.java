// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmInstanceAddressPoolRequest</p>
 */
public class DescribeGtmInstanceAddressPoolRequest extends Request {
    @Query
    @NameInMap("AddrPoolId")
    @Validation(required = true)
    private String addrPoolId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DescribeGtmInstanceAddressPoolRequest(Builder builder) {
        super(builder);
        this.addrPoolId = builder.addrPoolId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceAddressPoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addrPoolId
     */
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DescribeGtmInstanceAddressPoolRequest, Builder> {
        private String addrPoolId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmInstanceAddressPoolRequest response) {
            super(response);
            this.addrPoolId = response.addrPoolId;
            this.lang = response.lang;
        } 

        /**
         * AddrPoolId.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
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
        public DescribeGtmInstanceAddressPoolRequest build() {
            return new DescribeGtmInstanceAddressPoolRequest(this);
        } 

    } 

}
