// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIngressesRequest} extends {@link RequestModel}
 *
 * <p>ListIngressesRequest</p>
 */
public class ListIngressesRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    private ListIngressesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIngressesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<ListIngressesRequest, Builder> {
        private String appId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListIngressesRequest request) {
            super(request);
            this.appId = request.appId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * The list of routing rules.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ListIngressesRequest build() {
            return new ListIngressesRequest(this);
        } 

    } 

}
