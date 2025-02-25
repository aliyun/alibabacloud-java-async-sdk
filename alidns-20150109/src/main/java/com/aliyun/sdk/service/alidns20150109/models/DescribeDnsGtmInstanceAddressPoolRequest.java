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
 * {@link DescribeDnsGtmInstanceAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>DescribeDnsGtmInstanceAddressPoolRequest</p>
 */
public class DescribeDnsGtmInstanceAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeDnsGtmInstanceAddressPoolRequest(Builder builder) {
        super(builder);
        this.addrPoolId = builder.addrPoolId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceAddressPoolRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDnsGtmInstanceAddressPoolRequest, Builder> {
        private String addrPoolId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDnsGtmInstanceAddressPoolRequest request) {
            super(request);
            this.addrPoolId = request.addrPoolId;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the address pool.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testpool1</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The language of the values of specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeDnsGtmInstanceAddressPoolRequest build() {
            return new DescribeDnsGtmInstanceAddressPoolRequest(this);
        } 

    } 

}
