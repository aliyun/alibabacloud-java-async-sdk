// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisposeStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisposeStrategyResponseBody</p>
 */
public class ListDisposeStrategyResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(Integer code) {
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

        public ListDisposeStrategyResponseBody build() {
            return new ListDisposeStrategyResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * CurrentPage.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
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

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class ResponseData extends TeaModel {
        @NameInMap("AlertUuid")
        private String alertUuid;

        @NameInMap("Aliuid")
        private Long aliuid;

        @NameInMap("EffectiveStatus")
        private Integer effectiveStatus;

        @NameInMap("Entity")
        private java.util.List < ? > entity;

        @NameInMap("EntityId")
        private Long entityId;

        @NameInMap("EntityType")
        private String entityType;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IncidentName")
        private String incidentName;

        @NameInMap("IncidentUuid")
        private String incidentUuid;

        @NameInMap("PlaybookName")
        private String playbookName;

        @NameInMap("PlaybookType")
        private String playbookType;

        @NameInMap("PlaybookUuid")
        private String playbookUuid;

        @NameInMap("Scope")
        private java.util.List < ? > scope;

        @NameInMap("SophonTaskId")
        private String sophonTaskId;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("SubAliuid")
        private Long subAliuid;

        @NameInMap("TaskParam")
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
             * AlertUuid.
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * Aliuid.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * EffectiveStatus.
             */
            public Builder effectiveStatus(Integer effectiveStatus) {
                this.effectiveStatus = effectiveStatus;
                return this;
            }

            /**
             * Entity.
             */
            public Builder entity(java.util.List < ? > entity) {
                this.entity = entity;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
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
             * IncidentName.
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * IncidentUuid.
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * PlaybookName.
             */
            public Builder playbookName(String playbookName) {
                this.playbookName = playbookName;
                return this;
            }

            /**
             * PlaybookType.
             */
            public Builder playbookType(String playbookType) {
                this.playbookType = playbookType;
                return this;
            }

            /**
             * PlaybookUuid.
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(java.util.List < ? > scope) {
                this.scope = scope;
                return this;
            }

            /**
             * SophonTaskId.
             */
            public Builder sophonTaskId(String sophonTaskId) {
                this.sophonTaskId = sophonTaskId;
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
             * SubAliuid.
             */
            public Builder subAliuid(Long subAliuid) {
                this.subAliuid = subAliuid;
                return this;
            }

            /**
             * TaskParam.
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
        @NameInMap("PageInfo")
        private PageInfo pageInfo;

        @NameInMap("ResponseData")
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
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * ResponseData.
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
