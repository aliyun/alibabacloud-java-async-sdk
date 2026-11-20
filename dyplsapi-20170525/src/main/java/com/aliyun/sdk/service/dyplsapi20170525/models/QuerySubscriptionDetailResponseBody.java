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

        private Builder() {
        } 

        private Builder(QuerySubscriptionDetailResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.secretBindDetailDTO = model.secretBindDetailDTO;
        } 

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li>OK indicates that the request was successful.</li>
         * <li>For other error codes, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
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
         * <p>The description of the status code.</p>
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
         * <p>The data structure returned when the API call is successful.</p>
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

            private Builder() {
            } 

            private Builder(SecretBindDetailDTO model) {
                this.ASRModelId = model.ASRModelId;
                this.ASRStatus = model.ASRStatus;
                this.callRestrict = model.callRestrict;
                this.expireDate = model.expireDate;
                this.extension = model.extension;
                this.gmtCreate = model.gmtCreate;
                this.groupId = model.groupId;
                this.needRecord = model.needRecord;
                this.phoneNoA = model.phoneNoA;
                this.phoneNoB = model.phoneNoB;
                this.phoneNoX = model.phoneNoX;
                this.status = model.status;
                this.subsId = model.subsId;
            } 

            /**
             * <p>The ASR model ID. Valid values:</p>
             * <ul>
             * <li><p>General-Telephone-Mandarin Chinese model ID: 7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
             * </li>
             * <li><p>General-Telephone-Cantonese Chinese model ID: 9b4afe3d224e4fa3bf963697113e2f77</p>
             * </li>
             * <li><p>General-Telephone-Regional Accent model ID: 3655a6cb94764145a1f9a38a3c3b3b4b</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7ee372834d2f4cc7ac0d0ab2d0ae1aac</p>
             */
            public Builder ASRModelId(String ASRModelId) {
                this.ASRModelId = ASRModelId;
                return this;
            }

            /**
             * <p>The Automatic Speech Recognition (ASR) status. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: Disabled.</li>
             * <li><strong>true</strong>: Enabled.</li>
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
             * <p>The one-way call restriction status. This parameter is not returned if no one-way call restriction is configured. Valid values:</p>
             * <ul>
             * <li><strong>CONTROL_AX_DISABLE</strong>: Phone number A cannot call phone number X.</li>
             * <li><strong>CONTROL_BX_DISABLE</strong>: Phone number B cannot call phone number X.</li>
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
             * <p>The expiration time of the binding relationship, in the format of YYYY-MM-DD HH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-05 12:00:00</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>The extension number in the AXG extension binding.</p>
             * 
             * <strong>example:</strong>
             * <p>130</p>
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * <p>The time when the binding relationship was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-03-05 12:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The ID of the number group G (GID) in the binding relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>200001234****</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>Indicates whether all calls generated by this binding relationship are recorded. Valid values:</p>
             * <ul>
             * <li><strong>false</strong>: Calls are not recorded.</li>
             * <li><strong>true</strong>: Calls are recorded.</li>
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
             * <p>The phone number A in the binding relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>139****0000</p>
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * <p>The phone number B in the binding relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>138****0000</p>
             */
            public Builder phoneNoB(String phoneNoB) {
                this.phoneNoB = phoneNoB;
                return this;
            }

            /**
             * <p>The private number in the binding relationship, which is the X number.</p>
             * 
             * <strong>example:</strong>
             * <p>139****1111</p>
             */
            public Builder phoneNoX(String phoneNoX) {
                this.phoneNoX = phoneNoX;
                return this;
            }

            /**
             * <p>The status of the binding relationship. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Expired.</li>
             * <li><strong>1</strong>: Active.</li>
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
             * <p>The binding relationship ID.</p>
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
