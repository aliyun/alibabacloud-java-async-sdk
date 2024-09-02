// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQueryProcessorResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQueryProcessorResponseBody</p>
 */
public class CreateQueryProcessorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private CreateQueryProcessorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQueryProcessorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the query analysis rule.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateQueryProcessorResponseBody build() {
            return new CreateQueryProcessorResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("indexes")
        private java.util.List < String > indexes;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("processors")
        private java.util.List < java.util.Map<String, ?>> processors;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.active = builder.active;
            this.created = builder.created;
            this.domain = builder.domain;
            this.indexes = builder.indexes;
            this.name = builder.name;
            this.processors = builder.processors;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return active
         */
        public Boolean getActive() {
            return this.active;
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return indexes
         */
        public java.util.List < String > getIndexes() {
            return this.indexes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return processors
         */
        public java.util.List < java.util.Map<String, ?>> getProcessors() {
            return this.processors;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean active; 
            private Integer created; 
            private String domain; 
            private java.util.List < String > indexes; 
            private String name; 
            private java.util.List < java.util.Map<String, ?>> processors; 
            private Integer updated; 

            /**
             * Indicates whether the query analysis rule is the default one.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The time when the query analysis rule was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The type of the industry to which the query analysis rule was applied. Valid values:
             * <p>
             * 
             * *   GENERAL: general.
             * *   ECOMMERCE: e-commerce.
             * *   IT_CONTENT: IT content.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The indexes to which the query analysis rule was applied.
             */
            public Builder indexes(java.util.List < String > indexes) {
                this.indexes = indexes;
                return this;
            }

            /**
             * The name of the query analysis rule.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The features that are used in the query analysis rule.
             * <p>
             * 
             * For more information, see [QueryProcessor](~~170014~~).
             */
            public Builder processors(java.util.List < java.util.Map<String, ?>> processors) {
                this.processors = processors;
                return this;
            }

            /**
             * The time when the query analysis rule was last modified.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
