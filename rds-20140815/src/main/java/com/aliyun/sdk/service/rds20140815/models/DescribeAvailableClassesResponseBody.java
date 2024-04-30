// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableClassesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableClassesResponseBody</p>
 */
public class DescribeAvailableClassesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceClasses")
    private java.util.List < DBInstanceClasses> DBInstanceClasses;

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
    public java.util.List < DBInstanceClasses> getDBInstanceClasses() {
        return this.DBInstanceClasses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DBInstanceClasses> DBInstanceClasses; 
        private String requestId; 

        /**
         * An array that consists of the instance types available for the instance.
         */
        public Builder DBInstanceClasses(java.util.List < DBInstanceClasses> DBInstanceClasses) {
            this.DBInstanceClasses = DBInstanceClasses;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableClassesResponseBody build() {
            return new DescribeAvailableClassesResponseBody(this);
        } 

    } 

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
             * The maximum storage capacity that is supported for the instance. Unit: GB.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * The minimum storage capacity that is supported for the instance. Unit: GB.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * The minimum step size at which you can adjust the storage capacity of the instance. The minimum step size is 5 GB.
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
             * The instance type of the instance.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * The storage capacity range that is supported for the instance.
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
