// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20251111.models;

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
 * {@link ListCallDetailRecordsRequest} extends {@link RequestModel}
 *
 * <p>ListCallDetailRecordsRequest</p>
 */
public class ListCallDetailRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelId")
    private String accessChannelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessChannelType")
    private String accessChannelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Callee")
    private String callee;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DispositionCodes")
    private java.util.List<String> dispositionCodes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DispositionReasons")
    private java.util.List<String> dispositionReasons;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DraftVersion")
    private Boolean draftVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IssueResolved")
    private Boolean issueResolved;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTalkTurns")
    private Integer maxTalkTurns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinTalkTurns")
    private Integer minTalkTurns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    private String scriptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionIds")
    private java.util.List<String> sessionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String startTime;

    private ListCallDetailRecordsRequest(Builder builder) {
        super(builder);
        this.accessChannelId = builder.accessChannelId;
        this.accessChannelType = builder.accessChannelType;
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.dispositionCodes = builder.dispositionCodes;
        this.dispositionReasons = builder.dispositionReasons;
        this.draftVersion = builder.draftVersion;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.issueResolved = builder.issueResolved;
        this.maxTalkTurns = builder.maxTalkTurns;
        this.minTalkTurns = builder.minTalkTurns;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.scriptId = builder.scriptId;
        this.sessionIds = builder.sessionIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCallDetailRecordsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessChannelId
     */
    public String getAccessChannelId() {
        return this.accessChannelId;
    }

    /**
     * @return accessChannelType
     */
    public String getAccessChannelType() {
        return this.accessChannelType;
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
    }

    /**
     * @return dispositionCodes
     */
    public java.util.List<String> getDispositionCodes() {
        return this.dispositionCodes;
    }

    /**
     * @return dispositionReasons
     */
    public java.util.List<String> getDispositionReasons() {
        return this.dispositionReasons;
    }

    /**
     * @return draftVersion
     */
    public Boolean getDraftVersion() {
        return this.draftVersion;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return issueResolved
     */
    public Boolean getIssueResolved() {
        return this.issueResolved;
    }

    /**
     * @return maxTalkTurns
     */
    public Integer getMaxTalkTurns() {
        return this.maxTalkTurns;
    }

    /**
     * @return minTalkTurns
     */
    public Integer getMinTalkTurns() {
        return this.minTalkTurns;
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return sessionIds
     */
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<ListCallDetailRecordsRequest, Builder> {
        private String accessChannelId; 
        private String accessChannelType; 
        private String callee; 
        private String caller; 
        private java.util.List<String> dispositionCodes; 
        private java.util.List<String> dispositionReasons; 
        private Boolean draftVersion; 
        private String endTime; 
        private String instanceId; 
        private Boolean issueResolved; 
        private Integer maxTalkTurns; 
        private Integer minTalkTurns; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String scriptId; 
        private java.util.List<String> sessionIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(ListCallDetailRecordsRequest request) {
            super(request);
            this.accessChannelId = request.accessChannelId;
            this.accessChannelType = request.accessChannelType;
            this.callee = request.callee;
            this.caller = request.caller;
            this.dispositionCodes = request.dispositionCodes;
            this.dispositionReasons = request.dispositionReasons;
            this.draftVersion = request.draftVersion;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.issueResolved = request.issueResolved;
            this.maxTalkTurns = request.maxTalkTurns;
            this.minTalkTurns = request.minTalkTurns;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.scriptId = request.scriptId;
            this.sessionIds = request.sessionIds;
            this.startTime = request.startTime;
        } 

        /**
         * AccessChannelId.
         */
        public Builder accessChannelId(String accessChannelId) {
            this.putQueryParameter("AccessChannelId", accessChannelId);
            this.accessChannelId = accessChannelId;
            return this;
        }

        /**
         * AccessChannelType.
         */
        public Builder accessChannelType(String accessChannelType) {
            this.putQueryParameter("AccessChannelType", accessChannelType);
            this.accessChannelType = accessChannelType;
            return this;
        }

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putBodyParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putBodyParameter("Caller", caller);
            this.caller = caller;
            return this;
        }

        /**
         * DispositionCodes.
         */
        public Builder dispositionCodes(java.util.List<String> dispositionCodes) {
            String dispositionCodesShrink = shrink(dispositionCodes, "DispositionCodes", "json");
            this.putBodyParameter("DispositionCodes", dispositionCodesShrink);
            this.dispositionCodes = dispositionCodes;
            return this;
        }

        /**
         * DispositionReasons.
         */
        public Builder dispositionReasons(java.util.List<String> dispositionReasons) {
            String dispositionReasonsShrink = shrink(dispositionReasons, "DispositionReasons", "json");
            this.putBodyParameter("DispositionReasons", dispositionReasonsShrink);
            this.dispositionReasons = dispositionReasons;
            return this;
        }

        /**
         * DraftVersion.
         */
        public Builder draftVersion(Boolean draftVersion) {
            this.putQueryParameter("DraftVersion", draftVersion);
            this.draftVersion = draftVersion;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IssueResolved.
         */
        public Builder issueResolved(Boolean issueResolved) {
            this.putQueryParameter("IssueResolved", issueResolved);
            this.issueResolved = issueResolved;
            return this;
        }

        /**
         * MaxTalkTurns.
         */
        public Builder maxTalkTurns(Integer maxTalkTurns) {
            this.putQueryParameter("MaxTalkTurns", maxTalkTurns);
            this.maxTalkTurns = maxTalkTurns;
            return this;
        }

        /**
         * MinTalkTurns.
         */
        public Builder minTalkTurns(Integer minTalkTurns) {
            this.putQueryParameter("MinTalkTurns", minTalkTurns);
            this.minTalkTurns = minTalkTurns;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
            return this;
        }

        /**
         * SessionIds.
         */
        public Builder sessionIds(java.util.List<String> sessionIds) {
            String sessionIdsShrink = shrink(sessionIds, "SessionIds", "json");
            this.putBodyParameter("SessionIds", sessionIdsShrink);
            this.sessionIds = sessionIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public ListCallDetailRecordsRequest build() {
            return new ListCallDetailRecordsRequest(this);
        } 

    } 

}
