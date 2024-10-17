// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UploadResponseBody} extends {@link TeaModel}
 *
 * <p>UploadResponseBody</p>
 */
public class UploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadResult")
    private UploadResult uploadResult;

    private UploadResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadResult = builder.uploadResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadResult
     */
    public UploadResult getUploadResult() {
        return this.uploadResult;
    }

    public static final class Builder {
        private String requestId; 
        private UploadResult uploadResult; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5EC8221-08F2-4C95-9AF1-49FD998C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder uploadResult(UploadResult uploadResult) {
            this.uploadResult = uploadResult;
            return this;
        }

        public UploadResponseBody build() {
            return new UploadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadResponseBody} extends {@link TeaModel}
     *
     * <p>UploadResponseBody</p>
     */
    public static class UploadResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fid")
        private String fid;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("UploadTime")
        private String uploadTime;

        private UploadResult(Builder builder) {
            this.fid = builder.fid;
            this.fileName = builder.fileName;
            this.uploadTime = builder.uploadTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadResult create() {
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
         * @return uploadTime
         */
        public String getUploadTime() {
            return this.uploadTime;
        }

        public static final class Builder {
            private String fid; 
            private String fileName; 
            private String uploadTime; 

            /**
             * <p>The ID of the SourceMap file.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder fid(String fid) {
                this.fid = fid;
                return this;
            }

            /**
             * <p>The name of the SourceMap file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.js.map</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The time when the file was uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>1650272251</p>
             */
            public Builder uploadTime(String uploadTime) {
                this.uploadTime = uploadTime;
                return this;
            }

            public UploadResult build() {
                return new UploadResult(this);
            } 

        } 

    }
}
