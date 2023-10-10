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
    @NameInMap("page_number")
    private Long pageNumber;

    @Query
    @NameInMap("page_size")
    private Long pageSize;

    @Query
    @NameInMap("type")
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
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("page_number", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("page_size", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The event type. Valid values:
         * <p>
         * 
         * *   `cluster_create`: cluster creation.
         * *   `cluster_scaleout`: cluster scale-out.
         * *   `cluster_attach`: node addition.
         * *   `cluster_delete`: cluster deletion.
         * *   `cluster_upgrade`: cluster upgrades.
         * *   `cluster_migrate`: cluster migration.
         * *   `cluster_node_delete`: node removal.
         * *   `cluster_node_drain`: node draining.
         * *   `cluster_modify`: cluster modifications.
         * *   `cluster_configuration_modify`: modifications of control plane configurations.
         * *   `cluster_addon_install`: component installation.
         * *   `cluster_addon_upgrade`: component updates.
         * *   `cluster_addon_uninstall`: component uninstallation.
         * *   `runtime_upgrade`: runtime updates.
         * *   `nodepool_upgrade`: node pool upgrades.
         * *   `nodepool_update`: node pool updates.
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
