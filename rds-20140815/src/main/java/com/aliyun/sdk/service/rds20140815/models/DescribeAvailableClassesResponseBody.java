// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableClassesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableClassesResponseBody</p>
 */
public class DescribeAvailableClassesResponseBody extends TeaModel {
    @NameInMap("DBInstanceClasses")
    private java.util.List < DBInstanceClasses> DBInstanceClasses;

    @NameInMap("RequestId")
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
         * DBInstanceClasses.
         */
        public Builder DBInstanceClasses(java.util.List < DBInstanceClasses> DBInstanceClasses) {
            this.DBInstanceClasses = DBInstanceClasses;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("MaxValue")
        private Integer maxValue;

        @NameInMap("MinValue")
        private Integer minValue;

        @NameInMap("Step")
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
             * MaxValue.
             */
            public Builder maxValue(Integer maxValue) {
                this.maxValue = maxValue;
                return this;
            }

            /**
             * MinValue.
             */
            public Builder minValue(Integer minValue) {
                this.minValue = minValue;
                return this;
            }

            /**
             * Step.
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
        @NameInMap("DBInstanceClass")
        private String DBInstanceClass;

        @NameInMap("DBInstanceStorageRange")
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
             * DBInstanceClass.
             */
            public Builder DBInstanceClass(String DBInstanceClass) {
                this.DBInstanceClass = DBInstanceClass;
                return this;
            }

            /**
             * DBInstanceStorageRange.
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
