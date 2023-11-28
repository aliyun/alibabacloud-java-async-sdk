// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopCollectorRequest} extends {@link RequestModel}
 *
 * <p>StopCollectorRequest</p>
 */
public class StopCollectorRequest extends Request {
    @Path
    @NameInMap("ResId")
    @Validation(required = true)
    private String resId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private StopCollectorRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopCollectorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<StopCollectorRequest, Builder> {
        private String resId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(StopCollectorRequest request) {
            super(request);
            this.resId = request.resId;
            this.clientToken = request.clientToken;
        } 

        /**
         * The shipper ID.
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public StopCollectorRequest build() {
            return new StopCollectorRequest(this);
        } 

    } 

}
