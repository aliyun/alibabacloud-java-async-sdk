// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecondRankResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecondRankResponseBody</p>
 */
public class DescribeSecondRankResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private DescribeSecondRankResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecondRankResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the fine sort expression.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public DescribeSecondRankResponseBody build() {
            return new DescribeSecondRankResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("active")
        private Boolean active;

        @NameInMap("created")
        private Integer created;

        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private String id;

        @NameInMap("isDefault")
        private String isDefault;

        @NameInMap("isSys")
        private String isSys;

        @NameInMap("meta")
        private String meta;

        @NameInMap("name")
        private String name;

        @NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.active = builder.active;
            this.created = builder.created;
            this.description = builder.description;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.isSys = builder.isSys;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public String getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return isSys
         */
        public String getIsSys() {
            return this.isSys;
        }

        /**
         * @return meta
         */
        public String getMeta() {
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
            private String id; 
            private String isDefault; 
            private String isSys; 
            private String meta; 
            private String name; 
            private Integer updated; 

            /**
             * Indicates whether the expression is the default one.
             */
            public Builder active(Boolean active) {
                this.active = active;
                return this;
            }

            /**
             * The time when the expression was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The description of the expression.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the expression. This parameter appears only in the response.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the expression is the default one. This parameter appears only in the response. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isDefault(String isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Indicates whether the expression is a system expression. This parameter appears only in the response. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder isSys(String isSys) {
                this.isSys = isSys;
                return this;
            }

            /**
             * The content of the fine sort expression.
             * <p>
             * 
             * You can define an expression that consists of fields, feature functions, and mathematical functions to implement complex sort logic.
             */
            public Builder meta(String meta) {
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

            /**
             * The time when the expression was last updated.
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
