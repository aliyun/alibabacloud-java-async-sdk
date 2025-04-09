// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link CreateAnnotationMissionRequest} extends {@link RequestModel}
 *
 * <p>CreateAnnotationMissionRequest</p>
 */
public class CreateAnnotationMissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentId")
    private String agentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    private String agentKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionDataSourceType")
    private Integer annotationMissionDataSourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionDebugDataSourceList")
    private java.util.List<Integer> annotationMissionDebugDataSourceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionDebugDataSourceListJsonString")
    private String annotationMissionDebugDataSourceListJsonString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionName")
    private String annotationMissionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChatbotId")
    private String chatbotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationTimeEndFilter")
    private Long conversationTimeEndFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationTimeStartFilter")
    private Long conversationTimeStartFilter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExcludeOtherSession")
    private Boolean excludeOtherSession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Finished")
    private Boolean finished;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingCount")
    private Integer samplingCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingRate")
    private Integer samplingRate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SamplingType")
    private Integer samplingType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionEndReasonFilterList")
    private java.util.List<Integer> sessionEndReasonFilterList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionEndReasonFilterListJsonString")
    private String sessionEndReasonFilterListJsonString;

    private CreateAnnotationMissionRequest(Builder builder) {
        super(builder);
        this.agentId = builder.agentId;
        this.agentKey = builder.agentKey;
        this.annotationMissionDataSourceType = builder.annotationMissionDataSourceType;
        this.annotationMissionDebugDataSourceList = builder.annotationMissionDebugDataSourceList;
        this.annotationMissionDebugDataSourceListJsonString = builder.annotationMissionDebugDataSourceListJsonString;
        this.annotationMissionName = builder.annotationMissionName;
        this.chatbotId = builder.chatbotId;
        this.conversationTimeEndFilter = builder.conversationTimeEndFilter;
        this.conversationTimeStartFilter = builder.conversationTimeStartFilter;
        this.excludeOtherSession = builder.excludeOtherSession;
        this.finished = builder.finished;
        this.instanceId = builder.instanceId;
        this.samplingCount = builder.samplingCount;
        this.samplingRate = builder.samplingRate;
        this.samplingType = builder.samplingType;
        this.scriptId = builder.scriptId;
        this.sessionEndReasonFilterList = builder.sessionEndReasonFilterList;
        this.sessionEndReasonFilterListJsonString = builder.sessionEndReasonFilterListJsonString;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAnnotationMissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentId
     */
    public String getAgentId() {
        return this.agentId;
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return annotationMissionDataSourceType
     */
    public Integer getAnnotationMissionDataSourceType() {
        return this.annotationMissionDataSourceType;
    }

    /**
     * @return annotationMissionDebugDataSourceList
     */
    public java.util.List<Integer> getAnnotationMissionDebugDataSourceList() {
        return this.annotationMissionDebugDataSourceList;
    }

    /**
     * @return annotationMissionDebugDataSourceListJsonString
     */
    public String getAnnotationMissionDebugDataSourceListJsonString() {
        return this.annotationMissionDebugDataSourceListJsonString;
    }

    /**
     * @return annotationMissionName
     */
    public String getAnnotationMissionName() {
        return this.annotationMissionName;
    }

    /**
     * @return chatbotId
     */
    public String getChatbotId() {
        return this.chatbotId;
    }

    /**
     * @return conversationTimeEndFilter
     */
    public Long getConversationTimeEndFilter() {
        return this.conversationTimeEndFilter;
    }

    /**
     * @return conversationTimeStartFilter
     */
    public Long getConversationTimeStartFilter() {
        return this.conversationTimeStartFilter;
    }

    /**
     * @return excludeOtherSession
     */
    public Boolean getExcludeOtherSession() {
        return this.excludeOtherSession;
    }

    /**
     * @return finished
     */
    public Boolean getFinished() {
        return this.finished;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return samplingCount
     */
    public Integer getSamplingCount() {
        return this.samplingCount;
    }

    /**
     * @return samplingRate
     */
    public Integer getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * @return samplingType
     */
    public Integer getSamplingType() {
        return this.samplingType;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return sessionEndReasonFilterList
     */
    public java.util.List<Integer> getSessionEndReasonFilterList() {
        return this.sessionEndReasonFilterList;
    }

    /**
     * @return sessionEndReasonFilterListJsonString
     */
    public String getSessionEndReasonFilterListJsonString() {
        return this.sessionEndReasonFilterListJsonString;
    }

    public static final class Builder extends Request.Builder<CreateAnnotationMissionRequest, Builder> {
        private String agentId; 
        private String agentKey; 
        private Integer annotationMissionDataSourceType; 
        private java.util.List<Integer> annotationMissionDebugDataSourceList; 
        private String annotationMissionDebugDataSourceListJsonString; 
        private String annotationMissionName; 
        private String chatbotId; 
        private Long conversationTimeEndFilter; 
        private Long conversationTimeStartFilter; 
        private Boolean excludeOtherSession; 
        private Boolean finished; 
        private String instanceId; 
        private Integer samplingCount; 
        private Integer samplingRate; 
        private Integer samplingType; 
        private String scriptId; 
        private java.util.List<Integer> sessionEndReasonFilterList; 
        private String sessionEndReasonFilterListJsonString; 

        private Builder() {
            super();
        } 

        private Builder(CreateAnnotationMissionRequest request) {
            super(request);
            this.agentId = request.agentId;
            this.agentKey = request.agentKey;
            this.annotationMissionDataSourceType = request.annotationMissionDataSourceType;
            this.annotationMissionDebugDataSourceList = request.annotationMissionDebugDataSourceList;
            this.annotationMissionDebugDataSourceListJsonString = request.annotationMissionDebugDataSourceListJsonString;
            this.annotationMissionName = request.annotationMissionName;
            this.chatbotId = request.chatbotId;
            this.conversationTimeEndFilter = request.conversationTimeEndFilter;
            this.conversationTimeStartFilter = request.conversationTimeStartFilter;
            this.excludeOtherSession = request.excludeOtherSession;
            this.finished = request.finished;
            this.instanceId = request.instanceId;
            this.samplingCount = request.samplingCount;
            this.samplingRate = request.samplingRate;
            this.samplingType = request.samplingType;
            this.scriptId = request.scriptId;
            this.sessionEndReasonFilterList = request.sessionEndReasonFilterList;
            this.sessionEndReasonFilterListJsonString = request.sessionEndReasonFilterListJsonString;
        } 

        /**
         * AgentId.
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * AnnotationMissionDataSourceType.
         */
        public Builder annotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
            this.putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType);
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }

        /**
         * AnnotationMissionDebugDataSourceList.
         */
        public Builder annotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
            String annotationMissionDebugDataSourceListShrink = shrink(annotationMissionDebugDataSourceList, "AnnotationMissionDebugDataSourceList", "json");
            this.putQueryParameter("AnnotationMissionDebugDataSourceList", annotationMissionDebugDataSourceListShrink);
            this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
            return this;
        }

        /**
         * AnnotationMissionDebugDataSourceListJsonString.
         */
        public Builder annotationMissionDebugDataSourceListJsonString(String annotationMissionDebugDataSourceListJsonString) {
            this.putQueryParameter("AnnotationMissionDebugDataSourceListJsonString", annotationMissionDebugDataSourceListJsonString);
            this.annotationMissionDebugDataSourceListJsonString = annotationMissionDebugDataSourceListJsonString;
            return this;
        }

        /**
         * AnnotationMissionName.
         */
        public Builder annotationMissionName(String annotationMissionName) {
            this.putQueryParameter("AnnotationMissionName", annotationMissionName);
            this.annotationMissionName = annotationMissionName;
            return this;
        }

        /**
         * ChatbotId.
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * ConversationTimeEndFilter.
         */
        public Builder conversationTimeEndFilter(Long conversationTimeEndFilter) {
            this.putQueryParameter("ConversationTimeEndFilter", conversationTimeEndFilter);
            this.conversationTimeEndFilter = conversationTimeEndFilter;
            return this;
        }

        /**
         * ConversationTimeStartFilter.
         */
        public Builder conversationTimeStartFilter(Long conversationTimeStartFilter) {
            this.putQueryParameter("ConversationTimeStartFilter", conversationTimeStartFilter);
            this.conversationTimeStartFilter = conversationTimeStartFilter;
            return this;
        }

        /**
         * ExcludeOtherSession.
         */
        public Builder excludeOtherSession(Boolean excludeOtherSession) {
            this.putQueryParameter("ExcludeOtherSession", excludeOtherSession);
            this.excludeOtherSession = excludeOtherSession;
            return this;
        }

        /**
         * Finished.
         */
        public Builder finished(Boolean finished) {
            this.putQueryParameter("Finished", finished);
            this.finished = finished;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * SamplingCount.
         */
        public Builder samplingCount(Integer samplingCount) {
            this.putQueryParameter("SamplingCount", samplingCount);
            this.samplingCount = samplingCount;
            return this;
        }

        /**
         * SamplingRate.
         */
        public Builder samplingRate(Integer samplingRate) {
            this.putQueryParameter("SamplingRate", samplingRate);
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * SamplingType.
         */
        public Builder samplingType(Integer samplingType) {
            this.putQueryParameter("SamplingType", samplingType);
            this.samplingType = samplingType;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * SessionEndReasonFilterList.
         */
        public Builder sessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
            this.putQueryParameter("SessionEndReasonFilterList", sessionEndReasonFilterList);
            this.sessionEndReasonFilterList = sessionEndReasonFilterList;
            return this;
        }

        /**
         * SessionEndReasonFilterListJsonString.
         */
        public Builder sessionEndReasonFilterListJsonString(String sessionEndReasonFilterListJsonString) {
            this.putQueryParameter("SessionEndReasonFilterListJsonString", sessionEndReasonFilterListJsonString);
            this.sessionEndReasonFilterListJsonString = sessionEndReasonFilterListJsonString;
            return this;
        }

        @Override
        public CreateAnnotationMissionRequest build() {
            return new CreateAnnotationMissionRequest(this);
        } 

    } 

}
