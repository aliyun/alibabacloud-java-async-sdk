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
 * {@link QuerySmsSaasTaskListNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsSaasTaskListNewResponseBody</p>
 */
public class QuerySmsSaasTaskListNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySmsSaasTaskListNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsSaasTaskListNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySmsSaasTaskListNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySmsSaasTaskListNewResponseBody build() {
            return new QuerySmsSaasTaskListNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsSaasTaskListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskListNewResponseBody</p>
     */
    public static class CommParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private Long aliyunUid;

        @com.aliyun.core.annotation.NameInMap("CustId")
        private Long custId;

        @com.aliyun.core.annotation.NameInMap("CycleNum")
        private Integer cycleNum;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        private CommParams(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.custId = builder.custId;
            this.cycleNum = builder.cycleNum;
            this.partnerId = builder.partnerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommParams create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public Long getAliyunUid() {
            return this.aliyunUid;
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
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        public static final class Builder {
            private Long aliyunUid; 
            private Long custId; 
            private Integer cycleNum; 
            private Long partnerId; 

            private Builder() {
            } 

            private Builder(CommParams model) {
                this.aliyunUid = model.aliyunUid;
                this.custId = model.custId;
                this.cycleNum = model.cycleNum;
                this.partnerId = model.partnerId;
            } 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
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
             * PartnerId.
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            public CommParams build() {
                return new CommParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSaasTaskListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskListNewResponseBody</p>
     */
    public static class FcSaasTaskDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("CommParams")
        private CommParams commParams;

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

        private FcSaasTaskDTO(Builder builder) {
            this.bizType = builder.bizType;
            this.commParams = builder.commParams;
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

        public static FcSaasTaskDTO create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return commParams
         */
        public CommParams getCommParams() {
            return this.commParams;
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
            private CommParams commParams; 
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
            private String scheduleType; 
            private String status; 
            private Integer successCount; 
            private Long taskId; 
            private Long taskInstanceId; 
            private String taskName; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(FcSaasTaskDTO model) {
                this.bizType = model.bizType;
                this.commParams = model.commParams;
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
             * CommParams.
             */
            public Builder commParams(CommParams commParams) {
                this.commParams = commParams;
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

            public FcSaasTaskDTO build() {
                return new FcSaasTaskDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsSaasTaskListNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsSaasTaskListNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FcSaasTaskDTO")
        private java.util.List<FcSaasTaskDTO> fcSaasTaskDTO;

        private List(Builder builder) {
            this.fcSaasTaskDTO = builder.fcSaasTaskDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return fcSaasTaskDTO
         */
        public java.util.List<FcSaasTaskDTO> getFcSaasTaskDTO() {
            return this.fcSaasTaskDTO;
        }

        public static final class Builder {
            private java.util.List<FcSaasTaskDTO> fcSaasTaskDTO; 

            private Builder() {
            } 

            private Builder(List model) {
                this.fcSaasTaskDTO = model.fcSaasTaskDTO;
            } 

            /**
             * FcSaasTaskDTO.
             */
            public Builder fcSaasTaskDTO(java.util.List<FcSaasTaskDTO> fcSaasTaskDTO) {
                this.fcSaasTaskDTO = fcSaasTaskDTO;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
