// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupsRequest</p>
 */
public class DescribeGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeAttachedLoginPolicyGroups")
    private Boolean excludeAttachedLoginPolicyGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpId")
    private String idpId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginPolicyId")
    private String loginPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolutionId")
    private String solutionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferFileNeedApproval")
    private Boolean transferFileNeedApproval;

    private DescribeGroupsRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.businessChannel = builder.businessChannel;
        this.excludeAttachedLoginPolicyGroups = builder.excludeAttachedLoginPolicyGroups;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.idpId = builder.idpId;
        this.loginPolicyId = builder.loginPolicyId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.solutionId = builder.solutionId;
        this.transferFileNeedApproval = builder.transferFileNeedApproval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return excludeAttachedLoginPolicyGroups
     */
    public Boolean getExcludeAttachedLoginPolicyGroups() {
        return this.excludeAttachedLoginPolicyGroups;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return idpId
     */
    public String getIdpId() {
        return this.idpId;
    }

    /**
     * @return loginPolicyId
     */
    public String getLoginPolicyId() {
        return this.loginPolicyId;
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
     * @return solutionId
     */
    public String getSolutionId() {
        return this.solutionId;
    }

    /**
     * @return transferFileNeedApproval
     */
    public Boolean getTransferFileNeedApproval() {
        return this.transferFileNeedApproval;
    }

    public static final class Builder extends Request.Builder<DescribeGroupsRequest, Builder> {
        private String bizType; 
        private String businessChannel; 
        private Boolean excludeAttachedLoginPolicyGroups; 
        private String groupId; 
        private String groupName; 
        private String idpId; 
        private String loginPolicyId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String solutionId; 
        private Boolean transferFileNeedApproval; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupsRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.businessChannel = request.businessChannel;
            this.excludeAttachedLoginPolicyGroups = request.excludeAttachedLoginPolicyGroups;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.idpId = request.idpId;
            this.loginPolicyId = request.loginPolicyId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.solutionId = request.solutionId;
            this.transferFileNeedApproval = request.transferFileNeedApproval;
        } 

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * BusinessChannel.
         */
        public Builder businessChannel(String businessChannel) {
            this.putQueryParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>Specifies whether to exclude user groups that have associated logon policies.</p>
         */
        public Builder excludeAttachedLoginPolicyGroups(Boolean excludeAttachedLoginPolicyGroups) {
            this.putQueryParameter("ExcludeAttachedLoginPolicyGroups", excludeAttachedLoginPolicyGroups);
            this.excludeAttachedLoginPolicyGroups = excludeAttachedLoginPolicyGroups;
            return this;
        }

        /**
         * <p>The user group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-16nf7xxh4o9gc****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The user group name.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(String idpId) {
            this.putQueryParameter("IdpId", idpId);
            this.idpId = idpId;
            return this;
        }

        /**
         * <p>Filters user groups by the specified associated logon policy.</p>
         */
        public Builder loginPolicyId(String loginPolicyId) {
            this.putQueryParameter("LoginPolicyId", loginPolicyId);
            this.loginPolicyId = loginPolicyId;
            return this;
        }

        /**
         * <p>The page number for a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page for a paged query. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is not publicly available.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>co-0esnf80jab***</p>
         */
        public Builder solutionId(String solutionId) {
            this.putQueryParameter("SolutionId", solutionId);
            this.solutionId = solutionId;
            return this;
        }

        /**
         * <p>Indicates whether file approval is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transferFileNeedApproval(Boolean transferFileNeedApproval) {
            this.putQueryParameter("TransferFileNeedApproval", transferFileNeedApproval);
            this.transferFileNeedApproval = transferFileNeedApproval;
            return this;
        }

        @Override
        public DescribeGroupsRequest build() {
            return new DescribeGroupsRequest(this);
        } 

    } 

}
