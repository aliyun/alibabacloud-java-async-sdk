// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataMaskingEncryptionAlgorithmsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataMaskingEncryptionAlgorithmsResponseBody</p>
 */
public class ListDataMaskingEncryptionAlgorithmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Algorithms")
    private java.util.List<Algorithms> algorithms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataMaskingEncryptionAlgorithmsResponseBody(Builder builder) {
        this.algorithms = builder.algorithms;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataMaskingEncryptionAlgorithmsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithms
     */
    public java.util.List<Algorithms> getAlgorithms() {
        return this.algorithms;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Algorithms> algorithms; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataMaskingEncryptionAlgorithmsResponseBody model) {
            this.algorithms = model.algorithms;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of column encryption algorithms.</p>
         */
        public Builder algorithms(java.util.List<Algorithms> algorithms) {
            this.algorithms = algorithms;
            return this;
        }

        /**
         * <p>The request ID, which can be used to locate this API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataMaskingEncryptionAlgorithmsResponseBody build() {
            return new ListDataMaskingEncryptionAlgorithmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataMaskingEncryptionAlgorithmsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataMaskingEncryptionAlgorithmsResponseBody</p>
     */
    public static class Algorithms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Algorithms(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Algorithms create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String name; 

            private Builder() {
            } 

            private Builder(Algorithms model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.name = model.name;
            } 

            /**
             * <p>The business error code for the record or operation. This value can be empty if no error occurs. Evaluate this value together with ErrorMessage.</p>
             * 
             * <strong>example:</strong>
             * <p>data_masking_not_running</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The business error description for the record or operation.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance is not in the running state</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The algorithm name.</p>
             * 
             * <strong>example:</strong>
             * <p>AES_256_GCM</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Algorithms build() {
                return new Algorithms(this);
            } 

        } 

    }
}
