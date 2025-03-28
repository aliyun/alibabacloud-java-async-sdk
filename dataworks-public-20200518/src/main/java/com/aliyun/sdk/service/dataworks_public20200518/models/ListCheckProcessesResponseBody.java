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
 * {@link ListCheckProcessesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckProcessesResponseBody</p>
 */
public class ListCheckProcessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCheckProcessesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckProcessesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCheckProcessesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckProcessesResponseBody build() {
            return new ListCheckProcessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckProcessesResponseBody</p>
     */
    public static class CheckProcesses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventCode")
        private String eventCode;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        @com.aliyun.core.annotation.NameInMap("EventNameEn")
        private String eventNameEn;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ProcessName")
        private String processName;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private CheckProcesses(Builder builder) {
            this.eventCode = builder.eventCode;
            this.eventName = builder.eventName;
            this.eventNameEn = builder.eventNameEn;
            this.messageId = builder.messageId;
            this.operator = builder.operator;
            this.processId = builder.processId;
            this.processName = builder.processName;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckProcesses create() {
            return builder().build();
        }

        /**
         * @return eventCode
         */
        public String getEventCode() {
            return this.eventCode;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        /**
         * @return eventNameEn
         */
        public String getEventNameEn() {
            return this.eventNameEn;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return processName
         */
        public String getProcessName() {
            return this.processName;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String eventCode; 
            private String eventName; 
            private String eventNameEn; 
            private String messageId; 
            private String operator; 
            private String processId; 
            private String processName; 
            private Long projectId; 
            private String status; 

            private Builder() {
            } 

            private Builder(CheckProcesses model) {
                this.eventCode = model.eventCode;
                this.eventName = model.eventName;
                this.eventNameEn = model.eventNameEn;
                this.messageId = model.messageId;
                this.operator = model.operator;
                this.processId = model.processId;
                this.processName = model.processName;
                this.projectId = model.projectId;
                this.status = model.status;
            } 

            /**
             * <p>Extension point event encoding.</p>
             * 
             * <strong>example:</strong>
             * <p>commit-file</p>
             */
            public Builder eventCode(String eventCode) {
                this.eventCode = eventCode;
                return this;
            }

            /**
             * <p>The name of the extension point event.</p>
             * 
             * <strong>example:</strong>
             * <p>DnsEvent</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            /**
             * <p>The English name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Pre-event for Node Commit</p>
             */
            public Builder eventNameEn(String eventNameEn) {
                this.eventNameEn = eventNameEn;
                return this;
            }

            /**
             * <p>DataWorks the message ID of the open message. After an extended point event is triggered, you can obtain the message ID from the received event message.</p>
             * 
             * <strong>example:</strong>
             * <p>b824a5de-4223-4315-af3e-c4449d236db4</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The operator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>297635</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The ID of the process instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rdk_generate_d395da25-b0d3-4114-b2a5-d0247444a661_none_3496903_365203</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The name of the check object, such as the file name or node name.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_sql_test</p>
             */
            public Builder processName(String processName) {
                this.processName = processName;
                return this;
            }

            /**
             * <p>The ID of the DataWorks workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>32563</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The status of the extender check.</p>
             * <ul>
             * <li>CHECKING CHECKING</li>
             * <li>PASSED the pass check</li>
             * <li>BLOCKED check failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CHECKING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public CheckProcesses build() {
                return new CheckProcesses(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCheckProcessesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckProcessesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckProcesses")
        private java.util.List<CheckProcesses> checkProcesses;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.checkProcesses = builder.checkProcesses;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return checkProcesses
         */
        public java.util.List<CheckProcesses> getCheckProcesses() {
            return this.checkProcesses;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CheckProcesses> checkProcesses; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.checkProcesses = model.checkProcesses;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The check details of the extension.</p>
             */
            public Builder checkProcesses(java.util.List<CheckProcesses> checkProcesses) {
                this.checkProcesses = checkProcesses;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries displayed on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
