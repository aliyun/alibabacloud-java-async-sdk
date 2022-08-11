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
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ApiServer是否为内网地址。
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * 临时kubeconfig有效期，单位：分钟。  最小值：15（15分钟）  最大值：4320（3天）。
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
