// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link GetSkillImportFileUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetSkillImportFileUrlResponseBody</p>
 */
public class GetSkillImportFileUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSkillImportFileUrlResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillImportFileUrlResponseBody create() {
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

        private Builder(GetSkillImportFileUrlResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSkillImportFileUrlResponseBody build() {
            return new GetSkillImportFileUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillImportFileUrlResponseBody} extends {@link TeaModel}
     *
     * <p>GetSkillImportFileUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private String maxSize;

        @com.aliyun.core.annotation.NameInMap("OssObjectName")
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("UploadUrl")
        private String uploadUrl;

        private Data(Builder builder) {
            this.contentType = builder.contentType;
            this.maxSize = builder.maxSize;
            this.ossObjectName = builder.ossObjectName;
            this.uploadUrl = builder.uploadUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return maxSize
         */
        public String getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return uploadUrl
         */
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public static final class Builder {
            private String contentType; 
            private String maxSize; 
            private String ossObjectName; 
            private String uploadUrl; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contentType = model.contentType;
                this.maxSize = model.maxSize;
                this.ossObjectName = model.ossObjectName;
                this.uploadUrl = model.uploadUrl;
            } 

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>application/zip</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The maximum allowed file size for upload, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxSize(String maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The file name in the authorized OSS bucket.</p>
             * <blockquote>
             * <p>Among the four image input methods (FaceContrastPicture, FaceContrastPictureUrl, CertifyId, and OSS), select one to use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1190239587066411/skill/import/5e993afe-f629-4619-9ac2-51b125300cdd/2026/06/09/35059076-5992-4a71-a706-89230e57f2a2/ui-ux-pro-max.zip</p>
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * <p>The file upload URL. The client uses this URL to upload the file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://mse-shared-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/skill/import/199xxxxxxxx0842/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/2026/06/10/xxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/1781082579097.zip?Expires=1781083479&OSSAccessKeyId=STS.NZXGXTD2yoDLd5PfsYxjFrvBJ&Signature=Loyyzzzzzzzz%3D&security-token=CAIStgxxxxxxx">https://mse-shared-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/skill/import/199xxxxxxxx0842/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/2026/06/10/xxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/1781082579097.zip?Expires=1781083479&amp;OSSAccessKeyId=STS.NZXGXTD2yoDLd5PfsYxjFrvBJ&amp;Signature=Loyyzzzzzzzz%3D&amp;security-token=CAIStgxxxxxxx</a></p>
             */
            public Builder uploadUrl(String uploadUrl) {
                this.uploadUrl = uploadUrl;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
