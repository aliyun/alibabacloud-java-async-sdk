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
 * {@link CreateAndAttachPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAndAttachPolicyResponseBody</p>
 */
public class CreateAndAttachPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAndAttachPolicyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAndAttachPolicyResponseBody create() {
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

        private Builder(CreateAndAttachPolicyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to trace the call link.</p>
         * 
         * <strong>example:</strong>
         * <p>585657D2-1C20-5B8A-AF17-D727C6490BE4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAndAttachPolicyResponseBody build() {
            return new CreateAndAttachPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAndAttachPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAndAttachPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("attachment")
        private Attachment attachment;

        @com.aliyun.core.annotation.NameInMap("policyId")
        private String policyId;

        private Data(Builder builder) {
            this.attachment = builder.attachment;
            this.policyId = builder.policyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attachment
         */
        public Attachment getAttachment() {
            return this.attachment;
        }

        /**
         * @return policyId
         */
        public String getPolicyId() {
            return this.policyId;
        }

        public static final class Builder {
            private Attachment attachment; 
            private String policyId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.attachment = model.attachment;
                this.policyId = model.policyId;
            } 

            /**
             * <p>The association information of the policy.</p>
             */
            public Builder attachment(Attachment attachment) {
                this.attachment = attachment;
                return this;
            }

            /**
             * <p>The policy ID.</p>
             * 
             * <strong>example:</strong>
             * <p>p-cq7l5s5lhtgi6qasrdc0</p>
             */
            public Builder policyId(String policyId) {
                this.policyId = policyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
