// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeClusterAddonsUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonsUpgradeStatusRequest</p>
 */
public class DescribeClusterAddonsUpgradeStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("componentIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > componentIds;

    private DescribeClusterAddonsUpgradeStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentIds = builder.componentIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonsUpgradeStatusRequest create() {
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
     * @return componentIds
     */
    public java.util.List < String > getComponentIds() {
        return this.componentIds;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAddonsUpgradeStatusRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > componentIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAddonsUpgradeStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentIds = request.componentIds;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c23421cfa74454bc8b37163fd19af****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The list of component names.</p>
         * <p>This parameter is required.</p>
         */
        public Builder componentIds(java.util.List < String > componentIds) {
            String componentIdsShrink = shrink(componentIds, "componentIds", "json");
            this.putQueryParameter("componentIds", componentIdsShrink);
            this.componentIds = componentIds;
            return this;
        }

        @Override
        public DescribeClusterAddonsUpgradeStatusRequest build() {
            return new DescribeClusterAddonsUpgradeStatusRequest(this);
        } 

    } 

}
