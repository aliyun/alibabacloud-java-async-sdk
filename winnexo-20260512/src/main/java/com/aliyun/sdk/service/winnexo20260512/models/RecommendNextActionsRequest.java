// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link RecommendNextActionsRequest} extends {@link RequestModel}
 *
 * <p>RecommendNextActionsRequest</p>
 */
public class RecommendNextActionsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("customPrompt")
    private String customPrompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outputType")
    private String outputType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recentMessageCount")
    @com.aliyun.core.annotation.Validation(maximum = 30, minimum = 1)
    private Long recentMessageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private RecommendNextActionsRequest(Builder builder) {
        super(builder);
        this.customPrompt = builder.customPrompt;
        this.outputType = builder.outputType;
        this.recentMessageCount = builder.recentMessageCount;
        this.sessionId = builder.sessionId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecommendNextActionsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customPrompt
     */
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    /**
     * @return outputType
     */
    public String getOutputType() {
        return this.outputType;
    }

    /**
     * @return recentMessageCount
     */
    public Long getRecentMessageCount() {
        return this.recentMessageCount;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<RecommendNextActionsRequest, Builder> {
        private String customPrompt; 
        private String outputType; 
        private Long recentMessageCount; 
        private String sessionId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(RecommendNextActionsRequest request) {
            super(request);
            this.customPrompt = request.customPrompt;
            this.outputType = request.outputType;
            this.recentMessageCount = request.recentMessageCount;
            this.sessionId = request.sessionId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The extraction instruction.</p>
         * 
         * <strong>example:</strong>
         * <p>Only recommend next steps related to data analysis</p>
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * <p>The output type: <code>conversation/skill/task</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>followUpOnly</p>
         */
        public Builder outputType(String outputType) {
            this.putBodyParameter("outputType", outputType);
            this.outputType = outputType;
            return this;
        }

        /**
         * <p>The number of recent messages used to assemble the contextual information.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder recentMessageCount(Long recentMessageCount) {
            this.putBodyParameter("recentMessageCount", recentMessageCount);
            this.recentMessageCount = recentMessageCount;
            return this;
        }

        /**
         * <p>The session ID to filter by. If specified, returns all Active/Expired status information associated with this session.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSessionId</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. In winnexo-cli, pass this value explicitly by using --tenant-id.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public RecommendNextActionsRequest build() {
            return new RecommendNextActionsRequest(this);
        } 

    } 

}
