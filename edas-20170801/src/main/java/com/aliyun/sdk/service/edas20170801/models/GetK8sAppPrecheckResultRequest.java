// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sAppPrecheckResultRequest} extends {@link RequestModel}
 *
 * <p>GetK8sAppPrecheckResultRequest</p>
 */
public class GetK8sAppPrecheckResultRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    private GetK8sAppPrecheckResultRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.clusterId = builder.clusterId;
        this.namespace = builder.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sAppPrecheckResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    public static final class Builder extends Request.Builder<GetK8sAppPrecheckResultRequest, Builder> {
        private String appName; 
        private String clusterId; 
        private String namespace; 

        private Builder() {
            super();
        } 

        private Builder(GetK8sAppPrecheckResultRequest request) {
            super(request);
            this.appName = request.appName;
            this.clusterId = request.clusterId;
            this.namespace = request.namespace;
        } 

        /**
         * The name of the application.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * The ID of the cluster in Enterprise Distributed Application Service (EDAS).
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The namespace of the Kubernetes cluster.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        @Override
        public GetK8sAppPrecheckResultRequest build() {
            return new GetK8sAppPrecheckResultRequest(this);
        } 

    } 

}
