// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDataFlowsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataFlowsRequest</p>
 */
public class DescribeDataFlowsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List < Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private DescribeDataFlowsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowsRequest create() {
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
     * @return filters
     */
    public java.util.List < Filters> getFilters() {
        return this.filters;
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

    public static final class Builder extends Request.Builder<DescribeDataFlowsRequest, Builder> {
        private String fileSystemId; 
        private java.util.List < Filters> filters; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataFlowsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * The ID of the file system.
         * <p>
         * 
         * *   The IDs of CPFS file systems must start with `cpfs-`. Example: cpfs-125487\*\*\*\*.
         * *   The IDs of CPFS for LINGJUN file systems must start with `bmcpfs-`. Example: bmcpfs-0015\*\*\*\*.
         * 
         * >  CPFS file systems are available only on the China site (aliyun.com).
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The filter that is used to query data flows.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The number of results for each query.
         * <p>
         * 
         * Valid values: 10 to 100. Default value: 20.
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeDataFlowsRequest build() {
            return new DescribeDataFlowsRequest(this);
        } 

    } 

    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filters create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The filter name. Valid values:
             * <p>
             * 
             * *   DataFlowIds: filters data flows by data flow ID.
             * *   FsetIds: filters data flows by fileset ID.
             * *   FileSystemPath: filters data flows based on the path of a fileset in a CPFS file system.
             * *   SourceStorage: filters data flows based on the access path of the source storage.
             * *   ThroughputList: filters data flows based on data flow throughput.
             * *   Description: filters data flows based on the fileset description.
             * *   Status: filters data flows based on data flow status.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The filter value. This parameter does not support wildcards.
             * <p>
             * 
             * *   If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a data flow ID or a group of data flow IDs. You can specify a maximum of 10 data flow IDs. Example: `dfid-12345678` or `dfid-12345678,dfid-12345679`.
             * *   If Key is set to FsetIds, set Value to a fileset ID or a part of the fileset ID. You can specify a fileset ID or a group of fileset IDs. You can specify a maximum of 10 fileset IDs. Example: `fset-12345678` or `fset-12345678,fset-12345679`.
             * *   If Key is set to FileSystemPath, set Value to the path or a part of the path of a fileset in a CPFS file system. The value of the parameter must be 1 to 1,024 characters in length.
             * *   If Key is set to SourceStorage, set Value to the access path or a part of the access path of the source storage. The path can be up to 1,024 characters in length.
             * *   If Key is set to ThroughputList, set Value to the data flow throughput. Combined query is supported.
             * *   If Key is set to Description, set Value to a data flow description or a part of the data flow description.
             * *   If Key is set to Status, set Value to the data flow status.
             * *   If Key is set to SourceStoragePath, set Value to the access path or a part of the access path of the source storage. The path can be up to 1,024 characters in length.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
