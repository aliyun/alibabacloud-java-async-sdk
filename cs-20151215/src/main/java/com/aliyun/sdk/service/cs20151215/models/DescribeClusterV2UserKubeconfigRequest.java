// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribeClusterV2UserKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterV2UserKubeconfigRequest</p>
 */
public class DescribeClusterV2UserKubeconfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private Boolean privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemporaryDurationMinutes")
    private Long temporaryDurationMinutes;

    private DescribeClusterV2UserKubeconfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.privateIpAddress = builder.privateIpAddress;
        this.temporaryDurationMinutes = builder.temporaryDurationMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterV2UserKubeconfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeClusterV2UserKubeconfigRequest, Builder> {
        private String clusterId; 
        private Boolean privateIpAddress; 
        private Long temporaryDurationMinutes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterV2UserKubeconfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.privateIpAddress = request.privateIpAddress;
            this.temporaryDurationMinutes = request.temporaryDurationMinutes;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * TemporaryDurationMinutes.
         */
        public Builder temporaryDurationMinutes(Long temporaryDurationMinutes) {
            this.putQueryParameter("TemporaryDurationMinutes", temporaryDurationMinutes);
            this.temporaryDurationMinutes = temporaryDurationMinutes;
            return this;
        }

        @Override
        public DescribeClusterV2UserKubeconfigRequest build() {
            return new DescribeClusterV2UserKubeconfigRequest(this);
        } 

    } 

}
