// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGtmAddressPoolRequest} extends {@link RequestModel}
 *
 * <p>DeleteGtmAddressPoolRequest</p>
 */
public class DeleteGtmAddressPoolRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String addrPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteGtmAddressPoolRequest(Builder builder) {
        super(builder);
        this.addrPoolId = builder.addrPoolId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGtmAddressPoolRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGtmAddressPoolRequest, Builder> {
        private String addrPoolId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGtmAddressPoolRequest request) {
            super(request);
            this.addrPoolId = request.addrPoolId;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the address pool that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.putQueryParameter("AddrPoolId", addrPoolId);
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The language used by the user.</p>
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
        public DeleteGtmAddressPoolRequest build() {
            return new DeleteGtmAddressPoolRequest(this);
        } 

    } 

}
