// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendLikeRequest} extends {@link RequestModel}
 *
 * <p>SendLikeRequest</p>
 */
public class SendLikeRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("BroadCastType")
    private Integer broadCastType;

    @Body
    @NameInMap("Count")
    @Validation(required = true)
    private String count;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("OperatorUserId")
    private String operatorUserId;

    private SendLikeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.broadCastType = builder.broadCastType;
        this.count = builder.count;
        this.groupId = builder.groupId;
        this.operatorUserId = builder.operatorUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendLikeRequest create() {
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
     * @return broadCastType
     */
    public Integer getBroadCastType() {
        return this.broadCastType;
    }

    /**
     * @return count
     */
    public String getCount() {
        return this.count;
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

    public static final class Builder extends Request.Builder<SendLikeRequest, Builder> {
        private String appId; 
        private Integer broadCastType; 
        private String count; 
        private String groupId; 
        private String operatorUserId; 

        private Builder() {
            super();
        } 

        private Builder(SendLikeRequest request) {
            super(request);
            this.appId = request.appId;
            this.broadCastType = request.broadCastType;
            this.count = request.count;
            this.groupId = request.groupId;
            this.operatorUserId = request.operatorUserId;
        } 

        /**
         * 应用ID。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 系统消息广播类型，取值0，1，2.
         * <p>
         * 0：不广播。
         * 1：广播至消息组指定成员。
         * 2：广播至消息组。
         */
        public Builder broadCastType(Integer broadCastType) {
            this.putBodyParameter("BroadCastType", broadCastType);
            this.broadCastType = broadCastType;
            return this;
        }

        /**
         * 点赞数。示例值：1。
         */
        public Builder count(String count) {
            this.putBodyParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * 消息组ID。
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * 操作者ID。示例值：testUserId。
         */
        public Builder operatorUserId(String operatorUserId) {
            this.putBodyParameter("OperatorUserId", operatorUserId);
            this.operatorUserId = operatorUserId;
            return this;
        }

        @Override
        public SendLikeRequest build() {
            return new SendLikeRequest(this);
        } 

    } 

}
