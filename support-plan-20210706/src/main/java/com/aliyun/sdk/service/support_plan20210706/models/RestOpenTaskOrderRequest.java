// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestOpenTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>RestOpenTaskOrderRequest</p>
 */
public class RestOpenTaskOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetContent")
    private String resetContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetType")
    private String resetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private RestOpenTaskOrderRequest(Builder builder) {
        super(builder);
        this.openGroupId = builder.openGroupId;
        this.orderId = builder.orderId;
        this.resetContent = builder.resetContent;
        this.resetType = builder.resetType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestOpenTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return resetContent
     */
    public String getResetContent() {
        return this.resetContent;
    }

    /**
     * @return resetType
     */
    public String getResetType() {
        return this.resetType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<RestOpenTaskOrderRequest, Builder> {
        private String openGroupId; 
        private String orderId; 
        private String resetContent; 
        private String resetType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(RestOpenTaskOrderRequest request) {
            super(request);
            this.openGroupId = request.openGroupId;
            this.orderId = request.orderId;
            this.resetContent = request.resetContent;
            this.resetType = request.resetType;
            this.userName = request.userName;
        } 

        /**
         * OpenGroupId.
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * ResetContent.
         */
        public Builder resetContent(String resetContent) {
            this.putQueryParameter("ResetContent", resetContent);
            this.resetContent = resetContent;
            return this;
        }

        /**
         * ResetType.
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public RestOpenTaskOrderRequest build() {
            return new RestOpenTaskOrderRequest(this);
        } 

    } 

}
