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
 * {@link DescribeInstanceRdAccountsRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceRdAccountsRequest</p>
 */
public class DescribeInstanceRdAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberDesc")
    private String memberDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberDisplayName")
    private String memberDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberUid")
    private String memberUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeInstanceRdAccountsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.lang = builder.lang;
        this.memberDesc = builder.memberDesc;
        this.memberDisplayName = builder.memberDisplayName;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceRdAccountsRequest create() {
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
     * @return memberDesc
     */
    public String getMemberDesc() {
        return this.memberDesc;
    }

    /**
     * @return memberDisplayName
     */
    public String getMemberDisplayName() {
        return this.memberDisplayName;
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
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceRdAccountsRequest, Builder> {
        private String currentPage; 
        private String lang; 
        private String memberDesc; 
        private String memberDisplayName; 
        private String memberUid; 
        private String pageSize; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceRdAccountsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.lang = request.lang;
            this.memberDesc = request.memberDesc;
            this.memberDisplayName = request.memberDisplayName;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The page number of the current page.</p>
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
         * <p>The language type for the request and response messages.</p>
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
         * <p>The remarks of the Cloud Firewall member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>renewal</p>
         */
        public Builder memberDesc(String memberDesc) {
            this.putQueryParameter("MemberDesc", memberDesc);
            this.memberDesc = memberDesc;
            return this;
        }

        /**
         * <p>The name of the Cloud Firewall member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudfirewall_2</p>
         */
        public Builder memberDisplayName(String memberDisplayName) {
            this.putQueryParameter("MemberDisplayName", memberDisplayName);
            this.memberDisplayName = memberDisplayName;
            return this;
        }

        /**
         * <p>The UID of the member accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
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
         * <p>The IP address of the requester.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.170.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeInstanceRdAccountsRequest build() {
            return new DescribeInstanceRdAccountsRequest(this);
        } 

    } 

}
