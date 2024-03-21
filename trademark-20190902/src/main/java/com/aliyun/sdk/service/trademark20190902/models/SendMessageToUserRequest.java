// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToUserRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToUserRequest</p>
 */
public class SendMessageToUserRequest extends Request {
    @Query
    @NameInMap("ReceiverNickName")
    private String receiverNickName;

    @Query
    @NameInMap("SenderNickName")
    private String senderNickName;

    @Query
    @NameInMap("TemplateData")
    private java.util.Map < String, ? > templateData;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private SendMessageToUserRequest(Builder builder) {
        super(builder);
        this.receiverNickName = builder.receiverNickName;
        this.senderNickName = builder.senderNickName;
        this.templateData = builder.templateData;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageToUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return receiverNickName
     */
    public String getReceiverNickName() {
        return this.receiverNickName;
    }

    /**
     * @return senderNickName
     */
    public String getSenderNickName() {
        return this.senderNickName;
    }

    /**
     * @return templateData
     */
    public java.util.Map < String, ? > getTemplateData() {
        return this.templateData;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<SendMessageToUserRequest, Builder> {
        private String receiverNickName; 
        private String senderNickName; 
        private java.util.Map < String, ? > templateData; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageToUserRequest request) {
            super(request);
            this.receiverNickName = request.receiverNickName;
            this.senderNickName = request.senderNickName;
            this.templateData = request.templateData;
            this.templateId = request.templateId;
        } 

        /**
         * ReceiverNickName.
         */
        public Builder receiverNickName(String receiverNickName) {
            this.putQueryParameter("ReceiverNickName", receiverNickName);
            this.receiverNickName = receiverNickName;
            return this;
        }

        /**
         * SenderNickName.
         */
        public Builder senderNickName(String senderNickName) {
            this.putQueryParameter("SenderNickName", senderNickName);
            this.senderNickName = senderNickName;
            return this;
        }

        /**
         * TemplateData.
         */
        public Builder templateData(java.util.Map < String, ? > templateData) {
            String templateDataShrink = shrink(templateData, "TemplateData", "json");
            this.putQueryParameter("TemplateData", templateDataShrink);
            this.templateData = templateData;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SendMessageToUserRequest build() {
            return new SendMessageToUserRequest(this);
        } 

    } 

}
