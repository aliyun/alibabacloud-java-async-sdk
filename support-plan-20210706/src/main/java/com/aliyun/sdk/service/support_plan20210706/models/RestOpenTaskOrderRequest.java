// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestOpenTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>RestOpenTaskOrderRequest</p>
 */
public class RestOpenTaskOrderRequest extends Request {
    @Query
    @NameInMap("OpenGroupId")
    private String openGroupId;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private String orderId;

    @Query
    @NameInMap("ResetContent")
    private String resetContent;

    @Query
    @NameInMap("ResetType")
    private String resetType;

    @Query
    @NameInMap("UserName")
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

        private Builder(RestOpenTaskOrderRequest response) {
            super(response);
            this.openGroupId = response.openGroupId;
            this.orderId = response.orderId;
            this.resetContent = response.resetContent;
            this.resetType = response.resetType;
            this.userName = response.userName;
        } 

        /**
         * 主群关联Id
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * 任务单ID
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * 重开说明
         */
        public Builder resetContent(String resetContent) {
            this.putQueryParameter("ResetContent", resetContent);
            this.resetContent = resetContent;
            return this;
        }

        /**
         * 重开类型
         */
        public Builder resetType(String resetType) {
            this.putQueryParameter("ResetType", resetType);
            this.resetType = resetType;
            return this;
        }

        /**
         * 操作人姓名
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
