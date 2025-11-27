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
 * {@link UserBatchQuitGroupRequest} extends {@link RequestModel}
 *
 * <p>UserBatchQuitGroupRequest</p>
 */
public class UserBatchQuitGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    private UserBatchQuitGroupRequest(Builder builder) {
        super(builder);
        this.endUserIds = builder.endUserIds;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserBatchQuitGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    public static final class Builder extends Request.Builder<UserBatchQuitGroupRequest, Builder> {
        private java.util.List<String> endUserIds; 
        private String groupId; 

        private Builder() {
            super();
        } 

        private Builder(UserBatchQuitGroupRequest request) {
            super(request);
            this.endUserIds = request.endUserIds;
            this.groupId = request.groupId;
        } 

        /**
         * <p>The user IDs.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The ID of the user group.</p>
         * 
         * <strong>example:</strong>
         * <p>ug-lkuvalovhnlxvv****</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        @Override
        public UserBatchQuitGroupRequest build() {
            return new UserBatchQuitGroupRequest(this);
        } 

    } 

}
