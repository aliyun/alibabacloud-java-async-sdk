// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link GetIMBotRequest} extends {@link RequestModel}
 *
 * <p>GetIMBotRequest</p>
 */
public class GetIMBotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imBotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imBotId;

    private GetIMBotRequest(Builder builder) {
        super(builder);
        this.imBotId = builder.imBotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIMBotRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imBotId
     */
    public String getImBotId() {
        return this.imBotId;
    }

    public static final class Builder extends Request.Builder<GetIMBotRequest, Builder> {
        private String imBotId; 

        private Builder() {
            super();
        } 

        private Builder(GetIMBotRequest request) {
            super(request);
            this.imBotId = request.imBotId;
        } 

        /**
         * <p>Bot 主键 UUID</p>
         * <p>This parameter is required.</p>
         */
        public Builder imBotId(String imBotId) {
            this.putPathParameter("imBotId", imBotId);
            this.imBotId = imBotId;
            return this;
        }

        @Override
        public GetIMBotRequest build() {
            return new GetIMBotRequest(this);
        } 

    } 

}
