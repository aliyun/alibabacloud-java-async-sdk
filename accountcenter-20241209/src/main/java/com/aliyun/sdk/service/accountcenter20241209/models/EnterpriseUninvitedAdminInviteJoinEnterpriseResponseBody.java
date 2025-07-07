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
 * {@link EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody</p>
 */
public class EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody build() {
            return new EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseUninvitedAdminInviteJoinEnterpriseResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicantAliyunId")
        private String applicantAliyunId;

        @com.aliyun.core.annotation.NameInMap("ApplicantPk")
        private String applicantPk;

        @com.aliyun.core.annotation.NameInMap("ApplyRemark")
        private String applyRemark;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private Long applyTime;

        @com.aliyun.core.annotation.NameInMap("AuditorAliyunId")
        private String auditorAliyunId;

        @com.aliyun.core.annotation.NameInMap("AuditorPk")
        private String auditorPk;

        @com.aliyun.core.annotation.NameInMap("EcId")
        private String ecId;

        @com.aliyun.core.annotation.NameInMap("LeId")
        private String leId;

        @com.aliyun.core.annotation.NameInMap("LeLicenseNo")
        private String leLicenseNo;

        @com.aliyun.core.annotation.NameInMap("LeName")
        private String leName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("NbId")
        private String nbId;

        @com.aliyun.core.annotation.NameInMap("OperatedAliyunId")
        private String operatedAliyunId;

        @com.aliyun.core.annotation.NameInMap("OperatedPk")
        private String operatedPk;

        @com.aliyun.core.annotation.NameInMap("Success")
        private String success;

        @com.aliyun.core.annotation.NameInMap("TimeoutTime")
        private Long timeoutTime;

        @com.aliyun.core.annotation.NameInMap("TodoId")
        private String todoId;

        @com.aliyun.core.annotation.NameInMap("TodoType")
        private String todoType;

        private Data(Builder builder) {
            this.applicantAliyunId = builder.applicantAliyunId;
            this.applicantPk = builder.applicantPk;
            this.applyRemark = builder.applyRemark;
            this.applyTime = builder.applyTime;
            this.auditorAliyunId = builder.auditorAliyunId;
            this.auditorPk = builder.auditorPk;
            this.ecId = builder.ecId;
            this.leId = builder.leId;
            this.leLicenseNo = builder.leLicenseNo;
            this.leName = builder.leName;
            this.message = builder.message;
            this.nbId = builder.nbId;
            this.operatedAliyunId = builder.operatedAliyunId;
            this.operatedPk = builder.operatedPk;
            this.success = builder.success;
            this.timeoutTime = builder.timeoutTime;
            this.todoId = builder.todoId;
            this.todoType = builder.todoType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicantAliyunId
         */
        public String getApplicantAliyunId() {
            return this.applicantAliyunId;
        }

        /**
         * @return applicantPk
         */
        public String getApplicantPk() {
            return this.applicantPk;
        }

        /**
         * @return applyRemark
         */
        public String getApplyRemark() {
            return this.applyRemark;
        }

        /**
         * @return applyTime
         */
        public Long getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return auditorAliyunId
         */
        public String getAuditorAliyunId() {
            return this.auditorAliyunId;
        }

        /**
         * @return auditorPk
         */
        public String getAuditorPk() {
            return this.auditorPk;
        }

        /**
         * @return ecId
         */
        public String getEcId() {
            return this.ecId;
        }

        /**
         * @return leId
         */
        public String getLeId() {
            return this.leId;
        }

        /**
         * @return leLicenseNo
         */
        public String getLeLicenseNo() {
            return this.leLicenseNo;
        }

        /**
         * @return leName
         */
        public String getLeName() {
            return this.leName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return nbId
         */
        public String getNbId() {
            return this.nbId;
        }

        /**
         * @return operatedAliyunId
         */
        public String getOperatedAliyunId() {
            return this.operatedAliyunId;
        }

        /**
         * @return operatedPk
         */
        public String getOperatedPk() {
            return this.operatedPk;
        }

        /**
         * @return success
         */
        public String getSuccess() {
            return this.success;
        }

        /**
         * @return timeoutTime
         */
        public Long getTimeoutTime() {
            return this.timeoutTime;
        }

        /**
         * @return todoId
         */
        public String getTodoId() {
            return this.todoId;
        }

        /**
         * @return todoType
         */
        public String getTodoType() {
            return this.todoType;
        }

        public static final class Builder {
            private String applicantAliyunId; 
            private String applicantPk; 
            private String applyRemark; 
            private Long applyTime; 
            private String auditorAliyunId; 
            private String auditorPk; 
            private String ecId; 
            private String leId; 
            private String leLicenseNo; 
            private String leName; 
            private String message; 
            private String nbId; 
            private String operatedAliyunId; 
            private String operatedPk; 
            private String success; 
            private Long timeoutTime; 
            private String todoId; 
            private String todoType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicantAliyunId = model.applicantAliyunId;
                this.applicantPk = model.applicantPk;
                this.applyRemark = model.applyRemark;
                this.applyTime = model.applyTime;
                this.auditorAliyunId = model.auditorAliyunId;
                this.auditorPk = model.auditorPk;
                this.ecId = model.ecId;
                this.leId = model.leId;
                this.leLicenseNo = model.leLicenseNo;
                this.leName = model.leName;
                this.message = model.message;
                this.nbId = model.nbId;
                this.operatedAliyunId = model.operatedAliyunId;
                this.operatedPk = model.operatedPk;
                this.success = model.success;
                this.timeoutTime = model.timeoutTime;
                this.todoId = model.todoId;
                this.todoType = model.todoType;
            } 

            /**
             * ApplicantAliyunId.
             */
            public Builder applicantAliyunId(String applicantAliyunId) {
                this.applicantAliyunId = applicantAliyunId;
                return this;
            }

            /**
             * ApplicantPk.
             */
            public Builder applicantPk(String applicantPk) {
                this.applicantPk = applicantPk;
                return this;
            }

            /**
             * ApplyRemark.
             */
            public Builder applyRemark(String applyRemark) {
                this.applyRemark = applyRemark;
                return this;
            }

            /**
             * ApplyTime.
             */
            public Builder applyTime(Long applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * AuditorAliyunId.
             */
            public Builder auditorAliyunId(String auditorAliyunId) {
                this.auditorAliyunId = auditorAliyunId;
                return this;
            }

            /**
             * AuditorPk.
             */
            public Builder auditorPk(String auditorPk) {
                this.auditorPk = auditorPk;
                return this;
            }

            /**
             * EcId.
             */
            public Builder ecId(String ecId) {
                this.ecId = ecId;
                return this;
            }

            /**
             * LeId.
             */
            public Builder leId(String leId) {
                this.leId = leId;
                return this;
            }

            /**
             * LeLicenseNo.
             */
            public Builder leLicenseNo(String leLicenseNo) {
                this.leLicenseNo = leLicenseNo;
                return this;
            }

            /**
             * LeName.
             */
            public Builder leName(String leName) {
                this.leName = leName;
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
             * NbId.
             */
            public Builder nbId(String nbId) {
                this.nbId = nbId;
                return this;
            }

            /**
             * OperatedAliyunId.
             */
            public Builder operatedAliyunId(String operatedAliyunId) {
                this.operatedAliyunId = operatedAliyunId;
                return this;
            }

            /**
             * OperatedPk.
             */
            public Builder operatedPk(String operatedPk) {
                this.operatedPk = operatedPk;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(String success) {
                this.success = success;
                return this;
            }

            /**
             * TimeoutTime.
             */
            public Builder timeoutTime(Long timeoutTime) {
                this.timeoutTime = timeoutTime;
                return this;
            }

            /**
             * TodoId.
             */
            public Builder todoId(String todoId) {
                this.todoId = todoId;
                return this;
            }

            /**
             * TodoType.
             */
            public Builder todoType(String todoType) {
                this.todoType = todoType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
