// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendChatappMassMessageRequest} extends {@link RequestModel}
 *
 * <p>SendChatappMassMessageRequest</p>
 */
public class SendChatappMassMessageRequest extends Request {
    @Body
    @NameInMap("ChannelType")
    @Validation(required = true)
    private String channelType;

    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @Body
    @NameInMap("FallBackContent")
    private String fallBackContent;

    @Body
    @NameInMap("FallBackId")
    private String fallBackId;

    @Body
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    @Body
    @NameInMap("IsvCode")
    private String isvCode;

    @Body
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Body
    @NameInMap("SenderList")
    @Validation(required = true)
    private java.util.List < SenderList> senderList;

    @Body
    @NameInMap("TaskId")
    private String taskId;

    @Body
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    private SendChatappMassMessageRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.fallBackContent = builder.fallBackContent;
        this.fallBackId = builder.fallBackId;
        this.from = builder.from;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.senderList = builder.senderList;
        this.taskId = builder.taskId;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendChatappMassMessageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelType
     */
    public String getChannelType() {
        return this.channelType;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return fallBackContent
     */
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    /**
     * @return fallBackId
     */
    public String getFallBackId() {
        return this.fallBackId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return senderList
     */
    public java.util.List < SenderList> getSenderList() {
        return this.senderList;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<SendChatappMassMessageRequest, Builder> {
        private String channelType; 
        private String custSpaceId; 
        private String custWabaId; 
        private String fallBackContent; 
        private String fallBackId; 
        private String from; 
        private String isvCode; 
        private String language; 
        private java.util.List < SenderList> senderList; 
        private String taskId; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(SendChatappMassMessageRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.fallBackContent = request.fallBackContent;
            this.fallBackId = request.fallBackId;
            this.from = request.from;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.senderList = request.senderList;
            this.taskId = request.taskId;
            this.templateCode = request.templateCode;
        } 

        /**
         * 通道类型 whatsapp/viber/line
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * ISV客户wabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * 回落内容
         */
        public Builder fallBackContent(String fallBackContent) {
            this.putBodyParameter("FallBackContent", fallBackContent);
            this.fallBackContent = fallBackContent;
            return this;
        }

        /**
         * 回落策略ID
         */
        public Builder fallBackId(String fallBackId) {
            this.putBodyParameter("FallBackId", fallBackId);
            this.fallBackId = fallBackId;
            return this;
        }

        /**
         * 发送方
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 语言
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * SenderList.
         */
        public Builder senderList(java.util.List < SenderList> senderList) {
            String senderListShrink = shrink(senderList, "SenderList", "json");
            this.putBodyParameter("SenderList", senderListShrink);
            this.senderList = senderList;
            return this;
        }

        /**
         * 任务ID
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * 模板编码
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public SendChatappMassMessageRequest build() {
            return new SendChatappMassMessageRequest(this);
        } 

    } 

    public static class SenderList extends TeaModel {
        @NameInMap("Payload")
        private java.util.List < String > payload;

        @NameInMap("TemplateParams")
        private java.util.Map < String, String > templateParams;

        @NameInMap("To")
        @Validation(required = true)
        private String to;

        private SenderList(Builder builder) {
            this.payload = builder.payload;
            this.templateParams = builder.templateParams;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SenderList create() {
            return builder().build();
        }

        /**
         * @return payload
         */
        public java.util.List < String > getPayload() {
            return this.payload;
        }

        /**
         * @return templateParams
         */
        public java.util.Map < String, String > getTemplateParams() {
            return this.templateParams;
        }

        /**
         * @return to
         */
        public String getTo() {
            return this.to;
        }

        public static final class Builder {
            private java.util.List < String > payload; 
            private java.util.Map < String, String > templateParams; 
            private String to; 

            /**
             * payload
             */
            public Builder payload(java.util.List < String > payload) {
                this.payload = payload;
                return this;
            }

            /**
             * 变量参数
             */
            public Builder templateParams(java.util.Map < String, String > templateParams) {
                this.templateParams = templateParams;
                return this;
            }

            /**
             * 号码
             */
            public Builder to(String to) {
                this.to = to;
                return this;
            }

            public SenderList build() {
                return new SenderList(this);
            } 

        } 

    }
}
