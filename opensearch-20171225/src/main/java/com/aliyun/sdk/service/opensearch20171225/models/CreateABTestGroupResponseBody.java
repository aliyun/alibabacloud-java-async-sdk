// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABTestGroupResponseBody</p>
 */
public class CreateABTestGroupResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private CreateABTestGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestGroupResponseBody create() {
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
         * The return result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateABTestGroupResponseBody build() {
            return new CreateABTestGroupResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("created")
        private Integer created;

        @NameInMap("id")
        private String id;

        @NameInMap("name")
        private String name;

        @NameInMap("status")
        private Integer status;

        @NameInMap("updated")
        private Integer updated;

        private Result(Builder builder) {
            this.created = builder.created;
            this.id = builder.id;
            this.name = builder.name;
            this.status = builder.status;
            this.updated = builder.updated;
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

        public static final class Builder {
            private Integer created; 
            private String id; 
            private String name; 
            private Integer status; 
            private Integer updated; 

            /**
             * The time when the test group was created.
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
             * The status of the test group. Valid values:
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
             * The time when the test group was last modified.
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
