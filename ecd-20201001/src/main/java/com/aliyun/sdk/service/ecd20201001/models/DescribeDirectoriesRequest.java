// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201001.models;

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
 * {@link DescribeDirectoriesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDirectoriesRequest</p>
 */
public class DescribeDirectoriesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private java.util.List<String> directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeDirectoriesRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.directoryType = builder.directoryType;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDirectoriesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public java.util.List<String> getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return directoryType
     */
    public String getDirectoryType() {
        return this.directoryType;
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

    public static final class Builder extends Request.Builder<DescribeDirectoriesRequest, Builder> {
        private java.util.List<String> directoryId; 
        private String directoryType; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDirectoriesRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.directoryType = request.directoryType;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(java.util.List<String> directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder directoryType(String directoryType) {
            this.putQueryParameter("DirectoryType", directoryType);
            this.directoryType = directoryType;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
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
        public DescribeDirectoriesRequest build() {
            return new DescribeDirectoriesRequest(this);
        } 

    } 

}
