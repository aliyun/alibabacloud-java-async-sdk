// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTrFirewallV2Request} extends {@link RequestModel}
 *
 * <p>DeleteTrFirewallV2Request</p>
 */
public class DeleteTrFirewallV2Request extends Request {
    @Query
    @NameInMap("FirewallId")
    private String firewallId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private DeleteTrFirewallV2Request(Builder builder) {
        super(builder);
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTrFirewallV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallId
     */
    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteTrFirewallV2Request, Builder> {
        private String firewallId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTrFirewallV2Request request) {
            super(request);
            this.firewallId = request.firewallId;
            this.lang = request.lang;
        } 

        /**
         * FirewallId.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
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
        public DeleteTrFirewallV2Request build() {
            return new DeleteTrFirewallV2Request(this);
        } 

    } 

}
