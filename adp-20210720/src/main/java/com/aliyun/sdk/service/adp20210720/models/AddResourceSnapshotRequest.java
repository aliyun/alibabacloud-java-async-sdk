// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddResourceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>AddResourceSnapshotRequest</p>
 */
public class AddResourceSnapshotRequest extends Request {
    @Body
    @NameInMap("name")
    private String name;

    @Query
    @NameInMap("clusterUID")
    private String clusterUID;

    @Query
    @NameInMap("productVersionUID")
    private String productVersionUID;

    private AddResourceSnapshotRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.clusterUID = builder.clusterUID;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddResourceSnapshotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return clusterUID
     */
    public String getClusterUID() {
        return this.clusterUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<AddResourceSnapshotRequest, Builder> {
        private String name; 
        private String clusterUID; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(AddResourceSnapshotRequest request) {
            super(request);
            this.name = request.name;
            this.clusterUID = request.clusterUID;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * clusterUID.
         */
        public Builder clusterUID(String clusterUID) {
            this.putQueryParameter("clusterUID", clusterUID);
            this.clusterUID = clusterUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putQueryParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public AddResourceSnapshotRequest build() {
            return new AddResourceSnapshotRequest(this);
        } 

    } 

}
