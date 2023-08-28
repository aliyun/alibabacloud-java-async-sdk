// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BuildIndexRequest} extends {@link RequestModel}
 *
 * <p>BuildIndexRequest</p>
 */
public class BuildIndexRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("buildMode")
    private String buildMode;

    @Body
    @NameInMap("dataSourceName")
    private String dataSourceName;

    @Body
    @NameInMap("dataSourceType")
    private String dataSourceType;

    @Body
    @NameInMap("dataTimeSec")
    private Integer dataTimeSec;

    @Body
    @NameInMap("domain")
    private String domain;

    @Body
    @NameInMap("generation")
    private Long generation;

    @Body
    @NameInMap("partition")
    private String partition;

    private BuildIndexRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.buildMode = builder.buildMode;
        this.dataSourceName = builder.dataSourceName;
        this.dataSourceType = builder.dataSourceType;
        this.dataTimeSec = builder.dataTimeSec;
        this.domain = builder.domain;
        this.generation = builder.generation;
        this.partition = builder.partition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BuildIndexRequest create() {
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

    public static final class Builder extends Request.Builder<BuildIndexRequest, Builder> {
        private String instanceId; 
        private String buildMode; 
        private String dataSourceName; 
        private String dataSourceType; 
        private Integer dataTimeSec; 
        private String domain; 
        private Long generation; 
        private String partition; 

        private Builder() {
            super();
        } 

        private Builder(BuildIndexRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.buildMode = request.buildMode;
            this.dataSourceName = request.dataSourceName;
            this.dataSourceType = request.dataSourceType;
            this.dataTimeSec = request.dataTimeSec;
            this.domain = request.domain;
            this.generation = request.generation;
            this.partition = request.partition;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The mode in which reindexing is performed.
         */
        public Builder buildMode(String buildMode) {
            this.putBodyParameter("buildMode", buildMode);
            this.buildMode = buildMode;
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
         * The type of the data source.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("dataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * The timestamp in seconds. This parameter is required if you import data from the data source by calling API operations.
         */
        public Builder dataTimeSec(Integer dataTimeSec) {
            this.putBodyParameter("dataTimeSec", dataTimeSec);
            this.dataTimeSec = dataTimeSec;
            return this;
        }

        /**
         * The data center in which the data source resides.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The ID of the generation.
         */
        public Builder generation(Long generation) {
            this.putBodyParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * The data partition. This parameter is required if the dataSourceType parameter is set to odps.
         */
        public Builder partition(String partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        @Override
        public BuildIndexRequest build() {
            return new BuildIndexRequest(this);
        } 

    } 

}
