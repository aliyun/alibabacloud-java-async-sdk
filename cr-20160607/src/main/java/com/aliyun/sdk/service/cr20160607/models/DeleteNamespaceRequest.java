// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20160607.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNamespaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteNamespaceRequest</p>
 */
public class DeleteNamespaceRequest extends Request {
    @Path
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteNamespaceRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNamespaceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteNamespaceRequest, Builder> {
        private String namespace; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNamespaceRequest response) {
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
        public DeleteNamespaceRequest build() {
            return new DeleteNamespaceRequest(this);
        } 

    } 

}
