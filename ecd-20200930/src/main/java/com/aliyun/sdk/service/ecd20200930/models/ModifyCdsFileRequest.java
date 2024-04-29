// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyCdsFileRequest</p>
 */
public class ModifyCdsFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConflictPolicy")
    private String conflictPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 1024, minLength = 1)
    private String fileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyCdsFileRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.conflictPolicy = builder.conflictPolicy;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.fileName = builder.fileName;
        this.groupId = builder.groupId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdsFileRequest create() {
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
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyCdsFileRequest, Builder> {
        private String cdsId; 
        private String conflictPolicy; 
        private String endUserId; 
        private String fileId; 
        private String fileName; 
        private String groupId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCdsFileRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.conflictPolicy = request.conflictPolicy;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.fileName = request.fileName;
            this.groupId = request.groupId;
            this.regionId = request.regionId;
        } 

        /**
         * The cloud disk ID.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The processing mode of files that have the same name.
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
         *     refuses to create a file that has the same name as the file in the cloud.
         * 
         *     <!-- -->
         * 
         * *   auto_rename
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     automatically renames a file if the file has the same name as another file. By default, the current point in time is appended. Example: xxx20060102\_150405.
         * 
         *     <!-- -->
         * 
         * *   ignore
         * 
         *     <!-- -->
         * 
         *     :
         * 
         *     <!-- -->
         * 
         *     allows files with the same name.
         * 
         *     <!-- -->
         */
        public Builder conflictPolicy(String conflictPolicy) {
            this.putQueryParameter("ConflictPolicy", conflictPolicy);
            this.conflictPolicy = conflictPolicy;
            return this;
        }

        /**
         * The ID of the end user who uses the cloud disk.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
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
         * The group ID.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyCdsFileRequest build() {
            return new ModifyCdsFileRequest(this);
        } 

    } 

}
