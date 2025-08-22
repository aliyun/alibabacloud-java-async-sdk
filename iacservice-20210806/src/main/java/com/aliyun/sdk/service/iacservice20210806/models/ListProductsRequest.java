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
 * {@link ListProductsRequest} extends {@link RequestModel}
 *
 * <p>ListProductsRequest</p>
 */
public class ListProductsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("supportTerraformer")
    private Boolean supportTerraformer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    private ListProductsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.sort = builder.sort;
        this.status = builder.status;
        this.supportTerraformer = builder.supportTerraformer;
        this.terraformProviderVersion = builder.terraformProviderVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ListProductsRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private String sort; 
        private String status; 
        private Boolean supportTerraformer; 
        private String terraformProviderVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListProductsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.sort = request.sort;
            this.status = request.status;
            this.supportTerraformer = request.supportTerraformer;
            this.terraformProviderVersion = request.terraformProviderVersion;
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

        @Override
        public ListProductsRequest build() {
            return new ListProductsRequest(this);
        } 

    } 

}
