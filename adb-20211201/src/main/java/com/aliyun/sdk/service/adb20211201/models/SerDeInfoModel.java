// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SerDeInfoModel} extends {@link TeaModel}
 *
 * <p>SerDeInfoModel</p>
 */
public class SerDeInfoModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map<String, String> parameters;

    @com.aliyun.core.annotation.NameInMap("SerDeId")
    private Long serDeId;

    @com.aliyun.core.annotation.NameInMap("SerializationLib")
    private String serializationLib;

    private SerDeInfoModel(Builder builder) {
        this.name = builder.name;
        this.parameters = builder.parameters;
        this.serDeId = builder.serDeId;
        this.serializationLib = builder.serializationLib;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SerDeInfoModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    /**
     * @return serDeId
     */
    public Long getSerDeId() {
        return this.serDeId;
    }

    /**
     * @return serializationLib
     */
    public String getSerializationLib() {
        return this.serializationLib;
    }

    public static final class Builder {
        private String name; 
        private java.util.Map<String, String> parameters; 
        private Long serDeId; 
        private String serializationLib; 

        private Builder() {
        } 

        private Builder(SerDeInfoModel model) {
            this.name = model.name;
            this.parameters = model.parameters;
            this.serDeId = model.serDeId;
            this.serializationLib = model.serializationLib;
        } 

        /**
         * <p>The name of the serialization or deserialization information.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The serialization or deserialization configuration parameter.</p>
         */
        public Builder parameters(java.util.Map<String, String> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the serialization or deserialization information.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder serDeId(Long serDeId) {
            this.serDeId = serDeId;
            return this;
        }

        /**
         * <p>The library that is used for serialization.</p>
         * 
         * <strong>example:</strong>
         * <p>org.apache.hadoop.hive.ql.io.parquet.serde.ParquetHiveSerDe</p>
         */
        public Builder serializationLib(String serializationLib) {
            this.serializationLib = serializationLib;
            return this;
        }

        public SerDeInfoModel build() {
            return new SerDeInfoModel(this);
        } 

    } 

}
