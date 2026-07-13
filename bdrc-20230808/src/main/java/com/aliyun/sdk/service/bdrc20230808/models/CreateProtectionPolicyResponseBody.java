// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link CreateProtectionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateProtectionPolicyResponseBody</p>
 */
public class CreateProtectionPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateProtectionPolicyResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProtectionPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateProtectionPolicyResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateProtectionPolicyResponseBody build() {
            return new CreateProtectionPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateProtectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateProtectionPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectionPolicyId")
        private String protectionPolicyId;

        private Data(Builder builder) {
            this.protectionPolicyId = builder.protectionPolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return protectionPolicyId
         */
        public String getProtectionPolicyId() {
            return this.protectionPolicyId;
        }

        public static final class Builder {
            private String protectionPolicyId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.protectionPolicyId = model.protectionPolicyId;
            } 

            /**
             * ProtectionPolicyId.
             */
            public Builder protectionPolicyId(String protectionPolicyId) {
                this.protectionPolicyId = protectionPolicyId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
