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
 * {@link UpdateIMBotRequest} extends {@link RequestModel}
 *
 * <p>UpdateIMBotRequest</p>
 */
public class UpdateIMBotRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("imBotId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imBotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateIMBotInput body;

    private UpdateIMBotRequest(Builder builder) {
        super(builder);
        this.imBotId = builder.imBotId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIMBotRequest create() {
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

    /**
     * @return body
     */
    public UpdateIMBotInput getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateIMBotRequest, Builder> {
        private String imBotId; 
        private UpdateIMBotInput body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIMBotRequest request) {
            super(request);
            this.imBotId = request.imBotId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imBotId(String imBotId) {
            this.putPathParameter("imBotId", imBotId);
            this.imBotId = imBotId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(UpdateIMBotInput body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateIMBotRequest build() {
            return new UpdateIMBotRequest(this);
        } 

    } 

}
