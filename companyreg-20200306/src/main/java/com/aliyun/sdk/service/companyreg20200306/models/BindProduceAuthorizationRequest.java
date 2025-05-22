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
 * {@link BindProduceAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>BindProduceAuthorizationRequest</p>
 */
public class BindProduceAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserIds")
    private String authorizedUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizType")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>P20210815211849000001</p>
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
         * <p>esp.bookkeeping_ai</p>
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
