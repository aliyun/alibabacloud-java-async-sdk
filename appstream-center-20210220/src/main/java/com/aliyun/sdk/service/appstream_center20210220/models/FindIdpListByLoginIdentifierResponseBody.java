// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindIdpListByLoginIdentifierResponseBody} extends {@link TeaModel}
 *
 * <p>FindIdpListByLoginIdentifierResponseBody</p>
 */
public class FindIdpListByLoginIdentifierResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdpInfos")
    private java.util.List < IdpInfos> idpInfos;

    @com.aliyun.core.annotation.NameInMap("OfficeSiteInfo")
    private OfficeSiteInfo officeSiteInfo;

    @com.aliyun.core.annotation.NameInMap("PopRegionConfig")
    private java.util.Map < String, String > popRegionConfig;

    @com.aliyun.core.annotation.NameInMap("ProfileRegion")
    private String profileRegion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantAliasInfo")
    private TenantAliasInfo tenantAliasInfo;

    private FindIdpListByLoginIdentifierResponseBody(Builder builder) {
        this.idpInfos = builder.idpInfos;
        this.officeSiteInfo = builder.officeSiteInfo;
        this.popRegionConfig = builder.popRegionConfig;
        this.profileRegion = builder.profileRegion;
        this.requestId = builder.requestId;
        this.tenantAliasInfo = builder.tenantAliasInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindIdpListByLoginIdentifierResponseBody create() {
        return builder().build();
    }

    /**
     * @return idpInfos
     */
    public java.util.List < IdpInfos> getIdpInfos() {
        return this.idpInfos;
    }

    /**
     * @return officeSiteInfo
     */
    public OfficeSiteInfo getOfficeSiteInfo() {
        return this.officeSiteInfo;
    }

    /**
     * @return popRegionConfig
     */
    public java.util.Map < String, String > getPopRegionConfig() {
        return this.popRegionConfig;
    }

    /**
     * @return profileRegion
     */
    public String getProfileRegion() {
        return this.profileRegion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantAliasInfo
     */
    public TenantAliasInfo getTenantAliasInfo() {
        return this.tenantAliasInfo;
    }

    public static final class Builder {
        private java.util.List < IdpInfos> idpInfos; 
        private OfficeSiteInfo officeSiteInfo; 
        private java.util.Map < String, String > popRegionConfig; 
        private String profileRegion; 
        private String requestId; 
        private TenantAliasInfo tenantAliasInfo; 

        /**
         * IdpInfos.
         */
        public Builder idpInfos(java.util.List < IdpInfos> idpInfos) {
            this.idpInfos = idpInfos;
            return this;
        }

        /**
         * OfficeSiteInfo.
         */
        public Builder officeSiteInfo(OfficeSiteInfo officeSiteInfo) {
            this.officeSiteInfo = officeSiteInfo;
            return this;
        }

        /**
         * PopRegionConfig.
         */
        public Builder popRegionConfig(java.util.Map < String, String > popRegionConfig) {
            this.popRegionConfig = popRegionConfig;
            return this;
        }

        /**
         * ProfileRegion.
         */
        public Builder profileRegion(String profileRegion) {
            this.profileRegion = profileRegion;
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
         * TenantAliasInfo.
         */
        public Builder tenantAliasInfo(TenantAliasInfo tenantAliasInfo) {
            this.tenantAliasInfo = tenantAliasInfo;
            return this;
        }

        public FindIdpListByLoginIdentifierResponseBody build() {
            return new FindIdpListByLoginIdentifierResponseBody(this);
        } 

    } 

    public static class IdpInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("Cookies")
        private String cookies;

        @com.aliyun.core.annotation.NameInMap("IdpId")
        private String idpId;

        @com.aliyun.core.annotation.NameInMap("IdpName")
        private String idpName;

        @com.aliyun.core.annotation.NameInMap("IdpProvider")
        private String idpProvider;

        @com.aliyun.core.annotation.NameInMap("JumpSwitch")
        private String jumpSwitch;

        @com.aliyun.core.annotation.NameInMap("SsoProtocol")
        private String ssoProtocol;

        @com.aliyun.core.annotation.NameInMap("SsoServiceUrl")
        private String ssoServiceUrl;

        private IdpInfos(Builder builder) {
            this.accountType = builder.accountType;
            this.cookies = builder.cookies;
            this.idpId = builder.idpId;
            this.idpName = builder.idpName;
            this.idpProvider = builder.idpProvider;
            this.jumpSwitch = builder.jumpSwitch;
            this.ssoProtocol = builder.ssoProtocol;
            this.ssoServiceUrl = builder.ssoServiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IdpInfos create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return cookies
         */
        public String getCookies() {
            return this.cookies;
        }

        /**
         * @return idpId
         */
        public String getIdpId() {
            return this.idpId;
        }

        /**
         * @return idpName
         */
        public String getIdpName() {
            return this.idpName;
        }

        /**
         * @return idpProvider
         */
        public String getIdpProvider() {
            return this.idpProvider;
        }

        /**
         * @return jumpSwitch
         */
        public String getJumpSwitch() {
            return this.jumpSwitch;
        }

        /**
         * @return ssoProtocol
         */
        public String getSsoProtocol() {
            return this.ssoProtocol;
        }

        /**
         * @return ssoServiceUrl
         */
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

        public static final class Builder {
            private String accountType; 
            private String cookies; 
            private String idpId; 
            private String idpName; 
            private String idpProvider; 
            private String jumpSwitch; 
            private String ssoProtocol; 
            private String ssoServiceUrl; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * Cookies.
             */
            public Builder cookies(String cookies) {
                this.cookies = cookies;
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
             * IdpName.
             */
            public Builder idpName(String idpName) {
                this.idpName = idpName;
                return this;
            }

            /**
             * IdpProvider.
             */
            public Builder idpProvider(String idpProvider) {
                this.idpProvider = idpProvider;
                return this;
            }

            /**
             * JumpSwitch.
             */
            public Builder jumpSwitch(String jumpSwitch) {
                this.jumpSwitch = jumpSwitch;
                return this;
            }

            /**
             * SsoProtocol.
             */
            public Builder ssoProtocol(String ssoProtocol) {
                this.ssoProtocol = ssoProtocol;
                return this;
            }

            /**
             * SsoServiceUrl.
             */
            public Builder ssoServiceUrl(String ssoServiceUrl) {
                this.ssoServiceUrl = ssoServiceUrl;
                return this;
            }

            public IdpInfos build() {
                return new IdpInfos(this);
            } 

        } 

    }
    public static class OfficeSiteInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("ProviderId")
        private String providerId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SsoServiceUrl")
        private String ssoServiceUrl;

        private OfficeSiteInfo(Builder builder) {
            this.accessType = builder.accessType;
            this.officeSiteId = builder.officeSiteId;
            this.providerId = builder.providerId;
            this.regionId = builder.regionId;
            this.ssoServiceUrl = builder.ssoServiceUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OfficeSiteInfo create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return providerId
         */
        public String getProviderId() {
            return this.providerId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return ssoServiceUrl
         */
        public String getSsoServiceUrl() {
            return this.ssoServiceUrl;
        }

        public static final class Builder {
            private String accessType; 
            private String officeSiteId; 
            private String providerId; 
            private String regionId; 
            private String ssoServiceUrl; 

            /**
             * AccessType.
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * ProviderId.
             */
            public Builder providerId(String providerId) {
                this.providerId = providerId;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SsoServiceUrl.
             */
            public Builder ssoServiceUrl(String ssoServiceUrl) {
                this.ssoServiceUrl = ssoServiceUrl;
                return this;
            }

            public OfficeSiteInfo build() {
                return new OfficeSiteInfo(this);
            } 

        } 

    }
    public static class TenantAliasInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("TenantAlias")
        private String tenantAlias;

        private TenantAliasInfo(Builder builder) {
            this.accessType = builder.accessType;
            this.tenantAlias = builder.tenantAlias;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantAliasInfo create() {
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

            public TenantAliasInfo build() {
                return new TenantAliasInfo(this);
            } 

        } 

    }
}
