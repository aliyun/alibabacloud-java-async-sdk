// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String description; 
        private String directoryId; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.groupName = request.groupName;
        } 

        /**
         * <p>The description of the group.</p>
         * <p>The description can be up to 1,024 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a group.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * <p>The name of the group.</p>
         * <p>The name can contain letters, digits, underscores (_), hyphens (-), and periods (.).</p>
         * <p>The name can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public CreateGroupRequest build() {
            return new CreateGroupRequest(this);
        } 

    } 

}
