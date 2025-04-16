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
         * <p>The number of the page to return. Default value: 1.</p>
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
         * <p>Specifies whether VPC firewalls are configured. Valid values:</p>
         * <ul>
         * <li><strong>notconfigured</strong>: VPC firewalls are not configured.</li>
         * <li><strong>configured</strong>: VPC firewalls are configured.</li>
         * <li>If you do not specify this parameter, the access control policies of all VPC firewalls are queried.</li>
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
         * FirewallId.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
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
         * <p>The number of entries to return on each page. Maximum value: 50.</p>
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
