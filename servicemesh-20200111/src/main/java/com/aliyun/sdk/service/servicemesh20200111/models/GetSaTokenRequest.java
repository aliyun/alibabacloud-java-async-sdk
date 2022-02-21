// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSaTokenRequest} extends {@link RequestModel}
 *
 * <p>GetSaTokenRequest</p>
 */
public class GetSaTokenRequest extends Request {
    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("NeedRefresh")
    private Boolean needRefresh;

    @Body
    @NameInMap("ServiceAccountName")
    @Validation(required = true)
    private String serviceAccountName;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private GetSaTokenRequest(Builder builder) {
        super(builder);
        this.namespace = builder.namespace;
        this.needRefresh = builder.needRefresh;
        this.serviceAccountName = builder.serviceAccountName;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSaTokenRequest create() {
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
     * @return needRefresh
     */
    public Boolean getNeedRefresh() {
        return this.needRefresh;
    }

    /**
     * @return serviceAccountName
     */
    public String getServiceAccountName() {
        return this.serviceAccountName;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<GetSaTokenRequest, Builder> {
        private String namespace; 
        private Boolean needRefresh; 
        private String serviceAccountName; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(GetSaTokenRequest response) {
            super(response);
            this.namespace = response.namespace;
            this.needRefresh = response.needRefresh;
            this.serviceAccountName = response.serviceAccountName;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NeedRefresh.
         */
        public Builder needRefresh(Boolean needRefresh) {
            this.putBodyParameter("NeedRefresh", needRefresh);
            this.needRefresh = needRefresh;
            return this;
        }

        /**
         * ServiceAccountName.
         */
        public Builder serviceAccountName(String serviceAccountName) {
            this.putBodyParameter("ServiceAccountName", serviceAccountName);
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public GetSaTokenRequest build() {
            return new GetSaTokenRequest(this);
        } 

    } 

}
