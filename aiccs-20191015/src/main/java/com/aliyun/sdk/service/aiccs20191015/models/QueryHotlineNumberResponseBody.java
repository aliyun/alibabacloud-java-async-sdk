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

        private Builder() {
        } 

        private Builder(QueryHotlineNumberResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code. A value of Success indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Hotline number configuration information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Status code description.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE339D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * <ul>
         * <li><strong>true</strong>: Succeeded.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

            private Builder() {
            } 

            private Builder(GroupDOList model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>The skill group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6083****</p>
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The skill group name.</p>
             * 
             * <strong>example:</strong>
             * <p>技能组A</p>
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

            private Builder() {
            } 

            private Builder(CalloutRangeList model) {
                this.departmentId = model.departmentId;
                this.departmentName = model.departmentName;
                this.groupDOList = model.groupDOList;
            } 

            /**
             * <p>Department ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2256****</p>
             */
            public Builder departmentId(Long departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * <p>The department name.</p>
             * 
             * <strong>example:</strong>
             * <p>部门A</p>
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * <p>The skill group list.</p>
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

            private Builder() {
            } 

            private Builder(HotlineNumList model) {
                this.calloutAllDepartment = model.calloutAllDepartment;
                this.calloutRangeList = model.calloutRangeList;
                this.description = model.description;
                this.evaluationStatus = model.evaluationStatus;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.hotlineNumber = model.hotlineNumber;
                this.inBoundEnabled = model.inBoundEnabled;
                this.location = model.location;
                this.outboundEnabled = model.outboundEnabled;
                this.sp = model.sp;
            } 

            /**
             * <p>Outbound calls apply to all departments.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder calloutAllDepartment(Boolean calloutAllDepartment) {
                this.calloutAllDepartment = calloutAllDepartment;
                return this;
            }

            /**
             * <p>List of departments for which outbound calls are effective.</p>
             */
            public Builder calloutRangeList(java.util.List<CalloutRangeList> calloutRangeList) {
                this.calloutRangeList = calloutRangeList;
                return this;
            }

            /**
             * <p>Number description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Satisfaction status. Valid values:  </p>
             * <ul>
             * <li><strong>0</strong>: Neither inbound nor outbound calls are enabled.  </li>
             * <li><strong>1</strong>: Inbound calls are enabled.  </li>
             * <li><strong>2</strong>: Outbound calls are enabled.  </li>
             * <li><strong>3</strong>: Both inbound and outbound calls are enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder evaluationStatus(Integer evaluationStatus) {
                this.evaluationStatus = evaluationStatus;
                return this;
            }

            /**
             * <p>Incoming call flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder flowId(Long flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>Inbound flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试流程</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>Hotline number.</p>
             * 
             * <strong>example:</strong>
             * <p>0571****2211</p>
             */
            public Builder hotlineNumber(String hotlineNumber) {
                this.hotlineNumber = hotlineNumber;
                return this;
            }

            /**
             * <p>Indicates whether the number is used for inbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder inBoundEnabled(Boolean inBoundEnabled) {
                this.inBoundEnabled = inBoundEnabled;
                return this;
            }

            /**
             * <p>Number location.</p>
             * 
             * <strong>example:</strong>
             * <p>浙江杭州</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>Indicates whether the number is used for outbound calls.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder outboundEnabled(Boolean outboundEnabled) {
                this.outboundEnabled = outboundEnabled;
                return this;
            }

            /**
             * <p>Carrier.</p>
             * 
             * <strong>example:</strong>
             * <p>电信</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPage = model.currentPage;
                this.hotlineNumList = model.hotlineNumList;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Number list.</p>
             */
            public Builder hotlineNumList(java.util.List<HotlineNumList> hotlineNumList) {
                this.hotlineNumList = hotlineNumList;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total amount of data.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
