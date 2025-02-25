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
 * {@link DescribeClusterAddonInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonInstanceRequest</p>
 */
public class DescribeClusterAddonInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterID;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("AddonName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cd06bbf8a86764a31bcac76136691****</p>
         */
        public Builder clusterID(String clusterID) {
            this.putPathParameter("ClusterID", clusterID);
            this.clusterID = clusterID;
            return this;
        }

        /**
         * <p>The name of the component.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>terway-eniip</p>
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
