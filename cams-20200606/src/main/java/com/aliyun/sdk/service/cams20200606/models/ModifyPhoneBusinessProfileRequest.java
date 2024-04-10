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
    @NameInMap("About")
    private String about;

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
        this.about = builder.about;
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
     * @return about
     */
    public String getAbout() {
        return this.about;
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
        private String about; 
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
            this.about = request.about;
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
         * About.
         */
        public Builder about(String about) {
            this.putQueryParameter("About", about);
            this.about = about;
            return this;
        }

        /**
         * The space ID of the user under the independent software vendor (ISV) account.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * Modifies the business information of the account to which a specified phone number is bound.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The address.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The description.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * You can call this operation up to 10 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
         */
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
            return this;
        }

        /**
         * The industry.
         * <p>
         * 
         * > Enum: {OTHER, AUTO, BEAUTY, APPAREL, EDU, ENTERTAIN, EVENT_PLAN, FINANCE, GROCERY, GOVT, HOTEL, HEALTH, NONPROFIT, PROF_SERVICES, RETAIL, TRAVEL, RESTAURANT}
         */
        public Builder profilePictureUrl(String profilePictureUrl) {
            this.putQueryParameter("ProfilePictureUrl", profilePictureUrl);
            this.profilePictureUrl = profilePictureUrl;
            return this;
        }

        /**
         * Sichuan
         */
        public Builder vertical(String vertical) {
            this.putQueryParameter("Vertical", vertical);
            this.vertical = vertical;
            return this;
        }

        /**
         * The email address.
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
