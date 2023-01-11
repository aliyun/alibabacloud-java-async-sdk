// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPhoneBusinessProfileRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhoneBusinessProfileRequest</p>
 */
public class ModifyPhoneBusinessProfileRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("CustSpaceId")
    @Validation(required = true)
    private String custSpaceId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("ProfilePictureUrl")
    private String profilePictureUrl;

    @Query
    @NameInMap("Vertical")
    private String vertical;

    @Query
    @NameInMap("Websites")
    private java.util.List < String > websites;

    private ModifyPhoneBusinessProfileRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.custSpaceId = builder.custSpaceId;
        this.description = builder.description;
        this.email = builder.email;
        this.phoneNumber = builder.phoneNumber;
        this.profilePictureUrl = builder.profilePictureUrl;
        this.vertical = builder.vertical;
        this.websites = builder.websites;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPhoneBusinessProfileRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
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
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    /**
     * @return profilePictureUrl
     */
    public String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /**
     * @return vertical
     */
    public String getVertical() {
        return this.vertical;
    }

    /**
     * @return websites
     */
    public java.util.List < String > getWebsites() {
        return this.websites;
    }

    public static final class Builder extends Request.Builder<ModifyPhoneBusinessProfileRequest, Builder> {
        private String address; 
        private String custSpaceId; 
        private String description; 
        private String email; 
        private String phoneNumber; 
        private String profilePictureUrl; 
        private String vertical; 
        private java.util.List < String > websites; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPhoneBusinessProfileRequest request) {
            super(request);
            this.address = request.address;
            this.custSpaceId = request.custSpaceId;
            this.description = request.description;
            this.email = request.email;
            this.phoneNumber = request.phoneNumber;
            this.profilePictureUrl = request.profilePictureUrl;
            this.vertical = request.vertical;
            this.websites = request.websites;
        } 

        /**
         * 地址
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * 邮箱
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * 号码
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * 头像url
         */
        public Builder profilePictureUrl(String profilePictureUrl) {
            this.putQueryParameter("ProfilePictureUrl", profilePictureUrl);
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }

        /**
         * 行业
         */
        public Builder vertical(String vertical) {
            this.putQueryParameter("Vertical", vertical);
            this.vertical = vertical;
            return this;
        }

        /**
         * 网站
         */
        public Builder websites(java.util.List < String > websites) {
            String websitesShrink = shrink(websites, "Websites", "json");
            this.putQueryParameter("Websites", websitesShrink);
            this.websites = websites;
            return this;
        }

        @Override
        public ModifyPhoneBusinessProfileRequest build() {
            return new ModifyPhoneBusinessProfileRequest(this);
        } 

    } 

}
