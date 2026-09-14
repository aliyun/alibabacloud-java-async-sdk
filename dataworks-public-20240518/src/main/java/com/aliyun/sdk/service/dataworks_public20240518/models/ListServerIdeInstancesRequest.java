// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListServerIdeInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListServerIdeInstancesRequest</p>
 */
public class ListServerIdeInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RelatedUserId")
    private String relatedUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubType")
    private String subType;

    private ListServerIdeInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.relatedUserId = builder.relatedUserId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subType = builder.subType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServerIdeInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return relatedUserId
     */
    public String getRelatedUserId() {
        return this.relatedUserId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subType
     */
    public String getSubType() {
        return this.subType;
    }

    public static final class Builder extends Request.Builder<ListServerIdeInstancesRequest, Builder> {
        private String regionId; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String relatedUserId; 
        private String resourceGroupId; 
        private String subType; 

        private Builder() {
            super();
        } 

        private Builder(ListServerIdeInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.relatedUserId = request.relatedUserId;
            this.resourceGroupId = request.resourceGroupId;
            this.subType = request.subType;
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
         * <p>The keyword for fuzzy match by instance ID or instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>notebook_dev</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of records to return in a single request.</p>
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
         * <p>The pagination token for the next query. You do not need to specify this parameter for the first request.</p>
         * 
         * <strong>example:</strong>
         * <p>CAESG****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number. Minimum value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The account ID of the user who owns the instance. Used to filter instances by owner.</p>
         * 
         * <strong>example:</strong>
         * <p>20933221576142****</p>
         */
        public Builder relatedUserId(String relatedUserId) {
            this.putBodyParameter("RelatedUserId", relatedUserId);
            this.relatedUserId = relatedUserId;
            return this;
        }

        /**
         * <p>The DataWorks resource group identifier. You can specify a numeric resource group ID or a full identifier in the format of Serverless_res_group_{tenantId}_{resgId}.</p>
         * 
         * <strong>example:</strong>
         * <p>Serverless_res_group_123456789012345_9876543210****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance subtype. Valid values:</p>
         * <ul>
         * <li>PERSONAL_DEV: personal development environment.</li>
         * <li>DATA_AGENT: Data Agent.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PERSONAL_DEV</p>
         */
        public Builder subType(String subType) {
            this.putBodyParameter("SubType", subType);
            this.subType = subType;
            return this;
        }

        @Override
        public ListServerIdeInstancesRequest build() {
            return new ListServerIdeInstancesRequest(this);
        } 

    } 

}
