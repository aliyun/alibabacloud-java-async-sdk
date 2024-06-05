// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFileRequest} extends {@link RequestModel}
 *
 * <p>CreateFileRequest</p>
 */
public class CreateFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("check_name_mode")
    private String checkNameMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content_hash")
    private String contentHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content_hash_name")
    private String contentHashName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content_type")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("hidden")
    private Boolean hidden;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("image_media_metadata")
    private ImageMediaMetadata imageMediaMetadata;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("local_created_at")
    private String localCreatedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("local_modified_at")
    private String localModifiedAt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parallel_upload")
    private Boolean parallelUpload;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parent_file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("part_info_list")
    private java.util.List < PartInfoList> partInfoList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pre_hash")
    private String preHash;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("size")
    private Long size;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_tags")
    private java.util.List < UserTag > userTags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("video_media_metadata")
    private VideoMediaMetadata videoMediaMetadata;

    private CreateFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.checkNameMode = builder.checkNameMode;
        this.contentHash = builder.contentHash;
        this.contentHashName = builder.contentHashName;
        this.contentType = builder.contentType;
        this.description = builder.description;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.hidden = builder.hidden;
        this.imageMediaMetadata = builder.imageMediaMetadata;
        this.localCreatedAt = builder.localCreatedAt;
        this.localModifiedAt = builder.localModifiedAt;
        this.name = builder.name;
        this.parallelUpload = builder.parallelUpload;
        this.parentFileId = builder.parentFileId;
        this.partInfoList = builder.partInfoList;
        this.preHash = builder.preHash;
        this.shareId = builder.shareId;
        this.size = builder.size;
        this.type = builder.type;
        this.userTags = builder.userTags;
        this.videoMediaMetadata = builder.videoMediaMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFileRequest create() {
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
     * @return checkNameMode
     */
    public String getCheckNameMode() {
        return this.checkNameMode;
    }

    /**
     * @return contentHash
     */
    public String getContentHash() {
        return this.contentHash;
    }

    /**
     * @return contentHashName
     */
    public String getContentHashName() {
        return this.contentHashName;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return hidden
     */
    public Boolean getHidden() {
        return this.hidden;
    }

    /**
     * @return imageMediaMetadata
     */
    public ImageMediaMetadata getImageMediaMetadata() {
        return this.imageMediaMetadata;
    }

    /**
     * @return localCreatedAt
     */
    public String getLocalCreatedAt() {
        return this.localCreatedAt;
    }

    /**
     * @return localModifiedAt
     */
    public String getLocalModifiedAt() {
        return this.localModifiedAt;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parallelUpload
     */
    public Boolean getParallelUpload() {
        return this.parallelUpload;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
    }

    /**
     * @return partInfoList
     */
    public java.util.List < PartInfoList> getPartInfoList() {
        return this.partInfoList;
    }

    /**
     * @return preHash
     */
    public String getPreHash() {
        return this.preHash;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userTags
     */
    public java.util.List < UserTag > getUserTags() {
        return this.userTags;
    }

    /**
     * @return videoMediaMetadata
     */
    public VideoMediaMetadata getVideoMediaMetadata() {
        return this.videoMediaMetadata;
    }

    public static final class Builder extends Request.Builder<CreateFileRequest, Builder> {
        private String domainId; 
        private String checkNameMode; 
        private String contentHash; 
        private String contentHashName; 
        private String contentType; 
        private String description; 
        private String driveId; 
        private String fileId; 
        private Boolean hidden; 
        private ImageMediaMetadata imageMediaMetadata; 
        private String localCreatedAt; 
        private String localModifiedAt; 
        private String name; 
        private Boolean parallelUpload; 
        private String parentFileId; 
        private java.util.List < PartInfoList> partInfoList; 
        private String preHash; 
        private String shareId; 
        private Long size; 
        private String type; 
        private java.util.List < UserTag > userTags; 
        private VideoMediaMetadata videoMediaMetadata; 

        private Builder() {
            super();
        } 

        private Builder(CreateFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.checkNameMode = request.checkNameMode;
            this.contentHash = request.contentHash;
            this.contentHashName = request.contentHashName;
            this.contentType = request.contentType;
            this.description = request.description;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.hidden = request.hidden;
            this.imageMediaMetadata = request.imageMediaMetadata;
            this.localCreatedAt = request.localCreatedAt;
            this.localModifiedAt = request.localModifiedAt;
            this.name = request.name;
            this.parallelUpload = request.parallelUpload;
            this.parentFileId = request.parentFileId;
            this.partInfoList = request.partInfoList;
            this.preHash = request.preHash;
            this.shareId = request.shareId;
            this.size = request.size;
            this.type = request.type;
            this.userTags = request.userTags;
            this.videoMediaMetadata = request.videoMediaMetadata;
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
         * The processing method that is used if the file that you want to create has the same name as an existing file in the cloud. Valid values:
         * <p>
         * 
         * ignore: allows you to create the file by using the same name as an existing file in the cloud.
         * 
         * auto_rename: automatically renames the file that you want to create. By default, the current point in time is added to the end of the file name. Example: xxx\_20060102\_150405.
         * 
         * refuse: does not create the file that you want to create but returns the information about the file that has the same name in the cloud.
         * 
         * Default value: ignore.
         */
        public Builder checkNameMode(String checkNameMode) {
            this.putBodyParameter("check_name_mode", checkNameMode);
            this.checkNameMode = checkNameMode;
            return this;
        }

        /**
         * The hash value of the file content. The value is calculated based on the algorithm specified by content_hash_name.
         */
        public Builder contentHash(String contentHash) {
            this.putBodyParameter("content_hash", contentHash);
            this.contentHash = contentHash;
            return this;
        }

        /**
         * The name of the algorithm that is used to calculate the hash value of the file content. Only SHA1 is supported.
         */
        public Builder contentHashName(String contentHashName) {
            this.putBodyParameter("content_hash_name", contentHashName);
            this.contentHashName = contentHashName;
            return this;
        }

        /**
         * The type of the file content. Default value: application/oct-stream.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("content_type", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * The description of the file. The description can be up to 1,024 characters in length. By default, this parameter is left empty.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The drive ID. This parameter is required if the file is not uploaded by using the share URL of the file.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID. This parameter is required if check_name_mode is set to ignore.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * Specifies whether to hide the file or folder. By default, the file or folder is not hidden.
         */
        public Builder hidden(Boolean hidden) {
            this.putBodyParameter("hidden", hidden);
            this.hidden = hidden;
            return this;
        }

        /**
         * The information about the image specified by the client.
         */
        public Builder imageMediaMetadata(ImageMediaMetadata imageMediaMetadata) {
            this.putBodyParameter("image_media_metadata", imageMediaMetadata);
            this.imageMediaMetadata = imageMediaMetadata;
            return this;
        }

        /**
         * The time when the local file was created. By default, this parameter is left empty. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.
         */
        public Builder localCreatedAt(String localCreatedAt) {
            this.putBodyParameter("local_created_at", localCreatedAt);
            this.localCreatedAt = localCreatedAt;
            return this;
        }

        /**
         * The time when the local file was modified. By default, this parameter is left empty. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format based on the UTC+0 time zone.
         */
        public Builder localModifiedAt(String localModifiedAt) {
            this.putBodyParameter("local_modified_at", localModifiedAt);
            this.localModifiedAt = localModifiedAt;
            return this;
        }

        /**
         * The name of the file. The name can be up to 1,024 bytes in length based on the UTF-8 encoding rule and cannot end with a forward slash (/).
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * Specifies whether to enable the parallel upload feature.
         */
        public Builder parallelUpload(Boolean parallelUpload) {
            this.putBodyParameter("parallel_upload", parallelUpload);
            this.parallelUpload = parallelUpload;
            return this;
        }

        /**
         * The ID of the parent directory. If you want to create a file or folder in the root directory, set this parameter to root.
         */
        public Builder parentFileId(String parentFileId) {
            this.putBodyParameter("parent_file_id", parentFileId);
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * The information about the file parts. You can specify up to 10,000 parts. By default, if you do not specify this parameter, only one part is returned.
         */
        public Builder partInfoList(java.util.List < PartInfoList> partInfoList) {
            this.putBodyParameter("part_info_list", partInfoList);
            this.partInfoList = partInfoList;
            return this;
        }

        /**
         * The SHA-1 hash value of the first 1 KB data of the file. This parameter is required if you perform instant file upload by using the pre-hashing feature. If the SHA-1 hash value is not matched on the cloud, the client does not need to calculate the SHA-1 hash value of the entire file.
         */
        public Builder preHash(String preHash) {
            this.putBodyParameter("pre_hash", preHash);
            this.preHash = preHash;
            return this;
        }

        /**
         * The share ID. This parameter is required if the file is uploaded by using the share URL of the file.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        /**
         * The size of the file. Unit: bytes.
         */
        public Builder size(Long size) {
            this.putBodyParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * The type of the file. Valid values:
         * <p>
         * 
         * file folder
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * The custom tags. You can specify up to 1,000 tags.
         */
        public Builder userTags(java.util.List < UserTag > userTags) {
            this.putBodyParameter("user_tags", userTags);
            this.userTags = userTags;
            return this;
        }

        /**
         * The information about the video specified by the client.
         */
        public Builder videoMediaMetadata(VideoMediaMetadata videoMediaMetadata) {
            this.putBodyParameter("video_media_metadata", videoMediaMetadata);
            this.videoMediaMetadata = videoMediaMetadata;
            return this;
        }

        @Override
        public CreateFileRequest build() {
            return new CreateFileRequest(this);
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
             * The size of the file content before the file part. Unit: bytes. The value must be a multiple of 64. This parameter takes effect only if the parallel upload feature is enabled.
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
    public static class PartInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content_md5")
        private String contentMd5;

        @com.aliyun.core.annotation.NameInMap("parallel_sha1_ctx")
        private ParallelSha1Ctx parallelSha1Ctx;

        @com.aliyun.core.annotation.NameInMap("part_number")
        private Integer partNumber;

        private PartInfoList(Builder builder) {
            this.contentMd5 = builder.contentMd5;
            this.parallelSha1Ctx = builder.parallelSha1Ctx;
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
         * @return parallelSha1Ctx
         */
        public ParallelSha1Ctx getParallelSha1Ctx() {
            return this.parallelSha1Ctx;
        }

        /**
         * @return partNumber
         */
        public Integer getPartNumber() {
            return this.partNumber;
        }

        public static final class Builder {
            private String contentMd5; 
            private ParallelSha1Ctx parallelSha1Ctx; 
            private Integer partNumber; 

            /**
             * The MD5 hash value of the file part. This parameter is required when the MD5 hash value of the file part needs to be verified during part upload.
             */
            public Builder contentMd5(String contentMd5) {
                this.contentMd5 = contentMd5;
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
             * The serial number of a file part. The number starts from 1.
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
