// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVmMetaRequest} extends {@link RequestModel}
 *
 * <p>GetVmMetaRequest</p>
 */
public class GetVmMetaRequest extends Request {
    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("ServiceAccount")
    private String serviceAccount;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    @Query
    @NameInMap("TrustDomain")
    private String trustDomain;

    private GetVmMetaRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.serviceAccount = builder.serviceAccount;
        this.serviceMeshId = builder.serviceMeshId;
        this.trustDomain = builder.trustDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVmMetaRequest create() {
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
     * @return serviceAccount
     */
    public String getServiceAccount() {
        return this.serviceAccount;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return trustDomain
     */
    public String getTrustDomain() {
        return this.trustDomain;
    }

    public static final class Builder extends Request.Builder<GetVmMetaRequest, Builder> {
        private String namespace; 
        private String serviceAccount; 
        private String serviceMeshId; 
        private String trustDomain; 

        private Builder() {
            super();
        } 

        private Builder(GetVmMetaRequest response) {
            super(response);
            this.namespace = response.namespace;
            this.serviceAccount = response.serviceAccount;
            this.serviceMeshId = response.serviceMeshId;
            this.trustDomain = response.trustDomain;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ServiceAccount.
         */
        public Builder serviceAccount(String serviceAccount) {
            this.putQueryParameter("ServiceAccount", serviceAccount);
            this.serviceAccount = serviceAccount;
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

        /**
         * TrustDomain.
         */
        public Builder trustDomain(String trustDomain) {
            this.putQueryParameter("TrustDomain", trustDomain);
            this.trustDomain = trustDomain;
            return this;
        }

        @Override
        public GetVmMetaRequest build() {
            return new GetVmMetaRequest(this);
        } 

    } 

}
