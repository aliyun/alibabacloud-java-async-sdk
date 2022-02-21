// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOutboundTaskResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOutboundTaskResponseBody</p>
 */
public class QueryOutboundTaskResponseBody extends TeaModel {
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

    private QueryOutboundTaskResponseBody(Builder builder) {
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

    public static QueryOutboundTaskResponseBody create() {
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

        public QueryOutboundTaskResponseBody build() {
            return new QueryOutboundTaskResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BuId")
        private Long buId;

        @NameInMap("CallerNum")
        private String callerNum;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("DepartmentId")
        private Long departmentId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExtAttrs")
        private String extAttrs;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Model")
        private Integer model;

        @NameInMap("Modifier")
        private String modifier;

        @NameInMap("Name")
        private String name;

        @NameInMap("RetryInterval")
        private Integer retryInterval;

        @NameInMap("RetryTime")
        private Integer retryTime;

        @NameInMap("SkillGroup")
        private Long skillGroup;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Type")
        private Integer type;

        private List(Builder builder) {
            this.buId = builder.buId;
            this.callerNum = builder.callerNum;
            this.creator = builder.creator;
            this.departmentId = builder.departmentId;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.endTime = builder.endTime;
            this.extAttrs = builder.extAttrs;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.model = builder.model;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.retryInterval = builder.retryInterval;
            this.retryTime = builder.retryTime;
            this.skillGroup = builder.skillGroup;
            this.startDate = builder.startDate;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return buId
         */
        public Long getBuId() {
            return this.buId;
        }

        /**
         * @return callerNum
         */
        public String getCallerNum() {
            return this.callerNum;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return departmentId
         */
        public Long getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return model
         */
        public Integer getModel() {
            return this.model;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return retryInterval
         */
        public Integer getRetryInterval() {
            return this.retryInterval;
        }

        /**
         * @return retryTime
         */
        public Integer getRetryTime() {
            return this.retryTime;
        }

        /**
         * @return skillGroup
         */
        public Long getSkillGroup() {
            return this.skillGroup;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private Long buId; 
            private String callerNum; 
            private String creator; 
            private Long departmentId; 
            private String description; 
            private String endDate; 
            private String endTime; 
            private String extAttrs; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String groupName; 
            private Long id; 
            private Integer model; 
            private String modifier; 
            private String name; 
            private Integer retryInterval; 
            private Integer retryTime; 
            private Long skillGroup; 
            private String startDate; 
            private String startTime; 
            private Integer status; 
            private Integer type; 

            /**
             * BuId.
             */
            public Builder buId(Long buId) {
                this.buId = buId;
                return this;
            }

            /**
             * CallerNum.
             */
            public Builder callerNum(String callerNum) {
                this.callerNum = callerNum;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(Integer model) {
                this.model = model;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RetryInterval.
             */
            public Builder retryInterval(Integer retryInterval) {
                this.retryInterval = retryInterval;
                return this;
            }

            /**
             * RetryTime.
             */
            public Builder retryTime(Integer retryTime) {
                this.retryTime = retryTime;
                return this;
            }

            /**
             * SkillGroup.
             */
            public Builder skillGroup(Long skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
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
