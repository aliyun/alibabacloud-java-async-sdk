// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link DLSerdeInfo} extends {@link TeaModel}
 *
 * <p>DLSerdeInfo</p>
 */
public class DLSerdeInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DeserializerClass")
    private String deserializerClass;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, ?> parameters;

    @com.aliyun.core.annotation.NameInMap("SerdeType")
    private Integer serdeType;

    @com.aliyun.core.annotation.NameInMap("SerializationLib")
    private String serializationLib;

    @com.aliyun.core.annotation.NameInMap("SerializerClass")
    private String serializerClass;

    private DLSerdeInfo(Builder builder) {
        this.description = builder.description;
        this.deserializerClass = builder.deserializerClass;
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.serdeType = builder.serdeType;
        this.serializationLib = builder.serializationLib;
        this.serializerClass = builder.serializerClass;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DLSerdeInfo create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return deserializerClass
     */
    public String getDeserializerClass() {
        return this.deserializerClass;
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
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    /**
     * @return serdeType
     */
    public Integer getSerdeType() {
        return this.serdeType;
    }

    /**
     * @return serializationLib
     */
    public String getSerializationLib() {
        return this.serializationLib;
    }

    /**
     * @return serializerClass
     */
    public String getSerializerClass() {
        return this.serializerClass;
    }

    public static final class Builder {
        private String description; 
        private String deserializerClass; 
        private String name; 
        private java.util.Map<String, ?> parameters; 
        private Integer serdeType; 
        private String serializationLib; 
        private String serializerClass; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DeserializerClass.
         */
        public Builder deserializerClass(String deserializerClass) {
            this.deserializerClass = deserializerClass;
            return this;
        }

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
        public Builder parameters(java.util.Map<String, ?> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * SerdeType.
         */
        public Builder serdeType(Integer serdeType) {
            this.serdeType = serdeType;
            return this;
        }

        /**
         * SerializationLib.
         */
        public Builder serializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }

        /**
         * SerializerClass.
         */
        public Builder serializerClass(String serializerClass) {
            this.serializerClass = serializerClass;
            return this;
        }

        public DLSerdeInfo build() {
            return new DLSerdeInfo(this);
        } 

    } 

}
