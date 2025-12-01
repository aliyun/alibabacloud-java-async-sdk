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
 * {@link RemoveFilePermissionRequest} extends {@link RequestModel}
 *
 * <p>RemoveFilePermissionRequest</p>
 */
public class RemoveFilePermissionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<MemberList> memberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private RemoveFilePermissionRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.groupId = builder.groupId;
        this.memberList = builder.memberList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveFilePermissionRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return memberList
     */
    public java.util.List<MemberList> getMemberList() {
        return this.memberList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<RemoveFilePermissionRequest, Builder> {
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private String groupId; 
        private java.util.List<MemberList> memberList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveFilePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.groupId = request.groupId;
            this.memberList = request.memberList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the enterprise drive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-066224****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The ID of the end user.</p>
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
         * <p>The file ID. You can call the <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> operation to query the ID of the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The ID of the team space.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-1fbmvrc7ug5m7****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The users that you want to authorize to use the cloud disk.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberList(java.util.List<MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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
        public RemoveFilePermissionRequest build() {
            return new RemoveFilePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveFilePermissionRequest} extends {@link TeaModel}
     *
     * <p>RemoveFilePermissionRequest</p>
     */
    public static class CdsIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CdsIdentity(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdsIdentity create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(CdsIdentity model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The user ID or group ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>249dsfseee643h33g3dv****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The object type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>IT_Group: group.</li>
             * <li>IT_User: user.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>IT_User</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CdsIdentity build() {
                return new CdsIdentity(this);
            } 

        } 

    }
    /**
     * 
     * {@link RemoveFilePermissionRequest} extends {@link TeaModel}
     *
     * <p>RemoveFilePermissionRequest</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdsIdentity")
        @com.aliyun.core.annotation.Validation(required = true)
        private CdsIdentity cdsIdentity;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleId;

        private MemberList(Builder builder) {
            this.cdsIdentity = builder.cdsIdentity;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return cdsIdentity
         */
        public CdsIdentity getCdsIdentity() {
            return this.cdsIdentity;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private CdsIdentity cdsIdentity; 
            private String roleId; 

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.cdsIdentity = model.cdsIdentity;
                this.roleId = model.roleId;
            } 

            /**
             * <p>The permission information.</p>
             * <p>This parameter is required.</p>
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * <p>You can set permissions by specifying roles or by customizing operation permissions. This field is used to set permissions by specifying roles. This field is mutually exclusive with <code>ActionList</code>.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SystemFileEditorWithoutShareLink: the role that has the permissions to edit files but cannot share files.</li>
             * <li>SystemFileUploaderAndDownloaderWithShareLink: the role that has the permissions to upload, download, and share files.</li>
             * <li>SystemFileDownloader: the role that has the permissions to download files.</li>
             * <li>SystemFileEditorWithoutDelete: the role that has the permissions to edit files but cannot delete files.</li>
             * <li>SystemFileOwner: the role that has the permissions to collaborate with others.</li>
             * <li>SystemFileDownloaderWithShareLink: the role that has the permissions to download and share files</li>
             * <li>SystemFileUploaderAndViewer: the role that has the permissions to preview or upload files.</li>
             * <li>SystemFileViewer: the role that has the permissions to preview files.</li>
             * <li>SystemFileEditor: the role that has the permissions to edit files</li>
             * <li>SystemFileUploaderWithShareLink: the role that has the permissions to upload or share files.</li>
             * <li>SystemFileUploader: the role that has the permission to upload files.</li>
             * <li>SystemFileUploaderAndDownloader: the role that has the permissions to upload or download files.</li>
             * <li>SystemFileMetaViewer: the role that has the permissions to view files</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemFileUploaderAndDownloader</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
}
