// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateUserRequest} extends {@link RequestModel}
 *
 * <p>UpdateUserRequest</p>
 */
public class UpdateUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("User")
    private User user;

    private UpdateUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.user = builder.user;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return user
     */
    public User getUser() {
        return this.user;
    }

    public static final class Builder extends Request.Builder<UpdateUserRequest, Builder> {
        private String regionId; 
        private User user; 

        private Builder() {
            super();
        } 

        private Builder(UpdateUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.user = request.user;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * User.
         */
        public Builder user(User user) {
            String userShrink = shrink(user, "User", "json");
            this.putBodyParameter("User", userShrink);
            this.user = user;
            return this;
        }

        @Override
        public UpdateUserRequest build() {
            return new UpdateUserRequest(this);
        } 

    } 

    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableEventbridge")
        private Boolean enableEventbridge;

        private User(Builder builder) {
            this.enableEventbridge = builder.enableEventbridge;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return enableEventbridge
         */
        public Boolean getEnableEventbridge() {
            return this.enableEventbridge;
        }

        public static final class Builder {
            private Boolean enableEventbridge; 

            /**
             * EnableEventbridge.
             */
            public Builder enableEventbridge(Boolean enableEventbridge) {
                this.enableEventbridge = enableEventbridge;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
}
