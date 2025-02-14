// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
         * <p>The response code.</p>
         * <ul>
         * <li>The value OK indicates that the request was successful.</li>
         * <li>Other status codes indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>066E6E47-04CB-4774-A976-4F73CB76D4A3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information returned after the QuerySubscriptionDetail operation was called.</p>
         */
        public Builder secretBindDetailDTO(SecretBindDetailDTO secretBindDetailDTO) {
            this.secretBindDetailDTO = secretBindDetailDTO;
            return this;
        }

        public QuerySubscriptionDetailResponseBody build() {
            return new QuerySubscriptionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySubscriptionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySubscriptionDetailResponseBody</p>
     */
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
             * <p>The ID of the ASR model.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * <p>Indicates whether automatic speech recognition (ASR) is enabled. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: ASR is disabled.</li>
             * <li><strong>true</strong>: ASR is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ASRStatus(Boolean ASRStatus) {
                this.ASRStatus = ASRStatus;
                return this;
            }

            /**
             * <p>The status of one-way call restrictions. No value is returned for this parameter if one-way call restrictions are not set. Valid values:</p>
             * <ul>
             * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot be used to call phone number X.</li>
             * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot be used to call phone number X.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CONTROL_BX_DISABLE</p>
             */
            public Builder callRestrict(String callRestrict) {
                this.callRestrict = callRestrict;
                return this;
            }

            /**
             * <p>The expiration time of the binding.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-05 12:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The extension in the AXG extension binding.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The creation time of the binding.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-05 12:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of number group G in the binding.</p>
             * 
             * <strong>example:</strong>
             * <p>2000000130001</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether all calls made by the bound phone numbers are recorded. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder needRecord(Boolean needRecord) {
                this.needRecord = needRecord;
                return this;
            }

            /**
             * <p>Phone number A in the binding.</p>
             * 
             * <strong>example:</strong>
             * <p>13900001111</p>
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * <p>Phone number B in the binding.</p>
             * 
             * <strong>example:</strong>
             * <p>13900002222</p>
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * <p>The private number in the binding, that is, phone number X.</p>
             * 
             * <strong>example:</strong>
             * <p>13900001234</p>
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * <p>The binding status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The binding expired.</li>
             * <li><strong>1</strong>: The binding is in effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The binding ID.</p>
             * 
             * <strong>example:</strong>
             * <p>100000076879****</p>
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
