// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserGroupRequest</p>
 */
public class UpdateUserGroupRequest extends Request {
    @Body
    @NameInMap("CorpId")
    private String corpId;

    @Body
    @NameInMap("IsvSubId")
    @Validation(required = true)
    private String isvSubId;

    @Body
    @NameInMap("UserGroupId")
    @Validation(required = true, maximum = 9999999999999D, minimum = 1)
    private Long userGroupId;

    @Body
    @NameInMap("UserGroupName")
    @Validation(required = true)
    private String userGroupName;

    private UpdateUserGroupRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.isvSubId = builder.isvSubId;
        this.userGroupId = builder.userGroupId;
        this.userGroupName = builder.userGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return isvSubId
     */
    public String getIsvSubId() {
        return this.isvSubId;
    }

    /**
     * @return userGroupId
     */
    public Long getUserGroupId() {
        return this.userGroupId;
    }

    /**
     * @return userGroupName
     */
    public String getUserGroupName() {
        return this.userGroupName;
    }

    public static final class Builder extends Request.Builder<UpdateUserGroupRequest, Builder> {
        private String corpId; 
        private String isvSubId; 
        private Long userGroupId; 
        private String userGroupName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserGroupRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.isvSubId = response.isvSubId;
            this.userGroupId = response.userGroupId;
            this.userGroupName = response.userGroupName;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * IsvSubId.
         */
        public Builder isvSubId(String isvSubId) {
            this.putBodyParameter("IsvSubId", isvSubId);
            this.isvSubId = isvSubId;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(Long userGroupId) {
            this.putBodyParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        /**
         * UserGroupName.
         */
        public Builder userGroupName(String userGroupName) {
            this.putBodyParameter("UserGroupName", userGroupName);
            this.userGroupName = userGroupName;
            return this;
        }

        @Override
        public UpdateUserGroupRequest build() {
            return new UpdateUserGroupRequest(this);
        } 

    } 

}
