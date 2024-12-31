// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180208.models;

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
 * {@link RefuseDemandRequest} extends {@link RequestModel}
 *
 * <p>RefuseDemandRequest</p>
 */
public class RefuseDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    private RefuseDemandRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefuseDemandRequest create() {
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

    public static final class Builder extends Request.Builder<RefuseDemandRequest, Builder> {
        private String bizId; 
        private String message; 

        private Builder() {
            super();
        } 

        private Builder(RefuseDemandRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.message = request.message;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SE20183A0Q7C5556</p>
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
        public RefuseDemandRequest build() {
            return new RefuseDemandRequest(this);
        } 

    } 

}
