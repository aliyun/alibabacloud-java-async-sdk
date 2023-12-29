// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAuthorizationUrlRequest} extends {@link RequestModel}
 *
 * <p>GetAuthorizationUrlRequest</p>
 */
public class GetAuthorizationUrlRequest extends Request {
    @Query
    @NameInMap("EndDate")
    private String endDate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNo")
    @Validation(required = true)
    private String phoneNo;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SchemeId")
    @Validation(required = true)
    private Long schemeId;

    private GetAuthorizationUrlRequest(Builder builder) {
        super(builder);
        this.endDate = builder.endDate;
        this.ownerId = builder.ownerId;
        this.phoneNo = builder.phoneNo;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.schemeId = builder.schemeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNo
     */
    public String getPhoneNo() {
        return this.phoneNo;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return schemeId
     */
    public Long getSchemeId() {
        return this.schemeId;
    }

    public static final class Builder extends Request.Builder<GetAuthorizationUrlRequest, Builder> {
        private String endDate; 
        private Long ownerId; 
        private String phoneNo; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long schemeId; 

        private Builder() {
            super();
        } 

        private Builder(GetAuthorizationUrlRequest request) {
            super(request);
            this.endDate = request.endDate;
            this.ownerId = request.ownerId;
            this.phoneNo = request.phoneNo;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.schemeId = request.schemeId;
        } 

        /**
         * The authorization end date, which is in the yyyy-MM-dd format. This parameter is required for services of contract type.
         */
        public Builder endDate(String endDate) {
            this.putQueryParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * The phone number.
         */
        public Builder phoneNo(String phoneNo) {
            this.putQueryParameter("PhoneNo", phoneNo);
            this.phoneNo = phoneNo;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the authorization scenario. You can view the ID of the authorization scenario on the **Authorization Scenario Management** page in the **Phone Number Verification Service console**.
         */
        public Builder schemeId(Long schemeId) {
            this.putQueryParameter("SchemeId", schemeId);
            this.schemeId = schemeId;
            return this;
        }

        @Override
        public GetAuthorizationUrlRequest build() {
            return new GetAuthorizationUrlRequest(this);
        } 

    } 

}
