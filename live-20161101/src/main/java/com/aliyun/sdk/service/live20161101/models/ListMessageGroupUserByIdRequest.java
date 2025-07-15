// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ListMessageGroupUserByIdRequest} extends {@link RequestModel}
 *
 * <p>ListMessageGroupUserByIdRequest</p>
 */
public class ListMessageGroupUserByIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserIdList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userIdList;

    private ListMessageGroupUserByIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.groupId = builder.groupId;
        this.userIdList = builder.userIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMessageGroupUserByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return userIdList
     */
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<ListMessageGroupUserByIdRequest, Builder> {
        private String appId; 
        private String groupId; 
        private java.util.List<String> userIdList; 

        private Builder() {
            super();
        } 

        private Builder(ListMessageGroupUserByIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.groupId = request.groupId;
            this.userIdList = request.userIdList;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the message group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of users.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userIdList(java.util.List<String> userIdList) {
            String userIdListShrink = shrink(userIdList, "UserIdList", "simple");
            this.putBodyParameter("UserIdList", userIdListShrink);
            this.userIdList = userIdList;
            return this;
        }

        @Override
        public ListMessageGroupUserByIdRequest build() {
            return new ListMessageGroupUserByIdRequest(this);
        } 

    } 

}
