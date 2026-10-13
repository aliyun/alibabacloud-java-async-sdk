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
         * <p>The agent ID.</p>
         * <blockquote>
         * <p>You can obtain this value from the DescribeInstance operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1168702</p>
         */
        public Builder agentId(String agentId) {
            this.putQueryParameter("AgentId", agentId);
            this.agentId = agentId;
            return this;
        }

        /**
         * <p>The business space key.</p>
         * <blockquote>
         * <p>You can obtain this value from the DescribeInstance operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>9137ab9c27044921860030adf8590ec4_p_outbound_public</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * <p>The data type of the annotation task.</p>
         * <ul>
         * <li>1: outbound call</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder annotationMissionDataSourceType(Integer annotationMissionDataSourceType) {
            this.putQueryParameter("AnnotationMissionDataSourceType", annotationMissionDataSourceType);
            this.annotationMissionDataSourceType = annotationMissionDataSourceType;
            return this;
        }

        /**
         * <p>The annotation data source list.</p>
         * <blockquote>
         * <p>This parameter has the same function as AnnotationMissionDebugDataSourceListJsonString. Specify either one of them.</p>
         * </blockquote>
         */
        public Builder annotationMissionDebugDataSourceList(java.util.List<Integer> annotationMissionDebugDataSourceList) {
            String annotationMissionDebugDataSourceListShrink = shrink(annotationMissionDebugDataSourceList, "AnnotationMissionDebugDataSourceList", "json");
            this.putQueryParameter("AnnotationMissionDebugDataSourceList", annotationMissionDebugDataSourceListShrink);
            this.annotationMissionDebugDataSourceList = annotationMissionDebugDataSourceList;
            return this;
        }

        /**
         * <p>The debug data in JSON format.</p>
         * <blockquote>
         * <p>This parameter has the same function as AnnotationMissionDebugDataSourceList. Specify either one of them. The format is [1], [2], or [1,2]. You can specify multiple filter conditions in the array. The enum values for the filter conditions are as follows.</p>
         * </blockquote>
         * <ul>
         * <li>1: outbound call task</li>
         * <li>2: test task</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[1]</p>
         */
        public Builder annotationMissionDebugDataSourceListJsonString(String annotationMissionDebugDataSourceListJsonString) {
            this.putQueryParameter("AnnotationMissionDebugDataSourceListJsonString", annotationMissionDebugDataSourceListJsonString);
            this.annotationMissionDebugDataSourceListJsonString = annotationMissionDebugDataSourceListJsonString;
            return this;
        }

        /**
         * <p>The name of the annotation task.</p>
         * 
         * <strong>example:</strong>
         * <p>CarSaleInquiry-AnnotationTask-20230506-112934</p>
         */
        public Builder annotationMissionName(String annotationMissionName) {
            this.putQueryParameter("AnnotationMissionName", annotationMissionName);
            this.annotationMissionName = annotationMissionName;
            return this;
        }

        /**
         * <p>The robot ID.</p>
         * <blockquote>
         * <p>You can obtain this value from the DescribeScript operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-fqEnFZBYnb</p>
         */
        public Builder chatbotId(String chatbotId) {
            this.putQueryParameter("ChatbotId", chatbotId);
            this.chatbotId = chatbotId;
            return this;
        }

        /**
         * <p>The end time for the call time filter.</p>
         * 
         * <strong>example:</strong>
         * <p>1682956800000</p>
         */
        public Builder conversationTimeEndFilter(Long conversationTimeEndFilter) {
            this.putQueryParameter("ConversationTimeEndFilter", conversationTimeEndFilter);
            this.conversationTimeEndFilter = conversationTimeEndFilter;
            return this;
        }

        /**
         * <p>The start time for the call time filter.</p>
         * 
         * <strong>example:</strong>
         * <p>1683302400000</p>
         */
        public Builder conversationTimeStartFilter(Long conversationTimeStartFilter) {
            this.putQueryParameter("ConversationTimeStartFilter", conversationTimeStartFilter);
            this.conversationTimeStartFilter = conversationTimeStartFilter;
            return this;
        }

        /**
         * <p>Specifies whether to exclude call records that have been annotated by other tasks. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder excludeOtherSession(Boolean excludeOtherSession) {
            this.putQueryParameter("ExcludeOtherSession", excludeOtherSession);
            this.excludeOtherSession = excludeOtherSession;
            return this;
        }

        /**
         * <p>Specifies whether the business ended normally.</p>
         * <blockquote>
         * <p>This parameter takes effect only when SessionEndReasonFilterList is not specified.</p>
         * <ul>
         * <li>true: normal call records</li>
         * <li>false: abnormal call records</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder finished(Boolean finished) {
            this.putQueryParameter("Finished", finished);
            this.finished = finished;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bf3b51a5-e88a-4636-98b0-1a34725a085b</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The custom sampling quantity.</p>
         * <blockquote>
         * <p>This parameter takes effect only when SamplingType is set to 3. This parameter is required in that case. Otherwise, the creation fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder samplingCount(Integer samplingCount) {
            this.putQueryParameter("SamplingCount", samplingCount);
            this.samplingCount = samplingCount;
            return this;
        }

        /**
         * <p>The sampling ratio.</p>
         * <blockquote>
         * <p>This parameter takes effect only when SamplingType is set to 2. This parameter is required in that case. Otherwise, the creation fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder samplingRate(Integer samplingRate) {
            this.putQueryParameter("SamplingRate", samplingRate);
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * <p>The sampling type.</p>
         * <ul>
         * <li>1: full</li>
         * <li>2: percentage</li>
         * <li>3: custom quantity</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder samplingType(Integer samplingType) {
            this.putQueryParameter("SamplingType", samplingType);
            this.samplingType = samplingType;
            return this;
        }

        /**
         * <p>The outbound call scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6236f21e-2e04-4dad-a47b-ae77e6a48325</p>
         */
        public Builder scriptId(String scriptId) {
            this.putQueryParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * <p>The call result status filter conditions.</p>
         * <blockquote>
         * <p>This parameter has the same function as SessionEndReasonFilterListJsonString. Specify either one of them.</p>
         * </blockquote>
         */
        public Builder sessionEndReasonFilterList(java.util.List<Integer> sessionEndReasonFilterList) {
            this.putQueryParameter("SessionEndReasonFilterList", sessionEndReasonFilterList);
            this.sessionEndReasonFilterList = sessionEndReasonFilterList;
            return this;
        }

        /**
         * <p>The call result status filter conditions.</p>
         * <blockquote>
         * <p>This parameter has the same function as SessionEndReasonFilterList. Specify either one of them. The format is [1], [1,2], etc. You can specify multiple filter conditions in the array. The enum values for the filter conditions are as follows.</p>
         * </blockquote>
         * <p><strong>Call record filter enum values</strong></p>
         * <ul>
         * <li>1: normal completion</li>
         * <li>2: robot hung up after recognition rejection</li>
         * <li>3: hung up due to silence timeout</li>
         * <li>4: user hung up after recognition rejection</li>
         * <li>5: user hung up without reason</li>
         * <li>6: transferred to agent by intent match</li>
         * <li>7: transferred to agent by recognition rejection</li>
         * <li>8: no interaction on user side</li>
         * <li>9: system exception interruption</li>
         * <li>10: transferred to IVR by intent match</li>
         * <li>11: transferred to IVR by recognition rejection</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[1]</p>
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
