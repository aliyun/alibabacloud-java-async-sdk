// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWebHostingFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListWebHostingFilesResponseBody</p>
 */
public class ListWebHostingFilesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListWebHostingFilesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWebHostingFilesResponseBody create() {
        return builder().build();
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

        public ListWebHostingFilesResponseBody build() {
            return new ListWebHostingFilesResponseBody(this);
        } 

    } 

    public static class WebHostingFiles extends TeaModel {
        @NameInMap("ContentType")
        private String contentType;

        @NameInMap("ETag")
        private String eTag;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("LastModifiedTime")
        private Long lastModifiedTime;

        @NameInMap("SignedUrl")
        private String signedUrl;

        @NameInMap("Size")
        private Long size;

        private WebHostingFiles(Builder builder) {
            this.contentType = builder.contentType;
            this.eTag = builder.eTag;
            this.filePath = builder.filePath;
            this.lastModifiedTime = builder.lastModifiedTime;
            this.signedUrl = builder.signedUrl;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebHostingFiles create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return eTag
         */
        public String getETag() {
            return this.eTag;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return lastModifiedTime
         */
        public Long getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        /**
         * @return signedUrl
         */
        public String getSignedUrl() {
            return this.signedUrl;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String contentType; 
            private String eTag; 
            private String filePath; 
            private Long lastModifiedTime; 
            private String signedUrl; 
            private Long size; 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * ETag.
             */
            public Builder eTag(String eTag) {
                this.eTag = eTag;
                return this;
            }

            /**
             * FilePath.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * LastModifiedTime.
             */
            public Builder lastModifiedTime(Long lastModifiedTime) {
                this.lastModifiedTime = lastModifiedTime;
                return this;
            }

            /**
             * SignedUrl.
             */
            public Builder signedUrl(String signedUrl) {
                this.signedUrl = signedUrl;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public WebHostingFiles build() {
                return new WebHostingFiles(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("NextMarker")
        private String nextMarker;

        @NameInMap("WebHostingFiles")
        private java.util.List < WebHostingFiles> webHostingFiles;

        private Data(Builder builder) {
            this.count = builder.count;
            this.nextMarker = builder.nextMarker;
            this.webHostingFiles = builder.webHostingFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return nextMarker
         */
        public String getNextMarker() {
            return this.nextMarker;
        }

        /**
         * @return webHostingFiles
         */
        public java.util.List < WebHostingFiles> getWebHostingFiles() {
            return this.webHostingFiles;
        }

        public static final class Builder {
            private Integer count; 
            private String nextMarker; 
            private java.util.List < WebHostingFiles> webHostingFiles; 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * NextMarker.
             */
            public Builder nextMarker(String nextMarker) {
                this.nextMarker = nextMarker;
                return this;
            }

            /**
             * WebHostingFiles.
             */
            public Builder webHostingFiles(java.util.List < WebHostingFiles> webHostingFiles) {
                this.webHostingFiles = webHostingFiles;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
