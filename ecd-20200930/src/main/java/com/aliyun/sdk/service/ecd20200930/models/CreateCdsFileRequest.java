// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdsFileRequest} extends {@link RequestModel}
 *
 * <p>CreateCdsFileRequest</p>
 */
public class CreateCdsFileRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("ConflictPolicy")
    private String conflictPolicy;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("FileHash")
    private String fileHash;

    @Query
    @NameInMap("FileLength")
    @Validation(required = true)
    private Long fileLength;

    @Query
    @NameInMap("FileName")
    @Validation(required = true, maxLength = 256, minLength = 1)
    private String fileName;

    @Query
    @NameInMap("FileType")
    @Validation(required = true)
    private String fileType;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("ParentFileId")
    @Validation(required = true)
    private String parentFileId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CreateCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.conflictPolicy = builder.conflictPolicy;
        this.endUserId = builder.endUserId;
        this.fileHash = builder.fileHash;
        this.fileLength = builder.fileLength;
        this.fileName = builder.fileName;
        this.fileType = builder.fileType;
        this.groupId = builder.groupId;
        this.parentFileId = builder.parentFileId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdsFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return conflictPolicy
     */
    public String getConflictPolicy() {
        return this.conflictPolicy;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fileHash
     */
    public String getFileHash() {
        return this.fileHash;
    }

    /**
     * @return fileLength
     */
    public Long getFileLength() {
        return this.fileLength;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileType
     */
    public String getFileType() {
        return this.fileType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return parentFileId
     */
    public String getParentFileId() {
        return this.parentFileId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateCdsFileRequest, Builder> {
        private String cdsId; 
        private String conflictPolicy; 
        private String endUserId; 
        private String fileHash; 
        private Long fileLength; 
        private String fileName; 
        private String fileType; 
        private String groupId; 
        private String parentFileId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCdsFileRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.conflictPolicy = request.conflictPolicy;
            this.endUserId = request.endUserId;
            this.fileHash = request.fileHash;
            this.fileLength = request.fileLength;
            this.fileName = request.fileName;
            this.fileType = request.fileType;
            this.groupId = request.groupId;
            this.parentFileId = request.parentFileId;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The policy that is used when the file that you want to upload has the same name as an existing file in the cloud disk.
         * <p>
         * 
         * Valid values:
         * 
         * *   refuse
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     denies creating the file
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   auto_rename
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     automatically renames the file
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   ignore
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     allows the file to use the same name as the existing file in the cloud disk
         * 
         *     <!-- -->
         * 
         *     .
         * 
         * *   over_write
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     overwrites the existing file in the cloud disk
         * 
         *     <!-- -->
         * 
         *     .
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The hash value of the SHA1 algorithm that is used by the file.
         */
        public Builder fileHash(String fileHash) {
            this.putQueryParameter("FileHash", fileHash);
            this.fileHash = fileHash;
            return this;
        }

        /**
         * The file size. Unit: bytes.
         */
        public Builder fileLength(Long fileLength) {
            this.putQueryParameter("FileLength", fileLength);
            this.fileLength = fileLength;
            return this;
        }

        /**
         * The file name.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * The file type.
         * <p>
         * 
         * Valid values:
         * 
         * *   file
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   folder
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder fileType(String fileType) {
            this.putQueryParameter("FileType", fileType);
            this.fileType = fileType;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the parent folder.
         */
        public Builder parentFileId(String parentFileId) {
            this.putQueryParameter("ParentFileId", parentFileId);
            this.parentFileId = parentFileId;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateCdsFileRequest build() {
            return new CreateCdsFileRequest(this);
        } 

    } 

}
