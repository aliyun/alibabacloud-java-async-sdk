// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link SubmitVerifyCodeResultRequest} extends {@link RequestModel}
 *
 * <p>SubmitVerifyCodeResultRequest</p>
 */
public class SubmitVerifyCodeResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean result;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("To")
    private String to;

    private SubmitVerifyCodeResultRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
        this.result = builder.result;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitVerifyCodeResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    /**
     * @return to
     */
    public String getTo() {
        return this.to;
    }

    public static final class Builder extends Request.Builder<SubmitVerifyCodeResultRequest, Builder> {
        private String messageId; 
        private Boolean result; 
        private String to; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVerifyCodeResultRequest request) {
            super(request);
            this.messageId = request.messageId;
            this.result = request.result;
            this.to = request.to;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>202605012020***</p>
         */
        public Builder messageId(String messageId) {
            this.putQueryParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TRUE</p>
         */
        public Builder result(Boolean result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        /**
         * To.
         */
        public Builder to(String to) {
            this.putQueryParameter("To", to);
            this.to = to;
            return this;
        }

        @Override
        public SubmitVerifyCodeResultRequest build() {
            return new SubmitVerifyCodeResultRequest(this);
        } 

    } 

}
