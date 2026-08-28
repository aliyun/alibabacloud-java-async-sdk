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
 * {@link ListNodePoolComponentInstanceNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodePoolComponentInstanceNodesRequest</p>
 */
public class ListNodePoolComponentInstanceNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("nodepool_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodepoolId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("config_revision")
    private String configRevision;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("max_results")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("next_token")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("node_names")
    private java.util.List<String> nodeNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    private ListNodePoolComponentInstanceNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.nodepoolId = builder.nodepoolId;
        this.name = builder.name;
        this.configRevision = builder.configRevision;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeNames = builder.nodeNames;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodePoolComponentInstanceNodesRequest create() {
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
     * @return nodepoolId
     */
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return configRevision
     */
    public String getConfigRevision() {
        return this.configRevision;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return nodeNames
     */
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ListNodePoolComponentInstanceNodesRequest, Builder> {
        private String clusterId; 
        private String nodepoolId; 
        private String name; 
        private String configRevision; 
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<String> nodeNames; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ListNodePoolComponentInstanceNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.nodepoolId = request.nodepoolId;
            this.name = request.name;
            this.configRevision = request.configRevision;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeNames = request.nodeNames;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c2230fxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>np8d8c9c2cd0f64e89884f82a5fbcd****</p>
         */
        public Builder nodepoolId(String nodepoolId) {
            this.putPathParameter("nodepool_id", nodepoolId);
            this.nodepoolId = nodepoolId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kubelet</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * config_revision.
         */
        public Builder configRevision(String configRevision) {
            this.putQueryParameter("config_revision", configRevision);
            this.configRevision = configRevision;
            return this;
        }

        /**
         * max_results.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("max_results", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * next_token.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("next_token", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * node_names.
         */
        public Builder nodeNames(java.util.List<String> nodeNames) {
            String nodeNamesShrink = shrink(nodeNames, "node_names", "json");
            this.putQueryParameter("node_names", nodeNamesShrink);
            this.nodeNames = nodeNames;
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
        public ListNodePoolComponentInstanceNodesRequest build() {
            return new ListNodePoolComponentInstanceNodesRequest(this);
        } 

    } 

}
