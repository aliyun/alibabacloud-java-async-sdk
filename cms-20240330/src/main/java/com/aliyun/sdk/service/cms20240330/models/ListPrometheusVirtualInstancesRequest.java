// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link ListPrometheusVirtualInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListPrometheusVirtualInstancesRequest</p>
 */
public class ListPrometheusVirtualInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    private ListPrometheusVirtualInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusVirtualInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<ListPrometheusVirtualInstancesRequest, Builder> {
        private String regionId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(ListPrometheusVirtualInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.namespace = request.namespace;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public ListPrometheusVirtualInstancesRequest build() {
            return new ListPrometheusVirtualInstancesRequest(this);
        } 

    } 

}
