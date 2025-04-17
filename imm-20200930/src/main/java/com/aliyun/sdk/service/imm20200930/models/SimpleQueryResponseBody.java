// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SimpleQueryResponseBody} extends {@link TeaModel}
 *
 * <p>SimpleQueryResponseBody</p>
 */
public class SimpleQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Aggregations")
    private java.util.List<Aggregations> aggregations;

    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<File> files;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregations
     */
    public java.util.List<Aggregations> getAggregations() {
        return this.aggregations;
    }

    /**
     * @return files
     */
    public java.util.List<File> getFiles() {
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
        private java.util.List<Aggregations> aggregations; 
        private java.util.List<File> files; 
        private String nextToken; 
        private String requestId; 
        private Long totalHits; 

        private Builder() {
        } 

        private Builder(SimpleQueryResponseBody model) {
            this.aggregations = model.aggregations;
            this.files = model.files;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalHits = model.totalHits;
        } 

        /**
         * <p>The aggregations. This parameter is returned only when the value of the Aggregations request parameter is not empty.</p>
         */
        public Builder aggregations(java.util.List<Aggregations> aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        /**
         * <p>The files. This parameter is returned only when the value of the Aggregations request parameter is empty.</p>
         */
        public Builder files(java.util.List<File> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The pagination token is used in the next request to retrieve a new page of results if the total number of results exceeds the value of the MaxResults parameter.</p>
         * <p>It can be used in the next request to retrieve a new page of results.</p>
         * <p>If NextToken is empty, no next page exists.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpwZw==</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2C5C1E0F-D8B8-4DA0-8127-EC32C771****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of total hits.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalHits(Long totalHits) {
            this.totalHits = totalHits;
            return this;
        }

        public SimpleQueryResponseBody build() {
            return new SimpleQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SimpleQueryResponseBody} extends {@link TeaModel}
     *
     * <p>SimpleQueryResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Groups model) {
                this.count = model.count;
                this.value = model.value;
            } 

            /**
             * <p>The number of results in the grouped aggregation.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The value for the grouped aggregation.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link SimpleQueryResponseBody} extends {@link TeaModel}
     *
     * <p>SimpleQueryResponseBody</p>
     */
    public static class Aggregations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Field")
        private String field;

        @com.aliyun.core.annotation.NameInMap("Groups")
        private java.util.List<Groups> groups;

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
        public java.util.List<Groups> getGroups() {
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
            private java.util.List<Groups> groups; 
            private String operation; 
            private Double value; 

            private Builder() {
            } 

            private Builder(Aggregations model) {
                this.field = model.field;
                this.groups = model.groups;
                this.operation = model.operation;
                this.value = model.value;
            } 

            /**
             * <p>The name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Size</p>
             */
            public Builder field(String field) {
                this.field = field;
                return this;
            }

            /**
             * <p>The grouped aggregations. This parameter is returned only when the group operator is specified in the Aggregations request parameter.</p>
             */
            public Builder groups(java.util.List<Groups> groups) {
                this.groups = groups;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>sum</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            /**
             * <p>The statistical result.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
