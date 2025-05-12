// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListPodsOfInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListPodsOfInstanceResponseBody</p>
 */
public class ListPodsOfInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListPodsOfInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPodsOfInstanceResponseBody create() {
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String requestId; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListPodsOfInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.total = model.total;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B149FD9C-ED5C-5765-B3AD-05AA4A4D64D7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>instance not exists</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListPodsOfInstanceResponseBody build() {
            return new ListPodsOfInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPodsOfInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListPodsOfInstanceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("pod")
        private String pod;

        private Data(Builder builder) {
            this.namespace = builder.namespace;
            this.pod = builder.pod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        public static final class Builder {
            private String namespace; 
            private String pod; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.namespace = model.namespace;
                this.pod = model.pod;
            } 

            /**
             * namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * pod.
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
