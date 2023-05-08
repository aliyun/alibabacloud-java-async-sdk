// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBruteForceRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBruteForceRecordsRequest</p>
 */
public class DescribeBruteForceRecordsRequest extends Request {
    @Query
    @NameInMap("BlockIp")
    private String blockIp;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Status")
    private Integer status;

    private DescribeBruteForceRecordsRequest(Builder builder) {
        super(builder);
        this.blockIp = builder.blockIp;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBruteForceRecordsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockIp
     */
    public String getBlockIp() {
        return this.blockIp;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeBruteForceRecordsRequest, Builder> {
        private String blockIp; 
        private Integer currentPage; 
        private Integer pageSize; 
        private Long resourceOwnerId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBruteForceRecordsRequest request) {
            super(request);
            this.blockIp = request.blockIp;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.resourceOwnerId = request.resourceOwnerId;
            this.status = request.status;
        } 

        /**
         * BlockIp.
         */
        public Builder blockIp(String blockIp) {
            this.putQueryParameter("BlockIp", blockIp);
            this.blockIp = blockIp;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeBruteForceRecordsRequest build() {
            return new DescribeBruteForceRecordsRequest(this);
        } 

    } 

}
