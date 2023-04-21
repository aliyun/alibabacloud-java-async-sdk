// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachCenRequest} extends {@link RequestModel}
 *
 * <p>AttachCenRequest</p>
 */
public class AttachCenRequest extends Request {
    @Query
    @NameInMap("CenId")
    @Validation(required = true)
    private String cenId;

    @Query
    @NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @Query
    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    private String officeSiteId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VerifyCode")
    private String verifyCode;

    private AttachCenRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.officeSiteId = builder.officeSiteId;
        this.regionId = builder.regionId;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return cenOwnerId
     */
    public Long getCenOwnerId() {
        return this.cenOwnerId;
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
     * @return verifyCode
     */
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public static final class Builder extends Request.Builder<AttachCenRequest, Builder> {
        private String cenId; 
        private Long cenOwnerId; 
        private String officeSiteId; 
        private String regionId; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(AttachCenRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.officeSiteId = request.officeSiteId;
            this.regionId = request.regionId;
            this.verifyCode = request.verifyCode;
        } 

        /**
         * The ID of the CEN instance.
         */
        public Builder cenId(String cenId) {
            this.putQueryParameter("CenId", cenId);
            this.cenId = cenId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the CEN instance belongs.
         * <p>
         * 
         * *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to the Alibaba Cloud account, skip this parameter.
         * *   If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the exact Alibaba Cloud account.
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the SendVerifyCode operation to obtain the verification code.
         */
        public Builder verifyCode(String verifyCode) {
            this.putQueryParameter("VerifyCode", verifyCode);
            this.verifyCode = verifyCode;
            return this;
        }

        @Override
        public AttachCenRequest build() {
            return new AttachCenRequest(this);
        } 

    } 

}
