// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListApplicationConfigsRequest</p>
 */
public class ListApplicationConfigsRequest extends Request {
    @Query
    @NameInMap("ApplicationName")
    private String applicationName;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ConfigFileName")
    private String configFileName;

    @Query
    @NameInMap("ConfigItemKey")
    private String configItemKey;

    @Query
    @NameInMap("ConfigItemValue")
    private String configItemValue;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @Query
    @NameInMap("NodeId")
    private String nodeId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
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
         * The name of the application.
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the configuration file.
         */
        public Builder configFileName(String configFileName) {
            this.putQueryParameter("ConfigFileName", configFileName);
            this.configFileName = configFileName;
            return this;
        }

        /**
         * The name of the configuration item.
         */
        public Builder configItemKey(String configItemKey) {
            this.putQueryParameter("ConfigItemKey", configItemKey);
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * The value of the configuration item.
         */
        public Builder configItemValue(String configItemValue) {
            this.putQueryParameter("ConfigItemValue", configItemValue);
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The page number of the next page returned.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the node group.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * The node ID.
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * The region ID.
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
