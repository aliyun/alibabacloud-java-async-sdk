// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateK8sApplicationBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sApplicationBaseInfoRequest</p>
 */
public class UpdateK8sApplicationBaseInfoRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Owner")
    private String owner;

    @Query
    @NameInMap("PhoneNumber")
    private String phoneNumber;

    private UpdateK8sApplicationBaseInfoRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.email = builder.email;
        this.owner = builder.owner;
        this.phoneNumber = builder.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateK8sApplicationBaseInfoRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static final class Builder extends Request.Builder<UpdateK8sApplicationBaseInfoRequest, Builder> {
        private String appId; 
        private String description; 
        private String email; 
        private String owner; 
        private String phoneNumber; 

        private Builder() {
            super();
        } 

        private Builder(UpdateK8sApplicationBaseInfoRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
            this.email = request.email;
            this.owner = request.owner;
            this.phoneNumber = request.phoneNumber;
        } 

        /**
         * The ID of the application that you want to modify.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The description of the application. The description can be up to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The email address of the application owner.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * The owner of the application. The value can be up to 128 characters in length.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The phone number of the application owner.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        @Override
        public UpdateK8sApplicationBaseInfoRequest build() {
            return new UpdateK8sApplicationBaseInfoRequest(this);
        } 

    } 

}
