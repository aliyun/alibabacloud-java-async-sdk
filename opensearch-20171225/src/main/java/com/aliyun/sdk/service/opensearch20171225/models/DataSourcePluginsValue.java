// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DataSourcePluginsValue} extends {@link TeaModel}
 *
 * <p>DataSourcePluginsValue</p>
 */
public class DataSourcePluginsValue extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("fromFields")
    private String fromFields;

    @NameInMap("parameters")
    private java.util.Map < String, String > parameters;

    private DataSourcePluginsValue(Builder builder) {
        this.name = builder.name;
        this.fromFields = builder.fromFields;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataSourcePluginsValue create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return fromFields
     */
    public String getFromFields() {
        return this.fromFields;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    public static final class Builder {
        private String name; 
        private String fromFields; 
        private java.util.Map < String, String > parameters; 

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * fromFields.
         */
        public Builder fromFields(String fromFields) {
            this.fromFields = fromFields;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        public DataSourcePluginsValue build() {
            return new DataSourcePluginsValue(this);
        } 

    } 

}
