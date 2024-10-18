// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SendSmsVerifyCodeRequest} extends {@link RequestModel}
 *
 * <p>SendSmsVerifyCodeRequest</p>
 */
public class SendSmsVerifyCodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeLength")
    private Long codeLength;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CodeType")
    private Long codeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DuplicatePolicy")
    private Long duplicatePolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Long interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutId")
    private String outId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReturnVerifyCode")
    private Boolean returnVerifyCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SchemeName")
    private String schemeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmsUpExtendCode")
    private String smsUpExtendCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidTime")
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
         * <p>The length of the verification code. Default value: 4. Valid values: 4 to 8.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder codeLength(Long codeLength) {
            this.putQueryParameter("CodeLength", codeLength);
            this.codeLength = codeLength;
            return this;
        }

        /**
         * <p>The type of the generated verification code. Default value: 1. Valid values:</p>
         * <ul>
         * <li>1: digits only</li>
         * <li>2: uppercase letters only</li>
         * <li>3: lowercase letters only</li>
         * <li>4: uppercase and lowercase letters</li>
         * <li>5: digits and uppercase letters</li>
         * <li>6: digits and lowercase letters</li>
         * <li>7: digits and uppercase and lowercase letters</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder codeType(Long codeType) {
            this.putQueryParameter("CodeType", codeType);
            this.codeType = codeType;
            return this;
        }

        /**
         * <p>The country code of the phone number. SMS verification codes can be sent only by using phone numbers in the Chinese mainland. Default value: 86.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>Specifies how to handle the verification codes received earlier in a case where verification codes are sent to the same phone number for the same scenario within the validity period.</p>
         * <ul>
         * <li>1 (default): The latest verification code overwrites the verification codes received earlier. In this case, verification codes received earlier expire.</li>
         * <li>2: Verification codes within their validity period are valid and can be used for verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duplicatePolicy(Long duplicatePolicy) {
            this.putQueryParameter("DuplicatePolicy", duplicatePolicy);
            this.duplicatePolicy = duplicatePolicy;
            return this;
        }

        /**
         * <p>The time interval. Unit: seconds. Default value: 60. This parameter specifies how often you can send a verification code.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Long interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The external ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12358794Aqzaq</p>
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
         * <p>The phone number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>86130****0000</p>
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
         * <p>Specifies whether to return a verification code.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder returnVerifyCode(Boolean returnVerifyCode) {
            this.putQueryParameter("ReturnVerifyCode", returnVerifyCode);
            this.returnVerifyCode = returnVerifyCode;
            return this;
        }

        /**
         * <p>The verification service name. If this parameter is not specified, the default service is used. The name can be up to 20 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder schemeName(String schemeName) {
            this.putQueryParameter("SchemeName", schemeName);
            this.schemeName = schemeName;
            return this;
        }

        /**
         * <p>The signature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun Test</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>The extension code of the upstream text message. Upstream text messages are text messages sent to the communication service provider. Upstream text messages are used to customize a service, complete an inquiry, or send a request. You are charged for sending upstream text messages based on the billing standards of the service provider.</p>
         * <blockquote>
         * <p> The extension code is automatically generated by the system when the signature is generated. You do not need to specify the extension code. You can skip this parameter based on your business requirements. If you want to use custom extension codes, contact your account manager.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1213123</p>
         */
        public Builder smsUpExtendCode(String smsUpExtendCode) {
            this.putQueryParameter("SmsUpExtendCode", smsUpExtendCode);
            this.smsUpExtendCode = smsUpExtendCode;
            return this;
        }

        /**
         * <p>The code of the text message template.</p>
         * <p>Log on to the <a href="https://dysms.console.aliyun.com/dysms.htm?spm=5176.12818093.categories-n-products.ddysms.3b2816d0xml2NA#/overview">SMS console</a>. In the left-side navigation pane, click <strong>Go China</strong> or <strong>Go Globe</strong>. You can view the text message template code in the <strong>Template Code</strong> column on the <strong>Message Templates</strong> tab.</p>
         * <blockquote>
         * <p> The text message templates must be created on the Go Globe page and approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>azsq_*****</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>The value of the variable in the text message template. The verification code is replaced with &quot;##code##&quot;.</p>
         * <p>Example 1: For a system-defined template that contains variables, if the template content is &quot;Your verification code is ${code} and valid for 5 minutes. Do not disclose the verification code to others.&quot;, specify the value of this parameter as {&quot;code&quot;:&quot;##code##&quot;}</p>
         * <p>Example 2: For a custom template, if the template content is ${content}, specify the value of this parameter as {&quot;content&quot;:&quot;Your verification code is ##code## and must be used within 5 minutes.&quot;}.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If line breaks are required in JSON-formatted data, they must meet the relevant requirements that are specified in the standard JSON protocol.</p>
         * </li>
         * <li><p>For more information about template variables, see <a href="https://help.aliyun.com/document_detail/108253.html">SMS template specifications</a>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;code&quot;:&quot;##code##&quot;}</p>
         */
        public Builder templateParam(String templateParam) {
            this.putQueryParameter("TemplateParam", templateParam);
            this.templateParam = templateParam;
            return this;
        }

        /**
         * <p>The validity period of the verification code. Unit: seconds. Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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
