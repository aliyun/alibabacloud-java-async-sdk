// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceSQLPatternsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSQLPatternsResponseBody</p>
 */
public class DescribeDBInstanceSQLPatternsResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Patterns")
    private java.util.List < Patterns> patterns;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    private DescribeDBInstanceSQLPatternsResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.endTime = builder.endTime;
        this.patterns = builder.patterns;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSQLPatternsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return patterns
     */
    public java.util.List < Patterns> getPatterns() {
        return this.patterns;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String endTime; 
        private java.util.List < Patterns> patterns; 
        private String requestId; 
        private String startTime; 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Patterns.
         */
        public Builder patterns(java.util.List < Patterns> patterns) {
            this.patterns = patterns;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeDBInstanceSQLPatternsResponseBody build() {
            return new DescribeDBInstanceSQLPatternsResponseBody(this);
        } 

    } 

    public static class Patterns extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Values")
        private java.util.Map < String, ? > values;

        private Patterns(Builder builder) {
            this.name = builder.name;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patterns create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return values
         */
        public java.util.Map < String, ? > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String name; 
            private java.util.Map < String, ? > values; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Values.
             */
            public Builder values(java.util.Map < String, ? > values) {
                this.values = values;
                return this;
            }

            public Patterns build() {
                return new Patterns(this);
            } 

        } 

    }
}
