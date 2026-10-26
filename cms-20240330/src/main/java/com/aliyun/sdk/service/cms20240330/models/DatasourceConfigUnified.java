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
 * {@link DatasourceConfigUnified} extends {@link TeaModel}
 *
 * <p>DatasourceConfigUnified</p>
 */
public class DatasourceConfigUnified extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("legacyRaw")
    private String legacyRaw;

    @com.aliyun.core.annotation.NameInMap("legacyType")
    private String legacyType;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("productCategory")
    private String productCategory;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("stores")
    private java.util.List<Stores> stores;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DatasourceConfigUnified(Builder builder) {
        this.instanceId = builder.instanceId;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.namespace = builder.namespace;
        this.productCategory = builder.productCategory;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.stores = builder.stores;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatasourceConfigUnified create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return legacyRaw
     */
    public String getLegacyRaw() {
        return this.legacyRaw;
    }

    /**
     * @return legacyType
     */
    public String getLegacyType() {
        return this.legacyType;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return productCategory
     */
    public String getProductCategory() {
        return this.productCategory;
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
     * @return stores
     */
    public java.util.List<Stores> getStores() {
        return this.stores;
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
        private String instanceId; 
        private String legacyRaw; 
        private String legacyType; 
        private String namespace; 
        private String productCategory; 
        private String project; 
        private String regionId; 
        private java.util.List<Stores> stores; 
        private String tenantId; 
        private String type; 

        private Builder() {
        } 

        private Builder(DatasourceConfigUnified model) {
            this.instanceId = model.instanceId;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.namespace = model.namespace;
            this.productCategory = model.productCategory;
            this.project = model.project;
            this.regionId = model.regionId;
            this.stores = model.stores;
            this.tenantId = model.tenantId;
            this.type = model.type;
        } 

        /**
         * <p>The Prometheus instance ID, which is used when the type is PROMETHEUS.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The original V1 datasource JSON string returned as a fallback when the type is UNKNOWN and the read path parsing fails. If this field is not empty, the frontend displays it in read-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;SLS&quot;}</p>
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * <p>The legacy type returned when the type is UNKNOWN. This indicates that the rule cannot be edited by using the new API. Submit a ticket to contact the CloudMonitor team.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * <p>The namespace of the virtual Prometheus instance. This parameter is optional when the type is VIRTUAL_PROMETHEUS.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The category of the Alibaba Cloud service. This parameter is optional when the type is CLOUD_MONITORING. If this information is missing from the source, the value is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * <p>The name of the Simple Log Service project. This parameter is required when the type is SLS. All stores share the same project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p>The region ID. This parameter is optional for all types and defaults to the region of the rule or gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of Simple Log Service stores. This parameter is used when the type is SLS and must contain at least one store. Each store includes the store and storeType fields. The project and regionId fields are moved to the top level. The fields with the same names remaining in the stores are deprecated and return a 400 error if used in the write path.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;store&quot;:&quot;cms-alert-log&quot;,&quot;storeType&quot;:&quot;log&quot;}]</p>
         */
        public Builder stores(java.util.List<Stores> stores) {
            this.stores = stores;
            return this;
        }

        /**
         * <p>The ID of the tenant to which the virtual Prometheus instance belongs. This parameter is optional when the type is VIRTUAL_PROMETHEUS.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxxxxxx</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The data source type. Valid values and corresponding fields: PROMETHEUS (instanceId is required; regionId is optional), VIRTUAL_PROMETHEUS (instanceId is required; regionId, namespace, and tenantId are optional), UMODEL (regionId is optional; other fields are carried in queryConfig or conditionConfig), APM (regionId is optional), XTRACE (regionId is optional), EBPF (regionId is optional), RUM (regionId is optional), CLOUD_MONITORING (regionId and productCategory are optional), SLS (project and stores are required), and UNKNOWN (read-only fallback; do not use in the write path). Non-enum values such as CMS_BASIC_DS or SLS_DS are not allowed and return an Invalidtype 400 error.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROMETHEUS</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public DatasourceConfigUnified build() {
            return new DatasourceConfigUnified(this);
        } 

    } 

}
