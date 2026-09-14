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
 * {@link ListEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListEntitiesResponseBody</p>
 */
public class ListEntitiesResponseBody extends TeaModel {
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

    private ListEntitiesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntitiesResponseBody create() {
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

        private Builder(ListEntitiesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The request return value.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request return message.</p>
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
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListEntitiesResponseBody build() {
            return new ListEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesResponseBody</p>
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
             * <p>The current page number of the list.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of records returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records.</p>
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
     * {@link ListEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesResponseBody</p>
     */
    public static class AgentDisposes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDisposalMethod")
        private String agentDisposalMethod;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalPlaybookUuid")
        private String agentDisposalPlaybookUuid;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalReason")
        private String agentDisposalReason;

        private AgentDisposes(Builder builder) {
            this.agentDisposalMethod = builder.agentDisposalMethod;
            this.agentDisposalPlaybookUuid = builder.agentDisposalPlaybookUuid;
            this.agentDisposalReason = builder.agentDisposalReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentDisposes create() {
            return builder().build();
        }

        /**
         * @return agentDisposalMethod
         */
        public String getAgentDisposalMethod() {
            return this.agentDisposalMethod;
        }

        /**
         * @return agentDisposalPlaybookUuid
         */
        public String getAgentDisposalPlaybookUuid() {
            return this.agentDisposalPlaybookUuid;
        }

        /**
         * @return agentDisposalReason
         */
        public String getAgentDisposalReason() {
            return this.agentDisposalReason;
        }

        public static final class Builder {
            private String agentDisposalMethod; 
            private String agentDisposalPlaybookUuid; 
            private String agentDisposalReason; 

            private Builder() {
            } 

            private Builder(AgentDisposes model) {
                this.agentDisposalMethod = model.agentDisposalMethod;
                this.agentDisposalPlaybookUuid = model.agentDisposalPlaybookUuid;
                this.agentDisposalReason = model.agentDisposalReason;
            } 

            /**
             * <p>The disposal suggestion recommended by the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder agentDisposalMethod(String agentDisposalMethod) {
                this.agentDisposalMethod = agentDisposalMethod;
                return this;
            }

            /**
             * <p>The UUID of the playbook recommended by the agent for disposal.</p>
             * 
             * <strong>example:</strong>
             * <p>12XAD-SFQ-WAF-2ca2</p>
             */
            public Builder agentDisposalPlaybookUuid(String agentDisposalPlaybookUuid) {
                this.agentDisposalPlaybookUuid = agentDisposalPlaybookUuid;
                return this;
            }

            /**
             * AgentDisposalReason.
             */
            public Builder agentDisposalReason(String agentDisposalReason) {
                this.agentDisposalReason = agentDisposalReason;
                return this;
            }

            public AgentDisposes build() {
                return new AgentDisposes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesResponseBody</p>
     */
    public static class ResponseData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentAnalysisReason")
        private String agentAnalysisReason;

        @com.aliyun.core.annotation.NameInMap("AgentConfidence")
        private String agentConfidence;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalMethod")
        private String agentDisposalMethod;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalPlaybookUuid")
        private String agentDisposalPlaybookUuid;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalReason")
        private String agentDisposalReason;

        @com.aliyun.core.annotation.NameInMap("AgentDisposalSuggestion")
        private String agentDisposalSuggestion;

        @com.aliyun.core.annotation.NameInMap("AgentDisposes")
        private java.util.List<AgentDisposes> agentDisposes;

        @com.aliyun.core.annotation.NameInMap("AlertNum")
        private Integer alertNum;

        @com.aliyun.core.annotation.NameInMap("AlertUuid")
        private String alertUuid;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("CloudCode")
        private String cloudCode;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityInfo")
        private String entityInfo;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("EntityUuid")
        private String entityUuid;

        @com.aliyun.core.annotation.NameInMap("EventNum")
        private Integer eventNum;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IncidentUuid")
        private String incidentUuid;

        @com.aliyun.core.annotation.NameInMap("IsAsset")
        private String isAsset;

        @com.aliyun.core.annotation.NameInMap("IsMalware")
        private String isMalware;

        @com.aliyun.core.annotation.NameInMap("MalwareType")
        private String malwareType;

        @com.aliyun.core.annotation.NameInMap("SubUserId")
        private Long subUserId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        private ResponseData(Builder builder) {
            this.agentAnalysisReason = builder.agentAnalysisReason;
            this.agentConfidence = builder.agentConfidence;
            this.agentDisposalMethod = builder.agentDisposalMethod;
            this.agentDisposalPlaybookUuid = builder.agentDisposalPlaybookUuid;
            this.agentDisposalReason = builder.agentDisposalReason;
            this.agentDisposalSuggestion = builder.agentDisposalSuggestion;
            this.agentDisposes = builder.agentDisposes;
            this.alertNum = builder.alertNum;
            this.alertUuid = builder.alertUuid;
            this.aliuid = builder.aliuid;
            this.cloudCode = builder.cloudCode;
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.entityName = builder.entityName;
            this.entityType = builder.entityType;
            this.entityUuid = builder.entityUuid;
            this.eventNum = builder.eventNum;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.incidentUuid = builder.incidentUuid;
            this.isAsset = builder.isAsset;
            this.isMalware = builder.isMalware;
            this.malwareType = builder.malwareType;
            this.subUserId = builder.subUserId;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseData create() {
            return builder().build();
        }

        /**
         * @return agentAnalysisReason
         */
        public String getAgentAnalysisReason() {
            return this.agentAnalysisReason;
        }

        /**
         * @return agentConfidence
         */
        public String getAgentConfidence() {
            return this.agentConfidence;
        }

        /**
         * @return agentDisposalMethod
         */
        public String getAgentDisposalMethod() {
            return this.agentDisposalMethod;
        }

        /**
         * @return agentDisposalPlaybookUuid
         */
        public String getAgentDisposalPlaybookUuid() {
            return this.agentDisposalPlaybookUuid;
        }

        /**
         * @return agentDisposalReason
         */
        public String getAgentDisposalReason() {
            return this.agentDisposalReason;
        }

        /**
         * @return agentDisposalSuggestion
         */
        public String getAgentDisposalSuggestion() {
            return this.agentDisposalSuggestion;
        }

        /**
         * @return agentDisposes
         */
        public java.util.List<AgentDisposes> getAgentDisposes() {
            return this.agentDisposes;
        }

        /**
         * @return alertNum
         */
        public Integer getAlertNum() {
            return this.alertNum;
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
         * @return cloudCode
         */
        public String getCloudCode() {
            return this.cloudCode;
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityInfo
         */
        public String getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return entityUuid
         */
        public String getEntityUuid() {
            return this.entityUuid;
        }

        /**
         * @return eventNum
         */
        public Integer getEventNum() {
            return this.eventNum;
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
         * @return incidentUuid
         */
        public String getIncidentUuid() {
            return this.incidentUuid;
        }

        /**
         * @return isAsset
         */
        public String getIsAsset() {
            return this.isAsset;
        }

        /**
         * @return isMalware
         */
        public String getIsMalware() {
            return this.isMalware;
        }

        /**
         * @return malwareType
         */
        public String getMalwareType() {
            return this.malwareType;
        }

        /**
         * @return subUserId
         */
        public Long getSubUserId() {
            return this.subUserId;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String agentAnalysisReason; 
            private String agentConfidence; 
            private String agentDisposalMethod; 
            private String agentDisposalPlaybookUuid; 
            private String agentDisposalReason; 
            private String agentDisposalSuggestion; 
            private java.util.List<AgentDisposes> agentDisposes; 
            private Integer alertNum; 
            private String alertUuid; 
            private Long aliuid; 
            private String cloudCode; 
            private String entityId; 
            private String entityInfo; 
            private String entityName; 
            private String entityType; 
            private String entityUuid; 
            private Integer eventNum; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String incidentUuid; 
            private String isAsset; 
            private String isMalware; 
            private String malwareType; 
            private Long subUserId; 
            private String tags; 

            private Builder() {
            } 

            private Builder(ResponseData model) {
                this.agentAnalysisReason = model.agentAnalysisReason;
                this.agentConfidence = model.agentConfidence;
                this.agentDisposalMethod = model.agentDisposalMethod;
                this.agentDisposalPlaybookUuid = model.agentDisposalPlaybookUuid;
                this.agentDisposalReason = model.agentDisposalReason;
                this.agentDisposalSuggestion = model.agentDisposalSuggestion;
                this.agentDisposes = model.agentDisposes;
                this.alertNum = model.alertNum;
                this.alertUuid = model.alertUuid;
                this.aliuid = model.aliuid;
                this.cloudCode = model.cloudCode;
                this.entityId = model.entityId;
                this.entityInfo = model.entityInfo;
                this.entityName = model.entityName;
                this.entityType = model.entityType;
                this.entityUuid = model.entityUuid;
                this.eventNum = model.eventNum;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.incidentUuid = model.incidentUuid;
                this.isAsset = model.isAsset;
                this.isMalware = model.isMalware;
                this.malwareType = model.malwareType;
                this.subUserId = model.subUserId;
                this.tags = model.tags;
            } 

            /**
             * AgentAnalysisReason.
             */
            public Builder agentAnalysisReason(String agentAnalysisReason) {
                this.agentAnalysisReason = agentAnalysisReason;
                return this;
            }

            /**
             * <p>The confidence level of the entity as determined by the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
             */
            public Builder agentConfidence(String agentConfidence) {
                this.agentConfidence = agentConfidence;
                return this;
            }

            /**
             * <p>The recommended disposal method from the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>delete_file</p>
             */
            public Builder agentDisposalMethod(String agentDisposalMethod) {
                this.agentDisposalMethod = agentDisposalMethod;
                return this;
            }

            /**
             * <p>The UUID of the playbook recommended by the agent for disposal.</p>
             * 
             * <strong>example:</strong>
             * <p>12XAD-SFQ-WAF-2ca2</p>
             */
            public Builder agentDisposalPlaybookUuid(String agentDisposalPlaybookUuid) {
                this.agentDisposalPlaybookUuid = agentDisposalPlaybookUuid;
                return this;
            }

            /**
             * AgentDisposalReason.
             */
            public Builder agentDisposalReason(String agentDisposalReason) {
                this.agentDisposalReason = agentDisposalReason;
                return this;
            }

            /**
             * <p>The disposal suggestion recommended by the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder agentDisposalSuggestion(String agentDisposalSuggestion) {
                this.agentDisposalSuggestion = agentDisposalSuggestion;
                return this;
            }

            /**
             * <p>The list of disposal suggestions recommended by the agent.</p>
             */
            public Builder agentDisposes(java.util.List<AgentDisposes> agentDisposes) {
                this.agentDisposes = agentDisposes;
                return this;
            }

            /**
             * <p>The number of alerts associated with the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder alertNum(Integer alertNum) {
                this.alertNum = alertNum;
                return this;
            }

            /**
             * <p>The alert UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>sas_71e24437d2797ce8fc59692905a4****</p>
             */
            public Builder alertUuid(String alertUuid) {
                this.alertUuid = alertUuid;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>The cloud code of the entity source. Valid values:</p>
             * <ul>
             * <li>aliyun: Alibaba Cloud.</li>
             * <li>qcloud: Tencent Cloud.</li>
             * <li>hcloud: Huawei Cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>aliyun</p>
             */
            public Builder cloudCode(String cloudCode) {
                this.cloudCode = cloudCode;
                return this;
            }

            /**
             * <p>The logical ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>12345****</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity display information in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;file_path&quot;: &quot;c:/www/leixi.jsp&quot;,&quot;file_hash&quot;: &quot;aa0ca926ad948cd820e0a3d9a18c****&quot;,&quot;host_uuid&quot;: &quot;efed2cf7-0b77-45d9-a97b-d2cf246b****&quot;,&quot;malware_type&quot;: &quot;${aliyun.siem.sas.alert_tag.webshell}&quot;,&quot;host_name&quot;: &quot;launch-advisor-2023****&quot;}</p>
             */
            public Builder entityInfo(String entityInfo) {
                this.entityInfo = entityInfo;
                return this;
            }

            /**
             * <p>The entity name.</p>
             * 
             * <strong>example:</strong>
             * <p>123.123.123.123</p>
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            /**
             * <p>The entity type. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ip</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>The entity UUID.</p>
             * 
             * <strong>example:</strong>
             * <p>8087b3e4aa6862852c100c8738cf****</p>
             */
            public Builder entityUuid(String entityUuid) {
                this.entityUuid = entityUuid;
                return this;
            }

            /**
             * <p>The number of events associated with the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventNum(Integer eventNum) {
                this.eventNum = eventNum;
                return this;
            }

            /**
             * <p>The time when the entity was collected.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the entity was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The entity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789***</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The incident UUID. You can obtain this value from the incident list operation.</p>
             * 
             * <strong>example:</strong>
             * <p>85ea4241-798f-4684-a876-65d4f0c3****</p>
             */
            public Builder incidentUuid(String incidentUuid) {
                this.incidentUuid = incidentUuid;
                return this;
            }

            /**
             * <p>Indicates whether the entity is an asset. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isAsset(String isAsset) {
                this.isAsset = isAsset;
                return this;
            }

            /**
             * <p>Specifies whether the entity is malicious. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isMalware(String isMalware) {
                this.isMalware = isMalware;
                return this;
            }

            /**
             * <p>The malware type of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun.siem.sas.alert_tag.webshell</p>
             */
            public Builder malwareType(String malwareType) {
                this.malwareType = malwareType;
                return this;
            }

            /**
             * <p>The linked account ID associated with the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>113091674488****</p>
             */
            public Builder subUserId(Long subUserId) {
                this.subUserId = subUserId;
                return this;
            }

            /**
             * <p>The entity tags. The value is a JSON array string in the following format:</p>
             * <p><code>&quot;[{&quot;tagKey1&quot;:&quot;tagValue1&quot;},{&quot;tagKey2&quot;:&quot;tagValue2&quot;}]&quot;</code></p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;tagKey1&quot;:&quot;tagValue1&quot;},{&quot;tagKey2&quot;:&quot;tagValue2&quot;}]</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            public ResponseData build() {
                return new ResponseData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesResponseBody</p>
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
