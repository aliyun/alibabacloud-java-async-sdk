// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQLPatternAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQLPatternAttributeResponseBody</p>
 */
public class DescribeSQLPatternAttributeResponseBody extends TeaModel {
    @NameInMap("PatternDetail")
    private PatternDetail patternDetail;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeSQLPatternAttributeResponseBody(Builder builder) {
        this.patternDetail = builder.patternDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQLPatternAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return patternDetail
     */
    public PatternDetail getPatternDetail() {
        return this.patternDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PatternDetail patternDetail; 
        private String requestId; 

        /**
         * The detailed information of the SQL pattern.
         */
        public Builder patternDetail(PatternDetail patternDetail) {
            this.patternDetail = patternDetail;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSQLPatternAttributeResponseBody build() {
            return new DescribeSQLPatternAttributeResponseBody(this);
        } 

    } 

    public static class PatternDetail extends TeaModel {
        @NameInMap("AverageMemory")
        private String averageMemory;

        @NameInMap("AverageQueryTime")
        private String averageQueryTime;

        @NameInMap("QueryCount")
        private Long queryCount;

        @NameInMap("SQLPattern")
        private String SQLPattern;

        @NameInMap("TotalQueryTime")
        private String totalQueryTime;

        private PatternDetail(Builder builder) {
            this.averageMemory = builder.averageMemory;
            this.averageQueryTime = builder.averageQueryTime;
            this.queryCount = builder.queryCount;
            this.SQLPattern = builder.SQLPattern;
            this.totalQueryTime = builder.totalQueryTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PatternDetail create() {
            return builder().build();
        }

        /**
         * @return averageMemory
         */
        public String getAverageMemory() {
            return this.averageMemory;
        }

        /**
         * @return averageQueryTime
         */
        public String getAverageQueryTime() {
            return this.averageQueryTime;
        }

        /**
         * @return queryCount
         */
        public Long getQueryCount() {
            return this.queryCount;
        }

        /**
         * @return SQLPattern
         */
        public String getSQLPattern() {
            return this.SQLPattern;
        }

        /**
         * @return totalQueryTime
         */
        public String getTotalQueryTime() {
            return this.totalQueryTime;
        }

        public static final class Builder {
            private String averageMemory; 
            private String averageQueryTime; 
            private Long queryCount; 
            private String SQLPattern; 
            private String totalQueryTime; 

            /**
             * The average memory consumption associated with the SQL pattern. Unit: MB.
             */
            public Builder averageMemory(String averageMemory) {
                this.averageMemory = averageMemory;
                return this;
            }

            /**
             * The average query time associated with the SQL pattern. Unit: milliseconds.
             */
            public Builder averageQueryTime(String averageQueryTime) {
                this.averageQueryTime = averageQueryTime;
                return this;
            }

            /**
             * The number of queries performed based on the SQL pattern.
             */
            public Builder queryCount(Long queryCount) {
                this.queryCount = queryCount;
                return this;
            }

            /**
             * The statement of the SQL pattern.
             */
            public Builder SQLPattern(String SQLPattern) {
                this.SQLPattern = SQLPattern;
                return this;
            }

            /**
             * The total query time associated with the SQL pattern. Unit: milliseconds.
             */
            public Builder totalQueryTime(String totalQueryTime) {
                this.totalQueryTime = totalQueryTime;
                return this;
            }

            public PatternDetail build() {
                return new PatternDetail(this);
            } 

        } 

    }
}
