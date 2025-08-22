// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListResourceTypesRequest} extends {@link RequestModel}
 *
 * <p>ListResourceTypesRequest</p>
 */
public class ListResourceTypesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("acceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subcategory")
    private String subcategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supportTerraformer")
    private Boolean supportTerraformer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("terraformResourceTypes")
    private java.util.List<String> terraformResourceTypes;

    private ListResourceTypesRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.product = builder.product;
        this.sort = builder.sort;
        this.status = builder.status;
        this.subcategory = builder.subcategory;
        this.supportTerraformer = builder.supportTerraformer;
        this.terraformProviderVersion = builder.terraformProviderVersion;
        this.terraformResourceTypes = builder.terraformResourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourceTypesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subcategory
     */
    public String getSubcategory() {
        return this.subcategory;
    }

    /**
     * @return supportTerraformer
     */
    public Boolean getSupportTerraformer() {
        return this.supportTerraformer;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    /**
     * @return terraformResourceTypes
     */
    public java.util.List<String> getTerraformResourceTypes() {
        return this.terraformResourceTypes;
    }

    public static final class Builder extends Request.Builder<ListResourceTypesRequest, Builder> {
        private String acceptLanguage; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String product; 
        private String sort; 
        private String status; 
        private String subcategory; 
        private Boolean supportTerraformer; 
        private String terraformProviderVersion; 
        private java.util.List<String> terraformResourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListResourceTypesRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.product = request.product;
            this.sort = request.sort;
            this.status = request.status;
            this.subcategory = request.subcategory;
            this.supportTerraformer = request.supportTerraformer;
            this.terraformProviderVersion = request.terraformProviderVersion;
            this.terraformResourceTypes = request.terraformResourceTypes;
        } 

        /**
         * acceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * product.
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        /**
         * sort.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * subcategory.
         */
        public Builder subcategory(String subcategory) {
            this.putQueryParameter("subcategory", subcategory);
            this.subcategory = subcategory;
            return this;
        }

        /**
         * supportTerraformer.
         */
        public Builder supportTerraformer(Boolean supportTerraformer) {
            this.putQueryParameter("supportTerraformer", supportTerraformer);
            this.supportTerraformer = supportTerraformer;
            return this;
        }

        /**
         * terraformProviderVersion.
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putQueryParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * terraformResourceTypes.
         */
        public Builder terraformResourceTypes(java.util.List<String> terraformResourceTypes) {
            String terraformResourceTypesShrink = shrink(terraformResourceTypes, "terraformResourceTypes", "simple");
            this.putQueryParameter("terraformResourceTypes", terraformResourceTypesShrink);
            this.terraformResourceTypes = terraformResourceTypes;
            return this;
        }

        @Override
        public ListResourceTypesRequest build() {
            return new ListResourceTypesRequest(this);
        } 

    } 

}
