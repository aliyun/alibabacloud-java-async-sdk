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
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_number")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page_size")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsRequest create() {
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
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private String clusterId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.type = request.type;
        } 

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cf62854ac2130470897be7a27ed1f****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The event type. Valid values:</p>
         * <ul>
         * <li><code>cluster_create</code>: cluster creation.</li>
         * <li><code>cluster_scaleout</code>: cluster scale-out.</li>
         * <li><code>cluster_attach</code>: node addition.</li>
         * <li><code>cluster_delete</code>: cluster deletion.</li>
         * <li><code>cluster_upgrade</code>: cluster upgrades.</li>
         * <li><code>cluster_migrate</code>: cluster migration.</li>
         * <li><code>cluster_node_delete</code>: node removal.</li>
         * <li><code>cluster_node_drain</code>: node draining.</li>
         * <li><code>cluster_modify</code>: cluster modifications.</li>
         * <li><code>cluster_configuration_modify</code>: modifications of control plane configurations.</li>
         * <li><code>cluster_addon_install</code>: component installation.</li>
         * <li><code>cluster_addon_upgrade</code>: component updates.</li>
         * <li><code>cluster_addon_uninstall</code>: component uninstallation.</li>
         * <li><code>runtime_upgrade</code>: runtime updates.</li>
         * <li><code>nodepool_upgrade</code>: node pool upgrades.</li>
         * <li><code>nodepool_update</code>: node pool updates.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>nodepool_upgrade</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}
