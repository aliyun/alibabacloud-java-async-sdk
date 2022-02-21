// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceRequest} extends {@link RequestModel}
 *
 * <p>GetNamespaceRequest</p>
 */
public class GetNamespaceRequest extends Request {
    @Path
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNamespaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetNamespaceRequest, Builder> {
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetNamespaceRequest response) {
            super(response);
            this.namespace = response.namespace;
            this.regionId = response.regionId;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putPathParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetNamespaceRequest build() {
            return new GetNamespaceRequest(this);
        } 

    } 

}
