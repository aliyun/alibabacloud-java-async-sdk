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
 * {@link DescribeDataFlowSubTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataFlowSubTasksRequest</p>
 */
public class DescribeDataFlowSubTasksRequest extends Request {
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

    private DescribeDataFlowSubTasksRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowSubTasksRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDataFlowSubTasksRequest, Builder> {
        private String fileSystemId; 
        private java.util.List<Filters> filters; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataFlowSubTasksRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The file system ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-370lx1ev9ss27o0****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The filter keys for querying data flow streaming tasks.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of results per query.</p>
         * <ul>
         * <li><p>Valid values: 20 to 100.</p>
         * </li>
         * <li><p>Default value: 20.</p>
         * </li>
         * </ul>
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
         * <p>If the response is truncated, you can use NextToken to send a subsequent request to retrieve the remaining content from the point of truncation.</p>
         * 
         * <strong>example:</strong>
         * <p>iWk0AQAAAAAvY2FzZS8=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public DescribeDataFlowSubTasksRequest build() {
            return new DescribeDataFlowSubTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataFlowSubTasksRequest} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowSubTasksRequest</p>
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
             * <p>The name of the filter key.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DataFlowIds: filters by data flow ID.</li>
             * <li>DataFlowTaskIds: filters by data flow task ID.</li>
             * <li>DataFlowSubTaskIds: filters by data flow streaming task ID.</li>
             * <li>Status: filters by data flow status.</li>
             * <li>SrcFilePath: filters by source file path.</li>
             * <li>DstFilePath: filters by destination file path.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataFlowSubTaskIds</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter key. Wildcards are not supported.</p>
             * <ul>
             * <li>If Key is set to DataFlowIds, Value is set to a data flow ID or part of a data flow ID. You can specify one or more data flow IDs. A maximum of 10 data flow IDs can be specified. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
             * <li>If Key is set to DataFlowTaskIds, Value is set to a data flow task ID or part of a data flow task ID. You can specify one or more data flow task IDs. A maximum of 10 data flow task IDs can be specified. Example: <code>task-29ee8e890f45****</code> or <code>task-29ee8e890f45****,task-38ae8e890f45****</code>.</li>
             * <li>If Key is set to DataFlowSubTaskIds, Value is set to a data flow streaming task ID or part of a data flow streaming task ID. You can specify one or more data flow streaming task IDs. A maximum of 10 data flow streaming task IDs can be specified. Example: <code>subTaskId-370kyfmyknxcyzw****</code> or <code>subTaskId-247kyfmyknxcyzw****,subTaskId-256kyfmyknxcyzw****</code>.</li>
             * <li>If Key is set to Status, Value is set to the status of the data flow task, including EXPIRED, CREATED, RUNNING, COMPLETE, CANCELING, FAILED, and CANCELED. Combined queries are supported.</li>
             * <li>If Key is set to SrcFilePath, Value is set to the source file path. The maximum length is 1,023 characters.</li>
             * <li>If Key is set to DstFilePath, Value is set to the destination file path. The maximum length is 1,023 characters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>subTaskId-370kyfmyknxcyzw****</p>
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
