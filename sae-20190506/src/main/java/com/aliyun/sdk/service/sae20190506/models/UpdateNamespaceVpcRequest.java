// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceVpcRequest} extends {@link RequestModel}
 *
 * <p>UpdateNamespaceVpcRequest</p>
 */
public class UpdateNamespaceVpcRequest extends Request {
    @Query
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Query
    @NameInMap("VpcId")
    @Validation(required = true)
    private String vpcId;

    private UpdateNamespaceVpcRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNamespaceVpcRequest create() {
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
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<UpdateNamespaceVpcRequest, Builder> {
        private String namespaceId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNamespaceVpcRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
            this.vpcId = request.vpcId;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public UpdateNamespaceVpcRequest build() {
            return new UpdateNamespaceVpcRequest(this);
        } 

    } 

}
