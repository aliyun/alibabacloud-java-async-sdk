// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDirectoriesAndFilesRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoriesAndFilesRequest</p>
 */
public class ListDirectoriesAndFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryOnly")
    private Boolean directoryOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 128, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Path")
    @com.aliyun.core.annotation.Validation(required = true)
    private String path;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storageType;

    private ListDirectoriesAndFilesRequest(Builder builder) {
        super(builder);
        this.directoryOnly = builder.directoryOnly;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.path = builder.path;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDirectoriesAndFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryOnly
     */
    public Boolean getDirectoryOnly() {
        return this.directoryOnly;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ListDirectoriesAndFilesRequest, Builder> {
        private Boolean directoryOnly; 
        private String fileSystemId; 
        private Long maxResults; 
        private String nextToken; 
        private String path; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ListDirectoriesAndFilesRequest request) {
            super(request);
            this.directoryOnly = request.directoryOnly;
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.path = request.path;
            this.storageType = request.storageType;
        } 

        /**
         * <p>Specifies whether to query only directories.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>false (default): queries both directories and files.</li>
         * <li>true: queries only directories.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the StorageType parameter to All, you must set the DirectoryOnly parameter to true.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder directoryOnly(Boolean directoryOnly) {
            this.putQueryParameter("DirectoryOnly", directoryOnly);
            this.directoryOnly = directoryOnly;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>31a8e4****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The maximum number of directories or files to include in the results of each query.</p>
         * <p>Valid values: 10 to 128.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The absolute path of the directory.</p>
         * <p>The path must start with a forward slash (/) and must be a path that exists in the mount target.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/pathway/to/folder</p>
         */
        public Builder path(String path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * <p>The storage class.</p>
         * <ul>
         * <li>InfrequentAccess: the Infrequent Access (IA) storage class.</li>
         * <li>Archive: the Archive storage class.</li>
         * <li>All: all stored data.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the StorageType parameter to All, you must set the DirectoryOnly parameter to true.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>InfrequentAccess</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ListDirectoriesAndFilesRequest build() {
            return new ListDirectoriesAndFilesRequest(this);
        } 

    } 

}
