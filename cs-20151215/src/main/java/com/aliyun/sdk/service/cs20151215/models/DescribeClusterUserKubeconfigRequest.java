// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterUserKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterUserKubeconfigRequest</p>
 */
public class DescribeClusterUserKubeconfigRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    @Query
    @NameInMap("TemporaryDurationMinutes")
    private Long temporaryDurationMinutes;

    private DescribeClusterUserKubeconfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.privateIpAddress = builder.privateIpAddress;
        this.temporaryDurationMinutes = builder.temporaryDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterUserKubeconfigRequest create() {
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

    /**
     * @return temporaryDurationMinutes
     */
    public Long getTemporaryDurationMinutes() {
        return this.temporaryDurationMinutes;
    }

    public static final class Builder extends Request.Builder<DescribeClusterUserKubeconfigRequest, Builder> {
        private String clusterId; 
        private Boolean privateIpAddress; 
        private Long temporaryDurationMinutes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterUserKubeconfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.privateIpAddress = request.privateIpAddress;
            this.temporaryDurationMinutes = request.temporaryDurationMinutes;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
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
         * Default value: `false`.
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The validity period of a temporary kubeconfig file. Unit: minutes. Valid values: 15 to 4320 (3 days).
         * <p>
         * 
         * >  If you do not specify this parameter, the system specifies a longer validity period. The validity period is returned in the `expiration` parameter.
         */
        public Builder temporaryDurationMinutes(Long temporaryDurationMinutes) {
            this.putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes);
            this.temporaryDurationMinutes = temporaryDurationMinutes;
            return this;
        }

        @Override
        public DescribeClusterUserKubeconfigRequest build() {
            return new DescribeClusterUserKubeconfigRequest(this);
        } 

    } 

}
