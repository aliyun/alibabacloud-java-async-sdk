// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mindlive20210301.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LogoutDeviceRequest} extends {@link RequestModel}
 *
 * <p>LogoutDeviceRequest</p>
 */
public class LogoutDeviceRequest extends Request {
    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    @Query
    @NameInMap("UserSource")
    @Validation(required = true)
    private String userSource;

    private LogoutDeviceRequest(Builder builder) {
        super(builder);
        this.userId = builder.userId;
        this.userSource = builder.userSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogoutDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<LogoutDeviceRequest, Builder> {
        private String userId; 
        private String userSource; 

        private Builder() {
            super();
        } 

        private Builder(LogoutDeviceRequest request) {
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
        public LogoutDeviceRequest build() {
            return new LogoutDeviceRequest(this);
        } 

    } 

}
