// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicyAttachmentsRequest} extends {@link RequestModel}
 *
 * <p>ListPolicyAttachmentsRequest</p>
 */
public class ListPolicyAttachmentsRequest extends Request {
    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    private String policyType;

    @Query
    @NameInMap("PrincipalName")
    private String principalName;

    @Query
    @NameInMap("PrincipalType")
    private String principalType;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ListPolicyAttachmentsRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.principalName = builder.principalName;
        this.principalType = builder.principalType;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPolicyAttachmentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return principalName
     */
    public String getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ListPolicyAttachmentsRequest, Builder> {
        private String language; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String policyName; 
        private String policyType; 
        private String principalName; 
        private String principalType; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ListPolicyAttachmentsRequest request) {
            super(request);
            this.language = request.language;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.principalName = request.principalName;
            this.principalType = request.principalType;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The language that is used to return the description of the system policy. Valid values:
         * <p>
         * 
         * *   en: English
         * *   zh-CN: Chinese
         * *   ja: Japanese
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The name of the policy.
         * <p>
         * 
         * The name must be 1 to 128 characters in length and can contain letters, digits, and hyphens (-).
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * The type of the policy. If you do not specify this parameter, the system lists all types of policies. Valid values:
         * <p>
         * 
         * *   Custom: custom policy
         * *   System: system policy
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * The name of the object to which the policy is attached.
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * The type of the object to which the policy is attached. If you do not specify this parameter, the system lists all types of objects. Valid values:
         * <p>
         * 
         * *   IMSUser: RAM user
         * *   IMSGroup: RAM user group
         * *   ServiceRole: RAM role
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * The ID of the resource group or the ID of the Alibaba Cloud account to which the resource group belongs. If you do not specify this parameter, the system lists all policy attachment records under the current account.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ListPolicyAttachmentsRequest build() {
            return new ListPolicyAttachmentsRequest(this);
        } 

    } 

}
