// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNamespacedConfigMapsRequest} extends {@link RequestModel}
 *
 * <p>ListNamespacedConfigMapsRequest</p>
 */
public class ListNamespacedConfigMapsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    private ListNamespacedConfigMapsRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacedConfigMapsRequest create() {
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

    public static final class Builder extends Request.Builder<ListNamespacedConfigMapsRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListNamespacedConfigMapsRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
        } 

        /**
         * <p>cn-hangzhou</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ListNamespacedConfigMapsRequest build() {
            return new ListNamespacedConfigMapsRequest(this);
        } 

    } 

}
