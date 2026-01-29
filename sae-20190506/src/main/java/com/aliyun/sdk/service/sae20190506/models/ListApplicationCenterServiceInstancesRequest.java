// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListApplicationCenterServiceInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationCenterServiceInstancesRequest</p>
 */
public class ListApplicationCenterServiceInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ListApplicationCenterServiceInstancesRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationCenterServiceInstancesRequest create() {
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListApplicationCenterServiceInstancesRequest, Builder> {
        private String namespaceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationCenterServiceInstancesRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.regionId = request.regionId;
        } 

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListApplicationCenterServiceInstancesRequest build() {
            return new ListApplicationCenterServiceInstancesRequest(this);
        } 

    } 

}
