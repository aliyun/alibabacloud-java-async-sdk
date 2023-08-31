// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAllWhitelistTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribeAllWhitelistTemplateRequest</p>
 */
public class DescribeAllWhitelistTemplateRequest extends Request {
    @Query
    @NameInMap("FuzzySearch")
    private Boolean fuzzySearch;

    @Query
    @NameInMap("MaxRecordsPerPage")
    @Validation(required = true)
    private Integer maxRecordsPerPage;

    @Query
    @NameInMap("PageNumbers")
    @Validation(required = true)
    private Integer pageNumbers;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    private DescribeAllWhitelistTemplateRequest(Builder builder) {
        super(builder);
        this.fuzzySearch = builder.fuzzySearch;
        this.maxRecordsPerPage = builder.maxRecordsPerPage;
        this.pageNumbers = builder.pageNumbers;
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
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.templateName = request.templateName;
        } 

        /**
         * Specifies whether to enable fuzzy search. Valid values:
         * <p>
         * 
         * *   **true**: enables the feature.
         * *   **false**: disables the feature.
         */
        public Builder fuzzySearch(Boolean fuzzySearch) {
            this.putQueryParameter("FuzzySearch", fuzzySearch);
            this.fuzzySearch = fuzzySearch;
            return this;
        }

        /**
         * The number of entries to return on each page. Enumerated valid values: 10, 30, and 50.
         */
        public Builder maxRecordsPerPage(Integer maxRecordsPerPage) {
            this.putQueryParameter("MaxRecordsPerPage", maxRecordsPerPage);
            this.maxRecordsPerPage = maxRecordsPerPage;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumbers(Integer pageNumbers) {
            this.putQueryParameter("PageNumbers", pageNumbers);
            this.pageNumbers = pageNumbers;
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
         * The name of the whitelist. If you specify this parameter when you perform a fuzzy search, you can call the DescribeWhitelistTemplate operation to query the name of the whitelist during the fuzzy search.
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
