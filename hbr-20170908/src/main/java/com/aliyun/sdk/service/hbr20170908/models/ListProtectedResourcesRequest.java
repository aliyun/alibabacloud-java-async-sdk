// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link ListProtectedResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListProtectedResourcesRequest</p>
 */
public class ListProtectedResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedByProduct")
    private String createdByProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasSnapshot")
    private Boolean hasSnapshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Skip")
    private Integer skip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListProtectedResourcesRequest(Builder builder) {
        super(builder);
        this.createdByProduct = builder.createdByProduct;
        this.hasSnapshot = builder.hasSnapshot;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.resourceId = builder.resourceId;
        this.skip = builder.skip;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProtectedResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdByProduct
     */
    public String getCreatedByProduct() {
        return this.createdByProduct;
    }

    /**
     * @return hasSnapshot
     */
    public Boolean getHasSnapshot() {
        return this.hasSnapshot;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListProtectedResourcesRequest, Builder> {
        private String createdByProduct; 
        private Boolean hasSnapshot; 
        private Integer maxResults; 
        private String nextToken; 
        private String resourceId; 
        private Integer skip; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListProtectedResourcesRequest request) {
            super(request);
            this.createdByProduct = request.createdByProduct;
            this.hasSnapshot = request.hasSnapshot;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.resourceId = request.resourceId;
            this.skip = request.skip;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The product capability to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><strong>HBR</strong>: Cloud Backup standard capabilities.</li>
         * <li><strong>BASIC</strong>: ECS File Backup Essential Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BASIC</p>
         */
        public Builder createdByProduct(String createdByProduct) {
            this.putQueryParameter("CreatedByProduct", createdByProduct);
            this.createdByProduct = createdByProduct;
            return this;
        }

        /**
         * <p>Specifies whether backup points exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasSnapshot(Boolean hasSnapshot) {
            this.putQueryParameter("HasSnapshot", hasSnapshot);
            this.hasSnapshot = hasSnapshot;
            return this;
        }

        /**
         * <p>The maximum number of results to return per query.</p>
         * <p>Valid values: 10 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>aWQj********MCMy</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The resource ID. The meaning of this parameter varies based on the value of SourceType:</p>
         * <ul>
         * <li><strong>SourceType=ECS_FILE</strong>: the ECS instance ID.</li>
         * <li><strong>SourceType=COMMON_FILE_SYSTEM</strong>: the CPFS data source ID.</li>
         * <li><strong>SourceType=COMMON_NAS</strong>: the on-premises NAS data source ID.</li>
         * <li><strong>SourceType=File</strong>: the on-premises server client ID.</li>
         * <li><strong>SourceType=NAS</strong>: the Alibaba Cloud NAS file system ID.</li>
         * <li><strong>SourceType=OSS</strong>: the OSS bucket.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-wz95************7zrd</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The number of entries to skip for a paged query.
         * If the number of skipped entries exceeds the total number of matched entries, an empty list is returned. The number of skipped entries must be a multiple of MaxResults.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("Skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * <p>The type of backup feature. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: ECS file backup.</li>
         * <li><strong>COMMON_FILE_SYSTEM</strong>: CPFS backup.</li>
         * <li><strong>COMMON_NAS</strong>: On-premises NAS backup.</li>
         * <li><strong>File</strong>: On-premises file backup.</li>
         * <li><strong>NAS</strong>: Alibaba Cloud NAS backup.</li>
         * <li><strong>OSS</strong>: OSS backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListProtectedResourcesRequest build() {
            return new ListProtectedResourcesRequest(this);
        } 

    } 

}
