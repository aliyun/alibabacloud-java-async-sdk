// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SimpleQueryResponseBody} extends {@link TeaModel}
 *
 * <p>SimpleQueryResponseBody</p>
 */
public class SimpleQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aggregations")
    private java.util.List < Aggregations> aggregations;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List < File > files;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalHits")
    private Long totalHits;

    private SimpleQueryResponseBody(Builder builder) {
        this.aggregations = builder.aggregations;
        this.files = builder.files;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalHits = builder.totalHits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SimpleQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return aggregations
     */
    public java.util.List < Aggregations> getAggregations() {
        return this.aggregations;
    }

    /**
     * @return files
     */
    public java.util.List < File > getFiles() {
        return this.files;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalHits
     */
    public Long getTotalHits() {
        return this.totalHits;
    }

    public static final class Builder {
        private java.util.List < Aggregations> aggregations; 
        private java.util.List < File > files; 
        private String nextToken; 
        private String requestId; 
        private Long totalHits; 

        /**
         * Aggregations.
         */
        public Builder aggregations(java.util.List < Aggregations> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List < File > files) {
            this.files = files;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalHits.
         */
        public Builder totalHits(Long totalHits) {
            this.totalHits = totalHits;
            return this;
        }

        public SimpleQueryResponseBody build() {
            return new SimpleQueryResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Groups(Builder builder) {
            this.count = builder.count;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long count; 
            private String value; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
    public static class Aggregations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List < Groups> groups;

        @com.aliyun.core.annotation.NameInMap("Operation")
        private String operation;

        @com.aliyun.core.annotation.NameInMap("Value")
        private Double value;

        private Aggregations(Builder builder) {
            this.field = builder.field;
            this.groups = builder.groups;
            this.operation = builder.operation;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Aggregations create() {
            return builder().build();
        }

        /**
         * @return field
         */
        public String getField() {
            return this.field;
        }

        /**
         * @return groups
         */
        public java.util.List < Groups> getGroups() {
            return this.groups;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        /**
         * @return value
         */
        public Double getValue() {
            return this.value;
        }

        public static final class Builder {
            private String field; 
            private java.util.List < Groups> groups; 
            private String operation; 
            private Double value; 

            /**
             * Field.
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * Groups.
             */
            public Builder groups(java.util.List < Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * Operation.
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Double value) {
                this.value = value;
                return this;
            }

            public Aggregations build() {
                return new Aggregations(this);
            } 

        } 

    }
}
