// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetItemListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDatasetItemListRequest</p>
 */
public class DescribeDatasetItemListRequest extends Request {
    @Query
    @NameInMap("DatasetId")
    @Validation(required = true)
    private String datasetId;

    @Query
    @NameInMap("DatasetItemIds")
    private String datasetItemIds;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeDatasetItemListRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.datasetItemIds = builder.datasetItemIds;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetItemListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetItemIds
     */
    public String getDatasetItemIds() {
        return this.datasetItemIds;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeDatasetItemListRequest, Builder> {
        private String datasetId; 
        private String datasetItemIds; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDatasetItemListRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.datasetItemIds = request.datasetItemIds;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.putQueryParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetItemIds.
         */
        public Builder datasetItemIds(String datasetItemIds) {
            this.putQueryParameter("DatasetItemIds", datasetItemIds);
            this.datasetItemIds = datasetItemIds;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeDatasetItemListRequest build() {
            return new DescribeDatasetItemListRequest(this);
        } 

    } 

}
