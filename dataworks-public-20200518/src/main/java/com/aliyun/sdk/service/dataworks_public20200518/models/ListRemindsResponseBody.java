// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRemindsResponseBody} extends {@link TeaModel}
 *
 * <p>ListRemindsResponseBody</p>
 */
public class ListRemindsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListRemindsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRemindsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about custom alert rules returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRemindsResponseBody build() {
            return new ListRemindsResponseBody(this);
        } 

    } 

    public static class Reminds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertMethods")
        private java.util.List < String > alertMethods;

        @com.aliyun.core.annotation.NameInMap("AlertTargets")
        private java.util.List < String > alertTargets;

        @com.aliyun.core.annotation.NameInMap("AlertUnit")
        private String alertUnit;

        @com.aliyun.core.annotation.NameInMap("BaselineIds")
        private java.util.List < Long > baselineIds;

        @com.aliyun.core.annotation.NameInMap("BizProcessIds")
        private java.util.List < Long > bizProcessIds;

        @com.aliyun.core.annotation.NameInMap("DndEnd")
        private String dndEnd;

        @com.aliyun.core.annotation.NameInMap("DndStart")
        private String dndStart;

        @com.aliyun.core.annotation.NameInMap("Founder")
        private String founder;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List < Long > nodeIds;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List < Long > projectIds;

        @com.aliyun.core.annotation.NameInMap("RemindId")
        private Long remindId;

        @com.aliyun.core.annotation.NameInMap("RemindName")
        private String remindName;

        @com.aliyun.core.annotation.NameInMap("RemindType")
        private String remindType;

        @com.aliyun.core.annotation.NameInMap("RemindUnit")
        private String remindUnit;

        @com.aliyun.core.annotation.NameInMap("Useflag")
        private Boolean useflag;

        private Reminds(Builder builder) {
            this.alertMethods = builder.alertMethods;
            this.alertTargets = builder.alertTargets;
            this.alertUnit = builder.alertUnit;
            this.baselineIds = builder.baselineIds;
            this.bizProcessIds = builder.bizProcessIds;
            this.dndEnd = builder.dndEnd;
            this.dndStart = builder.dndStart;
            this.founder = builder.founder;
            this.nodeIds = builder.nodeIds;
            this.projectIds = builder.projectIds;
            this.remindId = builder.remindId;
            this.remindName = builder.remindName;
            this.remindType = builder.remindType;
            this.remindUnit = builder.remindUnit;
            this.useflag = builder.useflag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reminds create() {
            return builder().build();
        }

        /**
         * @return alertMethods
         */
        public java.util.List < String > getAlertMethods() {
            return this.alertMethods;
        }

        /**
         * @return alertTargets
         */
        public java.util.List < String > getAlertTargets() {
            return this.alertTargets;
        }

        /**
         * @return alertUnit
         */
        public String getAlertUnit() {
            return this.alertUnit;
        }

        /**
         * @return baselineIds
         */
        public java.util.List < Long > getBaselineIds() {
            return this.baselineIds;
        }

        /**
         * @return bizProcessIds
         */
        public java.util.List < Long > getBizProcessIds() {
            return this.bizProcessIds;
        }

        /**
         * @return dndEnd
         */
        public String getDndEnd() {
            return this.dndEnd;
        }

        /**
         * @return dndStart
         */
        public String getDndStart() {
            return this.dndStart;
        }

        /**
         * @return founder
         */
        public String getFounder() {
            return this.founder;
        }

        /**
         * @return nodeIds
         */
        public java.util.List < Long > getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return projectIds
         */
        public java.util.List < Long > getProjectIds() {
            return this.projectIds;
        }

        /**
         * @return remindId
         */
        public Long getRemindId() {
            return this.remindId;
        }

        /**
         * @return remindName
         */
        public String getRemindName() {
            return this.remindName;
        }

        /**
         * @return remindType
         */
        public String getRemindType() {
            return this.remindType;
        }

        /**
         * @return remindUnit
         */
        public String getRemindUnit() {
            return this.remindUnit;
        }

        /**
         * @return useflag
         */
        public Boolean getUseflag() {
            return this.useflag;
        }

        public static final class Builder {
            private java.util.List < String > alertMethods; 
            private java.util.List < String > alertTargets; 
            private String alertUnit; 
            private java.util.List < Long > baselineIds; 
            private java.util.List < Long > bizProcessIds; 
            private String dndEnd; 
            private String dndStart; 
            private String founder; 
            private java.util.List < Long > nodeIds; 
            private java.util.List < Long > projectIds; 
            private Long remindId; 
            private String remindName; 
            private String remindType; 
            private String remindUnit; 
            private Boolean useflag; 

            /**
             * The notification method. Valid values: MAIL, SMS, and PHONE. The value MAIL indicates that the notification is sent by email. The value SMS indicates that the notification is sent by text message. The value PHONE indicates that the notification is sent by call, which is supported only by DataWorks Professional Edition and more advanced editions.
             */
            public Builder alertMethods(java.util.List < String > alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * The IDs of the Alibaba Cloud accounts that are used to receive alert notifications.
             */
            public Builder alertTargets(java.util.List < String > alertTargets) {
                this.alertTargets = alertTargets;
                return this;
            }

            /**
             * The alert recipient. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.
             */
            public Builder alertUnit(String alertUnit) {
                this.alertUnit = alertUnit;
                return this;
            }

            /**
             * The IDs of the baselines to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BASELINE.
             */
            public Builder baselineIds(java.util.List < Long > baselineIds) {
                this.baselineIds = baselineIds;
                return this;
            }

            /**
             * The IDs of the workflows to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BIZPROCESS.
             */
            public Builder bizProcessIds(java.util.List < Long > bizProcessIds) {
                this.bizProcessIds = bizProcessIds;
                return this;
            }

            /**
             * The end time of the quiet hours. The value is in the hh:mm format. Valid values of hh: 0 to 23. Valid values of mm: 0 to 59.
             */
            public Builder dndEnd(String dndEnd) {
                this.dndEnd = dndEnd;
                return this;
            }

            /**
             * The start time of the quiet hours. The value is in the hh:mm format. Valid values of hh: 0 to 23. Valid values of mm: 0 to 59.
             */
            public Builder dndStart(String dndStart) {
                this.dndStart = dndStart;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the custom alert rule.
             */
            public Builder founder(String founder) {
                this.founder = founder;
                return this;
            }

            /**
             * The IDs of the nodes to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is NODE.
             */
            public Builder nodeIds(java.util.List < Long > nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * The IDs of the workspaces to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is PROJECT.
             */
            public Builder projectIds(java.util.List < Long > projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * The ID of the custom alert rule.
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * The name of the custom alert rule.
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * The conditions that trigger an alert for the node. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT. The value FINISHED indicates that the node finishes running. The value UNFINISHED indicates that the node is still running at the specified point in time. The value ERROR indicates that an error occurs when the node is running. The value CYCLE_UNFINISHED indicates that the node does not finish running in the specified scheduling cycle. The value TIMEOUT indicates that the node times out.
             */
            public Builder remindType(String remindType) {
                this.remindType = remindType;
                return this;
            }

            /**
             * The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates that the monitored object is a node. The value BASELINE indicates that the monitored object is a baseline. The value PROJECT indicates that the monitored object is a workspace. The value BIZPROCESS indicates that the monitored object is a workflow.
             */
            public Builder remindUnit(String remindUnit) {
                this.remindUnit = remindUnit;
                return this;
            }

            /**
             * Indicates whether the custom alert rule is enabled. Valid values: true and false.
             */
            public Builder useflag(Boolean useflag) {
                this.useflag = useflag;
                return this;
            }

            public Reminds build() {
                return new Reminds(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Reminds")
        private java.util.List < Reminds> reminds;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.reminds = builder.reminds;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return reminds
         */
        public java.util.List < Reminds> getReminds() {
            return this.reminds;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Reminds> reminds; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The custom alert rules returned.
             */
            public Builder reminds(java.util.List < Reminds> reminds) {
                this.reminds = reminds;
                return this;
            }

            /**
             * The total number of custom alert rules returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
