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
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

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
        this.edition = builder.edition;
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
     * @return edition
     */
    public String getEdition() {
        return this.edition;
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
        private String edition; 
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
            this.edition = request.edition;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.sortDirection = request.sortDirection;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The edition. Valid values: BASIC and STANDARD. The default value is STANDARD.</p>
         * 
         * <strong>example:</strong>
         * <p>STANDARD</p>
         */
        public Builder edition(String edition) {
            this.putQueryParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The key-value pairs of the filter.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. The default value is 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 99. The default value is 10.</p>
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
         * <p>The sort direction. Valid values:</p>
         * <ul>
         * <li><p><strong>ASCEND</strong>: Ascending order.</p>
         * </li>
         * <li><p><strong>DESCEND</strong> (Default): Descending order.</p>
         * </li>
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
         * <li><p><strong>ECS_FILE</strong>: Backs up Elastic Compute Service (ECS) files.</p>
         * </li>
         * <li><p><strong>OSS</strong>: Backs up Alibaba Cloud Object Storage Service (OSS) buckets.</p>
         * </li>
         * <li><p><strong>NAS</strong>: Backs up Alibaba Cloud Apsara File Storage NAS (NAS) file systems.</p>
         * </li>
         * <li><p><strong>OTS</strong>: Backs up Alibaba Cloud Tablestore instances.</p>
         * </li>
         * <li><p><strong>UDM_ECS</strong>: Backs up entire ECS instances.</p>
         * </li>
         * <li><p><strong>UDM_ECS_DISK</strong>: A sub-task for disk backup in an ECS instance backup job.</p>
         * </li>
         * <li><p><strong>COMMON_NAS</strong>: A generic NAS data source. This includes archive NAS and on-premises NAS data sources. Use the Values parameter of Filters to specify the data source type.</p>
         * </li>
         * <li><p><strong>File</strong>: Backs up on-premises files.</p>
         * </li>
         * <li><p><strong>SYNC</strong>: Data synchronization.</p>
         * </li>
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

            private Builder() {
            } 

            private Builder(Filters model) {
                this.key = model.key;
                this.operator = model.operator;
                this.values = model.values;
            } 

            /**
             * <p>The key of the filter. Valid values:</p>
             * <ul>
             * <li><p><strong>RegionId</strong>: The region ID.</p>
             * </li>
             * <li><p><strong>PlanId</strong>: The backup plan ID.</p>
             * </li>
             * <li><p><strong>JobId</strong>: The backup job ID.</p>
             * </li>
             * <li><p><strong>VaultId</strong>: The repository ID.</p>
             * </li>
             * <li><p><strong>InstanceId</strong>: The ECS instance ID.</p>
             * </li>
             * <li><p><strong>Bucket</strong>: The name of the OSS bucket.</p>
             * </li>
             * <li><p><strong>FileSystemId</strong>: The file system ID.</p>
             * </li>
             * <li><p><strong>Status</strong>: The job status.</p>
             * </li>
             * <li><p><strong>CreatedTime</strong>: The start time of the job.</p>
             * </li>
             * <li><p><strong>CompleteTime</strong>: The end time of the job.</p>
             * </li>
             * <li><p><strong>InstanceName</strong>: The name of the Tablestore instance.</p>
             * </li>
             * <li><p><strong>BackupType</strong>: The backup job. This parameter is required only when SourceType is set to COMMON_NAS.</p>
             * </li>
             * <li><p><strong>ParentId</strong>: The ID of the parent job. This parameter is required when you query sub-tasks. For example, if you set SourceType to UDM_ECS_DISK, you must specify the ID of the UDM_ECS job.</p>
             * </li>
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
             * <p>The matching operator. The default value is IN. This parameter specifies the operator to use for matching the Key and Value. Valid values:</p>
             * <ul>
             * <li><p><strong>EQUAL</strong>: Equal to.</p>
             * </li>
             * <li><p><strong>NOT_EQUAL</strong>: Not equal to.</p>
             * </li>
             * <li><p><strong>GREATER_THAN</strong>: Greater than.</p>
             * </li>
             * <li><p><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to.</p>
             * </li>
             * <li><p><strong>LESS_THAN</strong>: Less than.</p>
             * </li>
             * <li><p><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to.</p>
             * </li>
             * <li><p><strong>BETWEEN</strong>: The value is a JSON array in the format of <code>[start,end]</code>.</p>
             * </li>
             * <li><p><strong>IN</strong>: The value is an array.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The IN operator is not supported when you use <strong>CompleteTime</strong> as the key for a query.</p>
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
             * <p>The value of the filter.</p>
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
