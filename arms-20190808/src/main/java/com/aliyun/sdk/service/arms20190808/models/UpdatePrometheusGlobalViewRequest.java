// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdatePrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrometheusGlobalViewRequest</p>
 */
public class UpdatePrometheusGlobalViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllSubClustersSuccess")
    private Boolean allSubClustersSuccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MostRegionId")
    private String mostRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubClustersJson")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subClustersJson;

    private UpdatePrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.allSubClustersSuccess = builder.allSubClustersSuccess;
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.mostRegionId = builder.mostRegionId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.subClustersJson = builder.subClustersJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allSubClustersSuccess
     */
    public Boolean getAllSubClustersSuccess() {
        return this.allSubClustersSuccess;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return mostRegionId
     */
    public String getMostRegionId() {
        return this.mostRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return subClustersJson
     */
    public String getSubClustersJson() {
        return this.subClustersJson;
    }

    public static final class Builder extends Request.Builder<UpdatePrometheusGlobalViewRequest, Builder> {
        private Boolean allSubClustersSuccess; 
        private String clusterId; 
        private String groupName; 
        private String mostRegionId; 
        private String regionId; 
        private String resourceGroupId; 
        private String subClustersJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrometheusGlobalViewRequest request) {
            super(request);
            this.allSubClustersSuccess = request.allSubClustersSuccess;
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.mostRegionId = request.mostRegionId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.subClustersJson = request.subClustersJson;
        } 

        /**
         * <p>To edit a GlobalView aggregated instance, do you require all passed child instances to be verified successfully before creating a GlobalView instance (optional, default to false):</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allSubClustersSuccess(Boolean allSubClustersSuccess) {
            this.putQueryParameter("AllSubClustersSuccess", allSubClustersSuccess);
            this.allSubClustersSuccess = allSubClustersSuccess;
            return this;
        }

        /**
         * <p>The ID of the Prometheus instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>global****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the global aggregation instance.</p>
         * 
         * <strong>example:</strong>
         * <p>zyGlobalView</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The region ID of the global aggregation instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder mostRegionId(String mostRegionId) {
            this.putQueryParameter("MostRegionId", mostRegionId);
            this.mostRegionId = mostRegionId;
            return this;
        }

        /**
         * <p>The ID of the region in which the Prometheus instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxyexli2****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The data sources of the Prometheus instance for GlobalView.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-hangzhou&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c39a1048921e04f***********&quot;, &quot;sourceName&quot;:&quot;arms-luyao-test&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; }, { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-beijing&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c6b6485496d5b40***********&quot;, &quot;sourceName&quot;:&quot;agent-321-test&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; }, { &quot;headers&quot;:{ }, &quot;regionId&quot;:&quot;cn-zhangjiakou&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;extras&quot;:{ }, &quot;clusterId&quot;:&quot;c261a4f3200c446***********&quot;, &quot;sourceName&quot;:&quot;zaifeng-cardinality-01&quot;, &quot;dataSource&quot;:&quot;&quot;, &quot;userId&quot;:&quot;1672753***********&quot; } ]</p>
         */
        public Builder subClustersJson(String subClustersJson) {
            this.putQueryParameter("SubClustersJson", subClustersJson);
            this.subClustersJson = subClustersJson;
            return this;
        }

        @Override
        public UpdatePrometheusGlobalViewRequest build() {
            return new UpdatePrometheusGlobalViewRequest(this);
        } 

    } 

}
