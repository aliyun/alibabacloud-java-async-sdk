// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreatePolicyAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolicyAttachmentResponseBody</p>
 */
public class CreatePolicyAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreatePolicyAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolicyAttachmentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePolicyAttachmentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>585657D2-1C20-5B8A-AF17-D727C64***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePolicyAttachmentResponseBody build() {
            return new CreatePolicyAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreatePolicyAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>CreatePolicyAttachmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("policyAttachmentId")
        private String policyAttachmentId;

        private Data(Builder builder) {
            this.policyAttachmentId = builder.policyAttachmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return policyAttachmentId
         */
        public String getPolicyAttachmentId() {
            return this.policyAttachmentId;
        }

        public static final class Builder {
            private String policyAttachmentId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.policyAttachmentId = model.policyAttachmentId;
            } 

            /**
             * <p>Policy Mount ID</p>
             * 
             * <strong>example:</strong>
             * <p>pr-cqooju5lhtgquuj6***</p>
             */
            public Builder policyAttachmentId(String policyAttachmentId) {
                this.policyAttachmentId = policyAttachmentId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
