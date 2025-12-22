// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
 * {@link ListFirstRanksResponseBody} extends {@link TeaModel}
 *
 * <p>ListFirstRanksResponseBody</p>
 */
public class ListFirstRanksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(ListFirstRanksResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0A6EB64B-B4C8-CF02-810F-E660812972FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the rough sort expression.</p>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/170007.html">FirstRank</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public ListFirstRanksResponseBody build() {
            return new ListFirstRanksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFirstRanksResponseBody} extends {@link TeaModel}
     *
     * <p>ListFirstRanksResponseBody</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arg")
        private String arg;

        @com.aliyun.core.annotation.NameInMap("attribute")
        private String attribute;

        @com.aliyun.core.annotation.NameInMap("weight")
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

            private Builder() {
            } 

            private Builder(Meta model) {
                this.arg = model.arg;
                this.attribute = model.attribute;
                this.weight = model.weight;
            } 

            /**
             * <p>The parameters that are used by a function in the expression.</p>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/180765.html">Rough sort functions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder arg(String arg) {
                this.arg = arg;
                return this;
            }

            /**
             * <p>The attribute, feature function, or field to be searched for.</p>
             * <p>For more information about supported feature functions, see <a href="https://help.aliyun.com/document_detail/180765.html">Rough sort functions</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>static_bm25()</p>
             */
            public Builder attribute(String attribute) {
                this.attribute = attribute;
                return this;
            }

            /**
             * <p>The weight. Valid values: -100000 to 100000. The value cannot be 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListFirstRanksResponseBody} extends {@link TeaModel}
     *
     * <p>ListFirstRanksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active")
        private Boolean active;

        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("meta")
        private java.util.List<Meta> meta;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("updated")
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
        public java.util.List<Meta> getMeta() {
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
            private java.util.List<Meta> meta; 
            private String name; 
            private Integer updated; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.active = model.active;
                this.created = model.created;
                this.description = model.description;
                this.meta = model.meta;
                this.name = model.name;
                this.updated = model.updated;
            } 

            /**
             * <p>Specifies whether to set the fine sort expression as the default sort expression.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * <p>The time when the expression was created.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * <p>Description</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The information about the expression.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder meta(java.util.List<Meta> meta) {
                this.meta = meta;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the expression was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
