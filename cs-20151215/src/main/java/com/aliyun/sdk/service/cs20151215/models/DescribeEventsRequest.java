// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeEventsRequest</p>
 */
public class DescribeEventsRequest extends Request {
    @Query
    @NameInMap("cluster_id")
    private String clusterId;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    @Query
    @NameInMap("type")
    private String type;

    @Query
    @NameInMap("page_number")
    private Long pageNumber;

    private DescribeEventsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.pageSize = builder.pageSize;
        this.type = builder.type;
        this.pageNumber = builder.pageNumber;
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

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder extends Request.Builder<DescribeEventsRequest, Builder> {
        private String clusterId; 
        private Long pageSize; 
        private String type; 
        private Long pageNumber; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEventsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.pageSize = request.pageSize;
            this.type = request.type;
            this.pageNumber = request.pageNumber;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The type of the event. Valid values:
         * <p>
         * -"Cluster_create": Creates a cluster.
         * -"Cluster_scaleout": scale out the cluster.
         * -"Cluster_attach ": adds an existing node.
         * -"Cluster_delete ": deletes a cluster.
         * -"Cluster_upgrade ": upgrades the cluster.
         * -"Cluster_migrate ": migrates the cluster.
         * -"Cluster_node_delete ": removes a node.
         * -"Cluster_node_drain ": clears the node.
         * -"Cluster_modig": modifies the cluster.
         * -"Cluster_configuration_modif": modifies the cluster control configuration.
         * -"Cluster_addon_install ": install components.
         * -"Cluster_addon_upgrade ": upgrades components.
         * -"Cluster_addon_uninstall ": uninstall the component.
         * -"Runtime_upgrade ": upgrades the runtime.
         * -"Nodepool_upgrade ": upgrades the node pool.
         * -"Nodepool_update": updates the node pool.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * The number of pages to return.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        @Override
        public DescribeEventsRequest build() {
            return new DescribeEventsRequest(this);
        } 

    } 

}
