// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpControlPolicyItemsRequest} extends {@link RequestModel}
 *
 * <p>DescribeIpControlPolicyItemsRequest</p>
 */
public class DescribeIpControlPolicyItemsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpControlId")
    private String ipControlId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyItemId")
    private String policyItemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeIpControlPolicyItemsRequest(Builder builder) {
        super(builder);
        this.ipControlId = builder.ipControlId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyItemId = builder.policyItemId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpControlPolicyItemsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ipControlId
     */
    public String getIpControlId() {
        return this.ipControlId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return policyItemId
     */
    public String getPolicyItemId() {
        return this.policyItemId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeIpControlPolicyItemsRequest, Builder> {
        private String ipControlId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyItemId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIpControlPolicyItemsRequest request) {
            super(request);
            this.ipControlId = request.ipControlId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyItemId = request.policyItemId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the ACL. The ID is unique.
         */
        public Builder ipControlId(String ipControlId) {
            this.putQueryParameter("IpControlId", ipControlId);
            this.ipControlId = ipControlId;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the policy.
         */
        public Builder policyItemId(String policyItemId) {
            this.putQueryParameter("PolicyItemId", policyItemId);
            this.policyItemId = policyItemId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeIpControlPolicyItemsRequest build() {
            return new DescribeIpControlPolicyItemsRequest(this);
        } 

    } 

}
