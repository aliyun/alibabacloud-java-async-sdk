// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

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
 * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetLoginTokenResponseBody</p>
 */
public class GetLoginTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessType")
    private String accessType;

    @com.aliyun.core.annotation.NameInMap("AccountType")
    private String accountType;

    @com.aliyun.core.annotation.NameInMap("AdDomain")
    private String adDomain;

    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.NameInMap("IdpId")
    private String idpId;

    @com.aliyun.core.annotation.NameInMap("Industry")
    private String industry;

    @com.aliyun.core.annotation.NameInMap("KeepAliveToken")
    private String keepAliveToken;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.NameInMap("MfaTypeList")
    private java.util.List<MfaTypeList> mfaTypeList;

    @com.aliyun.core.annotation.NameInMap("NextStage")
    private String nextStage;

    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.NameInMap("OfficeSites")
    private java.util.List<String> officeSites;

    @com.aliyun.core.annotation.NameInMap("PasswordStrategy")
    private PasswordStrategy passwordStrategy;

    @com.aliyun.core.annotation.NameInMap("Phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("Props")
    private java.util.Map<String, String> props;

    @com.aliyun.core.annotation.NameInMap("QrCodePng")
    private String qrCodePng;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskVerifyInfo")
    private RiskVerifyInfo riskVerifyInfo;

    @com.aliyun.core.annotation.NameInMap("Secret")
    private String secret;

    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("TenantAlias")
    private String tenantAlias;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("TenantInfos")
    private java.util.List<TenantInfos> tenantInfos;

    @com.aliyun.core.annotation.NameInMap("VpcRegionId")
    private String vpcRegionId;

    @com.aliyun.core.annotation.NameInMap("WindowDisplayMode")
    private String windowDisplayMode;

    @com.aliyun.core.annotation.NameInMap("WyId")
    private String wyId;

    private GetLoginTokenResponseBody(Builder builder) {
        this.accessType = builder.accessType;
        this.accountType = builder.accountType;
        this.adDomain = builder.adDomain;
        this.email = builder.email;
        this.endUserId = builder.endUserId;
        this.idpId = builder.idpId;
        this.industry = builder.industry;
        this.keepAliveToken = builder.keepAliveToken;
        this.label = builder.label;
        this.loginToken = builder.loginToken;
        this.mfaTypeList = builder.mfaTypeList;
        this.nextStage = builder.nextStage;
        this.nickName = builder.nickName;
        this.officeSites = builder.officeSites;
        this.passwordStrategy = builder.passwordStrategy;
        this.phone = builder.phone;
        this.props = builder.props;
        this.qrCodePng = builder.qrCodePng;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.riskVerifyInfo = builder.riskVerifyInfo;
        this.secret = builder.secret;
        this.sessionId = builder.sessionId;
        this.tenantAlias = builder.tenantAlias;
        this.tenantId = builder.tenantId;
        this.tenantInfos = builder.tenantInfos;
        this.vpcRegionId = builder.vpcRegionId;
        this.windowDisplayMode = builder.windowDisplayMode;
        this.wyId = builder.wyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLoginTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return accountType
     */
    public String getAccountType() {
        return this.accountType;
    }

    /**
     * @return adDomain
     */
    public String getAdDomain() {
        return this.adDomain;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return idpId
     */
    public String getIdpId() {
        return this.idpId;
    }

    /**
     * @return industry
     */
    public String getIndustry() {
        return this.industry;
    }

    /**
     * @return keepAliveToken
     */
    public String getKeepAliveToken() {
        return this.keepAliveToken;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return mfaTypeList
     */
    public java.util.List<MfaTypeList> getMfaTypeList() {
        return this.mfaTypeList;
    }

    /**
     * @return nextStage
     */
    public String getNextStage() {
        return this.nextStage;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return officeSites
     */
    public java.util.List<String> getOfficeSites() {
        return this.officeSites;
    }

    /**
     * @return passwordStrategy
     */
    public PasswordStrategy getPasswordStrategy() {
        return this.passwordStrategy;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return props
     */
    public java.util.Map<String, String> getProps() {
        return this.props;
    }

    /**
     * @return qrCodePng
     */
    public String getQrCodePng() {
        return this.qrCodePng;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskVerifyInfo
     */
    public RiskVerifyInfo getRiskVerifyInfo() {
        return this.riskVerifyInfo;
    }

    /**
     * @return secret
     */
    public String getSecret() {
        return this.secret;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantAlias
     */
    public String getTenantAlias() {
        return this.tenantAlias;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantInfos
     */
    public java.util.List<TenantInfos> getTenantInfos() {
        return this.tenantInfos;
    }

    /**
     * @return vpcRegionId
     */
    public String getVpcRegionId() {
        return this.vpcRegionId;
    }

    /**
     * @return windowDisplayMode
     */
    public String getWindowDisplayMode() {
        return this.windowDisplayMode;
    }

    /**
     * @return wyId
     */
    public String getWyId() {
        return this.wyId;
    }

    public static final class Builder {
        private String accessType; 
        private String accountType; 
        private String adDomain; 
        private String email; 
        private String endUserId; 
        private String idpId; 
        private String industry; 
        private String keepAliveToken; 
        private String label; 
        private String loginToken; 
        private java.util.List<MfaTypeList> mfaTypeList; 
        private String nextStage; 
        private String nickName; 
        private java.util.List<String> officeSites; 
        private PasswordStrategy passwordStrategy; 
        private String phone; 
        private java.util.Map<String, String> props; 
        private String qrCodePng; 
        private String reason; 
        private String requestId; 
        private RiskVerifyInfo riskVerifyInfo; 
        private String secret; 
        private String sessionId; 
        private String tenantAlias; 
        private Long tenantId; 
        private java.util.List<TenantInfos> tenantInfos; 
        private String vpcRegionId; 
        private String windowDisplayMode; 
        private String wyId; 

        private Builder() {
        } 

        private Builder(GetLoginTokenResponseBody model) {
            this.accessType = model.accessType;
            this.accountType = model.accountType;
            this.adDomain = model.adDomain;
            this.email = model.email;
            this.endUserId = model.endUserId;
            this.idpId = model.idpId;
            this.industry = model.industry;
            this.keepAliveToken = model.keepAliveToken;
            this.label = model.label;
            this.loginToken = model.loginToken;
            this.mfaTypeList = model.mfaTypeList;
            this.nextStage = model.nextStage;
            this.nickName = model.nickName;
            this.officeSites = model.officeSites;
            this.passwordStrategy = model.passwordStrategy;
            this.phone = model.phone;
            this.props = model.props;
            this.qrCodePng = model.qrCodePng;
            this.reason = model.reason;
            this.requestId = model.requestId;
            this.riskVerifyInfo = model.riskVerifyInfo;
            this.secret = model.secret;
            this.sessionId = model.sessionId;
            this.tenantAlias = model.tenantAlias;
            this.tenantId = model.tenantId;
            this.tenantInfos = model.tenantInfos;
            this.vpcRegionId = model.vpcRegionId;
            this.windowDisplayMode = model.windowDisplayMode;
            this.wyId = model.wyId;
        } 

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.accessType = accessType;
            return this;
        }

        /**
         * AccountType.
         */
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * AdDomain.
         */
        public Builder adDomain(String adDomain) {
            this.adDomain = adDomain;
            return this;
        }

        /**
         * Email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.endUserId = endUserId;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(String idpId) {
            this.idpId = idpId;
            return this;
        }

        /**
         * Industry.
         */
        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        /**
         * KeepAliveToken.
         */
        public Builder keepAliveToken(String keepAliveToken) {
            this.keepAliveToken = keepAliveToken;
            return this;
        }

        /**
         * Label.
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * MfaTypeList.
         */
        public Builder mfaTypeList(java.util.List<MfaTypeList> mfaTypeList) {
            this.mfaTypeList = mfaTypeList;
            return this;
        }

        /**
         * NextStage.
         */
        public Builder nextStage(String nextStage) {
            this.nextStage = nextStage;
            return this;
        }

        /**
         * NickName.
         */
        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        /**
         * OfficeSites.
         */
        public Builder officeSites(java.util.List<String> officeSites) {
            this.officeSites = officeSites;
            return this;
        }

        /**
         * PasswordStrategy.
         */
        public Builder passwordStrategy(PasswordStrategy passwordStrategy) {
            this.passwordStrategy = passwordStrategy;
            return this;
        }

        /**
         * Phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Props.
         */
        public Builder props(java.util.Map<String, String> props) {
            this.props = props;
            return this;
        }

        /**
         * QrCodePng.
         */
        public Builder qrCodePng(String qrCodePng) {
            this.qrCodePng = qrCodePng;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskVerifyInfo.
         */
        public Builder riskVerifyInfo(RiskVerifyInfo riskVerifyInfo) {
            this.riskVerifyInfo = riskVerifyInfo;
            return this;
        }

        /**
         * Secret.
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * TenantAlias.
         */
        public Builder tenantAlias(String tenantAlias) {
            this.tenantAlias = tenantAlias;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantInfos.
         */
        public Builder tenantInfos(java.util.List<TenantInfos> tenantInfos) {
            this.tenantInfos = tenantInfos;
            return this;
        }

        /**
         * VpcRegionId.
         */
        public Builder vpcRegionId(String vpcRegionId) {
            this.vpcRegionId = vpcRegionId;
            return this;
        }

        /**
         * WindowDisplayMode.
         */
        public Builder windowDisplayMode(String windowDisplayMode) {
            this.windowDisplayMode = windowDisplayMode;
            return this;
        }

        /**
         * WyId.
         */
        public Builder wyId(String wyId) {
            this.wyId = wyId;
            return this;
        }

        public GetLoginTokenResponseBody build() {
            return new GetLoginTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
    public static class MfaTypeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        private MfaTypeList(Builder builder) {
            this.name = builder.name;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MfaTypeList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String name; 
            private String stage; 

            private Builder() {
            } 

            private Builder(MfaTypeList model) {
                this.name = model.name;
                this.stage = model.stage;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public MfaTypeList build() {
                return new MfaTypeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
    public static class PasswordStrategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TenantAlternativeChars")
        private java.util.List<String> tenantAlternativeChars;

        @com.aliyun.core.annotation.NameInMap("TenantPasswordLength")
        private Integer tenantPasswordLength;

        private PasswordStrategy(Builder builder) {
            this.tenantAlternativeChars = builder.tenantAlternativeChars;
            this.tenantPasswordLength = builder.tenantPasswordLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PasswordStrategy create() {
            return builder().build();
        }

        /**
         * @return tenantAlternativeChars
         */
        public java.util.List<String> getTenantAlternativeChars() {
            return this.tenantAlternativeChars;
        }

        /**
         * @return tenantPasswordLength
         */
        public Integer getTenantPasswordLength() {
            return this.tenantPasswordLength;
        }

        public static final class Builder {
            private java.util.List<String> tenantAlternativeChars; 
            private Integer tenantPasswordLength; 

            private Builder() {
            } 

            private Builder(PasswordStrategy model) {
                this.tenantAlternativeChars = model.tenantAlternativeChars;
                this.tenantPasswordLength = model.tenantPasswordLength;
            } 

            /**
             * TenantAlternativeChars.
             */
            public Builder tenantAlternativeChars(java.util.List<String> tenantAlternativeChars) {
                this.tenantAlternativeChars = tenantAlternativeChars;
                return this;
            }

            /**
             * TenantPasswordLength.
             */
            public Builder tenantPasswordLength(Integer tenantPasswordLength) {
                this.tenantPasswordLength = tenantPasswordLength;
                return this;
            }

            public PasswordStrategy build() {
                return new PasswordStrategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
    public static class RiskVerifyInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LastLockDuration")
        private Long lastLockDuration;

        @com.aliyun.core.annotation.NameInMap("Locked")
        private Boolean locked;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private RiskVerifyInfo(Builder builder) {
            this.email = builder.email;
            this.lastLockDuration = builder.lastLockDuration;
            this.locked = builder.locked;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskVerifyInfo create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return lastLockDuration
         */
        public Long getLastLockDuration() {
            return this.lastLockDuration;
        }

        /**
         * @return locked
         */
        public Boolean getLocked() {
            return this.locked;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String email; 
            private Long lastLockDuration; 
            private Boolean locked; 
            private String phone; 

            private Builder() {
            } 

            private Builder(RiskVerifyInfo model) {
                this.email = model.email;
                this.lastLockDuration = model.lastLockDuration;
                this.locked = model.locked;
                this.phone = model.phone;
            } 

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * LastLockDuration.
             */
            public Builder lastLockDuration(Long lastLockDuration) {
                this.lastLockDuration = lastLockDuration;
                return this;
            }

            /**
             * Locked.
             */
            public Builder locked(Boolean locked) {
                this.locked = locked;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public RiskVerifyInfo build() {
                return new RiskVerifyInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLoginTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetLoginTokenResponseBody</p>
     */
    public static class TenantInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("TenantAlias")
        private String tenantAlias;

        private TenantInfos(Builder builder) {
            this.accessType = builder.accessType;
            this.tenantAlias = builder.tenantAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantInfos create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return tenantAlias
         */
        public String getTenantAlias() {
            return this.tenantAlias;
        }

        public static final class Builder {
            private String accessType; 
            private String tenantAlias; 

            private Builder() {
            } 

            private Builder(TenantInfos model) {
                this.accessType = model.accessType;
                this.tenantAlias = model.tenantAlias;
            } 

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * TenantAlias.
             */
            public Builder tenantAlias(String tenantAlias) {
                this.tenantAlias = tenantAlias;
                return this;
            }

            public TenantInfos build() {
                return new TenantInfos(this);
            } 

        } 

    }
}
