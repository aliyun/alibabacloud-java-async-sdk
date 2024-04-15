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
         * The Alibaba Cloud account to which the CEN instance belongs.
         * <p>
         * 
         * *   If you own the CEN instance, you can skip this parameter.
         * *   If you do not own the CEN instance, you must specify the ID of the account that owns the CEN instance.
         */
        public Builder cenOwnerId(Long cenOwnerId) {
            this.putQueryParameter("CenOwnerId", cenOwnerId);
            this.cenOwnerId = cenOwnerId;
            return this;
        }

        /**
         * The office network ID.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.putQueryParameter("OfficeSiteId", officeSiteId);
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The verification code. If you do not own the CEN instance, you must call the [SendVerifyCode](~~436847~~) operation to obtain a verification code.
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
