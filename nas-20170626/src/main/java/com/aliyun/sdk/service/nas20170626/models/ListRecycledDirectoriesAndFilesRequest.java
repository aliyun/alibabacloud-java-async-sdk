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
 * {@link ListRecycledDirectoriesAndFilesRequest} extends {@link RequestModel}
 *
 * <p>ListRecycledDirectoriesAndFilesRequest</p>
 */
public class ListRecycledDirectoriesAndFilesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
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

        private Builder(ListRecycledDirectoriesAndFilesRequest request) {
            super(request);
            this.fileId = request.fileId;
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The ID of the directory that you want to query.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/2412173.html">ListRecentlyRecycledDirectories </a>operation to query the file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>04***08</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1ca404****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The number of files or directories to return for each query.</p>
         * <p>Valid values: 10 to 1000.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.</p>
         * <p>If all the files and directories are incompletely returned in a query, the return value of the NextToken parameter is not empty. In this case, you can specify a valid value for the NextToken parameter to continue the query.</p>
         * 
         * <strong>example:</strong>
         * <p>CJyNARIsMTY5OTI2NjQ3NTEzMjY2OTMwOF8xODA5NF8ufnl0YkROTl9uZXcuaXB5bmI=</p>
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
