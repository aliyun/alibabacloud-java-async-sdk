// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterOfflineConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterOfflineConfigRequest</p>
 */
public class ModifyClusterOfflineConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("buildMode")
    private String buildMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("config")
    private java.util.Map < String, Integer > config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceType")
    private String dataSourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataTimeSec")
    private Integer dataTimeSec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generation")
    private Long generation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partition")
    private String partition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("pushMode")
    private String pushMode;

    private ModifyClusterOfflineConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.buildMode = builder.buildMode;
        this.config = builder.config;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.dataTimeSec = builder.dataTimeSec;
        this.domain = builder.domain;
        this.generation = builder.generation;
        this.partition = builder.partition;
        this.pushMode = builder.pushMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterOfflineConfigRequest create() {
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
     * @return buildMode
     */
    public String getBuildMode() {
        return this.buildMode;
    }

    /**
     * @return config
     */
    public java.util.Map < String, Integer > getConfig() {
        return this.config;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return dataTimeSec
     */
    public Integer getDataTimeSec() {
        return this.dataTimeSec;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return generation
     */
    public Long getGeneration() {
        return this.generation;
    }

    /**
     * @return partition
     */
    public String getPartition() {
        return this.partition;
    }

    /**
     * @return pushMode
     */
    public String getPushMode() {
        return this.pushMode;
    }

    public static final class Builder extends Request.Builder<ModifyClusterOfflineConfigRequest, Builder> {
        private String instanceId; 
        private String buildMode; 
        private java.util.Map < String, Integer > config; 
        private String dataSourceName; 
        private String dataSourceType; 
        private Integer dataTimeSec; 
        private String domain; 
        private Long generation; 
        private String partition; 
        private String pushMode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterOfflineConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.buildMode = request.buildMode;
            this.config = request.config;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.dataTimeSec = request.dataTimeSec;
            this.domain = request.domain;
            this.generation = request.generation;
            this.partition = request.partition;
            this.pushMode = request.pushMode;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The reindexing method. Valid values: api: API data source. indexRecover: data recovery by using indexing.
         */
        public Builder buildMode(String buildMode) {
            this.putBodyParameter("buildMode", buildMode);
            this.buildMode = buildMode;
            return this;
        }

        /**
         * The configuration name, which is stored as a key.
         */
        public Builder config(java.util.Map < String, Integer > config) {
            this.putBodyParameter("config", config);
            this.config = config;
            return this;
        }

        /**
         * The name of the data source.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * The type of the data source. Valid values: odps: MaxCompute. swift: Swift. unKnow: unknown type.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * This parameter is required when index building by using API data sources is triggered.
         */
        public Builder dataTimeSec(Integer dataTimeSec) {
            this.putBodyParameter("dataTimeSec", dataTimeSec);
            this.dataTimeSec = dataTimeSec;
            return this;
        }

        /**
         * The data center in which the data source is deployed.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the full index version.
         */
        public Builder generation(Long generation) {
            this.putBodyParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * This parameter is required when index building for full data in a MaxCompute data source is triggered.
         */
        public Builder partition(String partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * The push mode of the configuration. By default, only the configuration is pushed.
         */
        public Builder pushMode(String pushMode) {
            this.putBodyParameter("pushMode", pushMode);
            this.pushMode = pushMode;
            return this;
        }

        @Override
        public ModifyClusterOfflineConfigRequest build() {
            return new ModifyClusterOfflineConfigRequest(this);
        } 

    } 

}
