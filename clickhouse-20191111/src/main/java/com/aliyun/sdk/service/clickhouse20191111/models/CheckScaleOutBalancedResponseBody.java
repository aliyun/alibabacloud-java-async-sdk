// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckScaleOutBalancedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckScaleOutBalancedResponseBody</p>
 */
public class CheckScaleOutBalancedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckCode")
    private String checkCode;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TableDetails")
    private TableDetails tableDetails;

    @com.aliyun.core.annotation.NameInMap("TimeDuration")
    private String timeDuration;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private CheckScaleOutBalancedResponseBody(Builder builder) {
        this.checkCode = builder.checkCode;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.tableDetails = builder.tableDetails;
        this.timeDuration = builder.timeDuration;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckScaleOutBalancedResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkCode
     */
    public String getCheckCode() {
        return this.checkCode;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tableDetails
     */
    public TableDetails getTableDetails() {
        return this.tableDetails;
    }

    /**
     * @return timeDuration
     */
    public String getTimeDuration() {
        return this.timeDuration;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String checkCode; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private TableDetails tableDetails; 
        private String timeDuration; 
        private Integer totalCount; 

        /**
         * <p>The check result. Valid values:</p>
         * <ul>
         * <li><strong>400</strong>: The cluster failed the check.</li>
         * <li><strong>200</strong>: The cluster passed the check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder checkCode(String checkCode) {
            this.checkCode = checkCode;
            return this;
        }

        /**
         * <p>The total number of returned pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Valid values:</p>
         * <ul>
         * <li><strong>30</strong> (default)</li>
         * <li><strong>50</strong></li>
         * <li><strong>100</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F5178C10-1407-4987-9133-DE4DC9119F75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The error information returned for a check failure.</p>
         */
        public Builder tableDetails(TableDetails tableDetails) {
            this.tableDetails = tableDetails;
            return this;
        }

        /**
         * <p>The amount of time that is required for the migration and scale-out. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder timeDuration(String timeDuration) {
            this.timeDuration = timeDuration;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public CheckScaleOutBalancedResponseBody build() {
            return new CheckScaleOutBalancedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckScaleOutBalancedResponseBody} extends {@link TeaModel}
     *
     * <p>CheckScaleOutBalancedResponseBody</p>
     */
    public static class TableDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cluster")
        private String cluster;

        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private Integer detail;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private TableDetail(Builder builder) {
            this.cluster = builder.cluster;
            this.database = builder.database;
            this.detail = builder.detail;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetail create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public String getCluster() {
            return this.cluster;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return detail
         */
        public Integer getDetail() {
            return this.detail;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String cluster; 
            private String database; 
            private Integer detail; 
            private String tableName; 

            /**
             * <p>The cluster. The value is fixed as <strong>default</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder cluster(String cluster) {
                this.cluster = cluster;
                return this;
            }

            /**
             * <p>The database name.</p>
             * 
             * <strong>example:</strong>
             * <p>db_name</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The error details. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The unique distributed table is missing.</li>
             * <li><strong>2</strong>: More than one distributed table exists for the local table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder detail(Integer detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The name of the local table.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public TableDetail build() {
                return new TableDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link CheckScaleOutBalancedResponseBody} extends {@link TeaModel}
     *
     * <p>CheckScaleOutBalancedResponseBody</p>
     */
    public static class TableDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TableDetail")
        private java.util.List < TableDetail> tableDetail;

        private TableDetails(Builder builder) {
            this.tableDetail = builder.tableDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableDetails create() {
            return builder().build();
        }

        /**
         * @return tableDetail
         */
        public java.util.List < TableDetail> getTableDetail() {
            return this.tableDetail;
        }

        public static final class Builder {
            private java.util.List < TableDetail> tableDetail; 

            /**
             * TableDetail.
             */
            public Builder tableDetail(java.util.List < TableDetail> tableDetail) {
                this.tableDetail = tableDetail;
                return this;
            }

            public TableDetails build() {
                return new TableDetails(this);
            } 

        } 

    }
}
