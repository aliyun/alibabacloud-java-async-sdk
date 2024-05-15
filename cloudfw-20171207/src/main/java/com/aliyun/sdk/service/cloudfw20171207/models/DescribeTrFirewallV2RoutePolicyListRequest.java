// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallV2RoutePolicyListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallV2RoutePolicyListRequest</p>
 */
public class DescribeTrFirewallV2RoutePolicyListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    private String policyId;

    private DescribeTrFirewallV2RoutePolicyListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.policyId = builder.policyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallV2RoutePolicyListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
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
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyId
     */
    public String getPolicyId() {
        return this.policyId;
    }

    public static final class Builder extends Request.Builder<DescribeTrFirewallV2RoutePolicyListRequest, Builder> {
        private Integer currentPage; 
        private String firewallId; 
        private String lang; 
        private Integer pageSize; 
        private String policyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallV2RoutePolicyListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.policyId = request.policyId;
        } 

        /**
         * The page number. Default value: 1.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the routing policy.
         */
        public Builder policyId(String policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        @Override
        public DescribeTrFirewallV2RoutePolicyListRequest build() {
            return new DescribeTrFirewallV2RoutePolicyListRequest(this);
        } 

    } 

}
