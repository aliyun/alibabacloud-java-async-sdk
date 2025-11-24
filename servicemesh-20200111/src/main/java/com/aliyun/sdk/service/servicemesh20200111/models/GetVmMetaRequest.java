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
 * {@link GetVmMetaRequest} extends {@link RequestModel}
 *
 * <p>GetVmMetaRequest</p>
 */
public class GetVmMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceAccount")
    private String serviceAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrustDomain")
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

        private Builder(GetVmMetaRequest request) {
            super(request);
            this.namespace = request.namespace;
            this.serviceAccount = request.serviceAccount;
            this.serviceMeshId = request.serviceMeshId;
            this.trustDomain = request.trustDomain;
        } 

        /**
         * <p>The name of the namespace. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The service account. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>http-sa</p>
         */
        public Builder serviceAccount(String serviceAccount) {
            this.putQueryParameter("ServiceAccount", serviceAccount);
            this.serviceAccount = serviceAccount;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ce51a7de4a5144db88a864ed91****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The trusted domain. Default value: cluster.local. This parameter is valid only after you set the Namespace and the ServiceAccount parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster.local</p>
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
