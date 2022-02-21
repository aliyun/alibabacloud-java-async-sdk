// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscriptionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySubscriptionDetailResponseBody</p>
 */
public class QuerySubscriptionDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecretBindDetailDTO")
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
         * SecretBindDetailDTO.
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
        @NameInMap("ASRModelId")
        private String ASRModelId;

        @NameInMap("ASRStatus")
        private Boolean ASRStatus;

        @NameInMap("CallRestrict")
        private String callRestrict;

        @NameInMap("ExpireDate")
        private String expireDate;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GroupId")
        private Long groupId;

        @NameInMap("NeedRecord")
        private Boolean needRecord;

        @NameInMap("PhoneNoA")
        private String phoneNoA;

        @NameInMap("PhoneNoB")
        private String phoneNoB;

        @NameInMap("PhoneNoX")
        private String phoneNoX;

        @NameInMap("Status")
        private Long status;

        @NameInMap("SubsId")
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
             * ASRModelId.
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * ASRStatus.
             */
            public Builder ASRStatus(Boolean ASRStatus) {
                this.ASRStatus = ASRStatus;
                return this;
            }

            /**
             * CallRestrict.
             */
            public Builder callRestrict(String callRestrict) {
                this.callRestrict = callRestrict;
                return this;
            }

            /**
             * ExpireDate.
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * NeedRecord.
             */
            public Builder needRecord(Boolean needRecord) {
                this.needRecord = needRecord;
                return this;
            }

            /**
             * PhoneNoA.
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * PhoneNoB.
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * PhoneNoX.
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * SubsId.
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
