// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupFilesRequest</p>
 */
public class DescribeBackupFilesRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    @Validation(required = true)
    private String currentPage;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private String pageSize;

    @Query
    @NameInMap("Path")
    private String path;

    @Query
    @NameInMap("SnapshotHash")
    @Validation(required = true)
    private String snapshotHash;

    @Query
    @NameInMap("Uuid")
    @Validation(required = true)
    private String uuid;

    private DescribeBackupFilesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.path = builder.path;
        this.snapshotHash = builder.snapshotHash;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return snapshotHash
     */
    public String getSnapshotHash() {
        return this.snapshotHash;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<DescribeBackupFilesRequest, Builder> {
        private String currentPage; 
        private String pageSize; 
        private String path; 
        private String snapshotHash; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupFilesRequest response) {
            super(response);
            this.currentPage = response.currentPage;
            this.pageSize = response.pageSize;
            this.path = response.path;
            this.snapshotHash = response.snapshotHash;
            this.uuid = response.uuid;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * SnapshotHash.
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public DescribeBackupFilesRequest build() {
            return new DescribeBackupFilesRequest(this);
        } 

    } 

}
