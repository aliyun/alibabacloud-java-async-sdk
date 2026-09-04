// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ResumeCopilotTurnStreamRequest} extends {@link RequestModel}
 *
 * <p>ResumeCopilotTurnStreamRequest</p>
 */
public class ResumeCopilotTurnStreamRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CursorByRun")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, Long> cursorByRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TurnId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String turnId;

    private ResumeCopilotTurnStreamRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.cursorByRun = builder.cursorByRun;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.traceId = builder.traceId;
        this.turnId = builder.turnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumeCopilotTurnStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return cursorByRun
     */
    public java.util.Map<String, Long> getCursorByRun() {
        return this.cursorByRun;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    /**
     * @return turnId
     */
    public String getTurnId() {
        return this.turnId;
    }

    public static final class Builder extends Request.Builder<ResumeCopilotTurnStreamRequest, Builder> {
        private String conversationId; 
        private java.util.Map<String, Long> cursorByRun; 
        private String lang; 
        private String regionId; 
        private String traceId; 
        private String turnId; 

        private Builder() {
            super();
        } 

        private Builder(ResumeCopilotTurnStreamRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.cursorByRun = request.cursorByRun;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.traceId = request.traceId;
            this.turnId = request.turnId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BABCD2D02C73A3E6CBD6EDC7A4488939</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cursorByRun(java.util.Map<String, Long> cursorByRun) {
            String cursorByRunShrink = shrink(cursorByRun, "CursorByRun", "json");
            this.putBodyParameter("CursorByRun", cursorByRunShrink);
            this.cursorByRun = cursorByRun;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc18b894-19a3-45ee-8768-a59478e00f65</p>
         */
        public Builder turnId(String turnId) {
            this.putBodyParameter("TurnId", turnId);
            this.turnId = turnId;
            return this;
        }

        @Override
        public ResumeCopilotTurnStreamRequest build() {
            return new ResumeCopilotTurnStreamRequest(this);
        } 

    } 

}
