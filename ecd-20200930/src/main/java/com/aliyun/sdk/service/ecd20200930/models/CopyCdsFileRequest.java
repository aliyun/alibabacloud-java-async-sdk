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
         * <p>Specifies whether to automatically rename the file when a file with the same name already exists in the destination folder.</p>
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
         * <p>The enterprise cloud drive ID.</p>
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
         * <p>The ID of the user who is logged on to the cloud drive.</p>
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
         * <p>The file ID. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the file.</p>
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
         * <p>The ID of the personal drive (which can be obtained from the UserId response parameter of the <a href="https://help.aliyun.com/document_detail/2357237.html">DescribeCloudDriveUsers</a> operation) or the team space ID (which can be obtained from the GroupId response parameter of the <a href="https://help.aliyun.com/document_detail/609896.html">DescribeCloudDriveGroups</a> operation) at the destination.</p>
         * <blockquote>
         * <p>If both FileReceiverId and FileReceiverType are empty, the file is copied to the personal drive where the file currently resides by default.</p>
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
         * <p>The type of the space to which the file belongs.</p>
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
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-hs3i1w39o68ma****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the parent folder at the destination. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the ID of the folder. Set this parameter to <code>root</code> if you want to copy the file or folder to the root directory.</p>
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
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
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
