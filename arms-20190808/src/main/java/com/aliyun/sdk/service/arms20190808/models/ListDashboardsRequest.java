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
 * {@link ListDashboardsRequest} extends {@link RequestModel}
 *
 * <p>ListDashboardsRequest</p>
 */
public class ListDashboardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DashboardName")
    private String dashboardName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecreateSwitch")
    private Boolean recreateSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    private ListDashboardsRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.dashboardName = builder.dashboardName;
        this.language = builder.language;
        this.product = builder.product;
        this.recreateSwitch = builder.recreateSwitch;
        this.regionId = builder.regionId;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDashboardsRequest create() {
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return dashboardName
     */
    public String getDashboardName() {
        return this.dashboardName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return recreateSwitch
     */
    public Boolean getRecreateSwitch() {
        return this.recreateSwitch;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ListDashboardsRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String dashboardName; 
        private String language; 
        private String product; 
        private Boolean recreateSwitch; 
        private String regionId; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ListDashboardsRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.clusterType = request.clusterType;
            this.dashboardName = request.dashboardName;
            this.language = request.language;
            this.product = request.product;
            this.recreateSwitch = request.recreateSwitch;
            this.regionId = request.regionId;
            this.title = request.title;
        } 

        /**
         * <p>The ID of the ACK cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cc7a37ee31aea4ed1a059eff8034b****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Valid values: ACK, ASK, cloud-product-prometheus, and Node. You can query the dashboards of a virtual cluster by specifying the cluster type. For InfluxDB, set this parameter to <code>cloud-product-prometheus</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Node</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The unique names of the dashboards. You can query dashboards by specifying their names. The <strong>dashboard title</strong> can be changed whereas the <strong>dashboard name</strong> cannot. You can specify multiple names and separate them with commas (,), for example, <code>k8s-event,k8s-overview</code>. A dashboard may have multiple versions. If you want to specify a version, you can add version information after the name, for example, <code>k8s-event:v1,k8s-overview:latest</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-node-overview</p>
         */
        public Builder dashboardName(String dashboardName) {
            this.putQueryParameter("DashboardName", dashboardName);
            this.dashboardName = dashboardName;
            return this;
        }

        /**
         * <p>The language of the returned Grafana dashboard. Valid values: en and zh. Default value: en.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The cloud service code. This parameter is required if you set the ClusterType parameter to <code>cloud-product-prometheus</code>. The following cloud services are available: Serverless App Engine, Microservices Engine, Message Queue for Apache RocketMQ, Lindorm, Message Queue for Apache Kafka, ApsaraDB for ClickHouse, Data Lake Analytics, Message Queue for RabbitMQ, ApsaraDB for MongoDB, Time Series Database (TSDB) for InfluxDB, MSE Cloud-native Gateway, Grafana Service, SchedulerX, Global Transaction Service, Enterprise Distributed Application Service, Machine Learning Platform for AI - Elastic Algorithm Service (EAS), Application High Availability Service, and Performance Testing.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>Specifies whether to create or query a virtual cluster. This parameter provides backward compatibility.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder recreateSwitch(Boolean recreateSwitch) {
            this.putQueryParameter("RecreateSwitch", recreateSwitch);
            this.recreateSwitch = recreateSwitch;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dashboard title. The dashboard title can be changed. We recommend that you specify the <strong>DashboardName</strong> parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiServer</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public ListDashboardsRequest build() {
            return new ListDashboardsRequest(this);
        } 

    } 

}
