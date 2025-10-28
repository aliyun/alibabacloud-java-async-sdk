// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetSecureTokenRequest} extends {@link RequestModel}
 *
 * <p>GetSecureTokenRequest</p>
 */
public class GetSecureTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the namespace, such as cn-beijing or cn-beijing:prod````.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen:x*****</p>
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
