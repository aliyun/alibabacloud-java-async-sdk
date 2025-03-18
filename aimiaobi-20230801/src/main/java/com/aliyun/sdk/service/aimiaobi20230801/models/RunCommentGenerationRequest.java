// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link RunCommentGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunCommentGenerationRequest</p>
 */
public class RunCommentGenerationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowEmoji")
    private Boolean allowEmoji;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private String extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Length")
    private String length;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LengthRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> lengthRange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NumComments")
    @com.aliyun.core.annotation.Validation(required = true)
    private String numComments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sentiment")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> sentiment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceMaterial")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceMaterial;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Style")
    private String style;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunCommentGenerationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allowEmoji = builder.allowEmoji;
        this.extraInfo = builder.extraInfo;
        this.length = builder.length;
        this.lengthRange = builder.lengthRange;
        this.numComments = builder.numComments;
        this.sentiment = builder.sentiment;
        this.sessionId = builder.sessionId;
        this.sourceMaterial = builder.sourceMaterial;
        this.style = builder.style;
        this.type = builder.type;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCommentGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return allowEmoji
     */
    public Boolean getAllowEmoji() {
        return this.allowEmoji;
    }

    /**
     * @return extraInfo
     */
    public String getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return length
     */
    public String getLength() {
        return this.length;
    }

    /**
     * @return lengthRange
     */
    public java.util.Map<String, ?> getLengthRange() {
        return this.lengthRange;
    }

    /**
     * @return numComments
     */
    public String getNumComments() {
        return this.numComments;
    }

    /**
     * @return sentiment
     */
    public java.util.Map<String, ?> getSentiment() {
        return this.sentiment;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sourceMaterial
     */
    public String getSourceMaterial() {
        return this.sourceMaterial;
    }

    /**
     * @return style
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * @return type
     */
    public java.util.Map<String, ?> getType() {
        return this.type;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunCommentGenerationRequest, Builder> {
        private String regionId; 
        private Boolean allowEmoji; 
        private String extraInfo; 
        private String length; 
        private java.util.Map<String, ?> lengthRange; 
        private String numComments; 
        private java.util.Map<String, ?> sentiment; 
        private String sessionId; 
        private String sourceMaterial; 
        private String style; 
        private java.util.Map<String, ?> type; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunCommentGenerationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allowEmoji = request.allowEmoji;
            this.extraInfo = request.extraInfo;
            this.length = request.length;
            this.lengthRange = request.lengthRange;
            this.numComments = request.numComments;
            this.sentiment = request.sentiment;
            this.sessionId = request.sessionId;
            this.sourceMaterial = request.sourceMaterial;
            this.style = request.style;
            this.type = request.type;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AllowEmoji.
         */
        public Builder allowEmoji(Boolean allowEmoji) {
            this.putBodyParameter("AllowEmoji", allowEmoji);
            this.allowEmoji = allowEmoji;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(String extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(String length) {
            this.putBodyParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;short&quot;:&quot;50&quot;,&quot;long&quot;:“50”}</p>
         */
        public Builder lengthRange(java.util.Map<String, ?> lengthRange) {
            String lengthRangeShrink = shrink(lengthRange, "LengthRange", "json");
            this.putBodyParameter("LengthRange", lengthRangeShrink);
            this.lengthRange = lengthRange;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder numComments(String numComments) {
            this.putBodyParameter("NumComments", numComments);
            this.numComments = numComments;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;positive&quot;:&quot;50&quot;,&quot;negative&quot;:&quot;50&quot;}</p>
         */
        public Builder sentiment(java.util.Map<String, ?> sentiment) {
            String sentimentShrink = shrink(sentiment, "Sentiment", "json");
            this.putBodyParameter("Sentiment", sentimentShrink);
            this.sentiment = sentiment;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder sourceMaterial(String sourceMaterial) {
            this.putBodyParameter("SourceMaterial", sourceMaterial);
            this.sourceMaterial = sourceMaterial;
            return this;
        }

        /**
         * Style.
         */
        public Builder style(String style) {
            this.putBodyParameter("Style", style);
            this.style = style;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;emotion&quot;:&quot;50&quot;,&quot;opinion&quot;:&quot;50&quot;}</p>
         */
        public Builder type(java.util.Map<String, ?> type) {
            String typeShrink = shrink(type, "Type", "json");
            this.putBodyParameter("Type", typeShrink);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3kcs1w3lltrtbfkr</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunCommentGenerationRequest build() {
            return new RunCommentGenerationRequest(this);
        } 

    } 

}
