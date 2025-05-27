// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListDisposeStrategyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDisposeStrategyResponseBody build() {
            return new ListDisposeStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDisposeStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisposeStrategyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
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
             * <p>100</p>
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
    /**
     * 
     * {@link ListDisposeStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisposeStrategyResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("EffectiveStatus")
        private Integer effectiveStatus;

        @com.aliyun.core.annotation.NameInMap("Entity")
        private java.util.List<?> entity;

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
        private java.util.List<?> scope;

        @com.aliyun.core.annotation.NameInMap("SophonTaskId")
        private String sophonTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubAliuid")
        private Long subAliuid;

        @com.aliyun.core.annotation.NameInMap("TaskParam")
        private String taskParam;

        @com.aliyun.core.annotation.NameInMap("TaskUrl")
        private String taskUrl;

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
            this.taskUrl = builder.taskUrl;
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
        public java.util.List<?> getEntity() {
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
        public java.util.List<?> getScope() {
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

        /**
         * @return taskUrl
         */
        public String getTaskUrl() {
            return this.taskUrl;
        }

        public static final class Builder {
            private String alertUuid; 
            private Long aliuid; 
            private Integer effectiveStatus; 
            private java.util.List<?> entity; 
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
            private java.util.List<?> scope; 
            private String sophonTaskId; 
            private Integer status; 
            private Long subAliuid; 
            private String taskParam; 
            private String taskUrl; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.alertUuid = model.alertUuid;
                this.aliuid = model.aliuid;
                this.effectiveStatus = model.effectiveStatus;
                this.entity = model.entity;
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.errorMessage = model.errorMessage;
                this.finishTime = model.finishTime;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.incidentName = model.incidentName;
                this.incidentUuid = model.incidentUuid;
                this.playbookName = model.playbookName;
                this.playbookType = model.playbookType;
                this.playbookUuid = model.playbookUuid;
                this.scope = model.scope;
                this.sophonTaskId = model.sophonTaskId;
                this.status = model.status;
                this.subAliuid = model.subAliuid;
                this.taskParam = model.taskParam;
                this.taskUrl = model.taskUrl;
            } 

            /**
             * <p>The UUID of the alert.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_71e24437d2797ce8fc59692905a4****</p>
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is associated with the policy in SIEM.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The status of the policy. Valid values:</p>
             * <ul>
             * <li>0: invalid</li>
             * <li>1: valid</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder effectiveStatus(Integer effectiveStatus) {
                this.effectiveStatus = effectiveStatus;
                return this;
            }

            /**
             * <p>The details of the entity. The value is a JSON array.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;ip&quot;:&quot;1.1.1.1&quot;}]</p>
             */
            public Builder entity(java.util.List<?> entity) {
                this.entity = entity;
                return this;
            }

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The type of the entity. Valid values:</p>
             * <ul>
             * <li>ip</li>
             * <li>process</li>
             * <li>file</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The summary information about the failed task.</p>
             * 
             * <strong>example:</strong>
             * <p>DisposalEntity failed which description is Aegis Quarantine File , return_info failed which description is Check Aegis Process Result , [ERROR DETAIL] *******.php:file not found</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The end time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-10 21:34:07</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>Multiple type of alerts, including Miner Network, Command line download and run malicious files, Backdoor Process, etc</p>
             */
            public Builder incidentName(String incidentName) {
                this.incidentName = incidentName;
                return this;
            }

            /**
             * <p>The UUID of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>The name of the playbook, which is the unique identifier of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>WafBlockIP</p>
             */
            public Builder playbookName(String playbookName) {
                this.playbookName = playbookName;
                return this;
            }

            /**
             * <p>The type of the playbook. Valid values:</p>
             * <ul>
             * <li>system: user-triggered playbook</li>
             * <li>custom: event-triggered playbook</li>
             * <li>custom_alert: alert-triggered playbook</li>
             * <li>soar-manual: user-run playbook</li>
             * <li>soar-mdr: MDR-run playbook</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder playbookType(String playbookType) {
                this.playbookType = playbookType;
                return this;
            }

            /**
             * <p>The UUID of the playbook.</p>
             * 
             * <strong>example:</strong>
             * <p>system_aliyun_clb_process_book</p>
             */
            public Builder playbookUuid(String playbookUuid) {
                this.playbookUuid = playbookUuid;
                return this;
            }

            /**
             * <p>The scope of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>[{ aliUid: 1766185894104675 }]</p>
             */
            public Builder scope(java.util.List<?> scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The ID of the SOAR handling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>577bbf90-a770-44a7-8154-586aa2d318fa</p>
             */
            public Builder sophonTaskId(String sophonTaskId) {
                this.sophonTaskId = sophonTaskId;
                return this;
            }

            /**
             * <p>The running status of the playbook. Valid values:</p>
             * <ul>
             * <li>200: successful</li>
             * <li>10: deleted</li>
             * <li>5: failed</li>
             * <li>0: initial</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the Alibaba account that is used to configure the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>176555323***</p>
             */
            public Builder subAliuid(Long subAliuid) {
                this.subAliuid = subAliuid;
                return this;
            }

            /**
             * <p>The parameters that are used to trigger the playbook. The value is in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;file&quot;: {
             *             &quot;op_code&quot;: &quot;2&quot;,
             *             &quot;file_path&quot;: &quot;/root/alert0913/a886.jsp&quot;,
             *             &quot;entity_type&quot;: &quot;file&quot;,
             *             &quot;entity_name&quot;: &quot;a886.jsp&quot;,
             *             &quot;file_name&quot;: &quot;a886.jsp&quot;,
             *             &quot;file_owner&quot;: &quot;USER:,GROUP:&quot;,
             *             &quot;hash_value&quot;: &quot;5def10c9a4287d0920d86b42420b20b0&quot;,
             *             &quot;op_level&quot;: &quot;2&quot;,
             *             &quot;entity_id&quot;: &quot;/root/alert0913/a886.jsp&quot;,
             *             &quot;host_uuid&quot;: {
             *                   &quot;entity_type&quot;: &quot;host&quot;,
             *                   &quot;entity_name&quot;: &quot;N/A&quot;,
             *                   &quot;is_comprised&quot;: &quot;1&quot;,
             *                   &quot;os_type&quot;: &quot;linux&quot;,
             *                   &quot;entity_id&quot;: &quot;5f58ef67-8803-4314-8d67-c87dc92b****&quot;,
             *                   &quot;host_uuid&quot;: &quot;5f58ef67-8803-4314-8d67-c87dc92b****&quot;,
             *                   &quot;host_name&quot;: &quot;N/A&quot;
             *             },
             *             &quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;
             *       },
             *       &quot;_sys_siem&quot;: {
             *             &quot;cloudCode&quot;: &quot;aliyun&quot;,
             *             &quot;alertId&quot;: &quot;89416745494****&quot;
             *       },
             *       &quot;scope&quot;: [
             *             {
             *                   &quot;aliUid&quot;: 1766185894104****
             *             }
             *       ]
             * }</p>
             */
            public Builder taskParam(String taskParam) {
                this.taskParam = taskParam;
                return this;
            }

            /**
             * TaskUrl.
             */
            public Builder taskUrl(String taskUrl) {
                this.taskUrl = taskUrl;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisposeStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisposeStrategyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageInfo")
        private PageInfo pageInfo;

        @com.aliyun.core.annotation.NameInMap("ResponseData")
        private java.util.List<ResponseData> responseData;

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
        public java.util.List<ResponseData> getResponseData() {
            return this.responseData;
        }

        public static final class Builder {
            private PageInfo pageInfo; 
            private java.util.List<ResponseData> responseData; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.pageInfo = model.pageInfo;
                this.responseData = model.responseData;
            } 

            /**
             * <p>The pagination information.</p>
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            /**
             * <p>The detailed data.</p>
             */
            public Builder responseData(java.util.List<ResponseData> responseData) {
                this.responseData = responseData;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
