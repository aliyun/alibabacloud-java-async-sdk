// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeParentPlatformsRequest} extends {@link RequestModel}
 *
 * <p>DescribeParentPlatformsRequest</p>
 */
public class DescribeParentPlatformsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GbId")
    private String gbId;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeParentPlatformsRequest(Builder builder) {
        super(builder);
        this.gbId = builder.gbId;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.sortBy = builder.sortBy;
        this.sortDirection = builder.sortDirection;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParentPlatformsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeParentPlatformsRequest, Builder> {
        private String gbId; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private String sortBy; 
        private String sortDirection; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeParentPlatformsRequest request) {
            super(request);
            this.gbId = request.gbId;
            this.ownerId = request.ownerId;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.sortBy = request.sortBy;
            this.sortDirection = request.sortDirection;
            this.status = request.status;
        } 

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putQueryParameter("GbId", gbId);
            this.gbId = gbId;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeParentPlatformsRequest build() {
            return new DescribeParentPlatformsRequest(this);
        } 

    } 

}
