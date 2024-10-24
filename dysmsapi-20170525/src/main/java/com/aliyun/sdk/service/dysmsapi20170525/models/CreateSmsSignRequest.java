// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateSmsSignRequest} extends {@link RequestModel}
 *
 * <p>CreateSmsSignRequest</p>
 */
public class CreateSmsSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySceneContent")
    private String applySceneContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List < String > moreData;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QualificationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long qualificationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer signSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignType")
    private Integer signType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThirdParty")
    private Boolean thirdParty;

    private CreateSmsSignRequest(Builder builder) {
        super(builder);
        this.applySceneContent = builder.applySceneContent;
        this.moreData = builder.moreData;
        this.ownerId = builder.ownerId;
        this.qualificationId = builder.qualificationId;
        this.remark = builder.remark;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.signName = builder.signName;
        this.signSource = builder.signSource;
        this.signType = builder.signType;
        this.thirdParty = builder.thirdParty;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSmsSignRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applySceneContent
     */
    public String getApplySceneContent() {
        return this.applySceneContent;
    }

    /**
     * @return moreData
     */
    public java.util.List < String > getMoreData() {
        return this.moreData;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qualificationId
     */
    public Long getQualificationId() {
        return this.qualificationId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
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
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return signSource
     */
    public Integer getSignSource() {
        return this.signSource;
    }

    /**
     * @return signType
     */
    public Integer getSignType() {
        return this.signType;
    }

    /**
     * @return thirdParty
     */
    public Boolean getThirdParty() {
        return this.thirdParty;
    }

    public static final class Builder extends Request.Builder<CreateSmsSignRequest, Builder> {
        private String applySceneContent; 
        private java.util.List < String > moreData; 
        private Long ownerId; 
        private Long qualificationId; 
        private String remark; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String signName; 
        private Integer signSource; 
        private Integer signType; 
        private Boolean thirdParty; 

        private Builder() {
            super();
        } 

        private Builder(CreateSmsSignRequest request) {
            super(request);
            this.applySceneContent = request.applySceneContent;
            this.moreData = request.moreData;
            this.ownerId = request.ownerId;
            this.qualificationId = request.qualificationId;
            this.remark = request.remark;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.signName = request.signName;
            this.signSource = request.signSource;
            this.signType = request.signType;
            this.thirdParty = request.thirdParty;
        } 

        /**
         * <p>Application scenarios, instructions as follows:</p>
         * <ul>
         * <li><p>For registered websites, enter the domain name with HTTP or HTTPS that has been registered with the MIIT.</p>
         * </li>
         * <li><p>For launched apps, provide a display link from the app store with HTTP or HTTPS, ensuring the app is online.</p>
         * </li>
         * <li><p>For public accounts or mini-programs, input the full name, ensuring they are online.</p>
         * </li>
         * <li><p>For e-commerce platform store names, applicable only to enterprise users, provide a display link with HTTP or HTTPS for the store.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/">http://www.aliyun.com/</a></p>
         */
        public Builder applySceneContent(String applySceneContent) {
            this.putQueryParameter("ApplySceneContent", applySceneContent);
            this.applySceneContent = applySceneContent;
            return this;
        }

        /**
         * <p>Additional information to supplement uploaded business proof documents or screenshots, which helps reviewers understand your business details.</p>
         * <p>This parameter is optional; please fill it out based on your actual needs.</p>
         */
        public Builder moreData(java.util.List < String > moreData) {
            String moreDataShrink = shrink(moreData, "MoreData", "json");
            this.putQueryParameter("MoreData", moreDataShrink);
            this.moreData = moreData;
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
         * <p>Approved or under-review qualification ID.</p>
         * <blockquote>
         * <ul>
         * <li>Before applying for an SMS signature, please first <a href="https://help.aliyun.com/zh/sms/user-guide/new-qualification?spm=a2c4g.11186623.0.0.718d187bbkpMRK">Apply for Qualification</a>.</li>
         * <li>You can view the qualification ID on the <a href="https://dysms.console.aliyun.com/domestic/text/qualification">Qualification Management</a> page.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8563**</p>
         */
        public Builder qualificationId(Long qualificationId) {
            this.putQueryParameter("QualificationId", qualificationId);
            this.qualificationId = qualificationId;
            return this;
        }

        /**
         * <p>Explanation of the SMS signature scenario, with a maximum length of 200 characters.</p>
         * <blockquote>
         * <p>The scenario explanation is one of the reference materials for signature review. Please provide a detailed description of the usage scenarios for your live services, along with links to verify these services such as website URLs with MIIT备案, app store display links, full names of public accounts or mini-programs, etc. For login scenarios, test account credentials are also required. A comprehensive application explanation enhances the efficiency of signature and template reviews. Refer to the <strong>Application Scenario</strong> column in the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.i2#section-xup-k46-yi4">Signature Source</a> table for filling in SMS scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SMS signature for the login scenario using verification code.</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
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
         * <p>Signature name. Please adhere to the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.0.4f9710fder2gR7#section-0p8-qn8-mmy">Signature Specifications</a>.</p>
         * <blockquote>
         * <ul>
         * <li>Signature names are case-insensitive; e.g., 【Aliyun Communication】 and 【aliyun communication】 are considered identical.</li>
         * <li>If your verification code signature and general signature names are the same, the system defaults to using the general signature for sending SMS messages.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Aliyun</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>Signature source. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Full name or abbreviation of an enterprise or institution.</li>
         * <li><strong>1</strong>: Full name or abbreviation of a MIIT-registered website.</li>
         * <li><strong>2</strong>: Full name or abbreviation of an App.</li>
         * <li><strong>3</strong>: Full name or abbreviation of an official account or mini-program.</li>
         * <li><strong>4</strong>: Full name or abbreviation of an e-commerce platform store.</li>
         * <li><strong>5</strong>: Full name or abbreviation of a trademark.</li>
         * </ul>
         * <p>For detailed information on signature sources, refer to <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.0.4f9710fder2gR7#section-xup-k46-yi4">Signature Source</a>.</p>
         * <blockquote>
         * <p>This interface does not support applying for signatures with sources as <strong>Test or Learning</strong> and <strong>Trial Use</strong>. If you need to apply for signatures with these sources, please go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign/add/qualification">SMS Service Console</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder signSource(Integer signSource) {
            this.putQueryParameter("SignSource", signSource);
            this.signSource = signSource;
            return this;
        }

        /**
         * <p>Signature type. Values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Verification Code</p>
         * </li>
         * <li><p><strong>1</strong>: General (Default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>It is recommended to use the default value: <strong>General</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder signType(Integer signType) {
            this.putQueryParameter("SignType", signType);
            this.signType = signType;
            return this;
        }

        /**
         * <p>Choose whether the applied signature is for self-use or third-party use.</p>
         * <ul>
         * <li><p>false: Self-use (default)</p>
         * </li>
         * <li><p>true: Third-party use</p>
         * <blockquote>
         * <p>Notice: Please select self-use qualification ID when the signature is for self-use; choose third-party use qualification ID when it&quot;s for third-party use.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder thirdParty(Boolean thirdParty) {
            this.putQueryParameter("ThirdParty", thirdParty);
            this.thirdParty = thirdParty;
            return this;
        }

        @Override
        public CreateSmsSignRequest build() {
            return new CreateSmsSignRequest(this);
        } 

    } 

}
