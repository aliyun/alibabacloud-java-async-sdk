// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeContainerServiceK8sClusterKritisStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerServiceK8sClusterKritisStatusRequest</p>
 */
public class DescribeContainerServiceK8sClusterKritisStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DescribeContainerServiceK8sClusterKritisStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerServiceK8sClusterKritisStatusRequest create() {
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DescribeContainerServiceK8sClusterKritisStatusRequest, Builder> {
        private String clusterId; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerServiceK8sClusterKritisStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c0e9efc6dea5f41db93b7e977123c****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>119.145.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DescribeContainerServiceK8sClusterKritisStatusRequest build() {
            return new DescribeContainerServiceK8sClusterKritisStatusRequest(this);
        } 

    } 

}
