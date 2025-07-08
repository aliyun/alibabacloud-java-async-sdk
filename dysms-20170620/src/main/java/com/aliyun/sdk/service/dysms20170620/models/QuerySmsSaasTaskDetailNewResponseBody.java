// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySmsSaasTaskDetailNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSaasTaskDetailNewResponseBody</p>
 */
public class QuerySmsSaasTaskDetailNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.NameInMap("DetailDownloadUrl")
    private String detailDownloadUrl;

    @com.aliyun.core.annotation.NameInMap("DetailDownloadUrlForSuccess")
    private String detailDownloadUrlForSuccess;

    @com.aliyun.core.annotation.NameInMap("ExtParams")
    private String extParams;

    @com.aliyun.core.annotation.NameInMap("FailCount")
    private Integer failCount;

    @com.aliyun.core.annotation.NameInMap("FireTime")
    private String fireTime;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("IsDeleted")
    private Boolean isDeleted;

    @com.aliyun.core.annotation.NameInMap("IsPermitOrder")
    private Boolean isPermitOrder;

    @com.aliyun.core.annotation.NameInMap("IsPermitOrderForSuccess")
    private Boolean isPermitOrderForSuccess;

    @com.aliyun.core.annotation.NameInMap("OssFilePath")
    private String ossFilePath;

    @com.aliyun.core.annotation.NameInMap("PhoneList")
    private PhoneList phoneList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SaasBaseCommParam")
    private SaasBaseCommParam saasBaseCommParam;

    @com.aliyun.core.annotation.NameInMap("SaasFileUrl")
    private String saasFileUrl;

    @com.aliyun.core.annotation.NameInMap("ScheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private Long taskId;

    @com.aliyun.core.annotation.NameInMap("TaskInstanceId")
    private Long taskInstanceId;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QuerySmsSaasTaskDetailNewResponseBody(Builder builder) {
        this.bizType = builder.bizType;
        this.detailDownloadUrl = builder.detailDownloadUrl;
        this.detailDownloadUrlForSuccess = builder.detailDownloadUrlForSuccess;
        this.extParams = builder.extParams;
        this.failCount = builder.failCount;
        this.fireTime = builder.fireTime;
        this.gmtCreate = builder.gmtCreate;
        this.isDeleted = builder.isDeleted;
        this.isPermitOrder = builder.isPermitOrder;
        this.isPermitOrderForSuccess = builder.isPermitOrderForSuccess;
        this.ossFilePath = builder.ossFilePath;
        this.phoneList = builder.phoneList;
        this.requestId = builder.requestId;
        this.saasBaseCommParam = builder.saasBaseCommParam;
        this.saasFileUrl = builder.saasFileUrl;
        this.scheduleType = builder.scheduleType;
        this.status = builder.status;
        this.successCount = builder.successCount;
        this.taskId = builder.taskId;
        this.taskInstanceId = builder.taskInstanceId;
        this.taskName = builder.taskName;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSaasTaskDetailNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return detailDownloadUrl
     */
    public String getDetailDownloadUrl() {
        return this.detailDownloadUrl;
    }

    /**
     * @return detailDownloadUrlForSuccess
     */
    public String getDetailDownloadUrlForSuccess() {
        return this.detailDownloadUrlForSuccess;
    }

    /**
     * @return extParams
     */
    public String getExtParams() {
        return this.extParams;
    }

    /**
     * @return failCount
     */
    public Integer getFailCount() {
        return this.failCount;
    }

    /**
     * @return fireTime
     */
    public String getFireTime() {
        return this.fireTime;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return isDeleted
     */
    public Boolean getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return isPermitOrder
     */
    public Boolean getIsPermitOrder() {
        return this.isPermitOrder;
    }

    /**
     * @return isPermitOrderForSuccess
     */
    public Boolean getIsPermitOrderForSuccess() {
        return this.isPermitOrderForSuccess;
    }

    /**
     * @return ossFilePath
     */
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    /**
     * @return phoneList
     */
    public PhoneList getPhoneList() {
        return this.phoneList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return saasBaseCommParam
     */
    public SaasBaseCommParam getSaasBaseCommParam() {
        return this.saasBaseCommParam;
    }

    /**
     * @return saasFileUrl
     */
    public String getSaasFileUrl() {
        return this.saasFileUrl;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskInstanceId
     */
    public Long getTaskInstanceId() {
        return this.taskInstanceId;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String bizType; 
        private String detailDownloadUrl; 
        private String detailDownloadUrlForSuccess; 
        private String extParams; 
        private Integer failCount; 
        private String fireTime; 
        private String gmtCreate; 
        private Boolean isDeleted; 
        private Boolean isPermitOrder; 
        private Boolean isPermitOrderForSuccess; 
        private String ossFilePath; 
        private PhoneList phoneList; 
        private String requestId; 
        private SaasBaseCommParam saasBaseCommParam; 
        private String saasFileUrl; 
        private String scheduleType; 
        private String status; 
        private Integer successCount; 
        private Long taskId; 
        private Long taskInstanceId; 
        private String taskName; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QuerySmsSaasTaskDetailNewResponseBody model) {
            this.bizType = model.bizType;
            this.detailDownloadUrl = model.detailDownloadUrl;
            this.detailDownloadUrlForSuccess = model.detailDownloadUrlForSuccess;
            this.extParams = model.extParams;
            this.failCount = model.failCount;
            this.fireTime = model.fireTime;
            this.gmtCreate = model.gmtCreate;
            this.isDeleted = model.isDeleted;
            this.isPermitOrder = model.isPermitOrder;
            this.isPermitOrderForSuccess = model.isPermitOrderForSuccess;
            this.ossFilePath = model.ossFilePath;
            this.phoneList = model.phoneList;
            this.requestId = model.requestId;
            this.saasBaseCommParam = model.saasBaseCommParam;
            this.saasFileUrl = model.saasFileUrl;
            this.scheduleType = model.scheduleType;
            this.status = model.status;
            this.successCount = model.successCount;
            this.taskId = model.taskId;
            this.taskInstanceId = model.taskInstanceId;
            this.taskName = model.taskName;
            this.totalCount = model.totalCount;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * DetailDownloadUrl.
         */
        public Builder detailDownloadUrl(String detailDownloadUrl) {
            this.detailDownloadUrl = detailDownloadUrl;
            return this;
        }

        /**
         * DetailDownloadUrlForSuccess.
         */
        public Builder detailDownloadUrlForSuccess(String detailDownloadUrlForSuccess) {
            this.detailDownloadUrlForSuccess = detailDownloadUrlForSuccess;
            return this;
        }

        /**
         * ExtParams.
         */
        public Builder extParams(String extParams) {
            this.extParams = extParams;
            return this;
        }

        /**
         * FailCount.
         */
        public Builder failCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }

        /**
         * FireTime.
         */
        public Builder fireTime(String fireTime) {
            this.fireTime = fireTime;
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
         * IsDeleted.
         */
        public Builder isDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * IsPermitOrder.
         */
        public Builder isPermitOrder(Boolean isPermitOrder) {
            this.isPermitOrder = isPermitOrder;
            return this;
        }

        /**
         * IsPermitOrderForSuccess.
         */
        public Builder isPermitOrderForSuccess(Boolean isPermitOrderForSuccess) {
            this.isPermitOrderForSuccess = isPermitOrderForSuccess;
            return this;
        }

        /**
         * OssFilePath.
         */
        public Builder ossFilePath(String ossFilePath) {
            this.ossFilePath = ossFilePath;
            return this;
        }

        /**
         * PhoneList.
         */
        public Builder phoneList(PhoneList phoneList) {
            this.phoneList = phoneList;
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
         * SaasBaseCommParam.
         */
        public Builder saasBaseCommParam(SaasBaseCommParam saasBaseCommParam) {
            this.saasBaseCommParam = saasBaseCommParam;
            return this;
        }

        /**
         * SaasFileUrl.
         */
        public Builder saasFileUrl(String saasFileUrl) {
            this.saasFileUrl = saasFileUrl;
            return this;
        }

        /**
         * ScheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskInstanceId.
         */
        public Builder taskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QuerySmsSaasTaskDetailNewResponseBody build() {
            return new QuerySmsSaasTaskDetailNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSaasTaskDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskDetailNewResponseBody</p>
     */
    public static class PhoneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("phoneNum")
        private java.util.List<String> phoneNum;

        private PhoneList(Builder builder) {
            this.phoneNum = builder.phoneNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneList create() {
            return builder().build();
        }

        /**
         * @return phoneNum
         */
        public java.util.List<String> getPhoneNum() {
            return this.phoneNum;
        }

        public static final class Builder {
            private java.util.List<String> phoneNum; 

            private Builder() {
            } 

            private Builder(PhoneList model) {
                this.phoneNum = model.phoneNum;
            } 

            /**
             * phoneNum.
             */
            public Builder phoneNum(java.util.List<String> phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            public PhoneList build() {
                return new PhoneList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSaasTaskDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskDetailNewResponseBody</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Param")
        private java.util.List<String> param;

        private ParamList(Builder builder) {
            this.param = builder.param;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return param
         */
        public java.util.List<String> getParam() {
            return this.param;
        }

        public static final class Builder {
            private java.util.List<String> param; 

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.param = model.param;
            } 

            /**
             * Param.
             */
            public Builder param(java.util.List<String> param) {
                this.param = param;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSaasTaskDetailNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskDetailNewResponseBody</p>
     */
    public static class SaasBaseCommParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private Long aliyunUid;

        @com.aliyun.core.annotation.NameInMap("BillCount")
        private Integer billCount;

        @com.aliyun.core.annotation.NameInMap("ByteCount")
        private Integer byteCount;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("CustId")
        private Long custId;

        @com.aliyun.core.annotation.NameInMap("CycleNum")
        private Integer cycleNum;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private ParamList paramList;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        @com.aliyun.core.annotation.NameInMap("Signature")
        private String signature;

        @com.aliyun.core.annotation.NameInMap("SmsContent")
        private String smsContent;

        @com.aliyun.core.annotation.NameInMap("SmsTemplateCode")
        private String smsTemplateCode;

        @com.aliyun.core.annotation.NameInMap("TaskErrorCase")
        private String taskErrorCase;

        @com.aliyun.core.annotation.NameInMap("TaskErrorSuggestion")
        private String taskErrorSuggestion;

        private SaasBaseCommParam(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.billCount = builder.billCount;
            this.byteCount = builder.byteCount;
            this.clientIp = builder.clientIp;
            this.custId = builder.custId;
            this.cycleNum = builder.cycleNum;
            this.paramList = builder.paramList;
            this.partnerId = builder.partnerId;
            this.signature = builder.signature;
            this.smsContent = builder.smsContent;
            this.smsTemplateCode = builder.smsTemplateCode;
            this.taskErrorCase = builder.taskErrorCase;
            this.taskErrorSuggestion = builder.taskErrorSuggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaasBaseCommParam create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return billCount
         */
        public Integer getBillCount() {
            return this.billCount;
        }

        /**
         * @return byteCount
         */
        public Integer getByteCount() {
            return this.byteCount;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return custId
         */
        public Long getCustId() {
            return this.custId;
        }

        /**
         * @return cycleNum
         */
        public Integer getCycleNum() {
            return this.cycleNum;
        }

        /**
         * @return paramList
         */
        public ParamList getParamList() {
            return this.paramList;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return signature
         */
        public String getSignature() {
            return this.signature;
        }

        /**
         * @return smsContent
         */
        public String getSmsContent() {
            return this.smsContent;
        }

        /**
         * @return smsTemplateCode
         */
        public String getSmsTemplateCode() {
            return this.smsTemplateCode;
        }

        /**
         * @return taskErrorCase
         */
        public String getTaskErrorCase() {
            return this.taskErrorCase;
        }

        /**
         * @return taskErrorSuggestion
         */
        public String getTaskErrorSuggestion() {
            return this.taskErrorSuggestion;
        }

        public static final class Builder {
            private Long aliyunUid; 
            private Integer billCount; 
            private Integer byteCount; 
            private String clientIp; 
            private Long custId; 
            private Integer cycleNum; 
            private ParamList paramList; 
            private Long partnerId; 
            private String signature; 
            private String smsContent; 
            private String smsTemplateCode; 
            private String taskErrorCase; 
            private String taskErrorSuggestion; 

            private Builder() {
            } 

            private Builder(SaasBaseCommParam model) {
                this.aliyunUid = model.aliyunUid;
                this.billCount = model.billCount;
                this.byteCount = model.byteCount;
                this.clientIp = model.clientIp;
                this.custId = model.custId;
                this.cycleNum = model.cycleNum;
                this.paramList = model.paramList;
                this.partnerId = model.partnerId;
                this.signature = model.signature;
                this.smsContent = model.smsContent;
                this.smsTemplateCode = model.smsTemplateCode;
                this.taskErrorCase = model.taskErrorCase;
                this.taskErrorSuggestion = model.taskErrorSuggestion;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * BillCount.
             */
            public Builder billCount(Integer billCount) {
                this.billCount = billCount;
                return this;
            }

            /**
             * ByteCount.
             */
            public Builder byteCount(Integer byteCount) {
                this.byteCount = byteCount;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * CustId.
             */
            public Builder custId(Long custId) {
                this.custId = custId;
                return this;
            }

            /**
             * CycleNum.
             */
            public Builder cycleNum(Integer cycleNum) {
                this.cycleNum = cycleNum;
                return this;
            }

            /**
             * ParamList.
             */
            public Builder paramList(ParamList paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * Signature.
             */
            public Builder signature(String signature) {
                this.signature = signature;
                return this;
            }

            /**
             * SmsContent.
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
                return this;
            }

            /**
             * SmsTemplateCode.
             */
            public Builder smsTemplateCode(String smsTemplateCode) {
                this.smsTemplateCode = smsTemplateCode;
                return this;
            }

            /**
             * TaskErrorCase.
             */
            public Builder taskErrorCase(String taskErrorCase) {
                this.taskErrorCase = taskErrorCase;
                return this;
            }

            /**
             * TaskErrorSuggestion.
             */
            public Builder taskErrorSuggestion(String taskErrorSuggestion) {
                this.taskErrorSuggestion = taskErrorSuggestion;
                return this;
            }

            public SaasBaseCommParam build() {
                return new SaasBaseCommParam(this);
            } 

        } 

    }
}
