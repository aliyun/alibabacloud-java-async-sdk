// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListCategoryRequest</p>
 */
public class ListCategoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 500)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
    private String parentCategoryId;

    private ListCategoryRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.regionId = builder.regionId;
        this.categoryName = builder.categoryName;
        this.categoryType = builder.categoryType;
        this.connectorId = builder.connectorId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentCategoryId = builder.parentCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     * @return categoryType
     */
    public String getCategoryType() {
        return this.categoryType;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
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
     * @return parentCategoryId
     */
    public String getParentCategoryId() {
        return this.parentCategoryId;
    }

    public static final class Builder extends Request.Builder<ListCategoryRequest, Builder> {
        private String workspaceId; 
        private String regionId; 
        private String categoryName; 
        private String categoryType; 
        private String connectorId; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(ListCategoryRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.regionId = request.regionId;
            this.categoryName = request.categoryName;
            this.categoryType = request.categoryType;
            this.connectorId = request.connectorId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentCategoryId = request.parentCategoryId;
        } 

        /**
         * <p>The workspace ID. For information about how to obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/2587495.html">How to use a workspace</a>. The bailian 2023-12-29 API version does not provide an API operation for listing workspaces. Obtain the workspace ID from the Model Studio console before calling this operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Performs an exact match or filter on the category list returned by the operation based on the category name. Default value: empty, which means category name filtering is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>ProductList</p>
         */
        public Builder categoryName(String categoryName) {
            this.putBodyParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        /**
         * <p>The type of category to query. Valid values:</p>
         * <ul>
         * <li>UNSTRUCTURED: category.</li>
         * </ul>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>Querying tables (data tables) by using API operations is not supported.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;</p>
         * <blockquote>
         * <p>Querying structured data tables by using API operations is not supported.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSTRUCTURED</p>
         */
        public Builder categoryType(String categoryType) {
            this.putBodyParameter("CategoryType", categoryType);
            this.categoryType = categoryType;
            return this;
        }

        /**
         * <p>The connector ID.</p>
         * 
         * <strong>example:</strong>
         * <p>file_conn_xxxxx</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * <p>The number of categories per page in a paged query. Maximum value: 200. Valid values: 1 to 200.</p>
         * <p>Default value:
         * If the value is not set or is less than 1, the default value is 20. If the value is greater than 200, the default value is 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdH70eOCSCKtacdomNzak4U=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the parent category for the categories to query.</p>
         * 
         * <strong>example:</strong>
         * <p>cate_cdd11b1b79a74e8bbd675c356a91ee3xxxxxxxx</p>
         */
        public Builder parentCategoryId(String parentCategoryId) {
            this.putBodyParameter("ParentCategoryId", parentCategoryId);
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        @Override
        public ListCategoryRequest build() {
            return new ListCategoryRequest(this);
        } 

    } 

}
