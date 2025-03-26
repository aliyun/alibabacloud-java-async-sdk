// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link UpdateSmsSignRequest} extends {@link RequestModel}
 *
 * <p>UpdateSmsSignRequest</p>
 */
public class UpdateSmsSignRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplySceneContent")
    private String applySceneContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoreData")
    private java.util.List<String> moreData;

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

    private UpdateSmsSignRequest(Builder builder) {
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

    public static UpdateSmsSignRequest create() {
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
    public java.util.List<String> getMoreData() {
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

    public static final class Builder extends Request.Builder<UpdateSmsSignRequest, Builder> {
        private String applySceneContent; 
        private java.util.List<String> moreData; 
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

        private Builder(UpdateSmsSignRequest request) {
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
         * <li>For registered websites, please enter the domain name registered with MIIT, including HTTP or HTTPS.</li>
         * <li>For launched apps, provide the display link from the app store with HTTP or HTTPS, ensuring the app is online.</li>
         * <li>For public accounts or mini-programs, fill in the full name, ensuring they are online.</li>
         * <li>For e-commerce platform store names (for enterprise users only), provide the display link with HTTP or HTTPS.</li>
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
         * <p>Additional materials, such as uploading business proof documents or screenshots of business operations, to help reviewers understand your business details.</p>
         */
        public Builder moreData(java.util.List<String> moreData) {
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
         * <li>Before applying for an SMS signature, please first <a href="https://help.aliyun.com/zh/sms/user-guide/new-qualification?spm=a2c4g.11186623.0.0.718d187bbkpMRK">apply for qualifications</a>.</li>
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
         * <p>The scenario explanation is one of the reference information for signature review. Please provide a detailed description of the usage scenarios of the launched business, along with verifiable information such as website links, registered domain addresses, app store download links, full names of public accounts or mini-programs, etc. For login scenarios, test account credentials are also required. A well-informed application explanation will enhance the efficiency of signature and template reviews. Refer to the <strong>Application Scenarios</strong> column in the <a href="https://help.aliyun.com/zh/sms/user-guide/signature-specifications-1?spm=a2c4g.11186623.0.i2#section-xup-k46-yi4">Signature Source</a> table for filling in SMS scenarios.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>登录场景申请验证码</p>
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
         * <p>Signature not yet approved.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>阿里云验证码</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>Source of the signature. Values:</p>
         * <ul>
         * <li><strong>0</strong>: Full name or abbreviation of enterprises and institutions.</li>
         * <li><strong>1</strong>: Full name or abbreviation of MIIT-registered websites.</li>
         * <li><strong>2</strong>: Full name or abbreviation of app applications.</li>
         * <li><strong>3</strong>: Full name or abbreviation of public accounts or mini-programs.</li>
         * <li><strong>4</strong>: Full name or abbreviation of e-commerce platform store names.</li>
         * <li><strong>5</strong>: Full name or abbreviation of trademarks.</li>
         * </ul>
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
         * <p>Signature type. It is recommended to use the default value.</p>
         * <ul>
         * <li><strong>0</strong>: Verification code</li>
         * <li><strong>1</strong>: General (default)</li>
         * </ul>
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
         * <p>Whether the signature is for self-use or others.</p>
         * <ul>
         * <li>false: Self-use</li>
         * <li>true: Others<blockquote>
         * <p>Notice: When the signature is for self-use, select the self-use qualification ID; when it&quot;s for others, choose the others&quot; qualification ID.</p>
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
        public UpdateSmsSignRequest build() {
            return new UpdateSmsSignRequest(this);
        } 

    } 

}
