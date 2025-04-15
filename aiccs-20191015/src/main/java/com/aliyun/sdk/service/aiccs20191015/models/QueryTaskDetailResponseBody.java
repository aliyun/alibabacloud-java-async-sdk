// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailResponseBody</p>
 */
public class QueryTaskDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private QueryTaskDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskDetailResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(QueryTaskDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QueryTaskDetailResponseBody build() {
            return new QueryTaskDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ani")
        private String ani;

        @com.aliyun.core.annotation.NameInMap("BuId")
        private Long buId;

        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        private Long departmentId;

        @com.aliyun.core.annotation.NameInMap("Dnis")
        private String dnis;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private Integer endReason;

        @com.aliyun.core.annotation.NameInMap("ExtAttrs")
        private String extAttrs;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private Long memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("OutboundNum")
        private Integer outboundNum;

        @com.aliyun.core.annotation.NameInMap("OutboundTaskId")
        private Long outboundTaskId;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("RetryTime")
        private String retryTime;

        @com.aliyun.core.annotation.NameInMap("ServicerId")
        private Long servicerId;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private Integer skillGroup;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private List(Builder builder) {
            this.ani = builder.ani;
            this.buId = builder.buId;
            this.departmentId = builder.departmentId;
            this.dnis = builder.dnis;
            this.endReason = builder.endReason;
            this.extAttrs = builder.extAttrs;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.outboundNum = builder.outboundNum;
            this.outboundTaskId = builder.outboundTaskId;
            this.priority = builder.priority;
            this.retryTime = builder.retryTime;
            this.servicerId = builder.servicerId;
            this.servicerName = builder.servicerName;
            this.skillGroup = builder.skillGroup;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return ani
         */
        public String getAni() {
            return this.ani;
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return departmentId
         */
        public Long getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return dnis
         */
        public String getDnis() {
            return this.dnis;
        }

        /**
         * @return endReason
         */
        public Integer getEndReason() {
            return this.endReason;
        }

        /**
         * @return extAttrs
         */
        public String getExtAttrs() {
            return this.extAttrs;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return memberId
         */
        public Long getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return outboundNum
         */
        public Integer getOutboundNum() {
            return this.outboundNum;
        }

        /**
         * @return outboundTaskId
         */
        public Long getOutboundTaskId() {
            return this.outboundTaskId;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return retryTime
         */
        public String getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return servicerId
         */
        public Long getServicerId() {
            return this.servicerId;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return skillGroup
         */
        public Integer getSkillGroup() {
            return this.skillGroup;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ani; 
            private Long buId; 
            private Long departmentId; 
            private String dnis; 
            private Integer endReason; 
            private String extAttrs; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Integer id; 
            private Long memberId; 
            private String memberName; 
            private Integer outboundNum; 
            private Long outboundTaskId; 
            private Integer priority; 
            private String retryTime; 
            private Long servicerId; 
            private String servicerName; 
            private Integer skillGroup; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(List model) {
                this.ani = model.ani;
                this.buId = model.buId;
                this.departmentId = model.departmentId;
                this.dnis = model.dnis;
                this.endReason = model.endReason;
                this.extAttrs = model.extAttrs;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.memberId = model.memberId;
                this.memberName = model.memberName;
                this.outboundNum = model.outboundNum;
                this.outboundTaskId = model.outboundTaskId;
                this.priority = model.priority;
                this.retryTime = model.retryTime;
                this.servicerId = model.servicerId;
                this.servicerName = model.servicerName;
                this.skillGroup = model.skillGroup;
                this.status = model.status;
            } 

            /**
             * Ani.
             */
            public Builder ani(String ani) {
                this.ani = ani;
                return this;
            }

            /**
             * BuId.
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * DepartmentId.
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * Dnis.
             */
            public Builder dnis(String dnis) {
                this.dnis = dnis;
                return this;
            }

            /**
             * EndReason.
             */
            public Builder endReason(Integer endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * ExtAttrs.
             */
            public Builder extAttrs(String extAttrs) {
                this.extAttrs = extAttrs;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(Long memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * OutboundNum.
             */
            public Builder outboundNum(Integer outboundNum) {
                this.outboundNum = outboundNum;
                return this;
            }

            /**
             * OutboundTaskId.
             */
            public Builder outboundTaskId(Long outboundTaskId) {
                this.outboundTaskId = outboundTaskId;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(String retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * ServicerId.
             */
            public Builder servicerId(Long servicerId) {
                this.servicerId = servicerId;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * SkillGroup.
             */
            public Builder skillGroup(Integer skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTaskDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTaskDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private String currentPage;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
        private String totalResults;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.list = builder.list;
            this.pageSize = builder.pageSize;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public String getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalResults
         */
        public String getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private String currentPage; 
            private java.util.List<List> list; 
            private String pageSize; 
            private String totalResults; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.list = model.list;
                this.pageSize = model.pageSize;
                this.totalResults = model.totalResults;
            } 

            /**
             * CurrentPage.
             */
            public Builder currentPage(String currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalResults.
             */
            public Builder totalResults(String totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
