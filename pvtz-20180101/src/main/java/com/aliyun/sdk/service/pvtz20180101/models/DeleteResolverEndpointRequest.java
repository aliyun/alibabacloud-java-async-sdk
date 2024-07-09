// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResolverEndpointRequest} extends {@link RequestModel}
 *
 * <p>DeleteResolverEndpointRequest</p>
 */
public class DeleteResolverEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private DeleteResolverEndpointRequest(Builder builder) {
        super(builder);
        this.endpointId = builder.endpointId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResolverEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointId
     */
    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<DeleteResolverEndpointRequest, Builder> {
        private String endpointId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResolverEndpointRequest request) {
            super(request);
            this.endpointId = request.endpointId;
            this.lang = request.lang;
        } 

        /**
         * The endpoint ID.
         */
        public Builder endpointId(String endpointId) {
            this.putQueryParameter("EndpointId", endpointId);
            this.endpointId = endpointId;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        @Override
        public DeleteResolverEndpointRequest build() {
            return new DeleteResolverEndpointRequest(this);
        } 

    } 

}
