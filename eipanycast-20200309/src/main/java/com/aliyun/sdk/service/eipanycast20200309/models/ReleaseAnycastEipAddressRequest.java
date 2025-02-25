// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eipanycast20200309.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseAnycastEipAddressRequest} extends {@link RequestModel}
 *
 * <p>ReleaseAnycastEipAddressRequest</p>
 */
public class ReleaseAnycastEipAddressRequest extends Request {
    @Query
    @NameInMap("AnycastId")
    @Validation(required = true)
    private String anycastId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    private ReleaseAnycastEipAddressRequest(Builder builder) {
        super(builder);
        this.anycastId = builder.anycastId;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseAnycastEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return anycastId
     */
    public String getAnycastId() {
        return this.anycastId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<ReleaseAnycastEipAddressRequest, Builder> {
        private String anycastId; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseAnycastEipAddressRequest request) {
            super(request);
            this.anycastId = request.anycastId;
            this.clientToken = request.clientToken;
        } 

        /**
         * The ID of the Anycast EIP to be released.
         */
        public Builder anycastId(String anycastId) {
            this.putQueryParameter("AnycastId", anycastId);
            this.anycastId = anycastId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public ReleaseAnycastEipAddressRequest build() {
            return new ReleaseAnycastEipAddressRequest(this);
        } 

    } 

}
