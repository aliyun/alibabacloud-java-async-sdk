// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link UpdateGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateGroupRequest</p>
 */
public class UpdateGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewComments")
    private String newComments;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDisplayName")
    private String newDisplayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewGroupName")
    private String newGroupName;

    private UpdateGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.newComments = builder.newComments;
        this.newDisplayName = builder.newDisplayName;
        this.newGroupName = builder.newGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return newComments
     */
    public String getNewComments() {
        return this.newComments;
    }

    /**
     * @return newDisplayName
     */
    public String getNewDisplayName() {
        return this.newDisplayName;
    }

    /**
     * @return newGroupName
     */
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateGroupRequest, Builder> {
        private String groupName; 
        private String newComments; 
        private String newDisplayName; 
        private String newGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.newComments = request.newComments;
            this.newDisplayName = request.newDisplayName;
            this.newGroupName = request.newGroupName;
        } 

        /**
         * <p>The name of the RAM user group.</p>
         * 
         * <strong>example:</strong>
         * <p>Dev-Team</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The new description.</p>
         * <p>The value can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-Team</p>
         */
        public Builder newComments(String newComments) {
            this.putQueryParameter("NewComments", newComments);
            this.newComments = newComments;
            return this;
        }

        /**
         * <p>The new display name of the RAM user group.</p>
         * <p>The name can be up to 24 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Test-Team</p>
         */
        public Builder newDisplayName(String newDisplayName) {
            this.putQueryParameter("NewDisplayName", newDisplayName);
            this.newDisplayName = newDisplayName;
            return this;
        }

        /**
         * <p>The new name of the RAM user group.</p>
         * <p>The name can be up to 64 characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>Test-Team</p>
         */
        public Builder newGroupName(String newGroupName) {
            this.putQueryParameter("NewGroupName", newGroupName);
            this.newGroupName = newGroupName;
            return this;
        }

        @Override
        public UpdateGroupRequest build() {
            return new UpdateGroupRequest(this);
        } 

    } 

}
