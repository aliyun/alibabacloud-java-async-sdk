// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link GetTrialInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrialInfoResponseBody</p>
 */
public class GetTrialInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TrialInfo")
    private TrialInfo trialInfo;

    private GetTrialInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.trialInfo = builder.trialInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrialInfoResponseBody create() {
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

    /**
     * @return trialInfo
     */
    public TrialInfo getTrialInfo() {
        return this.trialInfo;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private TrialInfo trialInfo; 

        private Builder() {
        } 

        private Builder(GetTrialInfoResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.trialInfo = model.trialInfo;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * TrialInfo.
         */
        public Builder trialInfo(TrialInfo trialInfo) {
            this.trialInfo = trialInfo;
            return this;
        }

        public GetTrialInfoResponseBody build() {
            return new GetTrialInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrialInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrialInfoResponseBody</p>
     */
    public static class TrialInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeepAfterTrialExpiration")
        private Boolean keepAfterTrialExpiration;

        @com.aliyun.core.annotation.NameInMap("TrialBackupPlanQuota")
        private Long trialBackupPlanQuota;

        @com.aliyun.core.annotation.NameInMap("TrialExpireTime")
        private Long trialExpireTime;

        @com.aliyun.core.annotation.NameInMap("TrialStartTime")
        private Long trialStartTime;

        @com.aliyun.core.annotation.NameInMap("TrialVaultQuota")
        private Long trialVaultQuota;

        @com.aliyun.core.annotation.NameInMap("TrialVaultReleaseTime")
        private Long trialVaultReleaseTime;

        private TrialInfo(Builder builder) {
            this.keepAfterTrialExpiration = builder.keepAfterTrialExpiration;
            this.trialBackupPlanQuota = builder.trialBackupPlanQuota;
            this.trialExpireTime = builder.trialExpireTime;
            this.trialStartTime = builder.trialStartTime;
            this.trialVaultQuota = builder.trialVaultQuota;
            this.trialVaultReleaseTime = builder.trialVaultReleaseTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrialInfo create() {
            return builder().build();
        }

        /**
         * @return keepAfterTrialExpiration
         */
        public Boolean getKeepAfterTrialExpiration() {
            return this.keepAfterTrialExpiration;
        }

        /**
         * @return trialBackupPlanQuota
         */
        public Long getTrialBackupPlanQuota() {
            return this.trialBackupPlanQuota;
        }

        /**
         * @return trialExpireTime
         */
        public Long getTrialExpireTime() {
            return this.trialExpireTime;
        }

        /**
         * @return trialStartTime
         */
        public Long getTrialStartTime() {
            return this.trialStartTime;
        }

        /**
         * @return trialVaultQuota
         */
        public Long getTrialVaultQuota() {
            return this.trialVaultQuota;
        }

        /**
         * @return trialVaultReleaseTime
         */
        public Long getTrialVaultReleaseTime() {
            return this.trialVaultReleaseTime;
        }

        public static final class Builder {
            private Boolean keepAfterTrialExpiration; 
            private Long trialBackupPlanQuota; 
            private Long trialExpireTime; 
            private Long trialStartTime; 
            private Long trialVaultQuota; 
            private Long trialVaultReleaseTime; 

            private Builder() {
            } 

            private Builder(TrialInfo model) {
                this.keepAfterTrialExpiration = model.keepAfterTrialExpiration;
                this.trialBackupPlanQuota = model.trialBackupPlanQuota;
                this.trialExpireTime = model.trialExpireTime;
                this.trialStartTime = model.trialStartTime;
                this.trialVaultQuota = model.trialVaultQuota;
                this.trialVaultReleaseTime = model.trialVaultReleaseTime;
            } 

            /**
             * KeepAfterTrialExpiration.
             */
            public Builder keepAfterTrialExpiration(Boolean keepAfterTrialExpiration) {
                this.keepAfterTrialExpiration = keepAfterTrialExpiration;
                return this;
            }

            /**
             * TrialBackupPlanQuota.
             */
            public Builder trialBackupPlanQuota(Long trialBackupPlanQuota) {
                this.trialBackupPlanQuota = trialBackupPlanQuota;
                return this;
            }

            /**
             * TrialExpireTime.
             */
            public Builder trialExpireTime(Long trialExpireTime) {
                this.trialExpireTime = trialExpireTime;
                return this;
            }

            /**
             * TrialStartTime.
             */
            public Builder trialStartTime(Long trialStartTime) {
                this.trialStartTime = trialStartTime;
                return this;
            }

            /**
             * TrialVaultQuota.
             */
            public Builder trialVaultQuota(Long trialVaultQuota) {
                this.trialVaultQuota = trialVaultQuota;
                return this;
            }

            /**
             * TrialVaultReleaseTime.
             */
            public Builder trialVaultReleaseTime(Long trialVaultReleaseTime) {
                this.trialVaultReleaseTime = trialVaultReleaseTime;
                return this;
            }

            public TrialInfo build() {
                return new TrialInfo(this);
            } 

        } 

    }
}
