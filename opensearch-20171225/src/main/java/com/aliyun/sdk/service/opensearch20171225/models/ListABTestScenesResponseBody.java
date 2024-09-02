// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestScenesResponseBody} extends {@link TeaModel}
 *
 * <p>ListABTestScenesResponseBody</p>
 */
public class ListABTestScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListABTestScenesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListABTestScenesResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the test scenarios.
         * <p>
         * 
         * For more information, see [ABTestScene](~~173618~~).
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListABTestScenesResponseBody build() {
            return new ListABTestScenesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("created")
        private Integer created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("updated")
        private Integer updated;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List < String > values;

        private Result(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.updated = builder.updated;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Integer getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return updated
         */
        public Integer getUpdated() {
            return this.updated;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private Integer created; 
            private String id; 
            private String name; 
            private Integer status; 
            private Integer updated; 
            private java.util.List < String > values; 

            /**
             * The time when the test scenario was created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * The ID of the test group.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the test group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The status of the test scenario. Valid values:
             * <p>
             * 
             * *   0: not in effect
             * *   1: in effect
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the test scenario was last modified.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            /**
             * The name of the test scenario.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
