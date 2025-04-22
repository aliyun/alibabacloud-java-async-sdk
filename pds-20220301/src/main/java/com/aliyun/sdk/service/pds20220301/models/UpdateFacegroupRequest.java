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
 * {@link UpdateFacegroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateFacegroupRequest</p>
 */
public class UpdateFacegroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_cover_face_id")
    private String groupCoverFaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("group_name")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String remarks;

    private UpdateFacegroupRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.groupCoverFaceId = builder.groupCoverFaceId;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.remarks = builder.remarks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFacegroupRequest create() {
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
     * @return groupCoverFaceId
     */
    public String getGroupCoverFaceId() {
        return this.groupCoverFaceId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    public static final class Builder extends Request.Builder<UpdateFacegroupRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String groupCoverFaceId; 
        private String groupId; 
        private String groupName; 
        private String remarks; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFacegroupRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.groupCoverFaceId = request.groupCoverFaceId;
            this.groupId = request.groupId;
            this.groupName = request.groupName;
            this.remarks = request.remarks;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The face ID of the thumbnail of the face-based group. You can obtain the face ID from the <strong>image_media_metadata</strong> parameter in the returned results of the GetFile, ListFile, or SearchFile operation.</p>
         * 
         * <strong>example:</strong>
         * <p>face1</p>
         */
        public Builder groupCoverFaceId(String groupCoverFaceId) {
            this.putBodyParameter("group_cover_face_id", groupCoverFaceId);
            this.groupCoverFaceId = groupCoverFaceId;
            return this;
        }

        /**
         * <p>The ID of the face-based group. You can call the ListFacegroups operation to query the group ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group-abc</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("group_id", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the face-based group. The name can be up to 128 characters in length.</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("group_name", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The remarks. The remarks can be up to 128 characters in length.</p>
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        @Override
        public UpdateFacegroupRequest build() {
            return new UpdateFacegroupRequest(this);
        } 

    } 

}
