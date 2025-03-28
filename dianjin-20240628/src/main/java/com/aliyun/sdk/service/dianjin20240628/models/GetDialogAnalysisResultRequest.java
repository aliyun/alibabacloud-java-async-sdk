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
         * asc.
         */
        public Builder asc(Boolean asc) {
            this.putBodyParameter("asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * sessionIds.
         */
        public Builder sessionIds(java.util.List<String> sessionIds) {
            this.putBodyParameter("sessionIds", sessionIds);
            this.sessionIds = sessionIds;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * useUrl.
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
