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
    @Validation(required = true)
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

        private Builder(DescribeBackupJobs2Request response) {
            super(response);
            this.filters = response.filters;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.sortDirection = response.sortDirection;
            this.sourceType = response.sourceType;
        } 

        /**
         * Filters.
         */
        public Builder filters(java.util.List < Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SortDirection.
         */
        public Builder sortDirection(String sortDirection) {
            this.putQueryParameter("SortDirection", sortDirection);
            this.sortDirection = sortDirection;
            return this;
        }

        /**
         * SourceType.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Values.
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
