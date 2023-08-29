// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CatalogSettings} extends {@link TeaModel}
 *
 * <p>CatalogSettings</p>
 */
public class CatalogSettings extends TeaModel {
    @NameInMap("Config")
    private java.util.Map < String, String > config;

    private CatalogSettings(Builder builder) {
        this.config = builder.config;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogSettings create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public java.util.Map < String, String > getConfig() {
        return this.config;
    }

    public static final class Builder {
        private java.util.Map < String, String > config; 

        /**
         * Config.
         */
        public Builder config(java.util.Map < String, String > config) {
            this.config = config;
            return this;
        }

        public CatalogSettings build() {
            return new CatalogSettings(this);
        } 

    } 

}
