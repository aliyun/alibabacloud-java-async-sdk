// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GenerateOTAUploadURLResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateOTAUploadURLResponseBody</p>
 */
public class GenerateOTAUploadURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

        private Builder() {
        } 

        private Builder(GenerateOTAUploadURLResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information returned if the call is successful. For more information, see the following parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>74C2BB8D-1D6F-41F5-AE68-6B2310883F63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GenerateOTAUploadURLResponseBody build() {
            return new GenerateOTAUploadURLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateOTAUploadURLResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateOTAUploadURLResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirmwareUrl")
        private String firmwareUrl;

        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("OSSAccessKeyId")
        private String OSSAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("ObjectStorage")
        private String objectStorage;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.firmwareUrl = model.firmwareUrl;
                this.host = model.host;
                this.key = model.key;
                this.OSSAccessKeyId = model.OSSAccessKeyId;
                this.objectStorage = model.objectStorage;
                this.policy = model.policy;
                this.signature = model.signature;
                this.utcCreate = model.utcCreate;
            } 

            /**
             * <p>The URL of the update package file that is stored in OSS.</p>
             * <p>After the update package file is uploaded, this parameter is used to call the <a href="https://help.aliyun.com/document_detail/147311.html">CreateOTAFirmware</a> operation to create an update package.</p>
             */
            public Builder firmwareUrl(String firmwareUrl) {
                this.firmwareUrl = firmwareUrl;
                return this;
            }

            /**
             * <p>The endpoint of OSS.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://iotx-ota.oss-cn-shanghai.aliyuncs.com">https://iotx-ota.oss-cn-shanghai.aliyuncs.com</a></p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The full path of the file in OSS. The file is uploaded by calling the OSS PostObject operation.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The AccessKey ID of the bucket owner.</p>
             * <p>This OSS bucket stores the update package file.</p>
             * 
             * <strong>example:</strong>
             * <p>cS8uRRy54Rsz****</p>
             */
            public Builder OSSAccessKeyId(String OSSAccessKeyId) {
                this.OSSAccessKeyId = OSSAccessKeyId;
                return this;
            }

            /**
             * <p>The type of object storage. Default value: OSS.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder objectStorage(String objectStorage) {
                this.objectStorage = objectStorage;
                return this;
            }

            /**
             * <p>The parameter that is used by OSS to verify form fields for the request.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJleHBpcmF****</p>
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * <p>The signature that is calculated based on <strong>AccessKeySecret</strong> and <strong>Policy</strong>. When you call an OSS operation, OSS uses the signature information to verify the POST request.</p>
             * 
             * <strong>example:</strong>
             * <p>v6lViO4FBvfquajQjg20K5hK****</p>
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * <p>The time when the URL of the uploaded update package file was generated. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-04T06:21:54.607Z</p>
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
