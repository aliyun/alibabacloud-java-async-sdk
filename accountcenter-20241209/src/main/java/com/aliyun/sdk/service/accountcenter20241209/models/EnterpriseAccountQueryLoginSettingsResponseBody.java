// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseAccountQueryLoginSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseAccountQueryLoginSettingsResponseBody</p>
 */
public class EnterpriseAccountQueryLoginSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseAccountQueryLoginSettingsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseAccountQueryLoginSettingsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseAccountQueryLoginSettingsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public EnterpriseAccountQueryLoginSettingsResponseBody build() {
            return new EnterpriseAccountQueryLoginSettingsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseAccountQueryLoginSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseAccountQueryLoginSettingsResponseBody</p>
     */
    public static class IpMaskDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpMaskEnabledStatus")
        private String ipMaskEnabledStatus;

        @com.aliyun.core.annotation.NameInMap("IpMasks")
        private java.util.List<String> ipMasks;

        private IpMaskDto(Builder builder) {
            this.ipMaskEnabledStatus = builder.ipMaskEnabledStatus;
            this.ipMasks = builder.ipMasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpMaskDto create() {
            return builder().build();
        }

        /**
         * @return ipMaskEnabledStatus
         */
        public String getIpMaskEnabledStatus() {
            return this.ipMaskEnabledStatus;
        }

        /**
         * @return ipMasks
         */
        public java.util.List<String> getIpMasks() {
            return this.ipMasks;
        }

        public static final class Builder {
            private String ipMaskEnabledStatus; 
            private java.util.List<String> ipMasks; 

            private Builder() {
            } 

            private Builder(IpMaskDto model) {
                this.ipMaskEnabledStatus = model.ipMaskEnabledStatus;
                this.ipMasks = model.ipMasks;
            } 

            /**
             * IpMaskEnabledStatus.
             */
            public Builder ipMaskEnabledStatus(String ipMaskEnabledStatus) {
                this.ipMaskEnabledStatus = ipMaskEnabledStatus;
                return this;
            }

            /**
             * IpMasks.
             */
            public Builder ipMasks(java.util.List<String> ipMasks) {
                this.ipMasks = ipMasks;
                return this;
            }

            public IpMaskDto build() {
                return new IpMaskDto(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseAccountQueryLoginSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseAccountQueryLoginSettingsResponseBody</p>
     */
    public static class RiskControlDto extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProtectLevel")
        private String protectLevel;

        @com.aliyun.core.annotation.NameInMap("RiskControlEnabled")
        private Boolean riskControlEnabled;

        @com.aliyun.core.annotation.NameInMap("VerifyDetail")
        private String verifyDetail;

        @com.aliyun.core.annotation.NameInMap("VerifyType")
        private String verifyType;

        private RiskControlDto(Builder builder) {
            this.protectLevel = builder.protectLevel;
            this.riskControlEnabled = builder.riskControlEnabled;
            this.verifyDetail = builder.verifyDetail;
            this.verifyType = builder.verifyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskControlDto create() {
            return builder().build();
        }

        /**
         * @return protectLevel
         */
        public String getProtectLevel() {
            return this.protectLevel;
        }

        /**
         * @return riskControlEnabled
         */
        public Boolean getRiskControlEnabled() {
            return this.riskControlEnabled;
        }

        /**
         * @return verifyDetail
         */
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        /**
         * @return verifyType
         */
        public String getVerifyType() {
            return this.verifyType;
        }

        public static final class Builder {
            private String protectLevel; 
            private Boolean riskControlEnabled; 
            private String verifyDetail; 
            private String verifyType; 

            private Builder() {
            } 

            private Builder(RiskControlDto model) {
                this.protectLevel = model.protectLevel;
                this.riskControlEnabled = model.riskControlEnabled;
                this.verifyDetail = model.verifyDetail;
                this.verifyType = model.verifyType;
            } 

            /**
             * ProtectLevel.
             */
            public Builder protectLevel(String protectLevel) {
                this.protectLevel = protectLevel;
                return this;
            }

            /**
             * RiskControlEnabled.
             */
            public Builder riskControlEnabled(Boolean riskControlEnabled) {
                this.riskControlEnabled = riskControlEnabled;
                return this;
            }

            /**
             * VerifyDetail.
             */
            public Builder verifyDetail(String verifyDetail) {
                this.verifyDetail = verifyDetail;
                return this;
            }

            /**
             * VerifyType.
             */
            public Builder verifyType(String verifyType) {
                this.verifyType = verifyType;
                return this;
            }

            public RiskControlDto build() {
                return new RiskControlDto(this);
            } 

        } 

    }
    /**
     * 
     * {@link EnterpriseAccountQueryLoginSettingsResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseAccountQueryLoginSettingsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IpMaskDto")
        private IpMaskDto ipMaskDto;

        @com.aliyun.core.annotation.NameInMap("MfaBindStatus")
        private String mfaBindStatus;

        @com.aliyun.core.annotation.NameInMap("RiskControlDto")
        private RiskControlDto riskControlDto;

        @com.aliyun.core.annotation.NameInMap("SecurityMobileLoginStatus")
        private String securityMobileLoginStatus;

        @com.aliyun.core.annotation.NameInMap("SessionExpireTime")
        private Integer sessionExpireTime;

        private Data(Builder builder) {
            this.ipMaskDto = builder.ipMaskDto;
            this.mfaBindStatus = builder.mfaBindStatus;
            this.riskControlDto = builder.riskControlDto;
            this.securityMobileLoginStatus = builder.securityMobileLoginStatus;
            this.sessionExpireTime = builder.sessionExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ipMaskDto
         */
        public IpMaskDto getIpMaskDto() {
            return this.ipMaskDto;
        }

        /**
         * @return mfaBindStatus
         */
        public String getMfaBindStatus() {
            return this.mfaBindStatus;
        }

        /**
         * @return riskControlDto
         */
        public RiskControlDto getRiskControlDto() {
            return this.riskControlDto;
        }

        /**
         * @return securityMobileLoginStatus
         */
        public String getSecurityMobileLoginStatus() {
            return this.securityMobileLoginStatus;
        }

        /**
         * @return sessionExpireTime
         */
        public Integer getSessionExpireTime() {
            return this.sessionExpireTime;
        }

        public static final class Builder {
            private IpMaskDto ipMaskDto; 
            private String mfaBindStatus; 
            private RiskControlDto riskControlDto; 
            private String securityMobileLoginStatus; 
            private Integer sessionExpireTime; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.ipMaskDto = model.ipMaskDto;
                this.mfaBindStatus = model.mfaBindStatus;
                this.riskControlDto = model.riskControlDto;
                this.securityMobileLoginStatus = model.securityMobileLoginStatus;
                this.sessionExpireTime = model.sessionExpireTime;
            } 

            /**
             * IpMaskDto.
             */
            public Builder ipMaskDto(IpMaskDto ipMaskDto) {
                this.ipMaskDto = ipMaskDto;
                return this;
            }

            /**
             * MfaBindStatus.
             */
            public Builder mfaBindStatus(String mfaBindStatus) {
                this.mfaBindStatus = mfaBindStatus;
                return this;
            }

            /**
             * RiskControlDto.
             */
            public Builder riskControlDto(RiskControlDto riskControlDto) {
                this.riskControlDto = riskControlDto;
                return this;
            }

            /**
             * SecurityMobileLoginStatus.
             */
            public Builder securityMobileLoginStatus(String securityMobileLoginStatus) {
                this.securityMobileLoginStatus = securityMobileLoginStatus;
                return this;
            }

            /**
             * SessionExpireTime.
             */
            public Builder sessionExpireTime(Integer sessionExpireTime) {
                this.sessionExpireTime = sessionExpireTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
