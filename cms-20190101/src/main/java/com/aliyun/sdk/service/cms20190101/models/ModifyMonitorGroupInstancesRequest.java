// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link ModifyMonitorGroupInstancesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMonitorGroupInstancesRequest</p>
 */
public class ModifyMonitorGroupInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Instances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Instances> instances;

    private ModifyMonitorGroupInstancesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instances = builder.instances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMonitorGroupInstancesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    public static final class Builder extends Request.Builder<ModifyMonitorGroupInstancesRequest, Builder> {
        private Long groupId; 
        private java.util.List<Instances> instances; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMonitorGroupInstancesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instances = request.instances;
        } 

        /**
         * <p>The ID of the application group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of instances. You can specify up to 2,000 instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.putQueryParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        @Override
        public ModifyMonitorGroupInstancesRequest build() {
            return new ModifyMonitorGroupInstancesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyMonitorGroupInstancesRequest} extends {@link TeaModel}
     *
     * <p>ModifyMonitorGroupInstancesRequest</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        @com.aliyun.core.annotation.Validation(required = true)
        private String category;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String regionId;

        private Instances(Builder builder) {
            this.category = builder.category;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String category; 
            private String instanceId; 
            private String instanceName; 
            private String regionId; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.category = model.category;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The cloud service to which the resource instance belongs. The following cloud services are supported:</p>
             * <ul>
             * <li><p>ECS (including Alibaba Cloud and third-party hosts)</p>
             * </li>
             * <li><p>ApsaraDB RDS</p>
             * </li>
             * <li><p>AnalyticDB</p>
             * </li>
             * <li><p>SLB</p>
             * </li>
             * <li><p>VPC (Elastic IP)</p>
             * </li>
             * <li><p>API Gateway</p>
             * </li>
             * <li><p>Alibaba Cloud CDN</p>
             * </li>
             * <li><p>Container Service for Swarm</p>
             * </li>
             * <li><p>DCDN</p>
             * </li>
             * <li><p>Anti-DDoS</p>
             * </li>
             * <li><p>EIP</p>
             * </li>
             * <li><p>Elasticsearch</p>
             * </li>
             * <li><p>E-MapReduce</p>
             * </li>
             * <li><p>Auto Scaling</p>
             * </li>
             * <li><p>ApsaraDB for HBase</p>
             * </li>
             * <li><p>IoT Edge</p>
             * </li>
             * <li><p>Kubernetes pod</p>
             * </li>
             * <li><p>ApsaraDB for Redis (sharded cluster)</p>
             * </li>
             * <li><p>ApsaraDB for Redis (read/write splitting)</p>
             * </li>
             * <li><p>ApsaraDB for Redis (Standard Edition)</p>
             * </li>
             * <li><p>ApsaraDB for Memcache</p>
             * </li>
             * <li><p>MNS</p>
             * </li>
             * <li><p>ApsaraDB for MongoDB (replica set)</p>
             * </li>
             * <li><p>ApsaraDB for MongoDB (sharded cluster)</p>
             * </li>
             * <li><p>ApsaraDB for MongoDB (sharded cluster)</p>
             * </li>
             * <li><p>MNS topic</p>
             * </li>
             * <li><p>OCS (ApsaraDB for Memcache of earlier versions)</p>
             * </li>
             * <li><p>OpenSearch</p>
             * </li>
             * <li><p>OSS</p>
             * </li>
             * <li><p>PolarDB</p>
             * </li>
             * <li><p>HybridDB for MySQL</p>
             * </li>
             * <li><p>Internet Shared Bandwidth</p>
             * </li>
             * <li><p>SLS</p>
             * </li>
             * <li><p>VPN Gateway</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the resource instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>i-a2d5q7pm12****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HostName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
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
                this.regionId = regionId;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
