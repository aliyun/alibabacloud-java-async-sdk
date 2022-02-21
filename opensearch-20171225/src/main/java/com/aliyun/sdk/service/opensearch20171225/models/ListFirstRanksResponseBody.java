// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFirstRanksResponseBody} extends {@link TeaModel}
 *
 * <p>ListFirstRanksResponseBody</p>
 */
public class ListFirstRanksResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListFirstRanksResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFirstRanksResponseBody create() {
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
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListFirstRanksResponseBody build() {
            return new ListFirstRanksResponseBody(this);
        } 

    } 

    public static class Meta extends TeaModel {
        @NameInMap("arg")
        private String arg;

        @NameInMap("attribute")
        private String attribute;

        @NameInMap("weight")
        private Integer weight;

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
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String arg; 
            private String attribute; 
            private Integer weight; 

            /**
             * arg.
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * attribute.
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * weight.
             */
            public Builder weight(Integer weight) {
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

        @NameInMap("created")
        private Integer created;

        @NameInMap("description")
        private String description;

        @NameInMap("meta")
        private java.util.List < Meta> meta;

        @NameInMap("name")
        private String name;

        @NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.active = builder.active;
            this.created = builder.created;
            this.description = builder.description;
            this.meta = builder.meta;
            this.name = builder.name;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private Boolean active; 
            private Integer created; 
            private String description; 
            private java.util.List < Meta> meta; 
            private String name; 
            private Integer updated; 

            /**
             * active.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * meta.
             */
            public Builder meta(java.util.List < Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * updated.
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
