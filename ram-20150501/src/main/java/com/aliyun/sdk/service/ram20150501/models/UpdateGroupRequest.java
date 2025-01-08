// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
    @com.aliyun.core.annotation.NameInMap("NewGroupName")
    private String newGroupName;

    private UpdateGroupRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.newComments = builder.newComments;
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
     * @return newGroupName
     */
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateGroupRequest, Builder> {
        private String groupName; 
        private String newComments; 
        private String newGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGroupRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.newComments = request.newComments;
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
         * <p>The new description of the RAM user group.</p>
         * <p>The comments must be 1 to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>NewDev-Team</p>
         */
        public Builder newComments(String newComments) {
            this.putQueryParameter("NewComments", newComments);
            this.newComments = newComments;
            return this;
        }

        /**
         * <p>The new name of the RAM user group.</p>
         * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), hyphens (-), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>NewDev-Team</p>
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
