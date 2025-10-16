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
 * {@link DescribeVpcFirewallCenSummaryListRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcFirewallCenSummaryListRequest</p>
 */
public class DescribeVpcFirewallCenSummaryListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterType")
    private String transitRouterType;

    private DescribeVpcFirewallCenSummaryListRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
        this.transitRouterType = builder.transitRouterType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcFirewallCenSummaryListRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return memberUid
     */
    public String getMemberUid() {
        return this.memberUid;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return transitRouterType
     */
    public String getTransitRouterType() {
        return this.transitRouterType;
    }

    public static final class Builder extends Request.Builder<DescribeVpcFirewallCenSummaryListRequest, Builder> {
        private String currentPage; 
        private String lang; 
        private String memberUid; 
        private String pageSize; 
        private String transitRouterType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcFirewallCenSummaryListRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
            this.transitRouterType = request.transitRouterType;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * MemberUid.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TransitRouterType.
         */
        public Builder transitRouterType(String transitRouterType) {
            this.putQueryParameter("TransitRouterType", transitRouterType);
            this.transitRouterType = transitRouterType;
            return this;
        }

        @Override
        public DescribeVpcFirewallCenSummaryListRequest build() {
            return new DescribeVpcFirewallCenSummaryListRequest(this);
        } 

    } 

}
