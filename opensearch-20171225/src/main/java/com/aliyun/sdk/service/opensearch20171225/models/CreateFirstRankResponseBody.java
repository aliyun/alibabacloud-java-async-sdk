// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirstRankResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFirstRankResponseBody</p>
 */
public class CreateFirstRankResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private CreateFirstRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirstRankResponseBody create() {
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
         * The information about the rough sort expression.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateFirstRankResponseBody build() {
            return new CreateFirstRankResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @NameInMap("arg")
        private String arg;

        @NameInMap("attribute")
        private String attribute;

        @NameInMap("weight")
        private Float weight;

        private Meta(Builder builder) {
            this.arg = builder.arg;
            this.attribute = builder.attribute;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return arg
         */
        public String getArg() {
            return this.arg;
        }

        /**
         * @return attribute
         */
        public String getAttribute() {
            return this.attribute;
        }

        /**
         * @return weight
         */
        public Float getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String arg; 
            private String attribute; 
            private Float weight; 

            /**
             * The parameters that are used by a function in the expression.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * The attribute, feature functions, or field to be searched for.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * The weight. Valid values: \[-100000,100000]. The value cannot be 0.
             */
            public Builder weight(Float weight) {
                this.weight = weight;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("active")
        private Boolean active;

        @NameInMap("meta")
        private java.util.List < Meta> meta;

        @NameInMap("name")
        private String name;

        private Result(Builder builder) {
            this.active = builder.active;
            this.meta = builder.meta;
            this.name = builder.name;
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
         * @return meta
         */
        public java.util.List < Meta> getMeta() {
            return this.meta;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean active; 
            private java.util.List < Meta> meta; 
            private String name; 

            /**
             * Indicates whether the expression is the default one.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The content of the expression.
             */
            public Builder meta(java.util.List < Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * The name of the expression.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
