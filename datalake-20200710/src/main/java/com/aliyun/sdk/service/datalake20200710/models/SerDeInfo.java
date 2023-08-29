// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SerDeInfo} extends {@link TeaModel}
 *
 * <p>SerDeInfo</p>
 */
public class SerDeInfo extends TeaModel {
    @NameInMap("Name")
    private String name;

    @NameInMap("Parameters")
    private java.util.Map < String, String > parameters;

    @NameInMap("SerializationLib")
    private String serializationLib;

    private SerDeInfo(Builder builder) {
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.serializationLib = builder.serializationLib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SerDeInfo create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, String > getParameters() {
        return this.parameters;
    }

    /**
     * @return serializationLib
     */
    public String getSerializationLib() {
        return this.serializationLib;
    }

    public static final class Builder {
        private String name; 
        private java.util.Map < String, String > parameters; 
        private String serializationLib; 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, String > parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * SerializationLib.
         */
        public Builder serializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }

        public SerDeInfo build() {
            return new SerDeInfo(this);
        } 

    } 

}
