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
 * {@link AppendInstancesToPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>AppendInstancesToPrometheusGlobalViewRequest</p>
 */
public class AppendInstancesToPrometheusGlobalViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clusters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalViewClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String globalViewClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AppendInstancesToPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusters = builder.clusters;
        this.globalViewClusterId = builder.globalViewClusterId;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AppendInstancesToPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return globalViewClusterId
     */
    public String getGlobalViewClusterId() {
        return this.globalViewClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AppendInstancesToPrometheusGlobalViewRequest, Builder> {
        private String clusters; 
        private String globalViewClusterId; 
        private String groupName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AppendInstancesToPrometheusGlobalViewRequest request) {
            super(request);
            this.clusters = request.clusters;
            this.globalViewClusterId = request.globalViewClusterId;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The list of global aggregation instances. The value is a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[ { &quot;sourceName&quot;: &quot;Data source name- ArmsPrometheus No.1&quot;, &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;, &quot;userId&quot;:&quot;UserID&quot;, &quot;clusterId&quot;:&quot;ClusterId&quot;, }, { &quot;sourceName&quot;: &quot;Data source name - MetrcStore No.2&quot;, &quot;sourceType&quot;:&quot;MetricStore&quot;, &quot;dataSource&quot;:&quot;Remote read endpoint of the MetricStore&quot;, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } }, { &quot;sourceName&quot;: &quot;Custom &quot;, &quot;sourceType&quot;:&quot;CustomPrometheus&quot;, &quot;dataSource&quot;:&quot;Remote read endpoint of the self-managed Prometheus data source&quot;, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } }, { &quot;sourceName&quot;: &quot;Other one &quot;, &quot;sourceType&quot;:&quot;Others&quot;, &quot;dataSource&quot;:&quot;Endpoint of another data source such as Tencent remote read&quot;, &quot;headers&quot;:{ &quot;AnyHeaderToFill&quot;:&quot;Headers to be filled&quot; }, &quot;extras&quot;:{ &quot;username&quot;:&quot;BasicAuthUsername&quot;, &quot;password&quot;:&quot;BasicAuthPassword&quot; } } // ....... more addre ]</p>
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("Clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The ID of the global aggregation instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>global-v2-cn-1670100631025794-6gjc0qgb</p>
         */
        public Builder globalViewClusterId(String globalViewClusterId) {
            this.putQueryParameter("GlobalViewClusterId", globalViewClusterId);
            this.globalViewClusterId = globalViewClusterId;
            return this;
        }

        /**
         * <p>The name of the global aggregation instance.</p>
         * <p>This parameter is required.</p>
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
        public AppendInstancesToPrometheusGlobalViewRequest build() {
            return new AppendInstancesToPrometheusGlobalViewRequest(this);
        } 

    } 

}
