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
 * {@link DescribeRestoreJobs2Request} extends {@link RequestModel}
 *
 * <p>DescribeRestoreJobs2Request</p>
 */
public class DescribeRestoreJobs2Request extends Request {
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
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    private DescribeRestoreJobs2Request(Builder builder) {
        super(builder);
        this.edition = builder.edition;
        this.filters = builder.filters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.restoreType = builder.restoreType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRestoreJobs2Request create() {
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
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    public static final class Builder extends Request.Builder<DescribeRestoreJobs2Request, Builder> {
        private String edition; 
        private java.util.List<Filters> filters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String restoreType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRestoreJobs2Request request) {
            super(request);
            this.edition = request.edition;
            this.filters = request.filters;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.restoreType = request.restoreType;
        } 

        /**
         * <p>The edition. Valid values: <code>BASIC</code> and <code>STANDARD</code>. Default value: <code>STANDARD</code>.</p>
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
         * <p>The filter conditions.</p>
         */
        public Builder filters(java.util.List<Filters> filters) {
            this.putQueryParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The page number. Pages start from 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 99. Default value: 10.</p>
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
         * <p>The data source type. Valid values:</p>
         * <ul>
         * <li><p><strong>ECS_FILE</strong>: Restores ECS files.</p>
         * </li>
         * <li><p><strong>OSS</strong>: Restores OSS objects.</p>
         * </li>
         * <li><p><strong>NAS</strong>: Restores NAS files.</p>
         * </li>
         * <li><p><strong>COMMON_FILE_SYSTEM</strong>: Restores data to a CPFS file system.</p>
         * </li>
         * <li><p><strong>OTS_TABLE</strong>: Restores an OTS table.</p>
         * </li>
         * <li><p><strong>UDM_ECS_ROLLBACK</strong>: Restores an entire ECS instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS_FILE</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        @Override
        public DescribeRestoreJobs2Request build() {
            return new DescribeRestoreJobs2Request(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRestoreJobs2Request} extends {@link TeaModel}
     *
     * <p>DescribeRestoreJobs2Request</p>
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
             * <p>The filter key. Valid values:</p>
             * <ul>
             * <li><p><strong>RegionId</strong>: region ID</p>
             * </li>
             * <li><p><strong>PlanId</strong>: backup plan ID</p>
             * </li>
             * <li><p><strong>JobId</strong>: backup job ID</p>
             * </li>
             * <li><p><strong>VaultId</strong>: vault ID</p>
             * </li>
             * <li><p><strong>InstanceId</strong>: ECS instance ID</p>
             * </li>
             * <li><p><strong>Bucket</strong>: OSS bucket name</p>
             * </li>
             * <li><p><strong>FileSystemId</strong>: file system ID</p>
             * </li>
             * <li><p><strong>Status</strong>: job status</p>
             * </li>
             * <li><p><strong>CompleteTime</strong>: completion time</p>
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
             * <p>The matching method. The default value is IN. Valid values:</p>
             * <ul>
             * <li><p><strong>EQUAL</strong>: Equal to</p>
             * </li>
             * <li><p><strong>NOT_EQUAL</strong>: Not equal to</p>
             * </li>
             * <li><p><strong>GREATER_THAN</strong>: Greater than</p>
             * </li>
             * <li><p><strong>GREATER_THAN_OR_EQUAL</strong>: Greater than or equal to</p>
             * </li>
             * <li><p><strong>LESS_THAN</strong>: Less than</p>
             * </li>
             * <li><p><strong>LESS_THAN_OR_EQUAL</strong>: Less than or equal to</p>
             * </li>
             * <li><p><strong>BETWEEN</strong>: The value is within a specified range. The <code>Values</code> parameter must be a JSON array in the <code>[min, max]</code> format.</p>
             * </li>
             * <li><p><strong>IN</strong>: The value is in a specified set. The <code>Values</code> parameter must be an array.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The IN operator is not supported when <code>Key</code> is <strong>CompleteTime</strong>.</p>
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
             * <p>An array of values for the specified filter key.</p>
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
