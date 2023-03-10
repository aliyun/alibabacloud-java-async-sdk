// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetPasswordRequest</p>
 */
public class ResetPasswordRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("phone")
    private String phone;

    private ResetPasswordRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.clientToken = builder.clientToken;
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.phone = builder.phone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    public static final class Builder extends Request.Builder<ResetPasswordRequest, Builder> {
        private String clientId; 
        private String clientToken; 
        private String email; 
        private String endUserId; 
        private String officeSiteId; 
        private String regionId; 
        private String phone; 

        private Builder() {
            super();
        } 

        private Builder(ResetPasswordRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.clientToken = request.clientToken;
            this.email = request.email;
            this.endUserId = request.endUserId;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.phone = request.phone;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * OfficeSiteId.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.putQueryParameter("phone", phone);
            this.phone = phone;
            return this;
        }

        @Override
        public ResetPasswordRequest build() {
            return new ResetPasswordRequest(this);
        } 

    } 

}
