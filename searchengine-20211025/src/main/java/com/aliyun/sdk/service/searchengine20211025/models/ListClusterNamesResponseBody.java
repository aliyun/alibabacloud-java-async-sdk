// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterNamesResponseBody</p>
 */
public class ListClusterNamesResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private ListClusterNamesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterNamesResponseBody create() {
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
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The result set
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListClusterNamesResponseBody build() {
            return new ListClusterNamesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("description")
        private String description;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        private Result(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
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
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 

            /**
             * The description of the cluster
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the cluster
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the cluster
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
