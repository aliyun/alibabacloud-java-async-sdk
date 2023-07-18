// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDomainResponseBody</p>
 */
public class DescribeCdnDomainResponseBody extends TeaModel {
    @NameInMap("AuthConfig")
    private AuthConfig authConfig;

    @NameInMap("CorsConfig")
    private CorsConfig corsConfig;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("IpConfig")
    private IpConfig ipConfig;

    @NameInMap("RefererConfig")
    private RefererConfig refererConfig;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceStatus")
    private String serviceStatus;

    @NameInMap("SpaceId")
    private String spaceId;

    @NameInMap("UaConfig")
    private UaConfig uaConfig;

    private DescribeCdnDomainResponseBody(Builder builder) {
        this.authConfig = builder.authConfig;
        this.corsConfig = builder.corsConfig;
        this.domainName = builder.domainName;
        this.ipConfig = builder.ipConfig;
        this.refererConfig = builder.refererConfig;
        this.requestId = builder.requestId;
        this.serviceStatus = builder.serviceStatus;
        this.spaceId = builder.spaceId;
        this.uaConfig = builder.uaConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return authConfig
     */
    public AuthConfig getAuthConfig() {
        return this.authConfig;
    }

    /**
     * @return corsConfig
     */
    public CorsConfig getCorsConfig() {
        return this.corsConfig;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ipConfig
     */
    public IpConfig getIpConfig() {
        return this.ipConfig;
    }

    /**
     * @return refererConfig
     */
    public RefererConfig getRefererConfig() {
        return this.refererConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceStatus
     */
    public String getServiceStatus() {
        return this.serviceStatus;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return uaConfig
     */
    public UaConfig getUaConfig() {
        return this.uaConfig;
    }

    public static final class Builder {
        private AuthConfig authConfig; 
        private CorsConfig corsConfig; 
        private String domainName; 
        private IpConfig ipConfig; 
        private RefererConfig refererConfig; 
        private String requestId; 
        private String serviceStatus; 
        private String spaceId; 
        private UaConfig uaConfig; 

        /**
         * AuthConfig.
         */
        public Builder authConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * CorsConfig.
         */
        public Builder corsConfig(CorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * IpConfig.
         */
        public Builder ipConfig(IpConfig ipConfig) {
            this.ipConfig = ipConfig;
            return this;
        }

        /**
         * RefererConfig.
         */
        public Builder refererConfig(RefererConfig refererConfig) {
            this.refererConfig = refererConfig;
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
         * ServiceStatus.
         */
        public Builder serviceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.spaceId = spaceId;
            return this;
        }

        /**
         * UaConfig.
         */
        public Builder uaConfig(UaConfig uaConfig) {
            this.uaConfig = uaConfig;
            return this;
        }

        public DescribeCdnDomainResponseBody build() {
            return new DescribeCdnDomainResponseBody(this);
        } 

    } 

    public static class AuthConfig extends TeaModel {
        @NameInMap("AuthDelta")
        private Integer authDelta;

        @NameInMap("AuthKey")
        private String authKey;

        @NameInMap("AuthType")
        private String authType;

        @NameInMap("configId")
        private String configId;

        private AuthConfig(Builder builder) {
            this.authDelta = builder.authDelta;
            this.authKey = builder.authKey;
            this.authType = builder.authType;
            this.configId = builder.configId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthConfig create() {
            return builder().build();
        }

        /**
         * @return authDelta
         */
        public Integer getAuthDelta() {
            return this.authDelta;
        }

        /**
         * @return authKey
         */
        public String getAuthKey() {
            return this.authKey;
        }

        /**
         * @return authType
         */
        public String getAuthType() {
            return this.authType;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        public static final class Builder {
            private Integer authDelta; 
            private String authKey; 
            private String authType; 
            private String configId; 

            /**
             * AuthDelta.
             */
            public Builder authDelta(Integer authDelta) {
                this.authDelta = authDelta;
                return this;
            }

            /**
             * AuthKey.
             */
            public Builder authKey(String authKey) {
                this.authKey = authKey;
                return this;
            }

            /**
             * AuthType.
             */
            public Builder authType(String authType) {
                this.authType = authType;
                return this;
            }

            /**
             * configId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            public AuthConfig build() {
                return new AuthConfig(this);
            } 

        } 

    }
    public static class CorsConfig extends TeaModel {
        @NameInMap("AccessOriginControl")
        private Boolean accessOriginControl;

        @NameInMap("AllowOrigin")
        private String allowOrigin;

        @NameInMap("ConfigId")
        private String configId;

        private CorsConfig(Builder builder) {
            this.accessOriginControl = builder.accessOriginControl;
            this.allowOrigin = builder.allowOrigin;
            this.configId = builder.configId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorsConfig create() {
            return builder().build();
        }

        /**
         * @return accessOriginControl
         */
        public Boolean getAccessOriginControl() {
            return this.accessOriginControl;
        }

        /**
         * @return allowOrigin
         */
        public String getAllowOrigin() {
            return this.allowOrigin;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        public static final class Builder {
            private Boolean accessOriginControl; 
            private String allowOrigin; 
            private String configId; 

            /**
             * AccessOriginControl.
             */
            public Builder accessOriginControl(Boolean accessOriginControl) {
                this.accessOriginControl = accessOriginControl;
                return this;
            }

            /**
             * AllowOrigin.
             */
            public Builder allowOrigin(String allowOrigin) {
                this.allowOrigin = allowOrigin;
                return this;
            }

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            public CorsConfig build() {
                return new CorsConfig(this);
            } 

        } 

    }
    public static class IpConfig extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("IpList")
        private String ipList;

        @NameInMap("Type")
        private String type;

        private IpConfig(Builder builder) {
            this.configId = builder.configId;
            this.ipList = builder.ipList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpConfig create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String configId; 
            private String ipList; 
            private String type; 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public IpConfig build() {
                return new IpConfig(this);
            } 

        } 

    }
    public static class RefererConfig extends TeaModel {
        @NameInMap("AllowEmpty")
        private String allowEmpty;

        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("DisableAst")
        private String disableAst;

        @NameInMap("ReferList")
        private String referList;

        @NameInMap("Type")
        private String type;

        private RefererConfig(Builder builder) {
            this.allowEmpty = builder.allowEmpty;
            this.configId = builder.configId;
            this.disableAst = builder.disableAst;
            this.referList = builder.referList;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefererConfig create() {
            return builder().build();
        }

        /**
         * @return allowEmpty
         */
        public String getAllowEmpty() {
            return this.allowEmpty;
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return disableAst
         */
        public String getDisableAst() {
            return this.disableAst;
        }

        /**
         * @return referList
         */
        public String getReferList() {
            return this.referList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String allowEmpty; 
            private String configId; 
            private String disableAst; 
            private String referList; 
            private String type; 

            /**
             * AllowEmpty.
             */
            public Builder allowEmpty(String allowEmpty) {
                this.allowEmpty = allowEmpty;
                return this;
            }

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * DisableAst.
             */
            public Builder disableAst(String disableAst) {
                this.disableAst = disableAst;
                return this;
            }

            /**
             * ReferList.
             */
            public Builder referList(String referList) {
                this.referList = referList;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RefererConfig build() {
                return new RefererConfig(this);
            } 

        } 

    }
    public static class UaConfig extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("Type")
        private String type;

        @NameInMap("UaList")
        private String uaList;

        private UaConfig(Builder builder) {
            this.configId = builder.configId;
            this.type = builder.type;
            this.uaList = builder.uaList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UaConfig create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uaList
         */
        public String getUaList() {
            return this.uaList;
        }

        public static final class Builder {
            private String configId; 
            private String type; 
            private String uaList; 

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UaList.
             */
            public Builder uaList(String uaList) {
                this.uaList = uaList;
                return this;
            }

            public UaConfig build() {
                return new UaConfig(this);
            } 

        } 

    }
}
