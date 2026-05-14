// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link CreateExternalDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateExternalDatabaseRequest</p>
 */
public class CreateExternalDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultUserMapping")
    private String defaultUserMapping;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("externalConfig")
    private java.util.List<ExternalConfig> externalConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("metastoreType")
    private String metastoreType;

    private CreateExternalDatabaseRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.comment = builder.comment;
        this.databaseName = builder.databaseName;
        this.defaultUserMapping = builder.defaultUserMapping;
        this.externalConfig = builder.externalConfig;
        this.metastoreType = builder.metastoreType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExternalDatabaseRequest create() {
        return builder().build();
    }

@Override
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
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return defaultUserMapping
     */
    public String getDefaultUserMapping() {
        return this.defaultUserMapping;
    }

    /**
     * @return externalConfig
     */
    public java.util.List<ExternalConfig> getExternalConfig() {
        return this.externalConfig;
    }

    /**
     * @return metastoreType
     */
    public String getMetastoreType() {
        return this.metastoreType;
    }

    public static final class Builder extends Request.Builder<CreateExternalDatabaseRequest, Builder> {
        private String instanceId; 
        private String comment; 
        private String databaseName; 
        private String defaultUserMapping; 
        private java.util.List<ExternalConfig> externalConfig; 
        private String metastoreType; 

        private Builder() {
            super();
        } 

        private Builder(CreateExternalDatabaseRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.comment = request.comment;
            this.databaseName = request.databaseName;
            this.defaultUserMapping = request.defaultUserMapping;
            this.externalConfig = request.externalConfig;
            this.metastoreType = request.metastoreType;
        } 

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.putBodyParameter("comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("databaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * defaultUserMapping.
         */
        public Builder defaultUserMapping(String defaultUserMapping) {
            this.putBodyParameter("defaultUserMapping", defaultUserMapping);
            this.defaultUserMapping = defaultUserMapping;
            return this;
        }

        /**
         * externalConfig.
         */
        public Builder externalConfig(java.util.List<ExternalConfig> externalConfig) {
            this.putBodyParameter("externalConfig", externalConfig);
            this.externalConfig = externalConfig;
            return this;
        }

        /**
         * metastoreType.
         */
        public Builder metastoreType(String metastoreType) {
            this.putBodyParameter("metastoreType", metastoreType);
            this.metastoreType = metastoreType;
            return this;
        }

        @Override
        public CreateExternalDatabaseRequest build() {
            return new CreateExternalDatabaseRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateExternalDatabaseRequest} extends {@link TeaModel}
     *
     * <p>CreateExternalDatabaseRequest</p>
     */
    public static class ExternalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private ExternalConfig(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExternalConfig create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ExternalConfig model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ExternalConfig build() {
                return new ExternalConfig(this);
            } 

        } 

    }
}
