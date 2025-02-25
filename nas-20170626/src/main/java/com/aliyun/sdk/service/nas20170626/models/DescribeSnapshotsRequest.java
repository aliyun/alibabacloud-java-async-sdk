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
 * {@link DescribeSnapshotsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSnapshotsRequest</p>
 */
public class DescribeSnapshotsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

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
    @com.aliyun.core.annotation.NameInMap("SnapshotIds")
    private String snapshotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotName")
    private String snapshotName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotType")
    private String snapshotType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private DescribeSnapshotsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemType = builder.fileSystemType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.snapshotIds = builder.snapshotIds;
        this.snapshotName = builder.snapshotName;
        this.snapshotType = builder.snapshotType;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
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
     * @return snapshotIds
     */
    public String getSnapshotIds() {
        return this.snapshotIds;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    /**
     * @return snapshotType
     */
    public String getSnapshotType() {
        return this.snapshotType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<DescribeSnapshotsRequest, Builder> {
        private String fileSystemId; 
        private String fileSystemType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String snapshotIds; 
        private String snapshotName; 
        private String snapshotType; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSnapshotsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.fileSystemType = request.fileSystemType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.snapshotIds = request.snapshotIds;
            this.snapshotName = request.snapshotName;
            this.snapshotType = request.snapshotType;
            this.status = request.status;
        } 

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>extreme-22f****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The type of the file system.</p>
         * <p>Valid value: extreme, which indicates Extreme File Storage NAS (NAS) file systems.</p>
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
         * <p>The page number.</p>
         * <p>Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The snapshot IDs.</p>
         * <p>You can specify a maximum of 100 snapshot IDs. You must separate snapshot IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>s-extreme-67pxwk9aevrkr****,s-extreme-snapsho****,s-extreme-6tmsbas6ljhwh****</p>
         */
        public Builder snapshotIds(String snapshotIds) {
            this.putQueryParameter("SnapshotIds", snapshotIds);
            this.snapshotIds = snapshotIds;
            return this;
        }

        /**
         * <p>The snapshot name.</p>
         * 
         * <strong>example:</strong>
         * <p>FinanceJoshua</p>
         */
        public Builder snapshotName(String snapshotName) {
            this.putQueryParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        /**
         * <p>The type of the snapshot.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>auto: auto snapshot</li>
         * <li>user: manual snapshot</li>
         * <li>all (default): all snapshot types</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder snapshotType(String snapshotType) {
            this.putQueryParameter("SnapshotType", snapshotType);
            this.snapshotType = snapshotType;
            return this;
        }

        /**
         * <p>The status of the snapshot.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>progressing: The snapshot is being created.</li>
         * <li>accomplished: The snapshot is created.</li>
         * <li>failed: The snapshot fails to be created.</li>
         * <li>all (default): all snapshot states.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public DescribeSnapshotsRequest build() {
            return new DescribeSnapshotsRequest(this);
        } 

    } 

}
