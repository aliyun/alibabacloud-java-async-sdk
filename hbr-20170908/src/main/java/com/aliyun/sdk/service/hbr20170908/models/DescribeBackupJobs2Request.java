// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupJobs2Request} extends {@link RequestModel}
 *
 * <p>DescribeBackupJobs2Request</p>
 */
public class DescribeBackupJobs2Request extends Request {
    @Query
    @NameInMap("Filters")
    private java.util.List < Filters> filters;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SortDirection")
    private String sortDirection;

    @Query
    @NameInMap("SourceType")
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
    public java.util.List < Filters> getFilters() {
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
        private java.util.List < Filters> filters; 
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
         * The keys in the filter.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The order in which you want to sort the results. Valid values:
         * <p>
         * 
         * *   **ASCEND**: sorts the results in ascending order
         * *   **DESCEND** (default value): sorts the results in descending order
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
            return this;
        }

        /**
         * The type of the data source. Valid values:
         * <p>
         * 
         * *   **ECS_FILE**: Elastic Compute Service (ECS) files
         * *   **OSS**: Object Storage Service (OSS) buckets
         * *   **NAS**: Apsara File Storage NAS file systems
         * *   **OTS**: Tablestore instances
         * *   **UDM_ECS**: ECS instances
         * *   **UDM_ECS_DISK**: ECS disks
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

    public static class Filters extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Values")
        private java.util.List < String > values;

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
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List < String > values; 

            /**
             * The key in the filter. Valid values:
             * <p>
             * 
             * *   **RegionId**: the ID of a region
             * *   **PlanId**: the ID of a backup plan
             * *   **JobId**: the ID of a backup job
             * *   **VaultId**: the ID of a backup vault
             * *   **InstanceId**: the ID of an ECS instance
             * *   **Bucket**: the name of an OSS bucket
             * *   **FileSystemId**: the ID of a file system
             * *   **Status**: the status of a backup job
             * *   **CreatedTime**: the start time of a backup job
             * *   **CompleteTime**: the end time of a backup job
             * *   **InstanceName**: the name of a Tablestore instance
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The matching method. Default value: IN. This parameter specifies the operator that you want to use to match a key and a value in the filter. Valid values:
             * <p>
             * 
             * *   **EQUAL**: equal to
             * *   **NOT_EQUAL**: not equal to
             * *   **GREATER_THAN**: greater than
             * *   **GREATER_THAN_OR_EQUAL**: greater than or equal to
             * *   **LESS_THAN**: less than
             * *   **LESS_THAN_OR_EQUAL**: less than or equal to
             * *   **BETWEEN**: specifies a JSON array as a range. The results must fall within the range in the `[Minimum value,Maximum value]` format.
             * *   **IN**: specifies an array as a collection. The results must fall within the collection.
             * 
             * > If you specify the **CompleteTime** parameter as a key to query backup jobs, you cannot use the IN operator to perform a match.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The variable values of the filter.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Filters build() {
                return new Filters(this);
            } 

        } 

    }
}
