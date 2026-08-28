// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
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
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("maxSize")
        private String maxSize;

        @com.aliyun.core.annotation.NameInMap("ossObjectName")
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("uploadUrl")
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
             * contentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * maxSize.
             */
            public Builder maxSize(String maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * ossObjectName.
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * uploadUrl.
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
