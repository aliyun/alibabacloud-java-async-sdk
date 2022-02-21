// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMediaResponseBody} extends {@link TeaModel}
 *
 * <p>CreateMediaResponseBody</p>
 */
public class CreateMediaResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("MediaUploadParam")
    private MediaUploadParam mediaUploadParam;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private CreateMediaResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.mediaUploadParam = builder.mediaUploadParam;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return mediaUploadParam
     */
    public MediaUploadParam getMediaUploadParam() {
        return this.mediaUploadParam;
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
        private Integer httpStatusCode; 
        private MediaUploadParam mediaUploadParam; 
        private String message; 
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * MediaUploadParam.
         */
        public Builder mediaUploadParam(MediaUploadParam mediaUploadParam) {
            this.mediaUploadParam = mediaUploadParam;
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

        public CreateMediaResponseBody build() {
            return new CreateMediaResponseBody(this);
        } 

    } 

    public static class MediaUploadParam extends TeaModel {
        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Id")
        private String id;

        @NameInMap("Instance")
        private String instance;

        @NameInMap("Name")
        private String name;

        @NameInMap("OssFileName")
        private String ossFileName;

        @NameInMap("OssFilePath")
        private String ossFilePath;

        private MediaUploadParam(Builder builder) {
            this.fileName = builder.fileName;
            this.id = builder.id;
            this.instance = builder.instance;
            this.name = builder.name;
            this.ossFileName = builder.ossFileName;
            this.ossFilePath = builder.ossFilePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaUploadParam create() {
            return builder().build();
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ossFileName
         */
        public String getOssFileName() {
            return this.ossFileName;
        }

        /**
         * @return ossFilePath
         */
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        public static final class Builder {
            private String fileName; 
            private String id; 
            private String instance; 
            private String name; 
            private String ossFileName; 
            private String ossFilePath; 

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OssFileName.
             */
            public Builder ossFileName(String ossFileName) {
                this.ossFileName = ossFileName;
                return this;
            }

            /**
             * OssFilePath.
             */
            public Builder ossFilePath(String ossFilePath) {
                this.ossFilePath = ossFilePath;
                return this;
            }

            public MediaUploadParam build() {
                return new MediaUploadParam(this);
            } 

        } 

    }
}
