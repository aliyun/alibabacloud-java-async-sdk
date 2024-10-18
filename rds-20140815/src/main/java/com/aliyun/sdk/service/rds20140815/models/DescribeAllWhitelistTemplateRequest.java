// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAllWhitelistTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllWhitelistTemplateRequest</p>
 */
public class DescribeAllWhitelistTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FuzzySearch")
    private Boolean fuzzySearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxRecordsPerPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxRecordsPerPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private DescribeAllWhitelistTemplateRequest(Builder builder) {
        super(builder);
        this.fuzzySearch = builder.fuzzySearch;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.pageNumbers = builder.pageNumbers;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAllWhitelistTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fuzzySearch
     */
    public Boolean getFuzzySearch() {
        return this.fuzzySearch;
    }

    /**
     * @return maxRecordsPerPage
     */
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    /**
     * @return pageNumbers
     */
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<DescribeAllWhitelistTemplateRequest, Builder> {
        private Boolean fuzzySearch; 
        private Integer maxRecordsPerPage; 
        private Integer pageNumbers; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAllWhitelistTemplateRequest request) {
            super(request);
            this.fuzzySearch = request.fuzzySearch;
            this.maxRecordsPerPage = request.maxRecordsPerPage;
            this.pageNumbers = request.pageNumbers;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateName = request.templateName;
        } 

        /**
         * <p>Specifies whether to enable fuzzy search. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder fuzzySearch(Boolean fuzzySearch) {
            this.putQueryParameter("FuzzySearch", fuzzySearch);
            this.fuzzySearch = fuzzySearch;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Enumerated valid values: 10, 30, and 50.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.putQueryParameter("MaxRecordsPerPage", maxRecordsPerPage);
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.putQueryParameter("PageNumbers", pageNumbers);
            this.pageNumbers = pageNumbers;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. For more information about resource groups, see related documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmyhigxskzysy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The name of the IP whitelist template. If you specify this parameter when you perform a fuzzy search, you can call the DescribeWhitelistTemplate operation to query the name of the whitelist template during the fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public DescribeAllWhitelistTemplateRequest build() {
            return new DescribeAllWhitelistTemplateRequest(this);
        } 

    } 

}
