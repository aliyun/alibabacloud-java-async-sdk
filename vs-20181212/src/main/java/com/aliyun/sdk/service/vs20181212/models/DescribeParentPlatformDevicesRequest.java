// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParentPlatformDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeParentPlatformDevicesRequest</p>
 */
public class DescribeParentPlatformDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Long pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortDirection")
    private String sortDirection;

    private DescribeParentPlatformDevicesRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortDirection = builder.sortDirection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentPlatformDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return sortDirection
     */
    public String getSortDirection() {
        return this.sortDirection;
    }

    public static final class Builder extends Request.Builder<DescribeParentPlatformDevicesRequest, Builder> {
        private String id; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private String sortBy; 
        private String sortDirection; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParentPlatformDevicesRequest request) {
            super(request);
            this.id = request.id;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortDirection = request.sortDirection;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortBy.
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * SortDirection.
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
            return this;
        }

        @Override
        public DescribeParentPlatformDevicesRequest build() {
            return new DescribeParentPlatformDevicesRequest(this);
        } 

    } 

}
