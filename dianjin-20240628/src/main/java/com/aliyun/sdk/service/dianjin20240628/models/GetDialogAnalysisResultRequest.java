// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetDialogAnalysisResultRequest} extends {@link RequestModel}
 *
 * <p>GetDialogAnalysisResultRequest</p>
 */
public class GetDialogAnalysisResultRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("asc")
    private Boolean asc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionIds")
    private java.util.List<String> sessionIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("useUrl")
    private Boolean useUrl;

    private GetDialogAnalysisResultRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.asc = builder.asc;
        this.endTime = builder.endTime;
        this.sessionIds = builder.sessionIds;
        this.startTime = builder.startTime;
        this.useUrl = builder.useUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDialogAnalysisResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return asc
     */
    public Boolean getAsc() {
        return this.asc;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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

    /**
     * @return useUrl
     */
    public Boolean getUseUrl() {
        return this.useUrl;
    }

    public static final class Builder extends Request.Builder<GetDialogAnalysisResultRequest, Builder> {
        private String workspaceId; 
        private Boolean asc; 
        private String endTime; 
        private java.util.List<String> sessionIds; 
        private String startTime; 
        private Boolean useUrl; 

        private Builder() {
            super();
        } 

        private Builder(GetDialogAnalysisResultRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.asc = request.asc;
            this.endTime = request.endTime;
            this.sessionIds = request.sessionIds;
            this.startTime = request.startTime;
            this.useUrl = request.useUrl;
        } 

        /**
         * <p>Workspace ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Whether to sort in ascending order. Default is true, which sorts by session creation time in ascending order. If false, sorts in descending order.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder asc(Boolean asc) {
            this.putBodyParameter("asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The end time, which must be in yyyy-MM-dd HH:mm:ss format. If sessionIds are provided, the system queries session analysis results based on these IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-23 09:20:02</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Session ID list. When useUrl is true, the response includes OSS URLs. You can specify up to 1000 sessions. If you specify more than 1000, only the first 1000 are processed. When useUrl is false, the response includes full analysis results. You can specify up to 10 sessions. If you specify more than 10, only the first 10 are processed. This parameter is optional. If sessionIds is empty, the API retrieves results for sessions created between startTime and endTime. If sessionIds is not empty, the API retrieves results for the specified sessions. You cannot leave both sessionIds and the time range empty.</p>
         */
        public Builder sessionIds(java.util.List<String> sessionIds) {
            this.putBodyParameter("sessionIds", sessionIds);
            this.sessionIds = sessionIds;
            return this;
        }

        /**
         * <p>Start time in yyyy-MM-dd HH:mm:ss format. If sessionIds is not empty, you can query the session analysis results using the specified session IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-09-14 09:11:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Whether to return an OSS URL instead of full analysis results. If true, the response includes an OSS URL that expires in one hour. Default is true. Supports up to 1000 sessions. If you specify more than 1000, only the first 1000 are processed. If false, the response includes full analysis results. Supports up to 10 sessions. If you specify more than 10, only the first 10 are processed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useUrl(Boolean useUrl) {
            this.putBodyParameter("useUrl", useUrl);
            this.useUrl = useUrl;
            return this;
        }

        @Override
        public GetDialogAnalysisResultRequest build() {
            return new GetDialogAnalysisResultRequest(this);
        } 

    } 

}
