// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpdateStoreViewRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoreViewRequest</p>
 */
public class UpdateStoreViewRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("storeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stores")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<StoreViewStore> stores;

    private UpdateStoreViewRequest(Builder builder) {
        super(builder);
        this.project = builder.project;
        this.name = builder.name;
        this.storeType = builder.storeType;
        this.stores = builder.stores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoreViewRequest create() {
        return builder().build();
    }

    @Override
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return storeType
     */
    public String getStoreType() {
        return this.storeType;
    }

    /**
     * @return stores
     */
    public java.util.List<StoreViewStore> getStores() {
        return this.stores;
    }

    public static final class Builder extends Request.Builder<UpdateStoreViewRequest, Builder> {
        private String project; 
        private String name; 
        private String storeType; 
        private java.util.List<StoreViewStore> stores; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoreViewRequest request) {
            super(request);
            this.project = request.project;
            this.name = request.name;
            this.storeType = request.storeType;
            this.stores = request.stores;
        } 

        /**
         * <p>The name of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example-project</p>
         */
        public Builder project(String project) {
            this.putHostParameter("project", project);
            this.project = project;
            return this;
        }

        /**
         * <p>The name of the dataset.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my_storeview</p>
         */
        public Builder name(String name) {
            this.putPathParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the dataset.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>metricstore</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>logstore</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        public Builder storeType(String storeType) {
            this.putBodyParameter("storeType", storeType);
            this.storeType = storeType;
            return this;
        }

        /**
         * <p>The Logstores or Metricstores.</p>
         * <p>This parameter is required.</p>
         */
        public Builder stores(java.util.List<StoreViewStore> stores) {
            this.putBodyParameter("stores", stores);
            this.stores = stores;
            return this;
        }

        @Override
        public UpdateStoreViewRequest build() {
            return new UpdateStoreViewRequest(this);
        } 

    } 

}
