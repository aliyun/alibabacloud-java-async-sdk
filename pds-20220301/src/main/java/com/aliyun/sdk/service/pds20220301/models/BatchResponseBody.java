// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link BatchResponseBody} extends {@link TeaModel}
 *
 * <p>BatchResponseBody</p>
 */
public class BatchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("responses")
    private java.util.List<Responses> responses;

    private BatchResponseBody(Builder builder) {
        this.responses = builder.responses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return responses
     */
    public java.util.List<Responses> getResponses() {
        return this.responses;
    }

    public static final class Builder {
        private java.util.List<Responses> responses; 

        private Builder() {
        } 

        private Builder(BatchResponseBody model) {
            this.responses = model.responses;
        } 

        /**
         * <p>All responses of the child requests.</p>
         */
        public Builder responses(java.util.List<Responses> responses) {
            this.responses = responses;
            return this;
        }

        public BatchResponseBody build() {
            return new BatchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchResponseBody} extends {@link TeaModel}
     *
     * <p>BatchResponseBody</p>
     */
    public static class Responses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("body")
        private java.util.Map<String, ?> body;

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
        public java.util.Map<String, ?> getBody() {
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
            private java.util.Map<String, ?> body; 
            private String id; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Responses model) {
                this.body = model.body;
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * <p>The response parameters of a child request. For more information, see the topic of the corresponding child request.</p>
             */
            public Builder body(java.util.Map<String, ?> body) {
                this.body = body;
                return this;
            }

            /**
             * <p>The ID of the child request. The ID is used to associate a child request with a response.</p>
             * 
             * <strong>example:</strong>
             * <p>93433894994ad2e1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The returned HTTP status code of a child request. For more information, see the topic of the corresponding child request.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
