// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOTAUploadURLResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOTAUploadURLResponseBody</p>
 */
public class GenerateOTAUploadURLResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GenerateOTAUploadURLResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOTAUploadURLResponseBody create() {
        return builder().build();
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateOTAUploadURLResponseBody build() {
            return new GenerateOTAUploadURLResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("FirmwareUrl")
        private String firmwareUrl;

        @NameInMap("Host")
        private String host;

        @NameInMap("Key")
        private String key;

        @NameInMap("OSSAccessKeyId")
        private String OSSAccessKeyId;

        @NameInMap("ObjectStorage")
        private String objectStorage;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("Signature")
        private String signature;

        @NameInMap("UtcCreate")
        private String utcCreate;

        private Data(Builder builder) {
            this.firmwareUrl = builder.firmwareUrl;
            this.host = builder.host;
            this.key = builder.key;
            this.OSSAccessKeyId = builder.OSSAccessKeyId;
            this.objectStorage = builder.objectStorage;
            this.policy = builder.policy;
            this.signature = builder.signature;
            this.utcCreate = builder.utcCreate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return firmwareUrl
         */
        public String getFirmwareUrl() {
            return this.firmwareUrl;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return OSSAccessKeyId
         */
        public String getOSSAccessKeyId() {
            return this.OSSAccessKeyId;
        }

        /**
         * @return objectStorage
         */
        public String getObjectStorage() {
            return this.objectStorage;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        public static final class Builder {
            private String firmwareUrl; 
            private String host; 
            private String key; 
            private String OSSAccessKeyId; 
            private String objectStorage; 
            private String policy; 
            private String signature; 
            private String utcCreate; 

            /**
             * FirmwareUrl.
             */
            public Builder firmwareUrl(String firmwareUrl) {
                this.firmwareUrl = firmwareUrl;
                return this;
            }

            /**
             * Host.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * OSSAccessKeyId.
             */
            public Builder OSSAccessKeyId(String OSSAccessKeyId) {
                this.OSSAccessKeyId = OSSAccessKeyId;
                return this;
            }

            /**
             * ObjectStorage.
             */
            public Builder objectStorage(String objectStorage) {
                this.objectStorage = objectStorage;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * UtcCreate.
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
