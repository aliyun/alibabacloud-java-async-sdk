// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateTicketRequest</p>
 */
public class CreateTicketRequest extends Request {
    @Body
    @NameInMap("playAccessKeyId")
    @Validation(required = true)
    private String playAccessKeyId;

    @Body
    @NameInMap("playAccessKeySecret")
    @Validation(required = true)
    private String playAccessKeySecret;

    private CreateTicketRequest(Builder builder) {
        super(builder);
        this.playAccessKeyId = builder.playAccessKeyId;
        this.playAccessKeySecret = builder.playAccessKeySecret;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playAccessKeyId
     */
    public String getPlayAccessKeyId() {
        return this.playAccessKeyId;
    }

    /**
     * @return playAccessKeySecret
     */
    public String getPlayAccessKeySecret() {
        return this.playAccessKeySecret;
    }

    public static final class Builder extends Request.Builder<CreateTicketRequest, Builder> {
        private String playAccessKeyId; 
        private String playAccessKeySecret; 

        private Builder() {
            super();
        } 

        private Builder(CreateTicketRequest request) {
            super(request);
            this.playAccessKeyId = request.playAccessKeyId;
            this.playAccessKeySecret = request.playAccessKeySecret;
        } 

        /**
         * playAccessKeyId.
         */
        public Builder playAccessKeyId(String playAccessKeyId) {
            this.putBodyParameter("playAccessKeyId", playAccessKeyId);
            this.playAccessKeyId = playAccessKeyId;
            return this;
        }

        /**
         * playAccessKeySecret.
         */
        public Builder playAccessKeySecret(String playAccessKeySecret) {
            this.putBodyParameter("playAccessKeySecret", playAccessKeySecret);
            this.playAccessKeySecret = playAccessKeySecret;
            return this;
        }

        @Override
        public CreateTicketRequest build() {
            return new CreateTicketRequest(this);
        } 

    } 

}
