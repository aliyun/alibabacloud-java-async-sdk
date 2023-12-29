// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendSmsVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>SendSmsVerifyCodeRequest</p>
 */
public class SendSmsVerifyCodeRequest extends Request {
    @Query
    @NameInMap("CodeLength")
    private Long codeLength;

    @Query
    @NameInMap("CodeType")
    private Long codeType;

    @Query
    @NameInMap("CountryCode")
    private String countryCode;

    @Query
    @NameInMap("DuplicatePolicy")
    private Long duplicatePolicy;

    @Query
    @NameInMap("Interval")
    private Long interval;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PhoneNumber")
    @Validation(required = true)
    private String phoneNumber;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ReturnVerifyCode")
    private Boolean returnVerifyCode;

    @Query
    @NameInMap("SchemeName")
    private String schemeName;

    @Query
    @NameInMap("SignName")
    @Validation(required = true)
    private String signName;

    @Query
    @NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @Query
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Query
    @NameInMap("TemplateParam")
    @Validation(required = true)
    private String templateParam;

    @Query
    @NameInMap("ValidTime")
    private Long validTime;

    private SendSmsVerifyCodeRequest(Builder builder) {
        super(builder);
        this.codeLength = builder.codeLength;
        this.codeType = builder.codeType;
        this.countryCode = builder.countryCode;
        this.duplicatePolicy = builder.duplicatePolicy;
        this.interval = builder.interval;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.phoneNumber = builder.phoneNumber;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.returnVerifyCode = builder.returnVerifyCode;
        this.schemeName = builder.schemeName;
        this.signName = builder.signName;
        this.smsUpExtendCode = builder.smsUpExtendCode;
        this.templateCode = builder.templateCode;
        this.templateParam = builder.templateParam;
        this.validTime = builder.validTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendSmsVerifyCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codeLength
     */
    public Long getCodeLength() {
        return this.codeLength;
    }

    /**
     * @return codeType
     */
    public Long getCodeType() {
        return this.codeType;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return duplicatePolicy
     */
    public Long getDuplicatePolicy() {
        return this.duplicatePolicy;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return phoneNumber
     */
    public String getPhoneNumber() {
        return this.phoneNumber;
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
     * @return returnVerifyCode
     */
    public Boolean getReturnVerifyCode() {
        return this.returnVerifyCode;
    }

    /**
     * @return schemeName
     */
    public String getSchemeName() {
        return this.schemeName;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return smsUpExtendCode
     */
    public String getSmsUpExtendCode() {
        return this.smsUpExtendCode;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateParam
     */
    public String getTemplateParam() {
        return this.templateParam;
    }

    /**
     * @return validTime
     */
    public Long getValidTime() {
        return this.validTime;
    }

    public static final class Builder extends Request.Builder<SendSmsVerifyCodeRequest, Builder> {
        private Long codeLength; 
        private Long codeType; 
        private String countryCode; 
        private Long duplicatePolicy; 
        private Long interval; 
        private String outId; 
        private Long ownerId; 
        private String phoneNumber; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean returnVerifyCode; 
        private String schemeName; 
        private String signName; 
        private String smsUpExtendCode; 
        private String templateCode; 
        private String templateParam; 
        private Long validTime; 

        private Builder() {
            super();
        } 

        private Builder(SendSmsVerifyCodeRequest request) {
            super(request);
            this.codeLength = request.codeLength;
            this.codeType = request.codeType;
            this.countryCode = request.countryCode;
            this.duplicatePolicy = request.duplicatePolicy;
            this.interval = request.interval;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.phoneNumber = request.phoneNumber;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.returnVerifyCode = request.returnVerifyCode;
            this.schemeName = request.schemeName;
            this.signName = request.signName;
            this.smsUpExtendCode = request.smsUpExtendCode;
            this.templateCode = request.templateCode;
            this.templateParam = request.templateParam;
            this.validTime = request.validTime;
        } 

        /**
         * The length of the verification code. Default value: 4. Valid values: 4 to 8.
         */
        public Builder codeLength(Long codeLength) {
            this.putQueryParameter("CodeLength", codeLength);
            this.codeLength = codeLength;
            return this;
        }

        /**
         * The type of the generated verification code. Default value: 1. Valid values:
         * <p>
         * 
         * *   1: digits only
         * *   2: uppercase letters only
         * *   3: lowercase letters only
         * *   4: uppercase and lowercase letters
         * *   5: digits and uppercase letters
         * *   6: digits and lowercase letters
         * *   7: digits and uppercase and lowercase letters
         */
        public Builder codeType(Long codeType) {
            this.putQueryParameter("CodeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * The country code of the phone number. SMS verification codes can be sent only by using phone numbers in the Chinese mainland. Default value: 86.
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * Specifies how to handle the verification codes received earlier in a case where verification codes are sent to the same phone number for the same scenario within the validity period.
         * <p>
         * 
         * *   1 (default): The latest verification code overwrites the verification codes received earlier. In this case, verification codes received earlier expire.
         * *   2: Verification codes within their validity period are valid and can be used for verification.
         */
        public Builder duplicatePolicy(Long duplicatePolicy) {
            this.putQueryParameter("DuplicatePolicy", duplicatePolicy);
            this.duplicatePolicy = duplicatePolicy;
            return this;
        }

        /**
         * The time interval. Unit: seconds. Default value: 60. This parameter specifies how often you can send a verification code.
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * The external ID.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
        public Builder phoneNumber(String phoneNumber) {
            this.putQueryParameter("PhoneNumber", phoneNumber);
            this.phoneNumber = phoneNumber;
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
         * Specifies whether to return a verification code.
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder returnVerifyCode(Boolean returnVerifyCode) {
            this.putQueryParameter("ReturnVerifyCode", returnVerifyCode);
            this.returnVerifyCode = returnVerifyCode;
            return this;
        }

        /**
         * The verification service name. If this parameter is not specified, the default service is used. The name can be up to 20 characters in length.
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * The signature.
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * The extension code of the upstream text message. Upstream text messages are text messages sent to the communication service provider. Upstream text messages are used to customize a service, complete an inquiry, or send a request. You are charged for sending upstream text messages based on the billing standards of the service provider.
         * <p>
         * 
         * >  The extension code is automatically generated by the system when the signature is generated. You do not need to specify the extension code. You can skip this parameter based on your business requirements. If you want to use custom extension codes, contact your account manager.
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
            return this;
        }

        /**
         * The code of the text message template.
         * <p>
         * 
         * Log on to the [SMS console](https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview). In the left-side navigation pane, click **Go China** or **Go Globe**. You can view the text message template code in the **Template Code** column on the **Message Templates** tab.
         * 
         * >  The text message templates must be created on the Go Globe page and approved.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * The value of the variable in the text message template. The verification code is replaced with "##code##".
         * <p>
         * 
         * Example 1: For a system-defined template that contains variables, if the template content is "Your verification code is ${code} and valid for 5 minutes. Do not disclose the verification code to others.", specify the value of this parameter as {"code":"##code##"}
         * 
         * Example 2: For a custom template, if the template content is ${content}, specify the value of this parameter as {"content":"Your verification code is ##code## and must be used within 5 minutes."}.
         * 
         * > 
         * 
         * *   If line breaks are required in JSON-formatted data, they must meet the relevant requirements that are specified in the standard JSON protocol.
         * 
         * *   For more information about template variables, see [SMS template specifications](~~108253~~).
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        /**
         * The validity period of the verification code. Unit: seconds. Default value: 300.
         */
        public Builder validTime(Long validTime) {
            this.putQueryParameter("ValidTime", validTime);
            this.validTime = validTime;
            return this;
        }

        @Override
        public SendSmsVerifyCodeRequest build() {
            return new SendSmsVerifyCodeRequest(this);
        } 

    } 

}
