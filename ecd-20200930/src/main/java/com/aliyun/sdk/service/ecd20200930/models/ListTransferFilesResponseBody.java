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
 * {@link ListTransferFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTransferFilesResponseBody</p>
 */
public class ListTransferFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTransferFilesResponseBody(Builder builder) {
        this.files = builder.files;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTransferFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Files> files; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTransferFilesResponseBody model) {
            this.files = model.files;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * Files.
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTransferFilesResponseBody build() {
            return new ListTransferFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTransferFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTransferFilesResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IconUrl")
        private String iconUrl;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OssFileName")
        private String ossFileName;

        @com.aliyun.core.annotation.NameInMap("OssFilePath")
        private String ossFilePath;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Files(Builder builder) {
            this.iconUrl = builder.iconUrl;
            this.id = builder.id;
            this.name = builder.name;
            this.ossFileName = builder.ossFileName;
            this.ossFilePath = builder.ossFilePath;
            this.size = builder.size;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return iconUrl
         */
        public String getIconUrl() {
            return this.iconUrl;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
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

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String iconUrl; 
            private String id; 
            private String name; 
            private String ossFileName; 
            private String ossFilePath; 
            private String size; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.iconUrl = model.iconUrl;
                this.id = model.id;
                this.name = model.name;
                this.ossFileName = model.ossFileName;
                this.ossFilePath = model.ossFilePath;
                this.size = model.size;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * IconUrl.
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
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

            /**
             * Size.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
