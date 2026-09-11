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
 * {@link ListDataInsightDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>ListDataInsightDirectoriesRequest</p>
 */
public class ListDataInsightDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentDir")
    private String parentDir;

    private ListDataInsightDirectoriesRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.parentDir = builder.parentDir;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataInsightDirectoriesRequest create() {
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
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return parentDir
     */
    public String getParentDir() {
        return this.parentDir;
    }

    public static final class Builder extends Request.Builder<ListDataInsightDirectoriesRequest, Builder> {
        private String fileSystemId; 
        private Integer maxResults; 
        private String nextToken; 
        private String parentDir; 

        private Builder() {
            super();
        } 

        private Builder(ListDataInsightDirectoriesRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.parentDir = request.parentDir;
        } 

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li>CPFS for Lingjun: The ID must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.<blockquote>
         * <p>Only CPFS for Lingjun file systems are supported.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-030wldnqm8evtpy****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The maximum number of directories to return.</p>
         * <p>Valid values: 10 to 100.</p>
         * <p>Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. Leave this parameter empty for the first request. Default value: &quot;&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The parent directory path. Specifies the parent directory to query. Default value: root directory &quot;/&quot;.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        public Builder parentDir(String parentDir) {
            this.putQueryParameter("ParentDir", parentDir);
            this.parentDir = parentDir;
            return this;
        }

        @Override
        public ListDataInsightDirectoriesRequest build() {
            return new ListDataInsightDirectoriesRequest(this);
        } 

    } 

}
