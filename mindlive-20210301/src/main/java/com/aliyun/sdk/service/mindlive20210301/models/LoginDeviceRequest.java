// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginDeviceRequest} extends {@link RequestModel}
 *
 * <p>LoginDeviceRequest</p>
 */
public class LoginDeviceRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("UserSource")
    @Validation(required = true)
    private String userSource;

    private LoginDeviceRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.userSource = builder.userSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoginDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userSource
     */
    public String getUserSource() {
        return this.userSource;
    }

    public static final class Builder extends Request.Builder<LoginDeviceRequest, Builder> {
        private String userId; 
        private String userSource; 

        private Builder() {
            super();
        } 

        private Builder(LoginDeviceRequest request) {
            super(request);
            this.userId = request.userId;
            this.userSource = request.userSource;
        } 

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserSource.
         */
        public Builder userSource(String userSource) {
            this.putQueryParameter("UserSource", userSource);
            this.userSource = userSource;
            return this;
        }

        @Override
        public LoginDeviceRequest build() {
            return new LoginDeviceRequest(this);
        } 

    } 

}
