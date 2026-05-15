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
 * {@link DeleteIMBotRequest} extends {@link RequestModel}
 *
 * <p>DeleteIMBotRequest</p>
 */
public class DeleteIMBotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imBotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imBotId;

    private DeleteIMBotRequest(Builder builder) {
        super(builder);
        this.imBotId = builder.imBotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIMBotRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteIMBotRequest, Builder> {
        private String imBotId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIMBotRequest request) {
            super(request);
            this.imBotId = request.imBotId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imBotId(String imBotId) {
            this.putPathParameter("imBotId", imBotId);
            this.imBotId = imBotId;
            return this;
        }

        @Override
        public DeleteIMBotRequest build() {
            return new DeleteIMBotRequest(this);
        } 

    } 

}
