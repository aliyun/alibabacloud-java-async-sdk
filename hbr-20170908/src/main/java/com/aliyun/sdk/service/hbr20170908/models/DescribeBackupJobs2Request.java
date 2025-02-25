// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeBackupJobs2Request} extends {@link RequestModel}
 *
 * <p>DescribeBackupJobs2Request</p>
 */
public class DescribeBackupJobs2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filters")
    private java.util.List<Filters> filters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortDirection")
    private String sortDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private DescribeBackupJobs2Request(Builder builder) {
        super(builder);
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.sortDirection = builder.sortDirection;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupJobs2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filters
     */
    public java.util.List<Filters> getFilters() {
        return this.filters;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sortDirection
     */
    public String getSortDirection() {
        return this.sortDirection;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<DescribeBackupJobs2Request, Builder> {
        private java.util.List<Filters> filters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String sortDirection; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBackupJobs2Request request) {
            super(request);
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortDirection = request.sortDirection;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The keys that you want to match in the filter.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The order in which you want to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>ASCEND</strong>: sorts the results in ascending order</li>
         * <li><strong>DESCEND</strong> (default value): sorts the results in descending order</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESCEND</p>
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
            return this;
        }

        /**
         * <p>The type of the data source. Valid values:</p>
         * <ul>
         * <li><strong>ECS_FILE</strong>: Elastic Compute Service (ECS) files</li>
         * <li><strong>OSS</strong>: Object Storage Service (OSS) buckets</li>
         * <li><strong>NAS</strong>: Apsara File Storage NAS file systems</li>
         * <li><strong>OTS</strong>: Tablestore instances</li>
         * <li><strong>UDM_ECS</strong>: ECS instances</li>
         * <li><strong>UDM_ECS_DISK</strong>: ECS disks</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public DescribeBackupJobs2Request build() {
            return new DescribeBackupJobs2Request(this);
        } 

    } 

    /**
     * 
     * {@link DescribeBackupJobs2Request} extends {@link TeaModel}
     *
     * <p>DescribeBackupJobs2Request</p>
     */
    public static class Filters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

        private Filters(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.values = builder.values;
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
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return values
         */
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List<String> values; 

            /**
             * <p>The keys in the filter. Valid values:</p>
             * <ul>
             * <li><strong>RegionId</strong>: the ID of a region</li>
             * <li><strong>PlanId</strong>: the ID of a backup plan</li>
             * <li><strong>JobId</strong>: the ID of a backup job</li>
             * <li><strong>VaultId</strong>: the ID of a backup vault</li>
             * <li><strong>InstanceId</strong>: the ID of an ECS instance</li>
             * <li><strong>Bucket</strong>: the name of an OSS bucket</li>
             * <li><strong>FileSystemId</strong>: the ID of a file system</li>
             * <li><strong>Status</strong>: the status of a backup job</li>
             * <li><strong>CreatedTime</strong>: the start time of a backup job</li>
             * <li><strong>CompleteTime</strong>: the end time of a backup job</li>
             * <li><strong>instanceName</strong>: the name of a Tablestore instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VaultId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The matching method. Default value: IN. This parameter specifies the operator that you want to use to match a key and a value in the filter. Valid values:</p>
             * <ul>
             * <li><strong>EQUAL</strong>: equal to</li>
             * <li><strong>NOT_EQUAL</strong>: not equal to</li>
             * <li><strong>GREATER_THAN</strong>: greater than</li>
             * <li><strong>GREATER_THAN_OR_EQUAL</strong>: greater than or equal to</li>
             * <li><strong>LESS_THAN</strong>: less than</li>
             * <li><strong>LESS_THAN_OR_EQUAL</strong>: less than or equal to</li>
             * <li><strong>BETWEEN</strong>: specifies a JSON array as a range. The results must fall within the range in the <code>[Minimum value,maximum value]</code> format.</li>
             * <li><strong>IN</strong>: specifies an array as a collection. The results must fall within the collection.</li>
             * </ul>
             * <blockquote>
             * <p> If you specify <strong>CompleteTime</strong> as a key to query backup jobs, you cannot use the IN operator to perform a match.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>IN</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The values that you want to match in the filter.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
