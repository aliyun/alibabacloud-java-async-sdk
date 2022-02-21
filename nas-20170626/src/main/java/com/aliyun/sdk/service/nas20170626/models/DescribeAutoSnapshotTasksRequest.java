// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoSnapshotTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoSnapshotTasksRequest</p>
 */
public class DescribeAutoSnapshotTasksRequest extends Request {
    @Query
    @NameInMap("AutoSnapshotPolicyIds")
    private String autoSnapshotPolicyIds;

    @Query
    @NameInMap("FileSystemIds")
    private String fileSystemIds;

    @Query
    @NameInMap("FileSystemType")
    @Validation(required = true)
    private String fileSystemType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    private DescribeAutoSnapshotTasksRequest(Builder builder) {
        super(builder);
        this.autoSnapshotPolicyIds = builder.autoSnapshotPolicyIds;
        this.fileSystemIds = builder.fileSystemIds;
        this.fileSystemType = builder.fileSystemType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoSnapshotTasksRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoSnapshotPolicyIds
     */
    public String getAutoSnapshotPolicyIds() {
        return this.autoSnapshotPolicyIds;
    }

    /**
     * @return fileSystemIds
     */
    public String getFileSystemIds() {
        return this.fileSystemIds;
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

    public static final class Builder extends Request.Builder<DescribeAutoSnapshotTasksRequest, Builder> {
        private String autoSnapshotPolicyIds; 
        private String fileSystemIds; 
        private String fileSystemType; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoSnapshotTasksRequest response) {
            super(response);
            this.autoSnapshotPolicyIds = response.autoSnapshotPolicyIds;
            this.fileSystemIds = response.fileSystemIds;
            this.fileSystemType = response.fileSystemType;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AutoSnapshotPolicyIds.
         */
        public Builder autoSnapshotPolicyIds(String autoSnapshotPolicyIds) {
            this.putQueryParameter("AutoSnapshotPolicyIds", autoSnapshotPolicyIds);
            this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
            return this;
        }

        /**
         * FileSystemIds.
         */
        public Builder fileSystemIds(String fileSystemIds) {
            this.putQueryParameter("FileSystemIds", fileSystemIds);
            this.fileSystemIds = fileSystemIds;
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

        @Override
        public DescribeAutoSnapshotTasksRequest build() {
            return new DescribeAutoSnapshotTasksRequest(this);
        } 

    } 

}
