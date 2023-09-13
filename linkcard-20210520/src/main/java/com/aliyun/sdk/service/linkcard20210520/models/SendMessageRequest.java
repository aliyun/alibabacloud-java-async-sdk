// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @Body
    @NameInMap("ApiProduct")
    private String apiProduct;

    @Body
    @NameInMap("MessageSendTime")
    @Validation(required = true)
    private Long messageSendTime;

    @Body
    @NameInMap("MessageTemplateId")
    @Validation(required = true)
    private Long messageTemplateId;

    @Body
    @NameInMap("MessageVariableParam")
    private String messageVariableParam;

    @Body
    @NameInMap("Msisdns")
    private java.util.List < String > msisdns;

    @Body
    @NameInMap("TaskName")
    @Validation(required = true)
    private String taskName;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.apiProduct = builder.apiProduct;
        this.messageSendTime = builder.messageSendTime;
        this.messageTemplateId = builder.messageTemplateId;
        this.messageVariableParam = builder.messageVariableParam;
        this.msisdns = builder.msisdns;
        this.taskName = builder.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiProduct
     */
    public String getApiProduct() {
        return this.apiProduct;
    }

    /**
     * @return messageSendTime
     */
    public Long getMessageSendTime() {
        return this.messageSendTime;
    }

    /**
     * @return messageTemplateId
     */
    public Long getMessageTemplateId() {
        return this.messageTemplateId;
    }

    /**
     * @return messageVariableParam
     */
    public String getMessageVariableParam() {
        return this.messageVariableParam;
    }

    /**
     * @return msisdns
     */
    public java.util.List < String > getMsisdns() {
        return this.msisdns;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String apiProduct; 
        private Long messageSendTime; 
        private Long messageTemplateId; 
        private String messageVariableParam; 
        private java.util.List < String > msisdns; 
        private String taskName; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.apiProduct = request.apiProduct;
            this.messageSendTime = request.messageSendTime;
            this.messageTemplateId = request.messageTemplateId;
            this.messageVariableParam = request.messageVariableParam;
            this.msisdns = request.msisdns;
            this.taskName = request.taskName;
        } 

        /**
         * Linkcard
         */
        public Builder apiProduct(String apiProduct) {
            this.putBodyParameter("ApiProduct", apiProduct);
            this.apiProduct = apiProduct;
            return this;
        }

        /**
         * MessageSendTime.
         */
        public Builder messageSendTime(Long messageSendTime) {
            this.putBodyParameter("MessageSendTime", messageSendTime);
            this.messageSendTime = messageSendTime;
            return this;
        }

        /**
         * MessageTemplateId.
         */
        public Builder messageTemplateId(Long messageTemplateId) {
            this.putBodyParameter("MessageTemplateId", messageTemplateId);
            this.messageTemplateId = messageTemplateId;
            return this;
        }

        /**
         * MessageVariableParam.
         */
        public Builder messageVariableParam(String messageVariableParam) {
            this.putBodyParameter("MessageVariableParam", messageVariableParam);
            this.messageVariableParam = messageVariableParam;
            return this;
        }

        /**
         * Msisdns.
         */
        public Builder msisdns(java.util.List < String > msisdns) {
            String msisdnsShrink = shrink(msisdns, "Msisdns", "json");
            this.putBodyParameter("Msisdns", msisdnsShrink);
            this.msisdns = msisdns;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.putBodyParameter("TaskName", taskName);
            this.taskName = taskName;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

}
