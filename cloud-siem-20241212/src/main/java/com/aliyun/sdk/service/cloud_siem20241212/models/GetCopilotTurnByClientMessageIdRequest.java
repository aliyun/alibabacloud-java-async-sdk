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
 * {@link GetCopilotTurnByClientMessageIdRequest} extends {@link RequestModel}
 *
 * <p>GetCopilotTurnByClientMessageIdRequest</p>
 */
public class GetCopilotTurnByClientMessageIdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientMessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientMessageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private GetCopilotTurnByClientMessageIdRequest(Builder builder) {
        super(builder);
        this.clientMessageId = builder.clientMessageId;
        this.conversationId = builder.conversationId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotTurnByClientMessageIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientMessageId
     */
    public String getClientMessageId() {
        return this.clientMessageId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
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

    public static final class Builder extends Request.Builder<GetCopilotTurnByClientMessageIdRequest, Builder> {
        private String clientMessageId; 
        private String conversationId; 
        private String lang; 
        private String regionId; 
        private String traceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCopilotTurnByClientMessageIdRequest request) {
            super(request);
            this.clientMessageId = request.clientMessageId;
            this.conversationId = request.conversationId;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.traceId = request.traceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>366932fb-9a83-4a2d-94dd-c925b35fcc0c</p>
         */
        public Builder clientMessageId(String clientMessageId) {
            this.putBodyParameter("ClientMessageId", clientMessageId);
            this.clientMessageId = clientMessageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7c91c1b0-9435-11f0-850d-adf64b261ca0</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
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

        @Override
        public GetCopilotTurnByClientMessageIdRequest build() {
            return new GetCopilotTurnByClientMessageIdRequest(this);
        } 

    } 

}
