// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessGroupsRequest</p>
 */
public class DescribeAccessGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessGroupName")
    private String accessGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    private String fileSystemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseUTCDateTime")
    private Boolean useUTCDateTime;

    private DescribeAccessGroupsRequest(Builder builder) {
        super(builder);
        this.accessGroupName = builder.accessGroupName;
        this.fileSystemType = builder.fileSystemType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.useUTCDateTime = builder.useUTCDateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessGroupName
     */
    public String getAccessGroupName() {
        return this.accessGroupName;
    }

    /**
     * @return fileSystemType
     */
    public String getFileSystemType() {
        return this.fileSystemType;
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
     * @return useUTCDateTime
     */
    public Boolean getUseUTCDateTime() {
        return this.useUTCDateTime;
    }

    public static final class Builder extends Request.Builder<DescribeAccessGroupsRequest, Builder> {
        private String accessGroupName; 
        private String fileSystemType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean useUTCDateTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAccessGroupsRequest request) {
            super(request);
            this.accessGroupName = request.accessGroupName;
            this.fileSystemType = request.fileSystemType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.useUTCDateTime = request.useUTCDateTime;
        } 

        /**
         * The name of the permission group.
         * <p>
         * 
         * Limits:
         * 
         * *   The name must be 3 to 64 characters in length.
         * *   The name must start with a letter and can contain letters, digits, underscores (\_), and hyphens (-).
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * The type of the file system.
         * <p>
         * 
         * Valid values:
         * 
         * *   standard (default): General-purpose NAS file system
         * *   extreme: Extreme NAS file system
         * *   cpfs: Cloud Parallel File Storage (CPFS) file system
         * 
         * > CPFS file systems are available only on the China site (aliyun.com).
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * The page number.
         * <p>
         * 
         * Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Valid values: 1 to 100.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Specifies whether to display the creation time of the permission group in UTC.
         * <p>
         * 
         * Valid values:
         * 
         * *   true (default): The time is displayed in UTC.
         * *   false: The time is not displayed in UTC.
         */
        public Builder useUTCDateTime(Boolean useUTCDateTime) {
            this.putQueryParameter("UseUTCDateTime", useUTCDateTime);
            this.useUTCDateTime = useUTCDateTime;
            return this;
        }

        @Override
        public DescribeAccessGroupsRequest build() {
            return new DescribeAccessGroupsRequest(this);
        } 

    } 

}
