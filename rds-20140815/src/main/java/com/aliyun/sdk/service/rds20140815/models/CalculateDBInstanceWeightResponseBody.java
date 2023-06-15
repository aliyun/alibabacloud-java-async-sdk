// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CalculateDBInstanceWeightResponseBody} extends {@link TeaModel}
 *
 * <p>CalculateDBInstanceWeightResponseBody</p>
 */
public class CalculateDBInstanceWeightResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("RequestId")
    private String requestId;

    private CalculateDBInstanceWeightResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CalculateDBInstanceWeightResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        /**
         * An array that consists of the system-assigned read weights.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CalculateDBInstanceWeightResponseBody build() {
            return new CalculateDBInstanceWeightResponseBody(this);
        } 

    } 

    public static class DBInstanceWeight extends TeaModel {
        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("ReadonlyInstanceSQLDelayedTime")
        private String readonlyInstanceSQLDelayedTime;

        @NameInMap("Weight")
        private String weight;

        private DBInstanceWeight(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceType = builder.DBInstanceType;
            this.readonlyInstanceSQLDelayedTime = builder.readonlyInstanceSQLDelayedTime;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceWeight create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return readonlyInstanceSQLDelayedTime
         */
        public String getReadonlyInstanceSQLDelayedTime() {
            return this.readonlyInstanceSQLDelayedTime;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String DBInstanceType; 
            private String readonlyInstanceSQLDelayedTime; 
            private String weight; 

            /**
             * The ID of instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The role of the instance. Valid values:
             * <p>
             * 
             * *   **Master**: primary instance
             * *   **Readonly**: read-only instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The threshold for the latency of data replication from the primary instance to the read-only instances. The read-only instances start to synchronize data from the primary instance after the time specified by the **ReadonlyInstanceSQLDelayedTime** parameter elapses. Unit: seconds.
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * The read weight that ApsaraDB RDS calculates in real time for the instance.
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public DBInstanceWeight build() {
                return new DBInstanceWeight(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("DBInstanceWeight")
        private java.util.List < DBInstanceWeight> DBInstanceWeight;

        private Items(Builder builder) {
            this.DBInstanceWeight = builder.DBInstanceWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBInstanceWeight
         */
        public java.util.List < DBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

        public static final class Builder {
            private java.util.List < DBInstanceWeight> DBInstanceWeight; 

            /**
             * DBInstanceWeight.
             */
            public Builder DBInstanceWeight(java.util.List < DBInstanceWeight> DBInstanceWeight) {
                this.DBInstanceWeight = DBInstanceWeight;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
