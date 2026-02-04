// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppInstanceTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInstanceTicketRequest</p>
 */
public class CreateAppInstanceTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    private CreateAppInstanceTicketRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.clientId = builder.clientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceTicketRequest create() {
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
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    public static final class Builder extends Request.Builder<CreateAppInstanceTicketRequest, Builder> {
        private String bizId; 
        private String clientId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInstanceTicketRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.clientId = request.clientId;
        } 

        /**
         * <p>Customer business ID</p>
         * 
         * <strong>example:</strong>
         * <p>WS20250801154628000001</p>
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * <p>Client ID of the device that needs to revoke the access token.</p>
         * 
         * <strong>example:</strong>
         * <p>d566aaf2-7c88-40a4-982f-6abef0be13c9</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        @Override
        public CreateAppInstanceTicketRequest build() {
            return new CreateAppInstanceTicketRequest(this);
        } 

    } 

}
