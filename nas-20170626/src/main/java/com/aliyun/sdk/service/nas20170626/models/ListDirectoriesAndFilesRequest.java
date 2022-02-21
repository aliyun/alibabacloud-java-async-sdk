// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDirectoriesAndFilesRequest} extends {@link RequestModel}
 *
 * <p>ListDirectoriesAndFilesRequest</p>
 */
public class ListDirectoriesAndFilesRequest extends Request {
    @Query
    @NameInMap("DirectoryOnly")
    private Boolean directoryOnly;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 128, minimum = 10)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Path")
    @Validation(required = true)
    private String path;

    @Query
    @NameInMap("StorageType")
    @Validation(required = true)
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

        private Builder(ListDirectoriesAndFilesRequest response) {
            super(response);
            this.directoryOnly = response.directoryOnly;
            this.fileSystemId = response.fileSystemId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.path = response.path;
            this.storageType = response.storageType;
        } 

        /**
         * DirectoryOnly.
         */
        public Builder directoryOnly(Boolean directoryOnly) {
            this.putQueryParameter("DirectoryOnly", directoryOnly);
            this.directoryOnly = directoryOnly;
            return this;
        }

        /**
         * FileSystemId.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
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
         * StorageType.
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
