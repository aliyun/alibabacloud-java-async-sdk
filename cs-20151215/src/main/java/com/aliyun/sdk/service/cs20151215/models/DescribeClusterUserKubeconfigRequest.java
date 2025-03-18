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
 * {@link DescribeClusterUserKubeconfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterUserKubeconfigRequest</p>
 */
public class DescribeClusterUserKubeconfigRequest extends Request {
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to obtain the kubeconfig file that is used to connect to the cluster over the internal network. Valid values:</p>
         * <ul>
         * <li><code>true</code>: obtains the kubeconfig file that is used to connect to the master instance over the internal network.</li>
         * <li><code>false</code>: obtains the kubeconfig file that is used to connect to the master instance over the Internet.</li>
         * </ul>
         * <p>Default value: <code>false</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder privateIpAddress(Boolean privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The validity period of a temporary kubeconfig file. Unit: minutes. Valid values: 15 to 4320 (3 days).</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system specifies a longer validity period. The validity period is returned in the <code>expiration</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
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
