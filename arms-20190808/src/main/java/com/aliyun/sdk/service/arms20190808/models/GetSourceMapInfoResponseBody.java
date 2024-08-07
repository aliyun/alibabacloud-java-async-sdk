// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSourceMapInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSourceMapInfoResponseBody</p>
 */
public class GetSourceMapInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceMapList")
    private java.util.List < SourceMapList> sourceMapList;

    private GetSourceMapInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sourceMapList = builder.sourceMapList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceMapInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceMapList
     */
    public java.util.List < SourceMapList> getSourceMapList() {
        return this.sourceMapList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SourceMapList> sourceMapList; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the SourceMap file.
         */
        public Builder sourceMapList(java.util.List < SourceMapList> sourceMapList) {
            this.sourceMapList = sourceMapList;
            return this;
        }

        public GetSourceMapInfoResponseBody build() {
            return new GetSourceMapInfoResponseBody(this);
        } 

    } 

    public static class SourceMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fid")
        private String fid;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("Size")
        private String size;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private SourceMapList(Builder builder) {
            this.fid = builder.fid;
            this.fileName = builder.fileName;
            this.size = builder.size;
            this.uploadTime = builder.uploadTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceMapList create() {
            return builder().build();
        }

        /**
         * @return fid
         */
        public String getFid() {
            return this.fid;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return size
         */
        public String getSize() {
            return this.size;
        }

        /**
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String fid; 
            private String fileName; 
            private String size; 
            private String uploadTime; 
            private String version; 

            /**
             * The ID of the SourceMap file.
             */
            public Builder fid(String fid) {
                this.fid = fid;
                return this;
            }

            /**
             * The name of the SourceMap file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The size of the file. Unit: KB.
             */
            public Builder size(String size) {
                this.size = size;
                return this;
            }

            /**
             * The timestamp that indicates when the file was uploaded.
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            /**
             * The version of the file.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public SourceMapList build() {
                return new SourceMapList(this);
            } 

        } 

    }
}
