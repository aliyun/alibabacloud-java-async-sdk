// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCenRequest} extends {@link RequestModel}
 *
 * <p>VerifyCenRequest</p>
 */
public class VerifyCenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cenId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CenOwnerId")
    private Long cenOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VerifyCode")
    private String verifyCode;

    private VerifyCenRequest(Builder builder) {
        super(builder);
        this.cenId = builder.cenId;
        this.cenOwnerId = builder.cenOwnerId;
        this.cidrBlock = builder.cidrBlock;
        this.regionId = builder.regionId;
        this.verifyCode = builder.verifyCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyCenRequest create() {
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
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
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

    public static final class Builder extends Request.Builder<VerifyCenRequest, Builder> {
        private String cenId; 
        private Long cenOwnerId; 
        private String cidrBlock; 
        private String regionId; 
        private String verifyCode; 

        private Builder() {
            super();
        } 

        private Builder(VerifyCenRequest request) {
            super(request);
            this.cenId = request.cenId;
            this.cenOwnerId = request.cenOwnerId;
            this.cidrBlock = request.cidrBlock;
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
         * The IPv4 CIDR block of the associated office network.
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
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
        public VerifyCenRequest build() {
            return new VerifyCenRequest(this);
        } 

    } 

}
