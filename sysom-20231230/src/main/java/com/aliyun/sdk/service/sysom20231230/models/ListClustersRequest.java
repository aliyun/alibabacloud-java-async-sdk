// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link ListClustersRequest} extends {@link RequestModel}
 *
 * <p>ListClustersRequest</p>
 */
public class ListClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("X-Debug-Id")
    private String xDebugId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_status")
    private String clusterStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("cluster_type")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("x-sysom-invoke-source")
    private String xSysomInvokeSource;

    private ListClustersRequest(Builder builder) {
        super(builder);
        this.xDebugId = builder.xDebugId;
        this.clusterId = builder.clusterId;
        this.clusterStatus = builder.clusterStatus;
        this.clusterType = builder.clusterType;
        this.current = builder.current;
        this.id = builder.id;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
        this.xSysomInvokeSource = builder.xSysomInvokeSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xDebugId
     */
    public String getXDebugId() {
        return this.xDebugId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterStatus
     */
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return current
     */
    public Long getCurrent() {
        return this.current;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return xSysomInvokeSource
     */
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

    public static final class Builder extends Request.Builder<ListClustersRequest, Builder> {
        private String xDebugId; 
        private String clusterId; 
        private String clusterStatus; 
        private String clusterType; 
        private Long current; 
        private String id; 
        private String name; 
        private Long pageSize; 
        private String xSysomInvokeSource; 

        private Builder() {
            super();
        } 

        private Builder(ListClustersRequest request) {
            super(request);
            this.xDebugId = request.xDebugId;
            this.clusterId = request.clusterId;
            this.clusterStatus = request.clusterStatus;
            this.clusterType = request.clusterType;
            this.current = request.current;
            this.id = request.id;
            this.name = request.name;
            this.pageSize = request.pageSize;
            this.xSysomInvokeSource = request.xSysomInvokeSource;
        } 

        /**
         * X-Debug-Id.
         */
        public Builder xDebugId(String xDebugId) {
            this.putQueryParameter("X-Debug-Id", xDebugId);
            this.xDebugId = xDebugId;
            return this;
        }

        /**
         * <p>Filters by cluster ID.</p>
         * <blockquote>
         * <p>This cluster ID is not the ACK cluster ID. It is the <code>id</code> field returned by this operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <ul>
         * <li><code>Running</code>: The cluster is managed normally.</li>
         * <li><code>Installing</code>: An installation task is in progress for the cluster.</li>
         * <li><code>Uninstalling</code>: An uninstallation task is in progress for the cluster.</li>
         * <li><code>Upgrading</code>: An update task is in progress for the cluster.</li>
         * <li><code>Offline</code>: The cluster is offline and management is abnormal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder clusterStatus(String clusterStatus) {
            this.putQueryParameter("cluster_status", clusterStatus);
            this.clusterStatus = clusterStatus;
            return this;
        }

        /**
         * <ul>
         * <li><code>ACK</code>: ACK cluster.</li>
         * <li><code>CUSTOM</code>: Custom cluster (default clusters belong to custom clusters).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("cluster_type", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The current page number (starting from page 1).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.putQueryParameter("current", current);
            this.current = current;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> Use the cluster_id parameter to filter instead.</p>
         * 
         * <strong>example:</strong>
         * <p>cb7d4cc26c8f845fb8a8255ffd394820e</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>Filters plugins by plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>proxy-next-upstream</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * x-sysom-invoke-source.
         */
        public Builder xSysomInvokeSource(String xSysomInvokeSource) {
            this.putQueryParameter("x-sysom-invoke-source", xSysomInvokeSource);
            this.xSysomInvokeSource = xSysomInvokeSource;
            return this;
        }

        @Override
        public ListClustersRequest build() {
            return new ListClustersRequest(this);
        } 

    } 

}
