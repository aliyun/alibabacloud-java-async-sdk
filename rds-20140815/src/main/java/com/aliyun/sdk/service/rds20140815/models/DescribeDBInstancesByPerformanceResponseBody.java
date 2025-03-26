// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstancesByPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesByPerformanceResponseBody</p>
 */
public class DescribeDBInstancesByPerformanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstancesByPerformanceResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancesByPerformanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDBInstancesByPerformanceResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The details about the instance.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>23907437-79B9-411A-9EE6-75A8F0F1C619</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>28</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesByPerformanceResponseBody build() {
            return new DescribeDBInstancesByPerformanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstancesByPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesByPerformanceResponseBody</p>
     */
    public static class DBInstancePerformance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPUUsage")
        private String CPUUsage;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DiskUsage")
        private String diskUsage;

        @com.aliyun.core.annotation.NameInMap("IOPSUsage")
        private String IOPSUsage;

        @com.aliyun.core.annotation.NameInMap("SessionUsage")
        private String sessionUsage;

        private DBInstancePerformance(Builder builder) {
            this.CPUUsage = builder.CPUUsage;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.diskUsage = builder.diskUsage;
            this.IOPSUsage = builder.IOPSUsage;
            this.sessionUsage = builder.sessionUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstancePerformance create() {
            return builder().build();
        }

        /**
         * @return CPUUsage
         */
        public String getCPUUsage() {
            return this.CPUUsage;
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return diskUsage
         */
        public String getDiskUsage() {
            return this.diskUsage;
        }

        /**
         * @return IOPSUsage
         */
        public String getIOPSUsage() {
            return this.IOPSUsage;
        }

        /**
         * @return sessionUsage
         */
        public String getSessionUsage() {
            return this.sessionUsage;
        }

        public static final class Builder {
            private String CPUUsage; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String diskUsage; 
            private String IOPSUsage; 
            private String sessionUsage; 

            private Builder() {
            } 

            private Builder(DBInstancePerformance model) {
                this.CPUUsage = model.CPUUsage;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.diskUsage = model.diskUsage;
                this.IOPSUsage = model.IOPSUsage;
                this.sessionUsage = model.sessionUsage;
            } 

            /**
             * <p>The CPU utilization of the instance in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.70</p>
             */
            public Builder CPUUsage(String CPUUsage) {
                this.CPUUsage = CPUUsage;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>DatabaseTest</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The disk usage of the instance in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>14.56</p>
             */
            public Builder diskUsage(String diskUsage) {
                this.diskUsage = diskUsage;
                return this;
            }

            /**
             * <p>The IOPS usage of the instance in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>0.15</p>
             */
            public Builder IOPSUsage(String IOPSUsage) {
                this.IOPSUsage = IOPSUsage;
                return this;
            }

            /**
             * <p>The number of sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>0.10</p>
             */
            public Builder sessionUsage(String sessionUsage) {
                this.sessionUsage = sessionUsage;
                return this;
            }

            public DBInstancePerformance build() {
                return new DBInstancePerformance(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstancesByPerformanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstancesByPerformanceResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstancePerformance")
        private java.util.List<DBInstancePerformance> DBInstancePerformance;

        private Items(Builder builder) {
            this.DBInstancePerformance = builder.DBInstancePerformance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstancePerformance
         */
        public java.util.List<DBInstancePerformance> getDBInstancePerformance() {
            return this.DBInstancePerformance;
        }

        public static final class Builder {
            private java.util.List<DBInstancePerformance> DBInstancePerformance; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstancePerformance = model.DBInstancePerformance;
            } 

            /**
             * DBInstancePerformance.
             */
            public Builder DBInstancePerformance(java.util.List<DBInstancePerformance> DBInstancePerformance) {
                this.DBInstancePerformance = DBInstancePerformance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
