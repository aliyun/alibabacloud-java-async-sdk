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
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putQueryParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
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
         * VerifyCodeAction.
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
