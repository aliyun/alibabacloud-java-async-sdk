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
    private java.util.List<Filters> filters;

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
    public java.util.List<Filters> getFilters() {
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
        private java.util.List<Filters> filters; 
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
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>CPFS: must start with <code>cpfs-</code>, such as cpfs-125487\<em>\</em>\<em>\</em>.</p>
         * </li>
         * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, such as bmcpfs-0015\<em>\</em>\<em>\</em>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The filter keys for querying data flows.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <p>Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If the return results are truncated, use NextToken to obtain content starting from the truncation point.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
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

    /**
     * 
     * {@link DescribeDataFlowsRequest} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The name of the filter key. Valid values:</p>
             * <ul>
             * <li>DataFlowIds: filters by data flow ID.</li>
             * <li>FsetIds: filters by Fileset ID.</li>
             * <li>FileSystemPath: filters by the path of the Fileset in the CPFS file system.</li>
             * <li>SourceStorage: filters by the access path of the source storage.</li>
             * <li>ThroughputList: filters by the transmission bandwidth of the data flow.</li>
             * <li>Description: filters by the description of the Fileset.</li>
             * <li>Status: filters by data flow status.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FsetIds</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter key. Wildcards are not supported for this parameter.</p>
             * <ul>
             * <li><p>If Key is set to DataFlowIds, Value is set to a data flow ID or part of a data flow ID. You can specify one or more data flow IDs. A maximum of 10 data flow IDs can be specified. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</p>
             * </li>
             * <li><p>If Key is set to FsetIds, Value is set to a Fileset ID or part of a Fileset ID. You can specify one or more Fileset IDs. A maximum of 10 Fileset IDs can be specified. Example: <code>fset-1902718ea0ae****</code> or <code>fset-235718ea0ae****,fset-5122718ea0ae****</code>.</p>
             * </li>
             * <li><p>If Key is set to FileSystemPath, Value is set to a path or part of a path in the CPFS file system. The value must be 1 to 1024 characters in length.</p>
             * </li>
             * <li><p>If Key is set to SourceStorage, Value is set to the access path of the source storage. The maximum length is 1024 characters.</p>
             * </li>
             * <li><p>If Key is set to ThroughputList, Value is set to the transmission bandwidth of the data flow. Combined queries are supported.</p>
             * </li>
             * <li><p>If Key is set to Description, Value is set to the description or part of the description of the data flow.</p>
             * </li>
             * <li><p>If Key is set to Status, Value is set to the data flow status.</p>
             * </li>
             * <li><p>If Key is set to SourceStoragePath, Value is set to the access path of the source storage or part of the access path. The maximum length is 1024 characters.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>FsetIds</p>
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
