// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddUserToGroupRequest} extends {@link RequestModel}
 *
 * <p>AddUserToGroupRequest</p>
 */
public class AddUserToGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private AddUserToGroupRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.groupId = builder.groupId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<AddUserToGroupRequest, Builder> {
        private String directoryId; 
        private String groupId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserToGroupRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.groupId = request.groupId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the directory.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The ID of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>g-00jqzghi2n3o5hkh****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>u-00q8wbq42wiltcrk****</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public AddUserToGroupRequest build() {
            return new AddUserToGroupRequest(this);
        } 

    } 

}
