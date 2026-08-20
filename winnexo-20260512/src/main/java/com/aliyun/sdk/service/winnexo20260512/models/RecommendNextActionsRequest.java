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
         * <p>自定义推荐 prompt（不超过 10000 字符）。作为自定义指令注入默认推荐模板（位于输出格式约束之前），输出仍受模板的 JSON 格式与类型约束</p>
         * 
         * <strong>example:</strong>
         * <p>只推荐与数据分析相关的下一步操作</p>
         */
        public Builder customPrompt(String customPrompt) {
            this.putBodyParameter("customPrompt", customPrompt);
            this.customPrompt = customPrompt;
            return this;
        }

        /**
         * <p>输出类型：followUpOnly=仅追问类推荐（默认），skillOnly=仅推荐执行的 skill，both=追问+skill</p>
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
         * <p>组装上下文的最近消息条数，范围 1-30，默认 10（约 5 轮 user+assistant 对话回合）</p>
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
         * <p>会话ID</p>
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
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
