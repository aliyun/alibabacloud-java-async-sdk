// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>SendVerifyCodeRequest</p>
 */
public class SendVerifyCodeRequest extends Request {
    @Query
    @NameInMap("ExtraInfo")
    private String extraInfo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("VerifyCodeAction")
    @Validation(required = true)
    private String verifyCodeAction;

    private SendVerifyCodeRequest(Builder builder) {
        super(builder);
        this.extraInfo = builder.extraInfo;
        this.regionId = builder.regionId;
        this.verifyCodeAction = builder.verifyCodeAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendVerifyCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return verifyCodeAction
     */
    public String getVerifyCodeAction() {
        return this.verifyCodeAction;
    }

    public static final class Builder extends Request.Builder<SendVerifyCodeRequest, Builder> {
        private String extraInfo; 
        private String regionId; 
        private String verifyCodeAction; 

        private Builder() {
            super();
        } 

        private Builder(SendVerifyCodeRequest request) {
            super(request);
            this.extraInfo = request.extraInfo;
            this.regionId = request.regionId;
            this.verifyCodeAction = request.verifyCodeAction;
        } 

        /**
         * The information in JSON format that is required for sending the verification code. To verify the security of CEN, you must provide the ID of the CEN instance and the ID of the Alibaba Cloud account to which the instance belongs.
         * <p>
         * 
         * *   CenId: the ID of the CEN instance
         * *   CenOwnerId: the ID of the Alibaba Cloud account to which the CEN instance belongs.
         * 
         * Note: If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to the Alibaba Cloud account, skip this parameter. If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the exact Alibaba Cloud account. Example: {"cenOwnerId": 1234567890\*\*\*\*\*\*,"cenId": "cen-3weq30r6t0s7t4\*\*\*\*"}.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The action that indicates what the verification code is used for. The parameter is only used to verify the security of CEN. Valid value: eds_cenID_securityverification.
         */
        public Builder verifyCodeAction(String verifyCodeAction) {
            this.putQueryParameter("VerifyCodeAction", verifyCodeAction);
            this.verifyCodeAction = verifyCodeAction;
            return this;
        }

        @Override
        public SendVerifyCodeRequest build() {
            return new SendVerifyCodeRequest(this);
        } 

    } 

}
