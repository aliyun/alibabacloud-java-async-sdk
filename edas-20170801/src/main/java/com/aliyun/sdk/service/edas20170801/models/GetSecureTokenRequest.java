// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecureTokenRequest} extends {@link RequestModel}
 *
 * <p>GetSecureTokenRequest</p>
 */
public class GetSecureTokenRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private GetSecureTokenRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecureTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<GetSecureTokenRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetSecureTokenRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The ID of the namespace, such as cn-beijing or cn-beijing:prod````.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public GetSecureTokenRequest build() {
            return new GetSecureTokenRequest(this);
        } 

    } 

}
