// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
    private java.util.List < Filters> filters;

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

    public static final class Builder extends Request.Builder<DescribeDataFlowSubTasksRequest, Builder> {
        private String fileSystemId; 
        private java.util.List < Filters> filters; 
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
         * <p>The ID of the file system.</p>
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
         * <p>The filter that is used to query data streaming tasks.</p>
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
         * <ul>
         * <li>Valid values: 20 to 100.</li>
         * <li>Default value: 20.</li>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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

            /**
             * <p>The filter name.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DataFlowIds: filters data flow subtasks by data flow ID.</li>
             * <li>DataFlowTaskIds: filters data flow subtasks by data flow task ID.</li>
             * <li>DataFlowSubTaskIds: filters data flow subtasks by data streaming task ID.</li>
             * <li>Status: filters data flow subtasks by status.</li>
             * <li>SrcFilePath: filters data flow subtasks by source file path.</li>
             * <li>DstFilePath: filters data flow subtasks by destination file path.</li>
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
             * <p>The filter value. This parameter does not support wildcards.</p>
             * <ul>
             * <li>If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a data flow ID or a group of data flow IDs. You can specify a maximum of 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a5be31****,df-244433a5be31****</code>.</li>
             * <li>If Key is set to DataFlowTaskIds, set Value to a data flow task ID or a part of the data flow task ID. You can specify a data flow task ID or a group of data flow task IDs. You can specify a maximum of 10 data flow task IDs. Example:  <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-27aa8e890f45****</code>.</li>
             * <li>If Key is set to DataFlowSubTaskIds, set Value to a data streaming task ID or a part of the data streaming task ID. You can specify a data streaming task ID or a group of data streaming task IDs. You can specify a maximum of 10 data streaming task IDs. Example: <code>subTaskId-370kyfmyknxcyzw**** </code>or <code>subTaskId-370kyfmyknxcyzw****,subTaskId-280kyfmyknxcyzw****</code>.</li>
             * <li>If Key is set to Status, set Value to the status of the data flow task. The status can be EXPIRED, CREATED, RUNNING, COMPLETE, CANCELING, FAILED, or CANCELED. Combined query is supported.</li>
             * <li>If Key is set to SrcFilePath, set Value to the path of the source file. The path can be up to 1,023 characters in length.</li>
             * <li>If Key is set to DstFilePath, set Value to the path of the destination file. The path can be up to 1,023 characters in length.</li>
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
