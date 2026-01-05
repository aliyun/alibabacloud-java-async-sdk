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
 * {@link ListDatasetVersionsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetVersionsRequest</p>
 */
public class ListDatasetVersionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreatorId")
    private String creatorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    private ListDatasetVersionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.creatorId = builder.creatorId;
        this.datasetId = builder.datasetId;
        this.order = builder.order;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetVersionsRequest create() {
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
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
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
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    public static final class Builder extends Request.Builder<ListDatasetVersionsRequest, Builder> {
        private String regionId; 
        private String creatorId; 
        private String datasetId; 
        private String order; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortBy; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetVersionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.creatorId = request.creatorId;
            this.datasetId = request.datasetId;
            this.order = request.order;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
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
         * <p>The creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12103XXX46492139</p>
         */
        public Builder creatorId(String creatorId) {
            this.putBodyParameter("CreatorId", creatorId);
            this.creatorId = creatorId;
            return this;
        }

        /**
         * <p>The dataset ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataworks-dataset:3pXXXb8o0ngr07njhps1</p>
         */
        public Builder datasetId(String datasetId) {
            this.putBodyParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The sort order. Default: Desc.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Asc: Ascending.</li>
         * <li>Desc: Descending.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Desc</p>
         */
        public Builder order(String order) {
            this.putBodyParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number. Default: 1.</p>
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
         * <p>The number of entries per page. Default: 10. Maximum: 100.</p>
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
         * <p>The sort field. Default: VersionNumber.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ModifyTime: Modification time.</li>
         * <li>CreateTime: Creation time.</li>
         * <li>VersionNumber: Version number.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putBodyParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        @Override
        public ListDatasetVersionsRequest build() {
            return new ListDatasetVersionsRequest(this);
        } 

    } 

}
