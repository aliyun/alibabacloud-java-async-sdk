// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDevicesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDevicesRequest</p>
 */
public class DescribeDevicesRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Dsn")
    private String dsn;

    @Query
    @NameInMap("GbId")
    private String gbId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("IncludeDirectory")
    private Boolean includeDirectory;

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
    @NameInMap("ParentId")
    private String parentId;

    @Query
    @NameInMap("SortBy")
    private String sortBy;

    @Query
    @NameInMap("SortDirection")
    private String sortDirection;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("Vendor")
    private String vendor;

    private DescribeDevicesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.dsn = builder.dsn;
        this.gbId = builder.gbId;
        this.groupId = builder.groupId;
        this.id = builder.id;
        this.includeDirectory = builder.includeDirectory;
        this.includeStats = builder.includeStats;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.parentId = builder.parentId;
        this.sortBy = builder.sortBy;
        this.sortDirection = builder.sortDirection;
        this.status = builder.status;
        this.type = builder.type;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return dsn
     */
    public String getDsn() {
        return this.dsn;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return includeDirectory
     */
    public Boolean getIncludeDirectory() {
        return this.includeDirectory;
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
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<DescribeDevicesRequest, Builder> {
        private String directoryId; 
        private String dsn; 
        private String gbId; 
        private String groupId; 
        private String id; 
        private Boolean includeDirectory; 
        private Boolean includeStats; 
        private String name; 
        private Long ownerId; 
        private Long pageNum; 
        private Long pageSize; 
        private String parentId; 
        private String sortBy; 
        private String sortDirection; 
        private String status; 
        private String type; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDevicesRequest response) {
            super(response);
            this.directoryId = response.directoryId;
            this.dsn = response.dsn;
            this.gbId = response.gbId;
            this.groupId = response.groupId;
            this.id = response.id;
            this.includeDirectory = response.includeDirectory;
            this.includeStats = response.includeStats;
            this.name = response.name;
            this.ownerId = response.ownerId;
            this.pageNum = response.pageNum;
            this.pageSize = response.pageSize;
            this.parentId = response.parentId;
            this.sortBy = response.sortBy;
            this.sortDirection = response.sortDirection;
            this.status = response.status;
            this.type = response.type;
            this.vendor = response.vendor;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * Dsn.
         */
        public Builder dsn(String dsn) {
            this.putQueryParameter("Dsn", dsn);
            this.dsn = dsn;
            return this;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
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
         * IncludeDirectory.
         */
        public Builder includeDirectory(Boolean includeDirectory) {
            this.putQueryParameter("IncludeDirectory", includeDirectory);
            this.includeDirectory = includeDirectory;
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
         * ParentId.
         */
        public Builder parentId(String parentId) {
            this.putQueryParameter("ParentId", parentId);
            this.parentId = parentId;
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

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public DescribeDevicesRequest build() {
            return new DescribeDevicesRequest(this);
        } 

    } 

}
