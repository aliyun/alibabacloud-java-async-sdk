// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshKubeconfigRequest</p>
 */
public class DescribeServiceMeshKubeconfigRequest extends Request {
    @Query
    @NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshKubeconfigRequest(Builder builder) {
        super(builder);
        this.privateIpAddress = builder.privateIpAddress;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshKubeconfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privateIpAddress
     */
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshKubeconfigRequest, Builder> {
        private Boolean privateIpAddress; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshKubeconfigRequest response) {
            super(response);
            this.privateIpAddress = response.privateIpAddress;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeServiceMeshKubeconfigRequest build() {
            return new DescribeServiceMeshKubeconfigRequest(this);
        } 

    } 

}
