// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link GetMessageRequest} extends {@link RequestModel}
 *
 * <p>GetMessageRequest</p>
 */
public class GetMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("MessageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageId;

    private GetMessageRequest(Builder builder) {
        super(builder);
        this.messageId = builder.messageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageRequest create() {
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

    public static final class Builder extends Request.Builder<GetMessageRequest, Builder> {
        private String messageId; 

        private Builder() {
            super();
        } 

        private Builder(GetMessageRequest request) {
            super(request);
            this.messageId = request.messageId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>m-123***7890</p>
         */
        public Builder messageId(String messageId) {
            this.putPathParameter("MessageId", messageId);
            this.messageId = messageId;
            return this;
        }

        @Override
        public GetMessageRequest build() {
            return new GetMessageRequest(this);
        } 

    } 

}
