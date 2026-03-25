// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ImportKMSSecretsForHostResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKMSSecretsForHostResponseBody</p>
 */
public class ImportKMSSecretsForHostResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Long successCount;

    private ImportKMSSecretsForHostResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKMSSecretsForHostResponseBody create() {
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
     * @return results
     */
    public java.util.List<Results> getResults() {
        return this.results;
    }

    /**
     * @return successCount
     */
    public Long getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Results> results; 
        private Long successCount; 

        private Builder() {
        } 

        private Builder(ImportKMSSecretsForHostResponseBody model) {
            this.requestId = model.requestId;
            this.results = model.results;
            this.successCount = model.successCount;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Results.
         */
        public Builder results(java.util.List<Results> results) {
            this.results = results;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }

        public ImportKMSSecretsForHostResponseBody build() {
            return new ImportKMSSecretsForHostResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportKMSSecretsForHostResponseBody} extends {@link TeaModel}
     *
     * <p>ImportKMSSecretsForHostResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("SecretName")
        private String secretName;

        private Results(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
            this.secretName = builder.secretName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return secretName
         */
        public String getSecretName() {
            return this.secretName;
        }

        public static final class Builder {
            private String code; 
            private String message; 
            private String secretName; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.code = model.code;
                this.message = model.message;
                this.secretName = model.secretName;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * SecretName.
             */
            public Builder secretName(String secretName) {
                this.secretName = secretName;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
