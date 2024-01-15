// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopyCdsFileRequest} extends {@link RequestModel}
 *
 * <p>CopyCdsFileRequest</p>
 */
public class CopyCdsFileRequest extends Request {
    @Query
    @NameInMap("AutoRename")
    private Boolean autoRename;

    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    private String endUserId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("FileReceiverId")
    private String fileReceiverId;

    @Query
    @NameInMap("FileReceiverType")
    private String fileReceiverType;

    @Query
    @NameInMap("GroupId")
    private String groupId;

    @Query
    @NameInMap("ParentFolderId")
    @Validation(required = true)
    private String parentFolderId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private CopyCdsFileRequest(Builder builder) {
        super(builder);
        this.autoRename = builder.autoRename;
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.fileReceiverId = builder.fileReceiverId;
        this.fileReceiverType = builder.fileReceiverType;
        this.groupId = builder.groupId;
        this.parentFolderId = builder.parentFolderId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyCdsFileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRename
     */
    public Boolean getAutoRename() {
        return this.autoRename;
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
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
     * @return fileReceiverId
     */
    public String getFileReceiverId() {
        return this.fileReceiverId;
    }

    /**
     * @return fileReceiverType
     */
    public String getFileReceiverType() {
        return this.fileReceiverType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return parentFolderId
     */
    public String getParentFolderId() {
        return this.parentFolderId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CopyCdsFileRequest, Builder> {
        private Boolean autoRename; 
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private String fileReceiverId; 
        private String fileReceiverType; 
        private String groupId; 
        private String parentFolderId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CopyCdsFileRequest request) {
            super(request);
            this.autoRename = request.autoRename;
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.fileReceiverId = request.fileReceiverId;
            this.fileReceiverType = request.fileReceiverType;
            this.groupId = request.groupId;
            this.parentFolderId = request.parentFolderId;
            this.regionId = request.regionId;
        } 

        /**
         * Specifies whether to automatically rename the file if a file that has the same name exists in the folder to which you want to copy the file. Default value: false.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder autoRename(Boolean autoRename) {
            this.putQueryParameter("AutoRename", autoRename);
            this.autoRename = autoRename;
            return this;
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
         * The user ID that you want to use to access the cloud disk.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The file ID. You can call the CreateCdsFile operation to query the file ID.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * 目标复制文件所在的个人空间ID（即UserId，您可以在DescribeCloudDriveUsers接口返回的报文中获取。）或者目标复制文件所在的团队空间ID（即GroupId，您可以在DescribeCloudDriveGroups接口返回的报文中获取。）
         * <p>
         * > FileReceiverId和FileReceiverType都为空时，默认复制到文件所在的个人空间。
         * >
         */
        public Builder fileReceiverId(String fileReceiverId) {
            this.putQueryParameter("FileReceiverId", fileReceiverId);
            this.fileReceiverId = fileReceiverId;
            return this;
        }

        /**
         * 文件所属的空间类型。
         */
        public Builder fileReceiverType(String fileReceiverType) {
            this.putQueryParameter("FileReceiverType", fileReceiverType);
            this.fileReceiverType = fileReceiverType;
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
         * The ID of the parent folder of the folder to which you want to copy the file. If you want to copy the file to the root directory, set this parameter to root.
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
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
        public CopyCdsFileRequest build() {
            return new CopyCdsFileRequest(this);
        } 

    } 

}
