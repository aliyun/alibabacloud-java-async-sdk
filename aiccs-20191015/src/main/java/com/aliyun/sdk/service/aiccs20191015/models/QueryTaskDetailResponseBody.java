// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTaskDetailResponseBody</p>
 */
public class QueryTaskDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class List extends TeaModel {
        @NameInMap("Ani")
        private String ani;

        @NameInMap("BuId")
        private Long buId;

        @NameInMap("DepartmentId")
        private Long departmentId;

        @NameInMap("Dnis")
        private String dnis;

        @NameInMap("EndReason")
        private Integer endReason;

        @NameInMap("ExtAttrs")
        private String extAttrs;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("MemberId")
        private Long memberId;

        @NameInMap("MemberName")
        private String memberName;

        @NameInMap("OutboundNum")
        private Integer outboundNum;

        @NameInMap("OutboundTaskId")
        private Long outboundTaskId;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("RetryTime")
        private String retryTime;

        @NameInMap("ServicerId")
        private Long servicerId;

        @NameInMap("ServicerName")
        private String servicerName;

        @NameInMap("SkillGroup")
        private Integer skillGroup;

        @NameInMap("Status")
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
    public static class Data extends TeaModel {
        @NameInMap("CurrentPage")
        private String currentPage;

        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("TotalResults")
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
        public java.util.List < List> getList() {
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
            private java.util.List < List> list; 
            private String pageSize; 
            private String totalResults; 

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
            public Builder list(java.util.List < List> list) {
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
