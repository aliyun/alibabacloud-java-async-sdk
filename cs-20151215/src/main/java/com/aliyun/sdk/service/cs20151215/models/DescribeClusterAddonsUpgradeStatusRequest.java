// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonsUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonsUpgradeStatusRequest</p>
 */
public class DescribeClusterAddonsUpgradeStatusRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("componentIds")
    @Validation(required = true)
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
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * componentIds.
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
