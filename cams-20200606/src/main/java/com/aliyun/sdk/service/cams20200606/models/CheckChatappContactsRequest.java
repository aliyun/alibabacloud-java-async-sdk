// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckChatappContactsRequest} extends {@link RequestModel}
 *
 * <p>CheckChatappContactsRequest</p>
 */
public class CheckChatappContactsRequest extends Request {
    @Body
    @NameInMap("ChannelType")
    @Validation(required = true)
    private String channelType;

    @Body
    @NameInMap("Contacts")
    @Validation(required = true)
    private java.util.List < String > contacts;

    @Body
    @NameInMap("CustWabaId")
    private String custWabaId;

    @Body
    @NameInMap("From")
    @Validation(required = true)
    private String from;

    private CheckChatappContactsRequest(Builder builder) {
        super(builder);
        this.channelType = builder.channelType;
        this.contacts = builder.contacts;
        this.custWabaId = builder.custWabaId;
        this.from = builder.from;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckChatappContactsRequest create() {
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
     * @return contacts
     */
    public java.util.List < String > getContacts() {
        return this.contacts;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return from
     */
    public String getFrom() {
        return this.from;
    }

    public static final class Builder extends Request.Builder<CheckChatappContactsRequest, Builder> {
        private String channelType; 
        private java.util.List < String > contacts; 
        private String custWabaId; 
        private String from; 

        private Builder() {
            super();
        } 

        private Builder(CheckChatappContactsRequest request) {
            super(request);
            this.channelType = request.channelType;
            this.contacts = request.contacts;
            this.custWabaId = request.custWabaId;
            this.from = request.from;
        } 

        /**
         * 通道类型
         */
        public Builder channelType(String channelType) {
            this.putBodyParameter("ChannelType", channelType);
            this.channelType = channelType;
            return this;
        }

        /**
         * 需要查询的用户列表,单次调用最多查询10个。注意：用户号码必须加国家码
         */
        public Builder contacts(java.util.List < String > contacts) {
            String contactsShrink = shrink(contacts, "Contacts", "json");
            this.putBodyParameter("Contacts", contactsShrink);
            this.contacts = contacts;
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
         * 发送号码,所选择ChannelType下的Business账号，即在控制台上审核通过的Number
         */
        public Builder from(String from) {
            this.putBodyParameter("From", from);
            this.from = from;
            return this;
        }

        @Override
        public CheckChatappContactsRequest build() {
            return new CheckChatappContactsRequest(this);
        } 

    } 

}
