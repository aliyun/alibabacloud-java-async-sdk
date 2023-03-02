// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindProduceAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>BindProduceAuthorizationRequest</p>
 */
public class BindProduceAuthorizationRequest extends Request {
    @Body
    @NameInMap("AuthorizedUserIds")
    private String authorizedUserIds;

    @Body
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Body
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    private BindProduceAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizedUserIds = builder.authorizedUserIds;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindProduceAuthorizationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedUserIds
     */
    public String getAuthorizedUserIds() {
        return this.authorizedUserIds;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    public static final class Builder extends Request.Builder<BindProduceAuthorizationRequest, Builder> {
        private String authorizedUserIds; 
        private String bizId; 
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(BindProduceAuthorizationRequest request) {
            super(request);
            this.authorizedUserIds = request.authorizedUserIds;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
        } 

        /**
         * AuthorizedUserIds.
         */
        public Builder authorizedUserIds(String authorizedUserIds) {
            this.putBodyParameter("AuthorizedUserIds", authorizedUserIds);
            this.authorizedUserIds = authorizedUserIds;
            return this;
        }

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public BindProduceAuthorizationRequest build() {
            return new BindProduceAuthorizationRequest(this);
        } 

    } 

}
