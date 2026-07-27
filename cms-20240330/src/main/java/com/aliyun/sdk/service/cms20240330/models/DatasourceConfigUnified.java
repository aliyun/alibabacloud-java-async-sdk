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

    @com.aliyun.core.annotation.NameInMap("productCategory")
    private String productCategory;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("stores")
    private java.util.List<Stores> stores;

    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DatasourceConfigUnified(Builder builder) {
        this.instanceId = builder.instanceId;
        this.legacyRaw = builder.legacyRaw;
        this.legacyType = builder.legacyType;
        this.productCategory = builder.productCategory;
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.stores = builder.stores;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String instanceId; 
        private String legacyRaw; 
        private String legacyType; 
        private String productCategory; 
        private String project; 
        private String regionId; 
        private java.util.List<Stores> stores; 
        private String type; 

        private Builder() {
        } 

        private Builder(DatasourceConfigUnified model) {
            this.instanceId = model.instanceId;
            this.legacyRaw = model.legacyRaw;
            this.legacyType = model.legacyType;
            this.productCategory = model.productCategory;
            this.project = model.project;
            this.regionId = model.regionId;
            this.stores = model.stores;
            this.type = model.type;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * legacyRaw.
         */
        public Builder legacyRaw(String legacyRaw) {
            this.legacyRaw = legacyRaw;
            return this;
        }

        /**
         * legacyType.
         */
        public Builder legacyType(String legacyType) {
            this.legacyType = legacyType;
            return this;
        }

        /**
         * productCategory.
         */
        public Builder productCategory(String productCategory) {
            this.productCategory = productCategory;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * stores.
         */
        public Builder stores(java.util.List<Stores> stores) {
            this.stores = stores;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
