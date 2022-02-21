// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestSceneResponseBody} extends {@link TeaModel}
 *
 * <p>CreateABTestSceneResponseBody</p>
 */
public class CreateABTestSceneResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private CreateABTestSceneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateABTestSceneResponseBody create() {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public CreateABTestSceneResponseBody build() {
            return new CreateABTestSceneResponseBody(this);
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

        @NameInMap("values")
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
             * created.
             */
            public Builder created(Integer created) {
                this.created = created;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * updated.
             */
            public Builder updated(Integer updated) {
                this.updated = updated;
                return this;
            }

            /**
             * values.
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
