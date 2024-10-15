// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListApplicationConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationConfigsRequest</p>
 */
public class ListApplicationConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationName")
    private String applicationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigFileName")
    private String configFileName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigItemKey")
    private String configItemKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigItemValue")
    private String configItemValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListApplicationConfigsRequest(Builder builder) {
        super(builder);
        this.applicationName = builder.applicationName;
        this.clusterId = builder.clusterId;
        this.configFileName = builder.configFileName;
        this.configItemKey = builder.configItemKey;
        this.configItemValue = builder.configItemValue;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeId = builder.nodeId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationName
     */
    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return configFileName
     */
    public String getConfigFileName() {
        return this.configFileName;
    }

    /**
     * @return configItemKey
     */
    public String getConfigItemKey() {
        return this.configItemKey;
    }

    /**
     * @return configItemValue
     */
    public String getConfigItemValue() {
        return this.configItemValue;
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListApplicationConfigsRequest, Builder> {
        private String applicationName; 
        private String clusterId; 
        private String configFileName; 
        private String configItemKey; 
        private String configItemValue; 
        private Integer maxResults; 
        private String nextToken; 
        private String nodeGroupId; 
        private String nodeId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListApplicationConfigsRequest request) {
            super(request);
            this.applicationName = request.applicationName;
            this.clusterId = request.clusterId;
            this.configFileName = request.configFileName;
            this.configItemKey = request.configItemKey;
            this.configItemValue = request.configItemValue;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeId = request.nodeId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-e6a9d46e9267****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p>hdfs-site.xml</p>
         */
        public Builder configFileName(String configFileName) {
            this.putQueryParameter("ConfigFileName", configFileName);
            this.configFileName = configFileName;
            return this;
        }

        /**
         * <p>The name of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>dfs.replication</p>
         */
        public Builder configItemKey(String configItemKey) {
            this.putQueryParameter("ConfigItemKey", configItemKey);
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * <p>The value of the configuration item.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder configItemValue(String configItemValue) {
            this.putQueryParameter("ConfigItemValue", configItemValue);
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The page number of the next page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the node group.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-d555335ced5c****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The node ID.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp10h9rezawz1i4o****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListApplicationConfigsRequest build() {
            return new ListApplicationConfigsRequest(this);
        } 

    } 

}
