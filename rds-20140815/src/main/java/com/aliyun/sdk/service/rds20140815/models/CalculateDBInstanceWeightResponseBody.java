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
 * {@link CalculateDBInstanceWeightResponseBody} extends {@link TeaModel}
 *
 * <p>CalculateDBInstanceWeightResponseBody</p>
 */
public class CalculateDBInstanceWeightResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Items items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CalculateDBInstanceWeightResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array that consists of information about the system-assigned read weight.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C816A4BF-A6EC-4722-95F9-2055859CCFD2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CalculateDBInstanceWeightResponseBody build() {
            return new CalculateDBInstanceWeightResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CalculateDBInstanceWeightResponseBody} extends {@link TeaModel}
     *
     * <p>CalculateDBInstanceWeightResponseBody</p>
     */
    public static class DBInstanceWeight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("ReadonlyInstanceSQLDelayedTime")
        private String readonlyInstanceSQLDelayedTime;

        @com.aliyun.core.annotation.NameInMap("Weight")
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

            private Builder() {
            } 

            private Builder(DBInstanceWeight model) {
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceType = model.DBInstanceType;
                this.readonlyInstanceSQLDelayedTime = model.readonlyInstanceSQLDelayedTime;
                this.weight = model.weight;
            } 

            /**
             * <p>The instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5xxxxxxx</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: primary instance</li>
             * <li><strong>Readonly</strong>: read-only instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The latency at which the read-only instances replicate data. The read-only instances replicate data from the primary instance at the latency that is specified by the <strong>ReadonlyInstanceSQLDelayedTime</strong> parameter. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder readonlyInstanceSQLDelayedTime(String readonlyInstanceSQLDelayedTime) {
                this.readonlyInstanceSQLDelayedTime = readonlyInstanceSQLDelayedTime;
                return this;
            }

            /**
             * <p>The read weight that the system calculates in real time for the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link CalculateDBInstanceWeightResponseBody} extends {@link TeaModel}
     *
     * <p>CalculateDBInstanceWeightResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceWeight")
        private java.util.List<DBInstanceWeight> DBInstanceWeight;

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
        public java.util.List<DBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

        public static final class Builder {
            private java.util.List<DBInstanceWeight> DBInstanceWeight; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.DBInstanceWeight = model.DBInstanceWeight;
            } 

            /**
             * DBInstanceWeight.
             */
            public Builder DBInstanceWeight(java.util.List<DBInstanceWeight> DBInstanceWeight) {
                this.DBInstanceWeight = DBInstanceWeight;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
