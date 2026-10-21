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
 * {@link GetCopilotTurnRequest} extends {@link RequestModel}
 *
 * <p>GetCopilotTurnRequest</p>
 */
public class GetCopilotTurnRequest extends Request {
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TurnId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String turnId;

    private GetCopilotTurnRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.traceId = builder.traceId;
        this.turnId = builder.turnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCopilotTurnRequest create() {
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

    public static final class Builder extends Request.Builder<GetCopilotTurnRequest, Builder> {
        private String conversationId; 
        private String lang; 
        private String regionId; 
        private String traceId; 
        private String turnId; 

        private Builder() {
            super();
        } 

        private Builder(GetCopilotTurnRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.traceId = request.traceId;
            this.turnId = request.turnId;
        } 

        /**
         * <p>The conversation ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>54b6c969-4b75-47be-9f43-71f88aeb****</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The language of the returned messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The region of the data management center for threat analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Assets are located in the Chinese mainland and Hong Kong (China).</li>
         * <li>ap-southeast-1: Assets are located outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The trace ID used to accurately query call information.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400e29b41d4a71644665544****</p>
         */
        public Builder traceId(String traceId) {
            this.putBodyParameter("TraceId", traceId);
            this.traceId = traceId;
            return this;
        }

        /**
         * <p>The primary key ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc18b894-19a3-45ee-8768-a59478e0****</p>
         */
        public Builder turnId(String turnId) {
            this.putBodyParameter("TurnId", turnId);
            this.turnId = turnId;
            return this;
        }

        @Override
        public GetCopilotTurnRequest build() {
            return new GetCopilotTurnRequest(this);
        } 

    } 

}
