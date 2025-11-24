// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link RevokeKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>RevokeKubeconfigRequest</p>
 */
public class RevokeKubeconfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private RevokeKubeconfigRequest(Builder builder) {
        super(builder);
        this.privateIpAddress = builder.privateIpAddress;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeKubeconfigRequest create() {
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

    public static final class Builder extends Request.Builder<RevokeKubeconfigRequest, Builder> {
        private Boolean privateIpAddress; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeKubeconfigRequest request) {
            super(request);
            this.privateIpAddress = request.privateIpAddress;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>Specifies whether to return the kubeconfig file for private access.</p>
         * <ul>
         * <li><code>true</code>: returns the kubeconfig file for private access.</li>
         * <li><code>false</code>: returns the kubeconfig file for public access.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putBodyParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The ID of the ASM instance for which you want to revoke its kubeconfig file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cf08a11940e8c46c48bc791fcdb3****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public RevokeKubeconfigRequest build() {
            return new RevokeKubeconfigRequest(this);
        } 

    } 

}
