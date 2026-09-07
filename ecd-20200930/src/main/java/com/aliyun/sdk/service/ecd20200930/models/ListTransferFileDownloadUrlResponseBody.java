// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link ListTransferFileDownloadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransferFileDownloadUrlResponseBody</p>
 */
public class ListTransferFileDownloadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Urls")
    private java.util.List<Urls> urls;

    private ListTransferFileDownloadUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.urls = builder.urls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransferFileDownloadUrlResponseBody create() {
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
     * @return urls
     */
    public java.util.List<Urls> getUrls() {
        return this.urls;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Urls> urls; 

        private Builder() {
        } 

        private Builder(ListTransferFileDownloadUrlResponseBody model) {
            this.requestId = model.requestId;
            this.urls = model.urls;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F1F01499-8F3D-5657-91AD-48177EB****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of file download URL information.</p>
         */
        public Builder urls(java.util.List<Urls> urls) {
            this.urls = urls;
            return this;
        }

        public ListTransferFileDownloadUrlResponseBody build() {
            return new ListTransferFileDownloadUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransferFileDownloadUrlResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransferFileDownloadUrlResponseBody</p>
     */
    public static class Urls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Urls(Builder builder) {
            this.fileId = builder.fileId;
            this.fileName = builder.fileName;
            this.status = builder.status;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Urls create() {
            return builder().build();
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String fileId; 
            private String fileName; 
            private String status; 
            private String url; 

            private Builder() {
            } 

            private Builder(Urls model) {
                this.fileId = model.fileId;
                this.fileName = model.fileName;
                this.status = model.status;
                this.url = model.url;
            } 

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>trf-i4pz8emx2k2fr****</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The file name.</p>
             * 
             * <strong>example:</strong>
             * <p>document.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file status.</p>
             * 
             * <strong>example:</strong>
             * <p>DELETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The file download URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxsy-transfer.oss-cn-beijing.aliyuncs.com/xxxx">http://xxsy-transfer.oss-cn-beijing.aliyuncs.com/xxxx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Urls build() {
                return new Urls(this);
            } 

        } 

    }
}
