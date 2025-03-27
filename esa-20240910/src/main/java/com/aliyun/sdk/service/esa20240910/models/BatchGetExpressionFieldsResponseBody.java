// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link BatchGetExpressionFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetExpressionFieldsResponseBody</p>
 */
public class BatchGetExpressionFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchGetExpressionFieldsResponseBody(Builder builder) {
        this.fields = builder.fields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetExpressionFieldsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Fields> fields; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchGetExpressionFieldsResponseBody model) {
            this.fields = model.fields;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of match fields.</p>
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchGetExpressionFieldsResponseBody build() {
            return new BatchGetExpressionFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetExpressionFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetExpressionFieldsResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private java.util.List<String> fields;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Fields(Builder builder) {
            this.fields = builder.fields;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List<String> getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fields; 
            private String id; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.fields = model.fields;
                this.id = model.id;
            } 

            /**
             * <p>List of match fields for a single expression.</p>
             */
            public Builder fields(java.util.List<String> fields) {
                this.fields = fields;
                return this;
            }

            /**
             * <p>ID of the expression, corresponding to the ID in the input parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
