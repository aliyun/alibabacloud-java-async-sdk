// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendMessageToGroupRequest} extends {@link RequestModel}
 *
 * <p>SendMessageToGroupRequest</p>
 */
public class SendMessageToGroupRequest extends Request {
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
    @NameInMap("Type")
    private Integer type;

    private SendMessageToGroupRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.data = builder.data;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageToGroupRequest create() {
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
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendMessageToGroupRequest, Builder> {
        private String appId; 
        private String data; 
        private String groupId; 
        private String operatorUserId; 
        private Integer type; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageToGroupRequest request) {
            super(request);
            this.appId = request.appId;
            this.data = request.data;
            this.groupId = request.groupId;
            this.operatorUserId = request.operatorUserId;
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
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendMessageToGroupRequest build() {
            return new SendMessageToGroupRequest(this);
        } 

    } 

}
