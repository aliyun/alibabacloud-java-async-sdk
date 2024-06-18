// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AcceptDemandRequest} extends {@link RequestModel}
 *
 * <p>AcceptDemandRequest</p>
 */
public class AcceptDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private AcceptDemandRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AcceptDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder extends Request.Builder<AcceptDemandRequest, Builder> {
        private String bizId; 
        private String message; 

        private Builder() {
            super();
        } 

        private Builder(AcceptDemandRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.message = request.message;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.putQueryParameter("Message", message);
            this.message = message;
            return this;
        }

        @Override
        public AcceptDemandRequest build() {
            return new AcceptDemandRequest(this);
        } 

    } 

}
