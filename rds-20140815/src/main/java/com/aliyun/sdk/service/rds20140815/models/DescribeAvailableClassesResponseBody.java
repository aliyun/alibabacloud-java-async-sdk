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
 * {@link DescribeAvailableClassesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableClassesResponseBody</p>
 */
public class DescribeAvailableClassesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceClasses")
    private java.util.List<DBInstanceClasses> DBInstanceClasses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableClassesResponseBody(Builder builder) {
        this.DBInstanceClasses = builder.DBInstanceClasses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableClassesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceClasses
     */
    public java.util.List<DBInstanceClasses> getDBInstanceClasses() {
        return this.DBInstanceClasses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DBInstanceClasses> DBInstanceClasses; 
        private String requestId; 

        /**
         * <p>An array that consists of the instance types available for the instance.</p>
         */
        public Builder DBInstanceClasses(java.util.List<DBInstanceClasses> DBInstanceClasses) {
            this.DBInstanceClasses = DBInstanceClasses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7E4448A6-9FE6-4474-A0C1-AA7CFC772CAC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableClassesResponseBody build() {
            return new DescribeAvailableClassesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAvailableClassesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableClassesResponseBody</p>
     */
    public static class DBInstanceStorageRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxValue")
        private Integer maxValue;

        @com.aliyun.core.annotation.NameInMap("MinValue")
        private Integer minValue;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        private DBInstanceStorageRange(Builder builder) {
            this.maxValue = builder.maxValue;
            this.minValue = builder.minValue;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceStorageRange create() {
            return builder().build();
        }

        /**
         * @return maxValue
         */
        public Integer getMaxValue() {
            return this.maxValue;
        }

        /**
         * @return minValue
         */
        public Integer getMinValue() {
            return this.minValue;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        public static final class Builder {
            private Integer maxValue; 
            private Integer minValue; 
            private Integer step; 

            /**
             * <p>The maximum storage capacity that is supported for the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * <p>The minimum storage capacity that is supported for the instance. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * <p>The minimum step size at which you can adjust the storage capacity of the instance. The minimum step size is 5 GB.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            public DBInstanceStorageRange build() {
                return new DBInstanceStorageRange(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAvailableClassesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAvailableClassesResponseBody</p>
     */
    public static class DBInstanceClasses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageRange")
        private DBInstanceStorageRange DBInstanceStorageRange;

        private DBInstanceClasses(Builder builder) {
            this.DBInstanceClass = builder.DBInstanceClass;
            this.DBInstanceStorageRange = builder.DBInstanceStorageRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceClasses create() {
            return builder().build();
        }

        /**
         * @return DBInstanceClass
         */
        public String getDBInstanceClass() {
            return this.DBInstanceClass;
        }

        /**
         * @return DBInstanceStorageRange
         */
        public DBInstanceStorageRange getDBInstanceStorageRange() {
            return this.DBInstanceStorageRange;
        }

        public static final class Builder {
            private String DBInstanceClass; 
            private DBInstanceStorageRange DBInstanceStorageRange; 

            /**
             * <p>The instance type of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rds.mysql.c1.large</p>
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * <p>The storage capacity range that is supported for the instance.</p>
             */
            public Builder DBInstanceStorageRange(DBInstanceStorageRange DBInstanceStorageRange) {
                this.DBInstanceStorageRange = DBInstanceStorageRange;
                return this;
            }

            public DBInstanceClasses build() {
                return new DBInstanceClasses(this);
            } 

        } 

    }
}
