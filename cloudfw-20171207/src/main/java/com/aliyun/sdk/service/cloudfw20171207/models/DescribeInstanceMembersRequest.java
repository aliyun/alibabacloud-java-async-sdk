// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceMembersRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceMembersRequest</p>
 */
public class DescribeInstanceMembersRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("MemberDesc")
    private String memberDesc;

    @Query
    @NameInMap("MemberDisplayName")
    private String memberDisplayName;

    @Query
    @NameInMap("MemberUid")
    private String memberUid;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    private DescribeInstanceMembersRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.memberDesc = builder.memberDesc;
        this.memberDisplayName = builder.memberDisplayName;
        this.memberUid = builder.memberUid;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceMembersRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeInstanceMembersRequest, Builder> {
        private String currentPage; 
        private String memberDesc; 
        private String memberDisplayName; 
        private String memberUid; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceMembersRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.memberDesc = request.memberDesc;
            this.memberDisplayName = request.memberDisplayName;
            this.memberUid = request.memberUid;
            this.pageSize = request.pageSize;
        } 

        /**
         * The page number. Default value: **1**.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The remarks of the member. The remarks must be 1 to 256 characters in length.
         */
        public Builder memberDesc(String memberDesc) {
            this.putQueryParameter("MemberDesc", memberDesc);
            this.memberDesc = memberDesc;
            return this;
        }

        /**
         * The name of the member.
         */
        public Builder memberDisplayName(String memberDisplayName) {
            this.putQueryParameter("MemberDisplayName", memberDisplayName);
            this.memberDisplayName = memberDisplayName;
            return this;
        }

        /**
         * The UID of the member.
         */
        public Builder memberUid(String memberUid) {
            this.putQueryParameter("MemberUid", memberUid);
            this.memberUid = memberUid;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Default value: **20**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeInstanceMembersRequest build() {
            return new DescribeInstanceMembersRequest(this);
        } 

    } 

}
