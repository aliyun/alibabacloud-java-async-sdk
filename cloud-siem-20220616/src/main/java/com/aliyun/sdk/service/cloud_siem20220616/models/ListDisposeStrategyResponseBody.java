// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisposeStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisposeStrategyResponseBody</p>
 */
public class ListDisposeStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDisposeStrategyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDisposeStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDisposeStrategyResponseBody build() {
            return new ListDisposeStrategyResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The current page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("EffectiveStatus")
        private Integer effectiveStatus;

        @com.aliyun.core.annotation.NameInMap("Entity")
        private java.util.List < ? > entity;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentName")
        private String incidentName;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("PlaybookName")
        private String playbookName;

        @com.aliyun.core.annotation.NameInMap("PlaybookType")
        private String playbookType;

        @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
        private String playbookUuid;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List < ? > scope;

        @com.aliyun.core.annotation.NameInMap("SophonTaskId")
        private String sophonTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubAliuid")
        private Long subAliuid;

        @com.aliyun.core.annotation.NameInMap("TaskParam")
        private String taskParam;

        private ResponseData(Builder builder) {
            this.alertUuid = builder.alertUuid;
            this.aliuid = builder.aliuid;
            this.effectiveStatus = builder.effectiveStatus;
            this.entity = builder.entity;
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.errorMessage = builder.errorMessage;
            this.finishTime = builder.finishTime;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentName = builder.incidentName;
            this.incidentUuid = builder.incidentUuid;
            this.playbookName = builder.playbookName;
            this.playbookType = builder.playbookType;
            this.playbookUuid = builder.playbookUuid;
            this.scope = builder.scope;
            this.sophonTaskId = builder.sophonTaskId;
            this.status = builder.status;
            this.subAliuid = builder.subAliuid;
            this.taskParam = builder.taskParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return alertUuid
         */
        public String getAlertUuid() {
            return this.alertUuid;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return effectiveStatus
         */
        public Integer getEffectiveStatus() {
            return this.effectiveStatus;
        }

        /**
         * @return entity
         */
        public java.util.List < ? > getEntity() {
            return this.entity;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return incidentName
         */
        public String getIncidentName() {
            return this.incidentName;
        }

        /**
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return playbookName
         */
        public String getPlaybookName() {
            return this.playbookName;
        }

        /**
         * @return playbookType
         */
        public String getPlaybookType() {
            return this.playbookType;
        }

        /**
         * @return playbookUuid
         */
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

        /**
         * @return scope
         */
        public java.util.List < ? > getScope() {
            return this.scope;
        }

        /**
         * @return sophonTaskId
         */
        public String getSophonTaskId() {
            return this.sophonTaskId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subAliuid
         */
        public Long getSubAliuid() {
            return this.subAliuid;
        }

        /**
         * @return taskParam
         */
        public String getTaskParam() {
            return this.taskParam;
        }

        public static final class Builder {
            private String alertUuid; 
            private Long aliuid; 
            private Integer effectiveStatus; 
            private java.util.List < ? > entity; 
            private Long entityId; 
            private String entityType; 
            private String errorMessage; 
            private String finishTime; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentName; 
            private String incidentUuid; 
            private String playbookName; 
            private String playbookType; 
            private String playbookUuid; 
            private java.util.List < ? > scope; 
            private String sophonTaskId; 
            private Integer status; 
            private Long subAliuid; 
            private String taskParam; 

            /**
             * The UUID of the alert.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is associated with the policy in SIEM.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The status of the policy. Valid values:
             * <p>
             * 
             * *   0: invalid
             * *   1: valid
             */
            public Builder effectiveStatus(Integer effectiveStatus) {
                this.effectiveStatus = effectiveStatus;
                return this;
            }

            /**
             * The details of the entity. The value is a JSON array.
             */
            public Builder entity(java.util.List < ? > entity) {
                this.entity = entity;
                return this;
            }

            /**
             * The ID of the entity.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The type of the entity. Valid values:
             * <p>
             * 
             * *   ip
             * *   process
             * *   file
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * The summary information about the failed task.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The end time of the task.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The update time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the policy.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the event.
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * The UUID of the event.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * The name of the playbook, which is the unique identifier of the playbook.
             */
            public Builder playbookName(String playbookName) {
                this.playbookName = playbookName;
                return this;
            }

            /**
             * The type of the playbook. Valid values:
             * <p>
             * 
             * *   system: user-triggered playbook
             * *   custom: event-triggered playbook
             * *   custom_alert: alert-triggered playbook
             * *   soar-manual: user-run playbook
             * *   soar-mdr: MDR-run playbook
             */
            public Builder playbookType(String playbookType) {
                this.playbookType = playbookType;
                return this;
            }

            /**
             * The UUID of the playbook.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * The scope of the policy.
             */
            public Builder scope(java.util.List < ? > scope) {
                this.scope = scope;
                return this;
            }

            /**
             * The ID of the SOAR handling policy.
             */
            public Builder sophonTaskId(String sophonTaskId) {
                this.sophonTaskId = sophonTaskId;
                return this;
            }

            /**
             * The running status of the playbook. Valid values:
             * <p>
             * 
             * *   200: successful
             * *   10: deleted
             * *   5: failed
             * *   0: initial
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the Alibaba account that is used to configure the policy.
             */
            public Builder subAliuid(Long subAliuid) {
                this.subAliuid = subAliuid;
                return this;
            }

            /**
             * The parameters that are used to trigger the playbook. The value is in the JSON format.
             */
            public Builder taskParam(String taskParam) {
                this.taskParam = taskParam;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List < ResponseData> responseData;

        private Data(Builder builder) {
            this.pageInfo = builder.pageInfo;
            this.responseData = builder.responseData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        /**
         * @return responseData
         */
        public java.util.List < ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List < ResponseData> responseData; 

            /**
             * The pagination information.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * The detailed data.
             */
            public Builder responseData(java.util.List < ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
