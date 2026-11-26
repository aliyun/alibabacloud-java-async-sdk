// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetRumSymbolFilesResponseBody} extends {@link TeaModel}
 *
 * <p>GetRumSymbolFilesResponseBody</p>
 */
public class GetRumSymbolFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetRumSymbolFilesResponseBody(Builder builder) {
        this.files = builder.files;
        this.hasMore = builder.hasMore;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRumSymbolFilesResponseBody create() {
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
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Files> files; 
        private Boolean hasMore; 
        private String nextToken; 
        private Long pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRumSymbolFilesResponseBody model) {
            this.files = model.files;
            this.hasMore = model.hasMore;
            this.nextToken = model.nextToken;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of symbol files.</p>
         */
        public Builder files(java.util.List<Files> files) {
            this.files = files;
            return this;
        }

        /**
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The pagination token for the next page. The example is for illustration purposes only and cannot be used for actual queries. To query the next page, use the actual value returned in the response.</p>
         * 
         * <strong>example:</strong>
         * <p>next</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>request-1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRumSymbolFilesResponseBody build() {
            return new GetRumSymbolFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRumSymbolFilesResponseBody} extends {@link TeaModel}
     *
     * <p>GetRumSymbolFilesResponseBody</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifactPath")
        private String artifactPath;

        @com.aliyun.core.annotation.NameInMap("artifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("fileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("matchedKeywords")
        private java.util.List<String> matchedKeywords;

        @com.aliyun.core.annotation.NameInMap("platform")
        private String platform;

        @com.aliyun.core.annotation.NameInMap("size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("uuid")
        private String uuid;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Files(Builder builder) {
            this.artifactPath = builder.artifactPath;
            this.artifactType = builder.artifactType;
            this.fileName = builder.fileName;
            this.matchedKeywords = builder.matchedKeywords;
            this.platform = builder.platform;
            this.size = builder.size;
            this.source = builder.source;
            this.updateTime = builder.updateTime;
            this.uuid = builder.uuid;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return artifactPath
         */
        public String getArtifactPath() {
            return this.artifactPath;
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return matchedKeywords
         */
        public java.util.List<String> getMatchedKeywords() {
            return this.matchedKeywords;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String artifactPath; 
            private String artifactType; 
            private String fileName; 
            private java.util.List<String> matchedKeywords; 
            private String platform; 
            private Long size; 
            private String source; 
            private Long updateTime; 
            private String uuid; 
            private String version; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.artifactPath = model.artifactPath;
                this.artifactType = model.artifactType;
                this.fileName = model.fileName;
                this.matchedKeywords = model.matchedKeywords;
                this.platform = model.platform;
                this.size = model.size;
                this.source = model.source;
                this.updateTime = model.updateTime;
                this.uuid = model.uuid;
                this.version = model.version;
            } 

            /**
             * <p>The object path of the symbol file.</p>
             * 
             * <strong>example:</strong>
             * <p>user/workspace/service-id/3.0.0/build-1/new-app.map</p>
             */
            public Builder artifactPath(String artifactPath) {
                this.artifactPath = artifactPath;
                return this;
            }

            /**
             * <p>The type of the symbol file.</p>
             * 
             * <strong>example:</strong>
             * <p>map</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The name of the symbol file.</p>
             * 
             * <strong>example:</strong>
             * <p>new-app.map</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The list of matched search keywords.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;new-app&quot;]</p>
             */
            public Builder matchedKeywords(java.util.List<String> matchedKeywords) {
                this.matchedKeywords = matchedKeywords;
                return this;
            }

            /**
             * <p>The platform type to which the file belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>web</p>
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * <p>The size of the file in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The source of the symbol file. This query API returns only symbol files uploaded by users, which is fixed to user. The value system is reserved for internal system symbols of the platform.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The timestamp of the last time the file was updated, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1778806923000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The UUID or Debug ID of the symbol file.</p>
             * 
             * <strong>example:</strong>
             * <p>build-1</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * <p>The associated application version number.</p>
             * 
             * <strong>example:</strong>
             * <p>3.0.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
