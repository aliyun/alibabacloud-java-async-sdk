// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonInstanceRequest</p>
 */
public class DescribeClusterAddonInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterID")
    private String clusterID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AddonName")
    private String addonName;

    private DescribeClusterAddonInstanceRequest(Builder builder) {
        super(builder);
        this.clusterID = builder.clusterID;
        this.addonName = builder.addonName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterID
     */
    public String getClusterID() {
        return this.clusterID;
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAddonInstanceRequest, Builder> {
        private String clusterID; 
        private String addonName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAddonInstanceRequest request) {
            super(request);
            this.clusterID = request.clusterID;
            this.addonName = request.addonName;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterID(String clusterID) {
            this.putPathParameter("ClusterID", clusterID);
            this.clusterID = clusterID;
            return this;
        }

        /**
         * The name of the component.
         */
        public Builder addonName(String addonName) {
            this.putPathParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        @Override
        public DescribeClusterAddonInstanceRequest build() {
            return new DescribeClusterAddonInstanceRequest(this);
        } 

    } 

}
