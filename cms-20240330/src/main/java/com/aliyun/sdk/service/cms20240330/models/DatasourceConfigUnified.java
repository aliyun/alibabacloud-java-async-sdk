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
         * <p>The Prometheus instance ID. Used when type is set to PROMETHEUS.</p>
         * 
         * <strong>example:</strong>
         * <p>rw-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The raw V1 datasource JSON string returned as a read-path fallback when type is set to UNKNOWN and parsing fails. The frontend displays this field as read-only when the value is not empty.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;SLS&quot;}</p>
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * <p>Returned when type is set to UNKNOWN. Indicates that the rule cannot be edited through the new API. Submit a ticket to contact the CloudMonitor team.</p>
         * 
         * <strong>example:</strong>
         * <p>SLS</p>
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * <p>The namespace. Optional when type is set to VIRTUAL_PROMETHEUS. Identifies the namespace to which the virtual Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>selectdb</p>
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The Alibaba Cloud service category. Optional when type is set to CLOUD_MONITORING. Returns unknown when the source does not contain this information.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * <p>The Simple Log Service (SLS) project name. Required when type is set to SLS. All stores share the same project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-project</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p>The region ID. Optional for all types. Defaults to the region of the rule or gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The list of SLS stores. Used when type is set to SLS. At least one store is required. Each store contains store and storeType fields. The project and regionId fields have been moved to the top level. The deprecated fields with the same names that remain in stores return a 400 error if used in write paths.</p>
         */
        public Builder stores(java.util.List<Stores> stores) {
            this.stores = stores;
            return this;
        }

        /**
         * <p>The tenant ID. Optional when type is set to VIRTUAL_PROMETHEUS. Identifies the tenant to which the virtual Prometheus instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>t-xxxxxxx</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The datasource type.</p>
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
