// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAccessGroupsRequest</p>
 */
public class DescribeAccessGroupsRequest extends Request {
    @Query
    @NameInMap("AccessGroupName")
    private String accessGroupName;

    @Query
    @NameInMap("FileSystemType")
    private String fileSystemType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("UseUTCDateTime")
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

        private Builder(DescribeAccessGroupsRequest response) {
            super(response);
            this.accessGroupName = response.accessGroupName;
            this.fileSystemType = response.fileSystemType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.useUTCDateTime = response.useUTCDateTime;
        } 

        /**
         * AccessGroupName.
         */
        public Builder accessGroupName(String accessGroupName) {
            this.putQueryParameter("AccessGroupName", accessGroupName);
            this.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * FileSystemType.
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
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
         * UseUTCDateTime.
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
