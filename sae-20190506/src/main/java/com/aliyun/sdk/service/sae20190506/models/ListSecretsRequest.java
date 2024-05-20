// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretsRequest} extends {@link RequestModel}
 *
 * <p>ListSecretsRequest</p>
 */
public class ListSecretsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private ListSecretsRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecretsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSecretsRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListSecretsRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The ID of the namespace in which the Secrets reside. By default, the namespace ID is the same as the region ID.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ListSecretsRequest build() {
            return new ListSecretsRequest(this);
        } 

    } 

}
