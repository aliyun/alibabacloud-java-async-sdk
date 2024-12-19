// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

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
 * {@link GetWithholdSignPageUrlRequest} extends {@link RequestModel}
 *
 * <p>GetWithholdSignPageUrlRequest</p>
 */
public class GetWithholdSignPageUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceType")
    private String deviceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExternalAgreementNo")
    private String externalAgreementNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityParameters")
    private String identityParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantId")
    private String merchantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantServiceDescription")
    private String merchantServiceDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MerchantServiceName")
    private String merchantServiceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutRequestNo")
    private String outRequestNo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReturnUrl")
    private String returnUrl;

    private GetWithholdSignPageUrlRequest(Builder builder) {
        super(builder);
        this.deviceType = builder.deviceType;
        this.extInfo = builder.extInfo;
        this.externalAgreementNo = builder.externalAgreementNo;
        this.identityParameters = builder.identityParameters;
        this.merchantId = builder.merchantId;
        this.merchantServiceDescription = builder.merchantServiceDescription;
        this.merchantServiceName = builder.merchantServiceName;
        this.notifyUrl = builder.notifyUrl;
        this.outRequestNo = builder.outRequestNo;
        this.returnUrl = builder.returnUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWithholdSignPageUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return externalAgreementNo
     */
    public String getExternalAgreementNo() {
        return this.externalAgreementNo;
    }

    /**
     * @return identityParameters
     */
    public String getIdentityParameters() {
        return this.identityParameters;
    }

    /**
     * @return merchantId
     */
    public String getMerchantId() {
        return this.merchantId;
    }

    /**
     * @return merchantServiceDescription
     */
    public String getMerchantServiceDescription() {
        return this.merchantServiceDescription;
    }

    /**
     * @return merchantServiceName
     */
    public String getMerchantServiceName() {
        return this.merchantServiceName;
    }

    /**
     * @return notifyUrl
     */
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    /**
     * @return outRequestNo
     */
    public String getOutRequestNo() {
        return this.outRequestNo;
    }

    /**
     * @return returnUrl
     */
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public static final class Builder extends Request.Builder<GetWithholdSignPageUrlRequest, Builder> {
        private String deviceType; 
        private String extInfo; 
        private String externalAgreementNo; 
        private String identityParameters; 
        private String merchantId; 
        private String merchantServiceDescription; 
        private String merchantServiceName; 
        private String notifyUrl; 
        private String outRequestNo; 
        private String returnUrl; 

        private Builder() {
            super();
        } 

        private Builder(GetWithholdSignPageUrlRequest request) {
            super(request);
            this.deviceType = request.deviceType;
            this.extInfo = request.extInfo;
            this.externalAgreementNo = request.externalAgreementNo;
            this.identityParameters = request.identityParameters;
            this.merchantId = request.merchantId;
            this.merchantServiceDescription = request.merchantServiceDescription;
            this.merchantServiceName = request.merchantServiceName;
            this.notifyUrl = request.notifyUrl;
            this.outRequestNo = request.outRequestNo;
            this.returnUrl = request.returnUrl;
        } 

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putBodyParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
            return this;
        }

        /**
         * ExternalAgreementNo.
         */
        public Builder externalAgreementNo(String externalAgreementNo) {
            this.putBodyParameter("ExternalAgreementNo", externalAgreementNo);
            this.externalAgreementNo = externalAgreementNo;
            return this;
        }

        /**
         * IdentityParameters.
         */
        public Builder identityParameters(String identityParameters) {
            this.putBodyParameter("IdentityParameters", identityParameters);
            this.identityParameters = identityParameters;
            return this;
        }

        /**
         * MerchantId.
         */
        public Builder merchantId(String merchantId) {
            this.putBodyParameter("MerchantId", merchantId);
            this.merchantId = merchantId;
            return this;
        }

        /**
         * MerchantServiceDescription.
         */
        public Builder merchantServiceDescription(String merchantServiceDescription) {
            this.putBodyParameter("MerchantServiceDescription", merchantServiceDescription);
            this.merchantServiceDescription = merchantServiceDescription;
            return this;
        }

        /**
         * MerchantServiceName.
         */
        public Builder merchantServiceName(String merchantServiceName) {
            this.putBodyParameter("MerchantServiceName", merchantServiceName);
            this.merchantServiceName = merchantServiceName;
            return this;
        }

        /**
         * NotifyUrl.
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putBodyParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * OutRequestNo.
         */
        public Builder outRequestNo(String outRequestNo) {
            this.putBodyParameter("OutRequestNo", outRequestNo);
            this.outRequestNo = outRequestNo;
            return this;
        }

        /**
         * ReturnUrl.
         */
        public Builder returnUrl(String returnUrl) {
            this.putBodyParameter("ReturnUrl", returnUrl);
            this.returnUrl = returnUrl;
            return this;
        }

        @Override
        public GetWithholdSignPageUrlRequest build() {
            return new GetWithholdSignPageUrlRequest(this);
        } 

    } 

}
