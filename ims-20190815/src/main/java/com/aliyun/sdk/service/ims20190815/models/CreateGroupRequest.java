// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateGroupRequest</p>
 */
public class CreateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Comments")
    private String comments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private CreateGroupRequest(Builder builder) {
        super(builder);
        this.comments = builder.comments;
        this.displayName = builder.displayName;
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
     * @return comments
     */
    public String getComments() {
        return this.comments;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<CreateGroupRequest, Builder> {
        private String comments; 
        private String displayName; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(CreateGroupRequest request) {
            super(request);
            this.comments = request.comments;
            this.displayName = request.displayName;
            this.groupName = request.groupName;
        } 

        /**
         * The description.
         * <p>
         * 
         * The value can be up to 128 characters in length.
         */
        public Builder comments(String comments) {
            this.putQueryParameter("Comments", comments);
            this.comments = comments;
            return this;
        }

        /**
         * The display name of the RAM user group.
         * <p>
         * 
         * The name can be up to 24 characters in length.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The name of the RAM user group. You must specify this parameter.
         * <p>
         * 
         * The name can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-).
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
