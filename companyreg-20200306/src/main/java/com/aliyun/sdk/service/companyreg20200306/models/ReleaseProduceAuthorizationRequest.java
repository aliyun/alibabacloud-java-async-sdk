// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link ReleaseProduceAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ReleaseProduceAuthorizationRequest</p>
 */
public class ReleaseProduceAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
    private String authorizedUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizType;

    private ReleaseProduceAuthorizationRequest(Builder builder) {
        super(builder);
        this.authorizedUserId = builder.authorizedUserId;
        this.bizId = builder.bizId;
        this.bizType = builder.bizType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseProduceAuthorizationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizedUserId
     */
    public String getAuthorizedUserId() {
        return this.authorizedUserId;
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

    public static final class Builder extends Request.Builder<ReleaseProduceAuthorizationRequest, Builder> {
        private String authorizedUserId; 
        private String bizId; 
        private String bizType; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseProduceAuthorizationRequest request) {
            super(request);
            this.authorizedUserId = request.authorizedUserId;
            this.bizId = request.bizId;
            this.bizType = request.bizType;
        } 

        /**
         * AuthorizedUserId.
         */
        public Builder authorizedUserId(String authorizedUserId) {
            this.putBodyParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P20211117141528000001</p>
         */
        public Builder bizId(String bizId) {
            this.putBodyParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>esp.beian_assist</p>
         */
        public Builder bizType(String bizType) {
            this.putBodyParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        @Override
        public ReleaseProduceAuthorizationRequest build() {
            return new ReleaseProduceAuthorizationRequest(this);
        } 

    } 

}
