// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListRemindsResponseBody build() {
            return new ListRemindsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRemindsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemindsResponseBody</p>
     */
    public static class Reminds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertMethods")
        private java.util.List<String> alertMethods;

        @com.aliyun.core.annotation.NameInMap("AlertTargets")
        private java.util.List<String> alertTargets;

        @com.aliyun.core.annotation.NameInMap("AlertUnit")
        private String alertUnit;

        @com.aliyun.core.annotation.NameInMap("BaselineIds")
        private java.util.List<Long> baselineIds;

        @com.aliyun.core.annotation.NameInMap("BizProcessIds")
        private java.util.List<Long> bizProcessIds;

        @com.aliyun.core.annotation.NameInMap("DndEnd")
        private String dndEnd;

        @com.aliyun.core.annotation.NameInMap("DndStart")
        private String dndStart;

        @com.aliyun.core.annotation.NameInMap("Founder")
        private String founder;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private java.util.List<Long> nodeIds;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<Long> projectIds;

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
        public java.util.List<String> getAlertMethods() {
            return this.alertMethods;
        }

        /**
         * @return alertTargets
         */
        public java.util.List<String> getAlertTargets() {
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
        public java.util.List<Long> getBaselineIds() {
            return this.baselineIds;
        }

        /**
         * @return bizProcessIds
         */
        public java.util.List<Long> getBizProcessIds() {
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
        public java.util.List<Long> getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return projectIds
         */
        public java.util.List<Long> getProjectIds() {
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
            private java.util.List<String> alertMethods; 
            private java.util.List<String> alertTargets; 
            private String alertUnit; 
            private java.util.List<Long> baselineIds; 
            private java.util.List<Long> bizProcessIds; 
            private String dndEnd; 
            private String dndStart; 
            private String founder; 
            private java.util.List<Long> nodeIds; 
            private java.util.List<Long> projectIds; 
            private Long remindId; 
            private String remindName; 
            private String remindType; 
            private String remindUnit; 
            private Boolean useflag; 

            /**
             * <p>The notification method. Valid values: MAIL, SMS, and PHONE. The value MAIL indicates that the notification is sent by email. Only DataWorks Professional Edition and more advanced editions support the PHONE notification method.</p>
             */
            public Builder alertMethods(java.util.List<String> alertMethods) {
                this.alertMethods = alertMethods;
                return this;
            }

            /**
             * <p>The IDs of the Alibaba Cloud accounts used by alert recipients.</p>
             */
            public Builder alertTargets(java.util.List<String> alertTargets) {
                this.alertTargets = alertTargets;
                return this;
            }

            /**
             * <p>The alert recipient. Valid values: OWNER and OTHER. The value OWNER indicates the node owner. The value OTHER indicates a specified user.</p>
             * 
             * <strong>example:</strong>
             * <p>OWNER</p>
             */
            public Builder alertUnit(String alertUnit) {
                this.alertUnit = alertUnit;
                return this;
            }

            /**
             * <p>The IDs of the baselines to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BASELINE.</p>
             */
            public Builder baselineIds(java.util.List<Long> baselineIds) {
                this.baselineIds = baselineIds;
                return this;
            }

            /**
             * <p>The IDs of the workflows to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is BIZPROCESS.</p>
             */
            public Builder bizProcessIds(java.util.List<Long> bizProcessIds) {
                this.bizProcessIds = bizProcessIds;
                return this;
            }

            /**
             * <p>The end time of the quiet hours. The time is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder dndEnd(String dndEnd) {
                this.dndEnd = dndEnd;
                return this;
            }

            /**
             * <p>The start time of the quiet hours. The time is in the hh:mm format. Valid values of hh: [0,23]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder dndStart(String dndStart) {
                this.dndStart = dndStart;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the rule creator.</p>
             * 
             * <strong>example:</strong>
             * <p>952795****</p>
             */
            public Builder founder(String founder) {
                this.founder = founder;
                return this;
            }

            /**
             * <p>The IDs of the nodes to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is NODE.</p>
             */
            public Builder nodeIds(java.util.List<Long> nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * <p>The IDs of the workspaces to which the custom alert rule is applied. This parameter is returned if the value of the RemindUnit parameter is PROJECT.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The custom alert rule ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder remindId(Long remindId) {
                this.remindId = remindId;
                return this;
            }

            /**
             * <p>The name of the custom alert rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Alert Rule</p>
             */
            public Builder remindName(String remindName) {
                this.remindName = remindName;
                return this;
            }

            /**
             * <p>The condition that triggers an alert. Valid values: FINISHED, UNFINISHED, ERROR, CYCLE_UNFINISHED, and TIMEOUT.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder remindType(String remindType) {
                this.remindType = remindType;
                return this;
            }

            /**
             * <p>The type of the object to which the custom alert rule is applied. Valid values: NODE, BASELINE, PROJECT, and BIZPROCESS. The value NODE indicates a node. The value BASELINE indicates a baseline. The value PROJECT indicates a workspace. The value BIZPROCESS indicates a workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>NODE</p>
             */
            public Builder remindUnit(String remindUnit) {
                this.remindUnit = remindUnit;
                return this;
            }

            /**
             * <p>Indicates whether the custom alert rule is enabled. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListRemindsResponseBody} extends {@link TeaModel}
     *
     * <p>ListRemindsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Reminds")
        private java.util.List<Reminds> reminds;

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
        public java.util.List<Reminds> getReminds() {
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
            private java.util.List<Reminds> reminds; 
            private Integer totalCount; 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of custom alert rules.</p>
             */
            public Builder reminds(java.util.List<Reminds> reminds) {
                this.reminds = reminds;
                return this;
            }

            /**
             * <p>The total number of custom alert rules returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
