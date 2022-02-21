// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentlyRecycledDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListRecentlyRecycledDirectoriesRequest</p>
 */
public class ListRecentlyRecycledDirectoriesRequest extends Request {
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

    private ListRecentlyRecycledDirectoriesRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentlyRecycledDirectoriesRequest create() {
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

    public static final class Builder extends Request.Builder<ListRecentlyRecycledDirectoriesRequest, Builder> {
        private String fileSystemId; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListRecentlyRecycledDirectoriesRequest response) {
            super(response);
            this.fileSystemId = response.fileSystemId;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
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
        public ListRecentlyRecycledDirectoriesRequest build() {
            return new ListRecentlyRecycledDirectoriesRequest(this);
        } 

    } 

}
