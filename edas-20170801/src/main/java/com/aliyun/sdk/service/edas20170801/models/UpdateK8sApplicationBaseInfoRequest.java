// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateK8sApplicationBaseInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateK8sApplicationBaseInfoRequest</p>
 */
public class UpdateK8sApplicationBaseInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
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
         * <p>The ID of the application that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4f038ddf-b27b-<strong><strong>-</strong></strong>-88e44375****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The description of the application. The description can be up to 256 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>app for pre-production</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The email address of the application owner.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:mymail@example.com">mymail@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>The owner of the application. The value can be up to 128 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Tom</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The phone number of the application owner.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234xxxx</p>
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
