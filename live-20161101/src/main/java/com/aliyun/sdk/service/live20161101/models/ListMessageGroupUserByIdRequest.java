// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMessageGroupUserByIdRequest} extends {@link RequestModel}
 *
 * <p>ListMessageGroupUserByIdRequest</p>
 */
public class ListMessageGroupUserByIdRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("UserIdList")
    private java.util.List < String > userIdList;

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
    public java.util.List < String > getUserIdList() {
        return this.userIdList;
    }

    public static final class Builder extends Request.Builder<ListMessageGroupUserByIdRequest, Builder> {
        private String appId; 
        private String groupId; 
        private java.util.List < String > userIdList; 

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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * UserIdList.
         */
        public Builder userIdList(java.util.List < String > userIdList) {
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
