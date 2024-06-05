// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchResponseBody} extends {@link TeaModel}
 *
 * <p>BatchResponseBody</p>
 */
public class BatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("responses")
    private java.util.List < Responses> responses;

    private BatchResponseBody(Builder builder) {
        this.responses = builder.responses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchResponseBody create() {
        return builder().build();
    }

    /**
     * @return responses
     */
    public java.util.List < Responses> getResponses() {
        return this.responses;
    }

    public static final class Builder {
        private java.util.List < Responses> responses; 

        /**
         * All responses of the child requests.
         */
        public Builder responses(java.util.List < Responses> responses) {
            this.responses = responses;
            return this;
        }

        public BatchResponseBody build() {
            return new BatchResponseBody(this);
        } 

    } 

    public static class Responses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private java.util.Map < String, ? > body;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("status")
        private Integer status;

        private Responses(Builder builder) {
            this.body = builder.body;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Responses create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public java.util.Map < String, ? > getBody() {
            return this.body;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, ? > body; 
            private String id; 
            private Integer status; 

            /**
             * The response parameters of a child request. For more information, see the topic of the corresponding child request.
             */
            public Builder body(java.util.Map < String, ? > body) {
                this.body = body;
                return this;
            }

            /**
             * The ID of the child request. The ID is used to associate a child request with a response.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The returned HTTP status code of a child request. For more information, see the topic of the corresponding child request.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Responses build() {
                return new Responses(this);
            } 

        } 

    }
}
