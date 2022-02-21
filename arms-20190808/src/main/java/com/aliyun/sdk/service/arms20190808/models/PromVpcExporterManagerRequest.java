// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PromVpcExporterManagerRequest} extends {@link RequestModel}
 *
 * <p>PromVpcExporterManagerRequest</p>
 */
public class PromVpcExporterManagerRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ExporterConfig")
    private String exporterConfig;

    @Query
    @NameInMap("ExporterType")
    @Validation(required = true)
    private String exporterType;

    @Query
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private PromVpcExporterManagerRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.exporterConfig = builder.exporterConfig;
        this.exporterType = builder.exporterType;
        this.method = builder.method;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PromVpcExporterManagerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return exporterConfig
     */
    public String getExporterConfig() {
        return this.exporterConfig;
    }

    /**
     * @return exporterType
     */
    public String getExporterType() {
        return this.exporterType;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<PromVpcExporterManagerRequest, Builder> {
        private String clusterId; 
        private String exporterConfig; 
        private String exporterType; 
        private String method; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(PromVpcExporterManagerRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.exporterConfig = response.exporterConfig;
            this.exporterType = response.exporterType;
            this.method = response.method;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ExporterConfig.
         */
        public Builder exporterConfig(String exporterConfig) {
            this.putQueryParameter("ExporterConfig", exporterConfig);
            this.exporterConfig = exporterConfig;
            return this;
        }

        /**
         * ExporterType.
         */
        public Builder exporterType(String exporterType) {
            this.putQueryParameter("ExporterType", exporterType);
            this.exporterType = exporterType;
            return this;
        }

        /**
         * Method.
         */
        public Builder method(String method) {
            this.putQueryParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public PromVpcExporterManagerRequest build() {
            return new PromVpcExporterManagerRequest(this);
        } 

    } 

}
