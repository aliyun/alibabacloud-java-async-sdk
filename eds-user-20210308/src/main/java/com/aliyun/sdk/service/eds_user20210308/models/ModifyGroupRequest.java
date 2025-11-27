// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link ModifyGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupRequest</p>
 */
public class ModifyGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newGroupName;

    private ModifyGroupRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.groupId = builder.groupId;
        this.newGroupName = builder.newGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return newGroupName
     */
    public String getNewGroupName() {
        return this.newGroupName;
    }

    public static final class Builder extends Request.Builder<ModifyGroupRequest, Builder> {
        private String description; 
        private String groupId; 
        private String newGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupRequest request) {
            super(request);
            this.description = request.description;
            this.groupId = request.groupId;
            this.newGroupName = request.newGroupName;
        } 

        /**
         * <p>The new description of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the user group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-12341234****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the new user group.</p>
         * <p>This parameter is required.</p>
         */
        public Builder newGroupName(String newGroupName) {
            this.putQueryParameter("NewGroupName", newGroupName);
            this.newGroupName = newGroupName;
            return this;
        }

        @Override
        public ModifyGroupRequest build() {
            return new ModifyGroupRequest(this);
        } 

    } 

}
