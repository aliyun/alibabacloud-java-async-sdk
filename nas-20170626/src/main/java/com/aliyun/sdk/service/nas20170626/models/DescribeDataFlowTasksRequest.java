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
 * {@link DescribeDataFlowTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeDataFlowTasksRequest</p>
 */
public class DescribeDataFlowTasksRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithReports")
    private Boolean withReports;

    private DescribeDataFlowTasksRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.withReports = builder.withReports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataFlowTasksRequest create() {
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

    /**
     * @return withReports
     */
    public Boolean getWithReports() {
        return this.withReports;
    }

    public static final class Builder extends Request.Builder<DescribeDataFlowTasksRequest, Builder> {
        private String fileSystemId; 
        private java.util.List<Filters> filters; 
        private Long maxResults; 
        private String nextToken; 
        private Boolean withReports; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataFlowTasksRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.withReports = request.withReports;
        } 

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>General-purpose CPFS: must start with <code>cpfs-</code>, for example, cpfs-099394bd928c****.</p>
         * </li>
         * <li><p>CPFS for Lingjun: must start with <code>bmcpfs-</code>, for example, bmcpfs-290w65p03ok64ya****.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-290w65p03ok64ya****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The collection of filter keys.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
         * <p>Valid values: 10 to 100.</p>
         * <p>Default value: 20.</p>
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
         * <p>The next token. If the returned results of a request are truncated, you can use NextToken to initiate another request and obtain the remaining results.</p>
         * 
         * <strong>example:</strong>
         * <p>TGlzdFJlc291cmNlU****mVzJjE1MTI2NjY4NzY5MTAzOTEmMiZORnI4NDhVeEtrUT0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Specifies whether to query report information.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>True: Queries reports. This is the default value.</li>
         * <li>False: Does not query reports.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Setting this parameter to false can accelerate the query speed.</li>
         * <li>Only CPFS for Lingjun supports this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder withReports(Boolean withReports) {
            this.putQueryParameter("WithReports", withReports);
            this.withReports = withReports;
            return this;
        }

        @Override
        public DescribeDataFlowTasksRequest build() {
            return new DescribeDataFlowTasksRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataFlowTasksRequest} extends {@link TeaModel}
     *
     * <p>DescribeDataFlowTasksRequest</p>
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
             * <li>DataFlowIds: Filters by data flow ID.</li>
             * <li>TaskIds: Filters by data flow task ID.</li>
             * <li>Originator: Filters by the originator of the data flow task.</li>
             * <li>TaskActions: Filters by the type of the data flow task.</li>
             * <li>DataTypes: Filters by the data type of the data flow task.</li>
             * <li>Status: Filters by the data flow status.</li>
             * <li>CreateTimeBegin: Filters data flow tasks created after a specified time.</li>
             * <li>CreateTimeEnd: Filters data flow tasks created before a specified time.</li>
             * <li>StartTimeBegin: Filters data flow tasks started after a specified time.</li>
             * <li>StartTimeEnd: Filters data flow tasks started before a specified time.</li>
             * <li>EndTimeBegin: Filters data flow tasks ended after a specified time.</li>
             * <li>EndTimeEnd: Filters data flow tasks ended before a specified time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataFlowIds</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the filter key. This parameter does not support wildcards.</p>
             * <ul>
             * <li>When Key is set to DataFlowIds, Value is set to the data flow ID or a part of the data flow ID. It can be a single DataFlowId or a list of DataFlowIds. You can specify up to 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
             * <li>When Key is set to TaskIds, Value is set to the data flow task ID or a part of the data flow task ID. It can be a single task ID or a list of task IDs. You can specify up to 10 data flow task IDs. Example: <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</li>
             * <li>When Key is set to TaskActions, Value is set to the task type of the data flow. Valid values: <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, and <strong>StreamExport</strong>. Combined queries are supported. Currently, CPFS for Lingjun only supports Import, Export, StreamImport, and StreamExport. StreamImport and StreamExport are supported only in CPFS for Lingjun 2.6.0 and later.</li>
             * <li>When Key is set to DataTypes, Value is set to the data type of the data flow task. Valid values: MetaAndData, Metadata, and Data. Combined queries are supported.</li>
             * <li>When Key is set to Originator, Value is set to the originator of the data flow task. Valid values: User and System.</li>
             * <li>When Key is set to Status, Value is set to the status of the data flow task. Valid values: Pending, Executing, Failed, Completed, Canceling, and Canceled. Combined queries are supported.</li>
             * <li>When Key is set to CreateTimeBegin, Value is set to the minimum creation time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>When Key is set to CreateTimeEnd, Value is set to the maximum creation time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>When Key is set to StartTimeBegin, Value is set to the minimum start time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>When Key is set to StartTimeEnd, Value is set to the maximum start time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>When Key is set to EndTimeBegin, Value is set to the minimum end time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>When Key is set to EndTimeEnd, Value is set to the maximum end time of the data flow task. Format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>df-194433a5be31****</p>
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
