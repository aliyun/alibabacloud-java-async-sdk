// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeReusableSlbRequest} extends {@link RequestModel}
 *
 * <p>DescribeReusableSlbRequest</p>
 */
public class DescribeReusableSlbRequest extends Request {
    @Body
    @NameInMap("K8sClusterId")
    @Validation(required = true)
    private String k8sClusterId;

    @Body
    @NameInMap("NetworkType")
    @Validation(required = true)
    private String networkType;

    private DescribeReusableSlbRequest(Builder builder) {
        super(builder);
        this.k8sClusterId = builder.k8sClusterId;
        this.networkType = builder.networkType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeReusableSlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return k8sClusterId
     */
    public String getK8sClusterId() {
        return this.k8sClusterId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    public static final class Builder extends Request.Builder<DescribeReusableSlbRequest, Builder> {
        private String k8sClusterId; 
        private String networkType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeReusableSlbRequest request) {
            super(request);
            this.k8sClusterId = request.k8sClusterId;
            this.networkType = request.networkType;
        } 

        /**
         * The ID of the Kubernetes cluster on the data plane.
         */
        public Builder k8sClusterId(String k8sClusterId) {
            this.putBodyParameter("K8sClusterId", k8sClusterId);
            this.k8sClusterId = k8sClusterId;
            return this;
        }

        /**
         * The network type of the SLB instance. Valid values:
         * <p>
         * 
         * *   `intranet`
         * *   `internet`
         */
        public Builder networkType(String networkType) {
            this.putBodyParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        @Override
        public DescribeReusableSlbRequest build() {
            return new DescribeReusableSlbRequest(this);
        } 

    } 

}
