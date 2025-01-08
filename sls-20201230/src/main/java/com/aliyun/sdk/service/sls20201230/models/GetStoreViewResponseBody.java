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
 * {@link GetStoreViewResponseBody} extends {@link TeaModel}
 *
 * <p>GetStoreViewResponseBody</p>
 */
public class GetStoreViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("storeType")
    private String storeType;

    @com.aliyun.core.annotation.NameInMap("stores")
    private java.util.List<StoreViewStore> stores;

    private GetStoreViewResponseBody(Builder builder) {
        this.storeType = builder.storeType;
        this.stores = builder.stores;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStoreViewResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String storeType; 
        private java.util.List<StoreViewStore> stores; 

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
         * 
         * <strong>example:</strong>
         * <p>logstore</p>
         */
        public Builder storeType(String storeType) {
            this.storeType = storeType;
            return this;
        }

        /**
         * <p>The Logstores or Metricstores.</p>
         */
        public Builder stores(java.util.List<StoreViewStore> stores) {
            this.stores = stores;
            return this;
        }

        public GetStoreViewResponseBody build() {
            return new GetStoreViewResponseBody(this);
        } 

    } 

}
