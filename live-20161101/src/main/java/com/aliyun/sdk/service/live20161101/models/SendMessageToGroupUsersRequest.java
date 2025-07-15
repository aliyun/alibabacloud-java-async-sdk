// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link SendMessageToGroupUsersRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToGroupUsersRequest</p>
 */
public class SendMessageToGroupUsersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OperatorUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operatorUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReceiverIdList")
    private java.util.List<String> receiverIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkipAudit")
    private Boolean skipAudit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer type;

    private SendMessageToGroupUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
        this.receiverIdList = builder.receiverIdList;
        this.skipAudit = builder.skipAudit;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageToGroupUsersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return operatorUserId
     */
    public String getOperatorUserId() {
        return this.operatorUserId;
    }

    /**
     * @return receiverIdList
     */
    public java.util.List<String> getReceiverIdList() {
        return this.receiverIdList;
    }

    /**
     * @return skipAudit
     */
    public Boolean getSkipAudit() {
        return this.skipAudit;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendMessageToGroupUsersRequest, Builder> {
        private String appId; 
        private String data; 
        private String groupId; 
        private String operatorUserId; 
        private java.util.List<String> receiverIdList; 
        private Boolean skipAudit; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageToGroupUsersRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.groupId = request.groupId;
            this.operatorUserId = request.operatorUserId;
            this.receiverIdList = request.receiverIdList;
            this.skipAudit = request.skipAudit;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VKL3***</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The message body. The value is a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the message group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AE35-****-T95F</p>
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the user who performs the operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>de1**a0</p>
         */
        public Builder operatorUserId(String operatorUserId) {
            this.putBodyParameter("OperatorUserId", operatorUserId);
            this.operatorUserId = operatorUserId;
            return this;
        }

        /**
         * <p>The list of users to receive the message.</p>
         */
        public Builder receiverIdList(java.util.List<String> receiverIdList) {
            String receiverIdListShrink = shrink(receiverIdList, "ReceiverIdList", "simple");
            this.putBodyParameter("ReceiverIdList", receiverIdListShrink);
            this.receiverIdList = receiverIdList;
            return this;
        }

        /**
         * <p>Specifies whether the message requires Alibaba Cloud content moderation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: does not require content moderation.</li>
         * <li><strong>false</strong>: requires content moderation. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipAudit(Boolean skipAudit) {
            this.putQueryParameter("SkipAudit", skipAudit);
            this.skipAudit = skipAudit;
            return this;
        }

        /**
         * <p>The type of the message. A value that is less than or equal to 10000 specifies a system message. A value that is greater than 10000 specifies a custom message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12000</p>
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendMessageToGroupUsersRequest build() {
            return new SendMessageToGroupUsersRequest(this);
        } 

    } 

}
