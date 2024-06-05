// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GetUploadUrlRequest</p>
 */
public class GetUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("part_info_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < PartInfoList> partInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("upload_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uploadId;

    private GetUploadUrlRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.partInfoList = builder.partInfoList;
        this.shareId = builder.shareId;
        this.uploadId = builder.uploadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return partInfoList
     */
    public java.util.List < PartInfoList> getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return uploadId
     */
    public String getUploadId() {
        return this.uploadId;
    }

    public static final class Builder extends Request.Builder<GetUploadUrlRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List < PartInfoList> partInfoList; 
        private String shareId; 
        private String uploadId; 

        private Builder() {
            super();
        } 

        private Builder(GetUploadUrlRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.partInfoList = request.partInfoList;
            this.shareId = request.shareId;
            this.uploadId = request.uploadId;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The information about the file parts.
         */
        public Builder partInfoList(java.util.List < PartInfoList> partInfoList) {
            this.putBodyParameter("part_info_list", partInfoList);
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * The share ID.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The ID of the upload task.
         */
        public Builder uploadId(String uploadId) {
            this.putBodyParameter("upload_id", uploadId);
            this.uploadId = uploadId;
            return this;
        }

        @Override
        public GetUploadUrlRequest build() {
            return new GetUploadUrlRequest(this);
        } 

    } 

    public static class ParallelSha1Ctx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private java.util.List < Long > h;

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
        public java.util.List < Long > getH() {
            return this.h;
        }

        /**
         * @return partOffset
         */
        public Long getPartOffset() {
            return this.partOffset;
        }

        public static final class Builder {
            private java.util.List < Long > h; 
            private Long partOffset; 

            /**
             * The first to fifth 32-bit variables of the SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.
             */
            public Builder h(java.util.List < Long > h) {
                this.h = h;
                return this;
            }

            /**
             * The size of the file part. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.
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
    public static class ParallelSha256Ctx extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("h")
        private java.util.List < Long > h;

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
        public java.util.List < Long > getH() {
            return this.h;
        }

        /**
         * @return partOffset
         */
        public Long getPartOffset() {
            return this.partOffset;
        }

        public static final class Builder {
            private java.util.List < Long > h; 
            private Long partOffset; 

            /**
             * The first to fifth 32-bit variables of the SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.
             */
            public Builder h(java.util.List < Long > h) {
                this.h = h;
                return this;
            }

            /**
             * The size of the file part. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.
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
    public static class PartInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content_md5")
        private String contentMd5;

        @com.aliyun.core.annotation.NameInMap("content_type")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("parallel_sha1_ctx")
        private ParallelSha1Ctx parallelSha1Ctx;

        @com.aliyun.core.annotation.NameInMap("parallel_sha256_ctx")
        private ParallelSha256Ctx parallelSha256Ctx;

        @com.aliyun.core.annotation.NameInMap("part_number")
        private Integer partNumber;

        private PartInfoList(Builder builder) {
            this.contentMd5 = builder.contentMd5;
            this.contentType = builder.contentType;
            this.parallelSha1Ctx = builder.parallelSha1Ctx;
            this.parallelSha256Ctx = builder.parallelSha256Ctx;
            this.partNumber = builder.partNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartInfoList create() {
            return builder().build();
        }

        /**
         * @return contentMd5
         */
        public String getContentMd5() {
            return this.contentMd5;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
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

        public static final class Builder {
            private String contentMd5; 
            private String contentType; 
            private ParallelSha1Ctx parallelSha1Ctx; 
            private ParallelSha256Ctx parallelSha256Ctx; 
            private Integer partNumber; 

            /**
             * content_md5.
             */
            public Builder contentMd5(String contentMd5) {
                this.contentMd5 = contentMd5;
                return this;
            }

            /**
             * content_type.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * The SHA-1 hash value of the file content before the file part. This parameter takes effect only if the parallel upload feature is enabled.
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
             * The serial number of a part.
             */
            public Builder partNumber(Integer partNumber) {
                this.partNumber = partNumber;
                return this;
            }

            public PartInfoList build() {
                return new PartInfoList(this);
            } 

        } 

    }
}
