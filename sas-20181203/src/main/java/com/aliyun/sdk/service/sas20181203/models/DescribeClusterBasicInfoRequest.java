// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterBasicInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterBasicInfoRequest</p>
 */
public class DescribeClusterBasicInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeClusterBasicInfoRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterBasicInfoRequest create() {
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
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeClusterBasicInfoRequest, Builder> {
        private String clusterId; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterBasicInfoRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * The ID of the cluster that you want to query.
         * <p>
         * 
         * > You can call the [DescribeGroupedContainerInstances](~~DescribeGroupedContainerInstances~~) operation to query the IDs of clusters.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The dimension from which you want to configure the feature. Valid values:
         * <p>
         * 
         * *   **Cluster**: the ID of the cluster
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   **containerNetwork**: container network topology
         * *   **interceptionSwitch**: cluster microsegmentation
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeClusterBasicInfoRequest build() {
            return new DescribeClusterBasicInfoRequest(this);
        } 

    } 

}
