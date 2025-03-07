// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailianchatbot20241105.models;

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
 * {@link SseChatRequest} extends {@link RequestModel}
 *
 * <p>SseChatRequest</p>
 */
public class SseChatRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Command")
    private String command;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderId")
    private String senderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SenderNick")
    private String senderNick;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Utterance")
    @com.aliyun.core.annotation.Validation(required = true)
    private String utterance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorParam")
    private String vendorParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private SseChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.command = builder.command;
        this.senderId = builder.senderId;
        this.senderNick = builder.senderNick;
        this.sessionId = builder.sessionId;
        this.utterance = builder.utterance;
        this.vendorParam = builder.vendorParam;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SseChatRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return senderId
     */
    public String getSenderId() {
        return this.senderId;
    }

    /**
     * @return senderNick
     */
    public String getSenderNick() {
        return this.senderNick;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return utterance
     */
    public String getUtterance() {
        return this.utterance;
    }

    /**
     * @return vendorParam
     */
    public String getVendorParam() {
        return this.vendorParam;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SseChatRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String command; 
        private String senderId; 
        private String senderNick; 
        private String sessionId; 
        private String utterance; 
        private String vendorParam; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SseChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.command = request.command;
            this.senderId = request.senderId;
            this.senderNick = request.senderNick;
            this.sessionId = request.sessionId;
            this.utterance = request.utterance;
            this.vendorParam = request.vendorParam;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbot-cn-dDmF3jcdVf</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Command.
         */
        public Builder command(String command) {
            this.putQueryParameter("Command", command);
            this.command = command;
            return this;
        }

        /**
         * SenderId.
         */
        public Builder senderId(String senderId) {
            this.putQueryParameter("SenderId", senderId);
            this.senderId = senderId;
            return this;
        }

        /**
         * SenderNick.
         */
        public Builder senderNick(String senderNick) {
            this.putQueryParameter("SenderNick", senderNick);
            this.senderNick = senderNick;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder utterance(String utterance) {
            this.putQueryParameter("Utterance", utterance);
            this.utterance = utterance;
            return this;
        }

        /**
         * VendorParam.
         */
        public Builder vendorParam(String vendorParam) {
            this.putQueryParameter("VendorParam", vendorParam);
            this.vendorParam = vendorParam;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-g7jspxljq8k909h3</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SseChatRequest build() {
            return new SseChatRequest(this);
        } 

    } 

}
