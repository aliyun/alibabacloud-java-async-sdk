// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupsRequest</p>
 */
public class DescribeGroupsRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InProtocol")
    private String inProtocol;

    @Query
    @NameInMap("IncludeStats")
    private Boolean includeStats;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNum")
    private Long pageNum;

    @Query
    @NameInMap("PageSize")
    private Long pageSize;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SortDirection")
    private String sortDirection;

    @Query
    @NameInMap("Status")
    private String status;

    private DescribeGroupsRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.inProtocol = builder.inProtocol;
        this.includeStats = builder.includeStats;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.sortBy = builder.sortBy;
        this.sortDirection = builder.sortDirection;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupsRequest create() {
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
     * @return inProtocol
     */
    public String getInProtocol() {
        return this.inProtocol;
    }

    /**
     * @return includeStats
     */
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
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

    public static final class Builder extends Request.Builder<DescribeGroupsRequest, Builder> {
        private String id; 
        private String inProtocol; 
        private Boolean includeStats; 
        private String name; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private String region; 
        private String sortBy; 
        private String sortDirection; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupsRequest response) {
            super(response);
            this.id = response.id;
            this.inProtocol = response.inProtocol;
            this.includeStats = response.includeStats;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.region = response.region;
            this.sortBy = response.sortBy;
            this.sortDirection = response.sortDirection;
            this.status = response.status;
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
         * InProtocol.
         */
        public Builder inProtocol(String inProtocol) {
            this.putQueryParameter("InProtocol", inProtocol);
            this.inProtocol = inProtocol;
            return this;
        }

        /**
         * IncludeStats.
         */
        public Builder includeStats(Boolean includeStats) {
            this.putQueryParameter("IncludeStats", includeStats);
            this.includeStats = includeStats;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public DescribeGroupsRequest build() {
            return new DescribeGroupsRequest(this);
        } 

    } 

}
