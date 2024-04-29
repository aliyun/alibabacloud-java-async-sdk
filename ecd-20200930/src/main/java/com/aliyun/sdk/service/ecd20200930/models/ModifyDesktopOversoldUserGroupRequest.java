// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDesktopOversoldUserGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyDesktopOversoldUserGroupRequest</p>
 */
public class ModifyDesktopOversoldUserGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OversoldGroupId")
    private String oversoldGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyGroupId")
    private String policyGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserGroupId")
    private String userGroupId;

    private ModifyDesktopOversoldUserGroupRequest(Builder builder) {
        super(builder);
        this.imageId = builder.imageId;
        this.name = builder.name;
        this.oversoldGroupId = builder.oversoldGroupId;
        this.policyGroupId = builder.policyGroupId;
        this.userGroupId = builder.userGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDesktopOversoldUserGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return oversoldGroupId
     */
    public String getOversoldGroupId() {
        return this.oversoldGroupId;
    }

    /**
     * @return policyGroupId
     */
    public String getPolicyGroupId() {
        return this.policyGroupId;
    }

    /**
     * @return userGroupId
     */
    public String getUserGroupId() {
        return this.userGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyDesktopOversoldUserGroupRequest, Builder> {
        private String imageId; 
        private String name; 
        private String oversoldGroupId; 
        private String policyGroupId; 
        private String userGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDesktopOversoldUserGroupRequest request) {
            super(request);
            this.imageId = request.imageId;
            this.name = request.name;
            this.oversoldGroupId = request.oversoldGroupId;
            this.policyGroupId = request.policyGroupId;
            this.userGroupId = request.userGroupId;
        } 

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OversoldGroupId.
         */
        public Builder oversoldGroupId(String oversoldGroupId) {
            this.putQueryParameter("OversoldGroupId", oversoldGroupId);
            this.oversoldGroupId = oversoldGroupId;
            return this;
        }

        /**
         * PolicyGroupId.
         */
        public Builder policyGroupId(String policyGroupId) {
            this.putQueryParameter("PolicyGroupId", policyGroupId);
            this.policyGroupId = policyGroupId;
            return this;
        }

        /**
         * UserGroupId.
         */
        public Builder userGroupId(String userGroupId) {
            this.putQueryParameter("UserGroupId", userGroupId);
            this.userGroupId = userGroupId;
            return this;
        }

        @Override
        public ModifyDesktopOversoldUserGroupRequest build() {
            return new ModifyDesktopOversoldUserGroupRequest(this);
        } 

    } 

}
