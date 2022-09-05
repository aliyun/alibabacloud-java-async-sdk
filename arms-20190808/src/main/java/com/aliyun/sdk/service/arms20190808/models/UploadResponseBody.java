// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadResponseBody} extends {@link TeaModel}
 *
 * <p>UploadResponseBody</p>
 */
public class UploadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadResult")
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadResult.
         */
        public Builder uploadResult(UploadResult uploadResult) {
            this.uploadResult = uploadResult;
            return this;
        }

        public UploadResponseBody build() {
            return new UploadResponseBody(this);
        } 

    } 

    public static class UploadResult extends TeaModel {
        @NameInMap("Fid")
        private String fid;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("UploadTime")
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
             * Fid.
             */
            public Builder fid(String fid) {
                this.fid = fid;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * UploadTime.
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
