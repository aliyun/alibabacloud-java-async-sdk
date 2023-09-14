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
         * 应用名称。
         */
        public Builder applicationName(String applicationName) {
            this.putQueryParameter("ApplicationName", applicationName);
            this.applicationName = applicationName;
            return this;
        }

        /**
         * 集群ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 配置文件名称。
         */
        public Builder configFileName(String configFileName) {
            this.putQueryParameter("ConfigFileName", configFileName);
            this.configFileName = configFileName;
            return this;
        }

        /**
         * 配置键值，支持模糊查询。
         */
        public Builder configItemKey(String configItemKey) {
            this.putQueryParameter("ConfigItemKey", configItemKey);
            this.configItemKey = configItemKey;
            return this;
        }

        /**
         * 配置项值。
         */
        public Builder configItemValue(String configItemValue) {
            this.putQueryParameter("ConfigItemValue", configItemValue);
            this.configItemValue = configItemValue;
            return this;
        }

        /**
         * 一次获取的最大记录数。取值范围：1~100。
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 标记当前开始读取的位置，置空表示从头开始。
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 节点组ID。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点ID。
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        /**
         * 区域ID。
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
