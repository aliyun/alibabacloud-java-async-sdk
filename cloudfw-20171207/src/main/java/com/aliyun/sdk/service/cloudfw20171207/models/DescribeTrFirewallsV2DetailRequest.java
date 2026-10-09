// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeTrFirewallsV2DetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallsV2DetailRequest</p>
 */
public class DescribeTrFirewallsV2DetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DescribeTrFirewallsV2DetailRequest(Builder builder) {
        super(builder);
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2DetailRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeTrFirewallsV2DetailRequest, Builder> {
        private String firewallId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallsV2DetailRequest request) {
            super(request);
            this.firewallId = request.firewallId;
            this.lang = request.lang;
        } 

        /**
         * <p>The ID of the VPC firewall instance. This parameter is required. If this parameter is not specified, the error ErrorMissingFirewallId (-360444, firewall id is required) is returned.</p>
         * <blockquote>
         * <p>You can call DescribeTrFirewallsV2List to query existing FirewallId values (in the format of vfw-tr-\*). If no firewall has been created, create an Enterprise Edition transit router in the CEN console first, and then call CreateTrFirewallV2.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-a5a6b89f46764928****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2DetailRequest build() {
            return new DescribeTrFirewallsV2DetailRequest(this);
        } 

    } 

}
