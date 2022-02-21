// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancesByPerformanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancesByPerformanceResponseBody</p>
 */
public class DescribeDBInstancesByPerformanceResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
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

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstancesByPerformanceResponseBody build() {
            return new DescribeDBInstancesByPerformanceResponseBody(this);
        } 

    } 

    public static class DBInstancePerformance extends TeaModel {
        @NameInMap("CPUUsage")
        private String CPUUsage;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DiskUsage")
        private String diskUsage;

        @NameInMap("IOPSUsage")
        private String IOPSUsage;

        @NameInMap("SessionUsage")
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

            /**
             * CPUUsage.
             */
            public Builder CPUUsage(String CPUUsage) {
                this.CPUUsage = CPUUsage;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DiskUsage.
             */
            public Builder diskUsage(String diskUsage) {
                this.diskUsage = diskUsage;
                return this;
            }

            /**
             * IOPSUsage.
             */
            public Builder IOPSUsage(String IOPSUsage) {
                this.IOPSUsage = IOPSUsage;
                return this;
            }

            /**
             * SessionUsage.
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
    public static class Items extends TeaModel {
        @NameInMap("DBInstancePerformance")
        private java.util.List < DBInstancePerformance> DBInstancePerformance;

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
        public java.util.List < DBInstancePerformance> getDBInstancePerformance() {
            return this.DBInstancePerformance;
        }

        public static final class Builder {
            private java.util.List < DBInstancePerformance> DBInstancePerformance; 

            /**
             * DBInstancePerformance.
             */
            public Builder DBInstancePerformance(java.util.List < DBInstancePerformance> DBInstancePerformance) {
                this.DBInstancePerformance = DBInstancePerformance;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
