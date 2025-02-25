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
 * {@link DescribeTrFirewallsV2RouteListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallsV2RouteListRequest</p>
 */
public class DescribeTrFirewallsV2RouteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private DescribeTrFirewallsV2RouteListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallsV2RouteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
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

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return trFirewallRoutePolicyId
     */
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public static final class Builder extends Request.Builder<DescribeTrFirewallsV2RouteListRequest, Builder> {
        private String currentPage; 
        private String firewallId; 
        private String lang; 
        private String pageSize; 
        private String trFirewallRoutePolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallsV2RouteListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
        } 

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-8bcfa0f2f12d411e****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
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

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-7d5c672e37ee4175****</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.putQueryParameter("TrFirewallRoutePolicyId", trFirewallRoutePolicyId);
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        @Override
        public DescribeTrFirewallsV2RouteListRequest build() {
            return new DescribeTrFirewallsV2RouteListRequest(this);
        } 

    } 

}
