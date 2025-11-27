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
 * {@link RemoveGroupRequest} extends {@link RequestModel}
 *
 * <p>RemoveGroupRequest</p>
 */
public class RemoveGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    private RemoveGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.groupIds = builder.groupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    public static final class Builder extends Request.Builder<RemoveGroupRequest, Builder> {
        private String groupId; 
        private java.util.List<String> groupIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.groupIds = request.groupIds;
        } 

        /**
         * <p>The ID of the user group to be deleted.</p>
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
         * <p>The IDs of the user groups to be deleted.</p>
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        @Override
        public RemoveGroupRequest build() {
            return new RemoveGroupRequest(this);
        } 

    } 

}
