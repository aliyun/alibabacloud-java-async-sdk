// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link ListClusterNamesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterNamesResponseBody</p>
 */
public class ListClusterNamesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(ListClusterNamesResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>id of request</p>
         * 
         * <strong>example:</strong>
         * <p>F6E3D968-529C-5C40-AFDD-133A8B8FD930</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result set.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListClusterNamesResponseBody build() {
            return new ListClusterNamesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterNamesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterNamesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ha3_test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>25030</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The cluster name.</p>
             * 
             * <strong>example:</strong>
             * <p>my_index</p>
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
