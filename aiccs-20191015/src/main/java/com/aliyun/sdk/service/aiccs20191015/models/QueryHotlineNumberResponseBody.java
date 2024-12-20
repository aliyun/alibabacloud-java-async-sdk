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
 * {@link QueryHotlineNumberResponseBody} extends {@link TeaModel}
 *
 * <p>QueryHotlineNumberResponseBody</p>
 */
public class QueryHotlineNumberResponseBody extends TeaModel {
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

    private QueryHotlineNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryHotlineNumberResponseBody create() {
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

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

        public QueryHotlineNumberResponseBody build() {
            return new QueryHotlineNumberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryHotlineNumberResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotlineNumberResponseBody</p>
     */
    public static class GroupDOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private GroupDOList(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupDOList create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Long groupId; 
            private String groupName; 

            /**
             * GroupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public GroupDOList build() {
                return new GroupDOList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHotlineNumberResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotlineNumberResponseBody</p>
     */
    public static class CalloutRangeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        private Long departmentId;

        @com.aliyun.core.annotation.NameInMap("DepartmentName")
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("GroupDOList")
        private java.util.List<GroupDOList> groupDOList;

        private CalloutRangeList(Builder builder) {
            this.departmentId = builder.departmentId;
            this.departmentName = builder.departmentName;
            this.groupDOList = builder.groupDOList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalloutRangeList create() {
            return builder().build();
        }

        /**
         * @return departmentId
         */
        public Long getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
        }

        /**
         * @return groupDOList
         */
        public java.util.List<GroupDOList> getGroupDOList() {
            return this.groupDOList;
        }

        public static final class Builder {
            private Long departmentId; 
            private String departmentName; 
            private java.util.List<GroupDOList> groupDOList; 

            /**
             * DepartmentId.
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * DepartmentName.
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * GroupDOList.
             */
            public Builder groupDOList(java.util.List<GroupDOList> groupDOList) {
                this.groupDOList = groupDOList;
                return this;
            }

            public CalloutRangeList build() {
                return new CalloutRangeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHotlineNumberResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotlineNumberResponseBody</p>
     */
    public static class HotlineNumList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalloutAllDepartment")
        private Boolean calloutAllDepartment;

        @com.aliyun.core.annotation.NameInMap("CalloutRangeList")
        private java.util.List<CalloutRangeList> calloutRangeList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EvaluationStatus")
        private Integer evaluationStatus;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private Long flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("HotlineNumber")
        private String hotlineNumber;

        @com.aliyun.core.annotation.NameInMap("InBoundEnabled")
        private Boolean inBoundEnabled;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("OutboundEnabled")
        private Boolean outboundEnabled;

        @com.aliyun.core.annotation.NameInMap("Sp")
        private String sp;

        private HotlineNumList(Builder builder) {
            this.calloutAllDepartment = builder.calloutAllDepartment;
            this.calloutRangeList = builder.calloutRangeList;
            this.description = builder.description;
            this.evaluationStatus = builder.evaluationStatus;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.hotlineNumber = builder.hotlineNumber;
            this.inBoundEnabled = builder.inBoundEnabled;
            this.location = builder.location;
            this.outboundEnabled = builder.outboundEnabled;
            this.sp = builder.sp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HotlineNumList create() {
            return builder().build();
        }

        /**
         * @return calloutAllDepartment
         */
        public Boolean getCalloutAllDepartment() {
            return this.calloutAllDepartment;
        }

        /**
         * @return calloutRangeList
         */
        public java.util.List<CalloutRangeList> getCalloutRangeList() {
            return this.calloutRangeList;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return evaluationStatus
         */
        public Integer getEvaluationStatus() {
            return this.evaluationStatus;
        }

        /**
         * @return flowId
         */
        public Long getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return hotlineNumber
         */
        public String getHotlineNumber() {
            return this.hotlineNumber;
        }

        /**
         * @return inBoundEnabled
         */
        public Boolean getInBoundEnabled() {
            return this.inBoundEnabled;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return outboundEnabled
         */
        public Boolean getOutboundEnabled() {
            return this.outboundEnabled;
        }

        /**
         * @return sp
         */
        public String getSp() {
            return this.sp;
        }

        public static final class Builder {
            private Boolean calloutAllDepartment; 
            private java.util.List<CalloutRangeList> calloutRangeList; 
            private String description; 
            private Integer evaluationStatus; 
            private Long flowId; 
            private String flowName; 
            private String hotlineNumber; 
            private Boolean inBoundEnabled; 
            private String location; 
            private Boolean outboundEnabled; 
            private String sp; 

            /**
             * CalloutAllDepartment.
             */
            public Builder calloutAllDepartment(Boolean calloutAllDepartment) {
                this.calloutAllDepartment = calloutAllDepartment;
                return this;
            }

            /**
             * CalloutRangeList.
             */
            public Builder calloutRangeList(java.util.List<CalloutRangeList> calloutRangeList) {
                this.calloutRangeList = calloutRangeList;
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
             * EvaluationStatus.
             */
            public Builder evaluationStatus(Integer evaluationStatus) {
                this.evaluationStatus = evaluationStatus;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * HotlineNumber.
             */
            public Builder hotlineNumber(String hotlineNumber) {
                this.hotlineNumber = hotlineNumber;
                return this;
            }

            /**
             * InBoundEnabled.
             */
            public Builder inBoundEnabled(Boolean inBoundEnabled) {
                this.inBoundEnabled = inBoundEnabled;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * OutboundEnabled.
             */
            public Builder outboundEnabled(Boolean outboundEnabled) {
                this.outboundEnabled = outboundEnabled;
                return this;
            }

            /**
             * Sp.
             */
            public Builder sp(String sp) {
                this.sp = sp;
                return this;
            }

            public HotlineNumList build() {
                return new HotlineNumList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryHotlineNumberResponseBody} extends {@link TeaModel}
     *
     * <p>QueryHotlineNumberResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("HotlineNumList")
        private java.util.List<HotlineNumList> hotlineNumList;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.currentPage = builder.currentPage;
            this.hotlineNumList = builder.hotlineNumList;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return hotlineNumList
         */
        public java.util.List<HotlineNumList> getHotlineNumList() {
            return this.hotlineNumList;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long currentPage; 
            private java.util.List<HotlineNumList> hotlineNumList; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * HotlineNumList.
             */
            public Builder hotlineNumList(java.util.List<HotlineNumList> hotlineNumList) {
                this.hotlineNumList = hotlineNumList;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
