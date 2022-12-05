// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGroupUsersRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToGroupUsersRequest</p>
 */
public class SendMessageToGroupUsersRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Data")
    @Validation(required = true)
    private String data;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("OperatorUserId")
    @Validation(required = true)
    private String operatorUserId;

    @Body
    @NameInMap("ReceiverIdList")
    @Validation(required = true)
    private java.util.List < String > receiverIdList;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private Integer type;

    private SendMessageToGroupUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
        this.receiverIdList = builder.receiverIdList;
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
    public java.util.List < String > getReceiverIdList() {
        return this.receiverIdList;
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
        private java.util.List < String > receiverIdList; 
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
            this.type = request.type;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(String data) {
            this.putBodyParameter("Data", data);
            this.data = data;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OperatorUserId.
         */
        public Builder operatorUserId(String operatorUserId) {
            this.putBodyParameter("OperatorUserId", operatorUserId);
            this.operatorUserId = operatorUserId;
            return this;
        }

        /**
         * ReceiverIdList.
         */
        public Builder receiverIdList(java.util.List < String > receiverIdList) {
            String receiverIdListShrink = shrink(receiverIdList, "ReceiverIdList", "json");
            this.putBodyParameter("ReceiverIdList", receiverIdListShrink);
            this.receiverIdList = receiverIdList;
            return this;
        }

        /**
         * Type.
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
