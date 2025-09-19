// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeBackupFilesRequest} extends {@link RequestModel}
 *
 * <p>DescribeBackupFilesRequest</p>
 */
public class DescribeBackupFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotHash")
    @com.aliyun.core.annotation.Validation(required = true)
    private String snapshotHash;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeBackupFilesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.path = request.path;
            this.snapshotHash = request.snapshotHash;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: <strong>10</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The path to the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The hash value of the backup file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a7f26223ef3974c6fac324cd37713ab65ab618859d20b4039192a5da44d77b63</p>
         */
        public Builder snapshotHash(String snapshotHash) {
            this.putQueryParameter("SnapshotHash", snapshotHash);
            this.snapshotHash = snapshotHash;
            return this;
        }

        /**
         * <p>The UUID of the server to which an anti-ransomware policy is applied.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6d5b361f-958d-48a8-a9d2-d6e82c1a****</p>
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
