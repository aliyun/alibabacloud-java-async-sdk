// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscriptionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySubscriptionDetailResponseBody</p>
 */
public class QuerySubscriptionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretBindDetailDTO")
    private SecretBindDetailDTO secretBindDetailDTO;

    private QuerySubscriptionDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.secretBindDetailDTO = builder.secretBindDetailDTO;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySubscriptionDetailResponseBody create() {
        return builder().build();
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
     * @return secretBindDetailDTO
     */
    public SecretBindDetailDTO getSecretBindDetailDTO() {
        return this.secretBindDetailDTO;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private SecretBindDetailDTO secretBindDetailDTO; 

        /**
         * The response code.
         * <p>
         * 
         * *   The value OK indicates that the request was successful.
         * *   Other status codes indicate that the request failed. For more information, see [Error codes](~~109196~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information returned after the QuerySubscriptionDetail operation was called.
         */
        public Builder secretBindDetailDTO(SecretBindDetailDTO secretBindDetailDTO) {
            this.secretBindDetailDTO = secretBindDetailDTO;
            return this;
        }

        public QuerySubscriptionDetailResponseBody build() {
            return new QuerySubscriptionDetailResponseBody(this);
        } 

    } 

    public static class SecretBindDetailDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ASRModelId")
        private String ASRModelId;

        @com.aliyun.core.annotation.NameInMap("ASRStatus")
        private Boolean ASRStatus;

        @com.aliyun.core.annotation.NameInMap("CallRestrict")
        private String callRestrict;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("NeedRecord")
        private Boolean needRecord;

        @com.aliyun.core.annotation.NameInMap("PhoneNoA")
        private String phoneNoA;

        @com.aliyun.core.annotation.NameInMap("PhoneNoB")
        private String phoneNoB;

        @com.aliyun.core.annotation.NameInMap("PhoneNoX")
        private String phoneNoX;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("SubsId")
        private String subsId;

        private SecretBindDetailDTO(Builder builder) {
            this.ASRModelId = builder.ASRModelId;
            this.ASRStatus = builder.ASRStatus;
            this.callRestrict = builder.callRestrict;
            this.expireDate = builder.expireDate;
            this.extension = builder.extension;
            this.gmtCreate = builder.gmtCreate;
            this.groupId = builder.groupId;
            this.needRecord = builder.needRecord;
            this.phoneNoA = builder.phoneNoA;
            this.phoneNoB = builder.phoneNoB;
            this.phoneNoX = builder.phoneNoX;
            this.status = builder.status;
            this.subsId = builder.subsId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecretBindDetailDTO create() {
            return builder().build();
        }

        /**
         * @return ASRModelId
         */
        public String getASRModelId() {
            return this.ASRModelId;
        }

        /**
         * @return ASRStatus
         */
        public Boolean getASRStatus() {
            return this.ASRStatus;
        }

        /**
         * @return callRestrict
         */
        public String getCallRestrict() {
            return this.callRestrict;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return needRecord
         */
        public Boolean getNeedRecord() {
            return this.needRecord;
        }

        /**
         * @return phoneNoA
         */
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        /**
         * @return phoneNoB
         */
        public String getPhoneNoB() {
            return this.phoneNoB;
        }

        /**
         * @return phoneNoX
         */
        public String getPhoneNoX() {
            return this.phoneNoX;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return subsId
         */
        public String getSubsId() {
            return this.subsId;
        }

        public static final class Builder {
            private String ASRModelId; 
            private Boolean ASRStatus; 
            private String callRestrict; 
            private String expireDate; 
            private String extension; 
            private String gmtCreate; 
            private Long groupId; 
            private Boolean needRecord; 
            private String phoneNoA; 
            private String phoneNoB; 
            private String phoneNoX; 
            private Long status; 
            private String subsId; 

            /**
             * The ID of the ASR model.
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * Indicates whether automatic speech recognition (ASR) is enabled. Valid values:
             * <p>
             * 
             * *   **false**: ASR is disabled.
             * *   **true**: ASR is enabled.
             */
            public Builder ASRStatus(Boolean ASRStatus) {
                this.ASRStatus = ASRStatus;
                return this;
            }

            /**
             * The status of one-way call restrictions. No value is returned for this parameter if one-way call restrictions are not set. Valid values:
             * <p>
             * 
             * *   **CONTROL_AX_DISABLE**: Phone number A cannot be used to call phone number X.
             * *   **CONTROL_BX_DISABLE**: Phone number B cannot be used to call phone number X.
             */
            public Builder callRestrict(String callRestrict) {
                this.callRestrict = callRestrict;
                return this;
            }

            /**
             * The expiration time of the binding.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * The extension in the AXG extension binding.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * The creation time of the binding.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The ID of number group G in the binding.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Indicates whether all calls made by the bound phone numbers are recorded. Valid values:
             * <p>
             * 
             * *   **false**
             * *   **true**
             */
            public Builder needRecord(Boolean needRecord) {
                this.needRecord = needRecord;
                return this;
            }

            /**
             * Phone number A in the binding.
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * Phone number B in the binding.
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * The private number in the binding, that is, phone number X.
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * The binding status. Valid values:
             * <p>
             * 
             * *   **0**: The binding expired.
             * *   **1**: The binding is in effect.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * The binding ID.
             */
            public Builder subsId(String subsId) {
                this.subsId = subsId;
                return this;
            }

            public SecretBindDetailDTO build() {
                return new SecretBindDetailDTO(this);
            } 

        } 

    }
}
