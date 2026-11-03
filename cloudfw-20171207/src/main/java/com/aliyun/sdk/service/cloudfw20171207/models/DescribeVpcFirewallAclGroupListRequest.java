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
 * {@link DescribeVpcFirewallAclGroupListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallAclGroupListRequest</p>
 */
public class DescribeVpcFirewallAclGroupListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallConfigureStatus")
    private String firewallConfigureStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private DescribeVpcFirewallAclGroupListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.firewallConfigureStatus = builder.firewallConfigureStatus;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallAclGroupListRequest create() {
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
     * @return firewallConfigureStatus
     */
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
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

    public static final class Builder extends Request.Builder<DescribeVpcFirewallAclGroupListRequest, Builder> {
        private String currentPage; 
        private String firewallConfigureStatus; 
        private String firewallId; 
        private String lang; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallAclGroupListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.firewallConfigureStatus = request.firewallConfigureStatus;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The page number of the current page returned for a paged query. Default value: 1.</p>
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
         * <p>The configuration status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><strong>configured</strong>: The virtual private cloud (VPC) firewalls at the border are configured (that is, the firewalls are created).</li>
         * <li>Empty: queries the access control policy of all virtual private cloud (VPC) firewalls at the border.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>configured</p>
         */
        public Builder firewallConfigureStatus(String firewallConfigureStatus) {
            this.putQueryParameter("FirewallConfigureStatus", firewallConfigureStatus);
            this.firewallConfigureStatus = firewallConfigureStatus;
            return this;
        }

        /**
         * <p>The instance ID of the virtual private cloud (VPC) firewalls at the border.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-5b202e7f0be64611****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the response message. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The maximum number of entries to return on each page for a paged query. Maximum value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeVpcFirewallAclGroupListRequest build() {
            return new DescribeVpcFirewallAclGroupListRequest(this);
        } 

    } 

}
