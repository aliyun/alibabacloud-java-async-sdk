// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeAutoSnapshotTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoSnapshotTasksRequest</p>
 */
public class DescribeAutoSnapshotTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoSnapshotPolicyIds")
    private String autoSnapshotPolicyIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemIds")
    private String fileSystemIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
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

        private Builder(DescribeAutoSnapshotTasksRequest request) {
            super(request);
            this.autoSnapshotPolicyIds = request.autoSnapshotPolicyIds;
            this.fileSystemIds = request.fileSystemIds;
            this.fileSystemType = request.fileSystemType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The IDs of automatic snapshot policies.</p>
         * <p>You can specify a maximum of 100 policy IDs. If you want to query the tasks of multiple automatic snapshot policies, you must separate the policy IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>sp-extreme-233e6****,sp-extreme-233e6****, sp-extreme-233e6****</p>
         */
        public Builder autoSnapshotPolicyIds(String autoSnapshotPolicyIds) {
            this.putQueryParameter("AutoSnapshotPolicyIds", autoSnapshotPolicyIds);
            this.autoSnapshotPolicyIds = autoSnapshotPolicyIds;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>You can specify a maximum of 100 file system IDs. If you want to query the snapshots of multiple file systems, you must separate the file system IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-233e6****,extreme -23vbp****,extreme -23vas****</p>
         */
        public Builder fileSystemIds(String fileSystemIds) {
            this.putQueryParameter("FileSystemIds", fileSystemIds);
            this.fileSystemIds = fileSystemIds;
            return this;
        }

        /**
         * <p>The type of the file system.</p>
         * <p>Valid value: extreme, which indicates Extreme NAS file systems.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme</p>
         */
        public Builder fileSystemType(String fileSystemType) {
            this.putQueryParameter("FileSystemType", fileSystemType);
            this.fileSystemType = fileSystemType;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
