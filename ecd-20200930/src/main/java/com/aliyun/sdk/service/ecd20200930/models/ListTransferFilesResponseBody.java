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
         * <p>The files.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>Maximum value: 100.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The returned value of <code>NextToken</code> is a pagination token, which can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
             * <p>The URL of the file icon.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>For image file types (.png, .jpg, .jpeg, .gif, .webp, and .svg), the URL of the specific image is returned.</p>
             * </li>
             * <li><p>For other file types, the URL of the default image is returned.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="https://app-center-icon-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/tenant">https://app-center-icon-pre-hangzhou.oss-cn-hangzhou.aliyuncs.com/tenant</a>****</p>
             */
            public Builder iconUrl(String iconUrl) {
                this.iconUrl = iconUrl;
                return this;
            }

            /**
             * <p>The file ID.</p>
             * 
             * <strong>example:</strong>
             * <p>trf-a213msf****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The file name.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the object stored in OSS.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>A value is returned for this parameter only when the object is stored in a custom OSS bucket.</li>
             * </ul>
             */
            public Builder ossFileName(String ossFileName) {
                this.ossFileName = ossFileName;
                return this;
            }

            /**
             * <p>The path of the object in the OSS bucket.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li>A value is returned for this parameter only when the object is stored in a custom OSS bucket.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>transfer/1244234/****</p>
             */
            public Builder ossFilePath(String ossFilePath) {
                this.ossFilePath = ossFilePath;
                return this;
            }

            /**
             * <p>The file size.</p>
             * 
             * <strong>example:</strong>
             * <p>10853079</p>
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The file status.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DELETING</li>
             * <li>DELETED</li>
             * <li>UPLOADED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELETED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The file type.</p>
             * 
             * <strong>example:</strong>
             * <p>txt</p>
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
