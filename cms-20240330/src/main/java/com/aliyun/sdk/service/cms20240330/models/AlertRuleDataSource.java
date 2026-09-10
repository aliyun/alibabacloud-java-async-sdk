// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AlertRuleDataSource} extends {@link TeaModel}
 *
 * <p>AlertRuleDataSource</p>
 */
public class AlertRuleDataSource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("dsList")
    private java.util.List<DsList> dsList;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private AlertRuleDataSource(Builder builder) {
        this.appType = builder.appType;
        this.dsList = builder.dsList;
        this.instanceId = builder.instanceId;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleDataSource create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return dsList
     */
    public java.util.List<DsList> getDsList() {
        return this.dsList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String appType; 
        private java.util.List<DsList> dsList; 
        private String instanceId; 
        private String namespace; 
        private String regionId; 
        private String tenantId; 
        private String type; 

        private Builder() {
        } 

        private Builder(AlertRuleDataSource model) {
            this.appType = model.appType;
            this.dsList = model.dsList;
            this.instanceId = model.instanceId;
            this.namespace = model.namespace;
            this.regionId = model.regionId;
            this.tenantId = model.tenantId;
            this.type = model.type;
        } 

        /**
         * <p>Applicable data source type: APM_DS.</p>
         * <p>The application type. Valid values:</p>
         * <ul>
         * <li>apm</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>apm</p>
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * <p>Applicable data source type: SLS_MULTI_DS.</p>
         * <p>The list of sub-data sources.</p>
         */
        public Builder dsList(java.util.List<DsList> dsList) {
            this.dsList = dsList;
            return this;
        }

        /**
         * <p>Applicable data source type: PROMETHEUS_DS.</p>
         * <p>The Prometheus instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-bbe8961b4a59be0</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Applicable data source type: ENTERPRISE_DS.</p>
         * <p>The name of the Hybrid Cloud Monitoring metric repository.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun-default</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>Applicable data source types: APM_DS and PROMETHEUS_DS.</p>
         * <p>The region ID of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Applicable data source type: ENTERPRISE_DS.</p>
         * <p>The tenant ID of the Hybrid Cloud Monitoring data source. Identifies the tenant in the Hybrid Cloud Monitoring environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The data source type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PROMETHEUS_DS: Prometheus data source.</li>
         * <li>SLS_MULTI_DS: SLS data source.</li>
         * <li>APM_DS: Application monitoring data source.</li>
         * <li>CMS_BASIC_DS: CloudMonitor Basic data source.</li>
         * <li>ENTERPRISE_DS: Hybrid Cloud Monitoring data source.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS_DS</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AlertRuleDataSource build() {
            return new AlertRuleDataSource(this);
        } 

    } 

    /**
     * 
     * {@link AlertRuleDataSource} extends {@link TeaModel}
     *
     * <p>AlertRuleDataSource</p>
     */
    public static class DsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("store")
        private String store;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private DsList(Builder builder) {
            this.project = builder.project;
            this.regionId = builder.regionId;
            this.store = builder.store;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DsList create() {
            return builder().build();
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return store
         */
        public String getStore() {
            return this.store;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String project; 
            private String regionId; 
            private String store; 
            private String type; 

            private Builder() {
            } 

            private Builder(DsList model) {
                this.project = model.project;
                this.regionId = model.regionId;
                this.store = model.store;
                this.type = model.type;
            } 

            /**
             * <p>The name of the Simple Log Service (SLS) project. Specifies the project where the logs or metrics reside.</p>
             * 
             * <strong>example:</strong>
             * <p>mySlsProject</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region where the SLS project resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The name of the LogStore or MetricStore.</p>
             * 
             * <strong>example:</strong>
             * <p>mySlsLogStore</p>
             */
            public Builder store(String store) {
                this.store = store;
                return this;
            }

            /**
             * <p>The type of the SLS sub-data source. Valid values:</p>
             * <ul>
             * <li>SLS_LOG_DS: LogStore data source.</li>
             * <li>SLS_METRIC_DS: MetricStore data source.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SLS_LOG_DS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DsList build() {
                return new DsList(this);
            } 

        } 

    }
}
