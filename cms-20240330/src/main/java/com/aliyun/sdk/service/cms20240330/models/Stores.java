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
 * {@link Stores} extends {@link TeaModel}
 *
 * <p>Stores</p>
 */
public class Stores extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("project")
    @Deprecated
    private String project;

    @com.aliyun.core.annotation.NameInMap("regionId")
    @Deprecated
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("store")
    private String store;

    @com.aliyun.core.annotation.NameInMap("storeType")
    private String storeType;

    private Stores(Builder builder) {
        this.project = builder.project;
        this.regionId = builder.regionId;
        this.store = builder.store;
        this.storeType = builder.storeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Stores create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    public static final class Builder {
        private String project; 
        private String regionId; 
        private String store; 
        private String storeType; 

        private Builder() {
        } 

        private Builder(Stores model) {
            this.project = model.project;
            this.regionId = model.regionId;
            this.store = model.store;
            this.storeType = model.storeType;
        } 

        /**
         * <p><strong>[Deprecated]</strong> The SLS project name. This field has been moved to DatasourceConfigUnified.project. Using this field in write paths returns HTTP status code 400.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-project</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The region ID. This field has been moved to DatasourceConfigUnified.regionId. Using this field in write paths returns HTTP status code 400.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the SLS Store.</p>
         * 
         * <strong>example:</strong>
         * <p>my-log-store</p>
         */
        public Builder store(String store) {
            this.store = store;
            return this;
        }

        /**
         * <p>The store type. Valid values:</p>
         * <ul>
         * <li>LOG: Logstore.</li>
         * <li>METRIC: Metricstore.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LOG</p>
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        public Stores build() {
            return new Stores(this);
        } 

    } 

}
