// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CopyCdsFileRequest} extends {@link RequestModel}
 *
 * <p>CopyCdsFileRequest</p>
 */
public class CopyCdsFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRename")
    private Boolean autoRename;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileReceiverId")
    private String fileReceiverId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileReceiverType")
    private String fileReceiverType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentFolderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parentFolderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Specifies whether to automatically rename the file if a file that has the same name exists in the folder to which you want to copy the file. Default value: false.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>false</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRename(Boolean autoRename) {
            this.putQueryParameter("AutoRename", autoRename);
            this.autoRename = autoRename;
            return this;
        }

        /**
         * <p>The ID of the cloud disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-352282****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The user ID that you want to use to access the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The file ID. You can call the CreateCdsFile operation to query the file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>640985a0ca2f71f489d2497682ca0bf468de****</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>目标复制文件所在的个人空间ID（即UserId，您可以在DescribeCloudDriveUsers接口返回的报文中获取。）或者目标复制文件所在的团队空间ID（即GroupId，您可以在DescribeCloudDriveGroups接口返回的报文中获取。）</p>
         * <blockquote>
         * <p>FileReceiverId和FileReceiverType都为空时，默认复制到文件所在的个人空间。</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>user02</p>
         */
        public Builder fileReceiverId(String fileReceiverId) {
            this.putQueryParameter("FileReceiverId", fileReceiverId);
            this.fileReceiverId = fileReceiverId;
            return this;
        }

        /**
         * <p>文件所属的空间类型。</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
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
         * <p>The ID of the parent folder of the folder to which you want to copy the file. If you want to copy the file to the root directory, set this parameter to root.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder parentFolderId(String parentFolderId) {
            this.putQueryParameter("ParentFolderId", parentFolderId);
            this.parentFolderId = parentFolderId;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
