// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsQualificationRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsQualificationRecordResponseBody</p>
 */
public class QuerySmsQualificationRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

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

    private QuerySmsQualificationRecordResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsQualificationRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySmsQualificationRecordResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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

        public QuerySmsQualificationRecordResponseBody build() {
            return new QuerySmsQualificationRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsQualificationRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsQualificationRecordResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditRemark")
        private String auditRemark;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private String auditTime;

        @com.aliyun.core.annotation.NameInMap("CompanyName")
        private String companyName;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("LegalPersonName")
        private String legalPersonName;

        @com.aliyun.core.annotation.NameInMap("QualificationGroupName")
        private String qualificationGroupName;

        @com.aliyun.core.annotation.NameInMap("StateName")
        private String stateName;

        @com.aliyun.core.annotation.NameInMap("UseBySelf")
        private String useBySelf;

        @com.aliyun.core.annotation.NameInMap("WorkOrderId")
        private Long workOrderId;

        private List(Builder builder) {
            this.auditRemark = builder.auditRemark;
            this.auditTime = builder.auditTime;
            this.companyName = builder.companyName;
            this.createDate = builder.createDate;
            this.groupId = builder.groupId;
            this.legalPersonName = builder.legalPersonName;
            this.qualificationGroupName = builder.qualificationGroupName;
            this.stateName = builder.stateName;
            this.useBySelf = builder.useBySelf;
            this.workOrderId = builder.workOrderId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return auditRemark
         */
        public String getAuditRemark() {
            return this.auditRemark;
        }

        /**
         * @return auditTime
         */
        public String getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return companyName
         */
        public String getCompanyName() {
            return this.companyName;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return legalPersonName
         */
        public String getLegalPersonName() {
            return this.legalPersonName;
        }

        /**
         * @return qualificationGroupName
         */
        public String getQualificationGroupName() {
            return this.qualificationGroupName;
        }

        /**
         * @return stateName
         */
        public String getStateName() {
            return this.stateName;
        }

        /**
         * @return useBySelf
         */
        public String getUseBySelf() {
            return this.useBySelf;
        }

        /**
         * @return workOrderId
         */
        public Long getWorkOrderId() {
            return this.workOrderId;
        }

        public static final class Builder {
            private String auditRemark; 
            private String auditTime; 
            private String companyName; 
            private String createDate; 
            private Long groupId; 
            private String legalPersonName; 
            private String qualificationGroupName; 
            private String stateName; 
            private String useBySelf; 
            private Long workOrderId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.auditRemark = model.auditRemark;
                this.auditTime = model.auditTime;
                this.companyName = model.companyName;
                this.createDate = model.createDate;
                this.groupId = model.groupId;
                this.legalPersonName = model.legalPersonName;
                this.qualificationGroupName = model.qualificationGroupName;
                this.stateName = model.stateName;
                this.useBySelf = model.useBySelf;
                this.workOrderId = model.workOrderId;
            } 

            /**
             * <p>审核备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder auditRemark(String auditRemark) {
                this.auditRemark = auditRemark;
                return this;
            }

            /**
             * <p>审核时间</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-26 17:29:04</p>
             */
            public Builder auditTime(String auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * <p>公司名称或实人认证姓名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder companyName(String companyName) {
                this.companyName = companyName;
                return this;
            }

            /**
             * <p>创建时间</p>
             * 
             * <strong>example:</strong>
             * <p>2025-02-20 11:59:30</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>资质组ID</p>
             * 
             * <strong>example:</strong>
             * <p>10000****</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>法人名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder legalPersonName(String legalPersonName) {
                this.legalPersonName = legalPersonName;
                return this;
            }

            /**
             * <p>资质组名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder qualificationGroupName(String qualificationGroupName) {
                this.qualificationGroupName = qualificationGroupName;
                return this;
            }

            /**
             * <p>审核状态名</p>
             * 
             * <strong>example:</strong>
             * <p>INT</p>
             */
            public Builder stateName(String stateName) {
                this.stateName = stateName;
                return this;
            }

            /**
             * <p>是否自用</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder useBySelf(String useBySelf) {
                this.useBySelf = useBySelf;
                return this;
            }

            /**
             * <p>工单ID</p>
             * 
             * <strong>example:</strong>
             * <p>2001****</p>
             */
            public Builder workOrderId(Long workOrderId) {
                this.workOrderId = workOrderId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsQualificationRecordResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsQualificationRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNo; 
            private Long pageSize; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
