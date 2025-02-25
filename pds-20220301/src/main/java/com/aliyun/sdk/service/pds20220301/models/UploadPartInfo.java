// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link UploadPartInfo} extends {@link TeaModel}
 *
 * <p>UploadPartInfo</p>
 */
public class UploadPartInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("etag")
    private String etag;

    @com.aliyun.core.annotation.NameInMap("internal_upload_url")
    private String internalUploadUrl;

    @com.aliyun.core.annotation.NameInMap("parallel_sha1_ctx")
    private ParallelSha1Ctx parallelSha1Ctx;

    @com.aliyun.core.annotation.NameInMap("parallel_sha256_ctx")
    private ParallelSha256Ctx parallelSha256Ctx;

    @com.aliyun.core.annotation.NameInMap("part_number")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer partNumber;

    @com.aliyun.core.annotation.NameInMap("part_size")
    private Long partSize;

    @com.aliyun.core.annotation.NameInMap("upload_url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadUrl;

    private UploadPartInfo(Builder builder) {
        this.etag = builder.etag;
        this.internalUploadUrl = builder.internalUploadUrl;
        this.parallelSha1Ctx = builder.parallelSha1Ctx;
        this.parallelSha256Ctx = builder.parallelSha256Ctx;
        this.partNumber = builder.partNumber;
        this.partSize = builder.partSize;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPartInfo create() {
        return builder().build();
    }

    /**
     * @return etag
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * @return internalUploadUrl
     */
    public String getInternalUploadUrl() {
        return this.internalUploadUrl;
    }

    /**
     * @return parallelSha1Ctx
     */
    public ParallelSha1Ctx getParallelSha1Ctx() {
        return this.parallelSha1Ctx;
    }

    /**
     * @return parallelSha256Ctx
     */
    public ParallelSha256Ctx getParallelSha256Ctx() {
        return this.parallelSha256Ctx;
    }

    /**
     * @return partNumber
     */
    public Integer getPartNumber() {
        return this.partNumber;
    }

    /**
     * @return partSize
     */
    public Long getPartSize() {
        return this.partSize;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder {
        private String etag; 
        private String internalUploadUrl; 
        private ParallelSha1Ctx parallelSha1Ctx; 
        private ParallelSha256Ctx parallelSha256Ctx; 
        private Integer partNumber; 
        private Long partSize; 
        private String uploadUrl; 

        /**
         * etag.
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * internal_upload_url.
         */
        public Builder internalUploadUrl(String internalUploadUrl) {
            this.internalUploadUrl = internalUploadUrl;
            return this;
        }

        /**
         * parallel_sha1_ctx.
         */
        public Builder parallelSha1Ctx(ParallelSha1Ctx parallelSha1Ctx) {
            this.parallelSha1Ctx = parallelSha1Ctx;
            return this;
        }

        /**
         * parallel_sha256_ctx.
         */
        public Builder parallelSha256Ctx(ParallelSha256Ctx parallelSha256Ctx) {
            this.parallelSha256Ctx = parallelSha256Ctx;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder partNumber(Integer partNumber) {
            this.partNumber = partNumber;
            return this;
        }

        /**
         * part_size.
         */
        public Builder partSize(Long partSize) {
            this.partSize = partSize;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public UploadPartInfo build() {
            return new UploadPartInfo(this);
        } 

    } 

    /**
     * 
     * {@link UploadPartInfo} extends {@link TeaModel}
     *
     * <p>UploadPartInfo</p>
     */
    public static class ParallelSha1Ctx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private java.util.List<Long> h;

        @com.aliyun.core.annotation.NameInMap("part_offset")
        private Long partOffset;

        private ParallelSha1Ctx(Builder builder) {
            this.h = builder.h;
            this.partOffset = builder.partOffset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParallelSha1Ctx create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public java.util.List<Long> getH() {
            return this.h;
        }

        /**
         * @return partOffset
         */
        public Long getPartOffset() {
            return this.partOffset;
        }

        public static final class Builder {
            private java.util.List<Long> h; 
            private Long partOffset; 

            /**
             * h.
             */
            public Builder h(java.util.List<Long> h) {
                this.h = h;
                return this;
            }

            /**
             * part_offset.
             */
            public Builder partOffset(Long partOffset) {
                this.partOffset = partOffset;
                return this;
            }

            public ParallelSha1Ctx build() {
                return new ParallelSha1Ctx(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadPartInfo} extends {@link TeaModel}
     *
     * <p>UploadPartInfo</p>
     */
    public static class ParallelSha256Ctx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private java.util.List<Long> h;

        @com.aliyun.core.annotation.NameInMap("part_offset")
        private Long partOffset;

        private ParallelSha256Ctx(Builder builder) {
            this.h = builder.h;
            this.partOffset = builder.partOffset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParallelSha256Ctx create() {
            return builder().build();
        }

        /**
         * @return h
         */
        public java.util.List<Long> getH() {
            return this.h;
        }

        /**
         * @return partOffset
         */
        public Long getPartOffset() {
            return this.partOffset;
        }

        public static final class Builder {
            private java.util.List<Long> h; 
            private Long partOffset; 

            /**
             * h.
             */
            public Builder h(java.util.List<Long> h) {
                this.h = h;
                return this;
            }

            /**
             * part_offset.
             */
            public Builder partOffset(Long partOffset) {
                this.partOffset = partOffset;
                return this;
            }

            public ParallelSha256Ctx build() {
                return new ParallelSha256Ctx(this);
            } 

        } 

    }
}
