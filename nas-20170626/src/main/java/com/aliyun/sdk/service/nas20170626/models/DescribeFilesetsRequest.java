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
 * {@link DescribeFilesetsRequest} extends {@link RequestModel}
 *
 * <p>DescribeFilesetsRequest</p>
 */
public class DescribeFilesetsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OrderByField")
    private String orderByField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    private DescribeFilesetsRequest(Builder builder) {
        super(builder);
        this.fileSystemId = builder.fileSystemId;
        this.filters = builder.filters;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderByField = builder.orderByField;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesetsRequest create() {
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
     * @return orderByField
     */
    public String getOrderByField() {
        return this.orderByField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<DescribeFilesetsRequest, Builder> {
        private String fileSystemId; 
        private java.util.List<Filters> filters; 
        private Long maxResults; 
        private String nextToken; 
        private String orderByField; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFilesetsRequest request) {
            super(request);
            this.fileSystemId = request.fileSystemId;
            this.filters = request.filters;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderByField = request.orderByField;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * <p>The file system ID.</p>
         * <ul>
         * <li><p>CPFS: Must start with <code>cpfs-</code>, such as cpfs-099394bd928c****.</p>
         * </li>
         * <li><p>CPFS for Lingjun: Must start with <code>bmcpfs-</code>, such as bmcpfs-290w65p03ok64ya****.</p>
         * <blockquote>
         * <p>This operation supports only CPFS file systems (with an ID prefix of cpfs-* or bmcpfs-*). Standard NAS and Extreme NAS file systems are not supported.</p>
         * </blockquote>
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
         * <p>The filter conditions for the filesets to query.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single request.</p>
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
         * <p>The pagination token. If the returned results are truncated, you can use this token to initiate another request to retrieve the remaining results.</p>
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
         * <p>The sort field.</p>
         * <ul>
         * <li>FileCountLimit: The file count limit of the quota.</li>
         * <li>SizeLimit: The capacity limit of the quota.</li>
         * <li>FileCountUsage: The file count usage.</li>
         * <li>SpaceUsage: The capacity usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FileCountLimit</p>
         */
        public Builder orderByField(String orderByField) {
            this.putQueryParameter("OrderByField", orderByField);
            this.orderByField = orderByField;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * <ul>
         * <li>asc (default): Ascending order. Results are sorted from smallest to largest.</li>
         * <li>desc: Descending order. Results are sorted from largest to smallest.<blockquote>
         * <p>This parameter takes effect only when the OrderByField parameter is specified.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public DescribeFilesetsRequest build() {
            return new DescribeFilesetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesetsRequest} extends {@link TeaModel}
     *
     * <p>DescribeFilesetsRequest</p>
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
             * <li>FsetIds: Filters by fileset ID.</li>
             * <li>FileSystemPath: Filters by the path of the fileset in the CPFS file system.</li>
             * <li>Description: Filters by the description of the fileset.</li>
             * <li>QuotaExists: Filters by whether a quota exists.<blockquote>
             * <p>Only CPFS for Lingjun 2.7.0 and later support filtering by the QuotaExists parameter.</p>
             * </blockquote>
             * </li>
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
             * <p>The value of the filter key. This parameter does not support wildcards.</p>
             * <ul>
             * <li>When Key is set to FsetIds, Value is set to the fileset ID. You can specify one or more fileset IDs. You can specify up to 10 fileset IDs. Separate multiple values with commas (,). Example: <code>fset-1902718ea0ae****</code> or <code>fset-1902718ea0ae****,fset-3212718ea0ae****</code>.</li>
             * <li>When Key is set to FileSystemPath, Value is set to the path or a part of the path of the fileset in the CPFS file system. The value must be 2 to 1,024 characters in length and encoded in UTF-8.</li>
             * <li>When Key is set to Description, Value is set to the description or a part of the description of the fileset.</li>
             * <li>When Key is set to QuotaExists, Value is set to true or false. If you do not specify this parameter, all filesets are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fset-1902718ea0ae****</p>
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
