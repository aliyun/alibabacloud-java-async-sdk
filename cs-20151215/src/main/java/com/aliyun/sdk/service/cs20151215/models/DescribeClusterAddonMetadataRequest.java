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
 * {@link DescribeClusterAddonMetadataRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonMetadataRequest</p>
 */
public class DescribeClusterAddonMetadataRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("component_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private DescribeClusterAddonMetadataRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentId = builder.componentId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonMetadataRequest create() {
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAddonMetadataRequest, Builder> {
        private String clusterId; 
        private String componentId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAddonMetadataRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentId = request.componentId;
            this.version = request.version;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c71d616e629ff40d5b42d7bb87770****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coredns</p>
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("component_id", componentId);
            this.componentId = componentId;
            return this;
        }

        /**
         * version.
         */
        public Builder version(String version) {
            this.putQueryParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeClusterAddonMetadataRequest build() {
            return new DescribeClusterAddonMetadataRequest(this);
        } 

    } 

}
