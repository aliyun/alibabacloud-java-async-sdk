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

        private Builder(ListPolicyAttachmentsRequest response) {
            super(response);
            this.language = response.language;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.policyName = response.policyName;
            this.policyType = response.policyType;
            this.principalName = response.principalName;
            this.principalType = response.principalType;
            this.resourceGroupId = response.resourceGroupId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(String principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
            return this;
        }

        /**
         * PrincipalType.
         */
        public Builder principalType(String principalType) {
            this.putQueryParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        /**
         * ResourceGroupId.
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
