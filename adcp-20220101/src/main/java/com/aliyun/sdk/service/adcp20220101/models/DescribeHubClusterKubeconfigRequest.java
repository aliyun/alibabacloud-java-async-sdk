// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClusterKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeHubClusterKubeconfigRequest</p>
 */
public class DescribeHubClusterKubeconfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    private DescribeHubClusterKubeconfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.privateIpAddress = builder.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClusterKubeconfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return privateIpAddress
     */
    public Boolean getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static final class Builder extends Request.Builder<DescribeHubClusterKubeconfigRequest, Builder> {
        private String clusterId; 
        private Boolean privateIpAddress; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHubClusterKubeconfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.privateIpAddress = request.privateIpAddress;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. Valid values:
         * <p>
         * 
         * *   `true`: obtains the kubeconfig file that is used to connect to the master instance over the internal network.
         * *   `false`: obtains the kubeconfig file that is used to connect to the master instance over the Internet.
         * 
         * Default value: `false`
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        @Override
        public DescribeHubClusterKubeconfigRequest build() {
            return new DescribeHubClusterKubeconfigRequest(this);
        } 

    } 

}
