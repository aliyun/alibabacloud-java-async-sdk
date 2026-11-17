// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadInfoResponseBody</p>
 */
public class GetUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUploadInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadInfoResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUploadInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code of the API. A value of 200 indicates success. If the call fails, the corresponding error code is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The file upload address and temporary credentials.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The processing message returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8737D130-BFD0-5D51-96F6-C08EB1139A25</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUploadInfoResponseBody build() {
            return new GetUploadInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUploadInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetUploadInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessKeyId")
        private String accessKeyId;

        @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
        private String accessKeySecret;

        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Expiration")
        private String expiration;

        @com.aliyun.core.annotation.NameInMap("FilePath")
        private String filePath;

        @com.aliyun.core.annotation.NameInMap("OssPoint")
        private String ossPoint;

        @com.aliyun.core.annotation.NameInMap("OssPointInternal")
        private String ossPointInternal;

        @com.aliyun.core.annotation.NameInMap("StsToken")
        private String stsToken;

        private Data(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.accessKeySecret = builder.accessKeySecret;
            this.bucketName = builder.bucketName;
            this.expiration = builder.expiration;
            this.filePath = builder.filePath;
            this.ossPoint = builder.ossPoint;
            this.ossPointInternal = builder.ossPointInternal;
            this.stsToken = builder.stsToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return accessKeySecret
         */
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return expiration
         */
        public String getExpiration() {
            return this.expiration;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return ossPoint
         */
        public String getOssPoint() {
            return this.ossPoint;
        }

        /**
         * @return ossPointInternal
         */
        public String getOssPointInternal() {
            return this.ossPointInternal;
        }

        /**
         * @return stsToken
         */
        public String getStsToken() {
            return this.stsToken;
        }

        public static final class Builder {
            private String accessKeyId; 
            private String accessKeySecret; 
            private String bucketName; 
            private String expiration; 
            private String filePath; 
            private String ossPoint; 
            private String ossPointInternal; 
            private String stsToken; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accessKeyId = model.accessKeyId;
                this.accessKeySecret = model.accessKeySecret;
                this.bucketName = model.bucketName;
                this.expiration = model.expiration;
                this.filePath = model.filePath;
                this.ossPoint = model.ossPoint;
                this.ossPointInternal = model.ossPointInternal;
                this.stsToken = model.stsToken;
            } 

            /**
             * <p>The AccessKey ID of the STS temporary access credential.</p>
             * 
             * <strong>example:</strong>
             * <p>STS.NUexample****</p>
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * <p>The AccessKey secret of the STS temporary access credential. This parameter is used together with AccessKeyId and StsToken.</p>
             * 
             * <strong>example:</strong>
             * <p>secret-example****</p>
             */
            public Builder accessKeySecret(String accessKeySecret) {
                this.accessKeySecret = accessKeySecret;
                return this;
            }

            /**
             * <p>The name of the destination OSS bucket for the upload.</p>
             * 
             * <strong>example:</strong>
             * <p>appstream-example</p>
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * <p>Not supported.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder expiration(String expiration) {
                this.expiration = expiration;
                return this;
            }

            /**
             * <p>The OSS directory prefix where files are allowed to be uploaded. The path of the uploaded object must be located in this directory.</p>
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * <p>The OSS endpoint for public network access.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder ossPoint(String ossPoint) {
                this.ossPoint = ossPoint;
                return this;
            }

            /**
             * <p>The internal OSS endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai-internal.aliyuncs.com</p>
             */
            public Builder ossPointInternal(String ossPointInternal) {
                this.ossPointInternal = ossPointInternal;
                return this;
            }

            /**
             * <p>The STS temporary security token. This parameter is used together with AccessKeyId and AccessKeySecret for file upload.</p>
             * 
             * <strong>example:</strong>
             * <p>CAISexample****</p>
             */
            public Builder stsToken(String stsToken) {
                this.stsToken = stsToken;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
