// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecycledDirectoriesAndFilesRequest} extends {@link RequestModel}
 *
 * <p>ListRecycledDirectoriesAndFilesRequest</p>
 */
public class ListRecycledDirectoriesAndFilesRequest extends Request {
    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("FileSystemId")
    @Validation(required = true)
    private String fileSystemId;

    @Query
    @NameInMap("MaxResults")
    @Validation(maximum = 1000, minimum = 10)
    private Long maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    private ListRecycledDirectoriesAndFilesRequest(Builder builder) {
        super(builder);
        this.fileId = builder.fileId;
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecycledDirectoriesAndFilesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
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

    public static final class Builder extends Request.Builder<ListRecycledDirectoriesAndFilesRequest, Builder> {
        private String fileId; 
        private String fileSystemId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRecycledDirectoriesAndFilesRequest response) {
            super(response);
            this.fileId = response.fileId;
            this.fileSystemId = response.fileSystemId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
        } 

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
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

        @Override
        public ListRecycledDirectoriesAndFilesRequest build() {
            return new ListRecycledDirectoriesAndFilesRequest(this);
        } 

    } 

}
