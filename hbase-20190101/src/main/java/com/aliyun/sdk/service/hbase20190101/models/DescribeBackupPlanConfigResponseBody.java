// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPlanConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPlanConfigResponseBody</p>
 */
public class DescribeBackupPlanConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FullBackupCycle")
    private Integer fullBackupCycle;

    @com.aliyun.core.annotation.NameInMap("MinHFileBackupCount")
    private Integer minHFileBackupCount;

    @com.aliyun.core.annotation.NameInMap("NextFullBackupDate")
    private String nextFullBackupDate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tables")
    private Tables tables;

    private DescribeBackupPlanConfigResponseBody(Builder builder) {
        this.fullBackupCycle = builder.fullBackupCycle;
        this.minHFileBackupCount = builder.minHFileBackupCount;
        this.nextFullBackupDate = builder.nextFullBackupDate;
        this.requestId = builder.requestId;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPlanConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return fullBackupCycle
     */
    public Integer getFullBackupCycle() {
        return this.fullBackupCycle;
    }

    /**
     * @return minHFileBackupCount
     */
    public Integer getMinHFileBackupCount() {
        return this.minHFileBackupCount;
    }

    /**
     * @return nextFullBackupDate
     */
    public String getNextFullBackupDate() {
        return this.nextFullBackupDate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tables
     */
    public Tables getTables() {
        return this.tables;
    }

    public static final class Builder {
        private Integer fullBackupCycle; 
        private Integer minHFileBackupCount; 
        private String nextFullBackupDate; 
        private String requestId; 
        private Tables tables; 

        /**
         * FullBackupCycle.
         */
        public Builder fullBackupCycle(Integer fullBackupCycle) {
            this.fullBackupCycle = fullBackupCycle;
            return this;
        }

        /**
         * MinHFileBackupCount.
         */
        public Builder minHFileBackupCount(Integer minHFileBackupCount) {
            this.minHFileBackupCount = minHFileBackupCount;
            return this;
        }

        /**
         * NextFullBackupDate.
         */
        public Builder nextFullBackupDate(String nextFullBackupDate) {
            this.nextFullBackupDate = nextFullBackupDate;
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
         * Tables.
         */
        public Builder tables(Tables tables) {
            this.tables = tables;
            return this;
        }

        public DescribeBackupPlanConfigResponseBody build() {
            return new DescribeBackupPlanConfigResponseBody(this);
        } 

    } 

    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Table")
        private java.util.List < String > table;

        private Tables(Builder builder) {
            this.table = builder.table;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return table
         */
        public java.util.List < String > getTable() {
            return this.table;
        }

        public static final class Builder {
            private java.util.List < String > table; 

            /**
             * Table.
             */
            public Builder table(java.util.List < String > table) {
                this.table = table;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
}
