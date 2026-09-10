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
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese.</li>
         * <li>en-US: English.</li>
         * </ul>
         * <p>Default value: zh-CN.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("acceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The keyword for searching resource code or name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. Valid values: 0 to 200. Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>tokenForNextPage</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The product code. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The order in which resource types are returned. Valid values:</p>
         * <ul>
         * <li>Normal (default): returned in normal order.</li>
         * <li>Top: returned in order of popular access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The status list for filtering. Valid values:</p>
         * <ul>
         * <li>Available</li>
         * <li>Deprecated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available,Deprecated</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The product subcategory in Terraform.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        public Builder subcategory(String subcategory) {
            this.putQueryParameter("subcategory", subcategory);
            this.subcategory = subcategory;
            return this;
        }

        /**
         * <p>Specifies whether Terraformer is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder supportTerraformer(Boolean supportTerraformer) {
            this.putQueryParameter("supportTerraformer", supportTerraformer);
            this.supportTerraformer = supportTerraformer;
            return this;
        }

        /**
         * <p>The Terraform Provider version. If this parameter is left empty, the latest version is used by default.</p>
         * 
         * <strong>example:</strong>
         * <p>1.227.0</p>
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putQueryParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        /**
         * <p>The list of Terraform resources.</p>
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
