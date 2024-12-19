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

    private DescribeDataFlowTasksRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
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

    public static final class Builder extends Request.Builder<DescribeDataFlowTasksRequest, Builder> {
        private String fileSystemId; 
        private java.util.List<Filters> filters; 
        private Long maxResults; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDataFlowTasksRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The ID of the file system.</p>
         * <ul>
         * <li>The IDs of CPFS file systems must start with <code>cpfs-</code>. Example: cpfs-099394bd928c****.</li>
         * <li>The IDs of CPFS for LINGJUN file systems must start with <code>bmcpfs-</code>. Example: bmcpfs-290w65p03ok64ya****.</li>
         * </ul>
         * <blockquote>
         * <p> CPFS is not supported on the international site.</p>
         * </blockquote>
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
         * <p>The details about filters.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of results for each query.</p>
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
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
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

            /**
             * <p>The filter name.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DataFlowIds: filters data flow tasks by data flow ID.</li>
             * <li>TaskIds: filters data flow tasks by task ID.</li>
             * <li>Originator: filters data flow tasks by task initiator.</li>
             * <li>TaskActions: filters data flow tasks by task type.</li>
             * <li>DataTypes: filters data flow tasks by data type.</li>
             * <li>Status: filters data flow tasks by data flow status.</li>
             * <li>CreateTimeBegin: filters data flow tasks that are created after a specified time.</li>
             * <li>CreateTimeEnd: filters data flow tasks that are created before a specified time.</li>
             * <li>StartTimeBegin: filters data flow tasks that are started after a specified time.</li>
             * <li>StartTimeEnd: filters data flow tasks that are started before a specified time.</li>
             * <li>EndTimeBegin: filters data flow tasks that are stopped after a specified time.</li>
             * <li>EndTimeEnd: filters data flow tasks that are stopped before a specified time.</li>
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
             * <p>The filter value. This parameter does not support wildcards.</p>
             * <ul>
             * <li>If Key is set to DataFlowIds, set Value to a data flow ID or a part of the data flow ID. You can specify a data flow ID or a group of data flow IDs. You can specify a maximum of 10 data flow IDs. Example: <code>df-194433a5be31****</code> or <code>df-194433a512a2****,df-234533a5be31****</code>.</li>
             * <li>If Key is set to TaskId, set Value to a data flow task ID or a part of the data flow task ID. You can specify a data flow task ID or a group of data flow task IDs. You can specify a maximum of 10 data flow task IDs. Example: <code>task-38aa8e890f45****</code> or <code>task-38aa8e890f45****,task-29ae8e890f45****</code>.</li>
             * <li>If Key is set to TaskActions, set Value to the type of data flow task. The task type can be <strong>Import</strong>, <strong>Export</strong>, <strong>Evict</strong>, <strong>Inventory</strong>, <strong>StreamImport</strong>, or <strong>StreamExport</strong>. Combined query is supported. CPFS for LINGJUN supports only the Import, Export, StreamImport, and StreamExport tasks. Only CPFS for LINGJUN V2.6.0 and later support the StreamImport and StreamExport tasks.</li>
             * <li>If Key is set to DataTypes, set Value to the data type of the data flow task. The data type can be MetaAndData, Metadata, or Data. Combined query is supported.</li>
             * <li>If Key is set to Originator, set Value to the initiator of the data flow task. The initiator can be User or System.</li>
             * <li>If Key is set to Status, set Value to the status of the data flow task. The status can be Pending, Executing, Failed, Completed, Canceling, or Canceled. Combined query is supported.</li>
             * <li>If Key is set to CreateTimeBegin, set Value to the beginning of the time range to create the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>If Key is set to CreateTimeEnd, set Value to the end of the time range to create the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>If Key is set to StartTimeBegin, set Value to the beginning of the time range to start the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>If Key is set to StartTimeEnd, set Value to the end of the time range to start the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>If Key is set to EndTimeBegin, set Value to the beginning of the time range to stop the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * <li>If Key is set to EndTimeEnd, set Value to the end of the time range to stop the data flow task. Time format: <code>yyyy-MM-ddThh:mmZ</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dfid-12345678</p>
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
