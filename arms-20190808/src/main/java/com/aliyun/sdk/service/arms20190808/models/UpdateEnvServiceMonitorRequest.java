// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvServiceMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvServiceMonitorRequest</p>
 */
public class UpdateEnvServiceMonitorRequest extends Request {
    @Query
    @NameInMap("AliyunLang")
    private String aliyunLang;

    @Body
    @NameInMap("ConfigYaml")
    @Validation(required = true)
    private String configYaml;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EnvironmentId")
    @Validation(required = true)
    private String environmentId;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ServiceMonitorName")
    @Validation(required = true)
    private String serviceMonitorName;

    private UpdateEnvServiceMonitorRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.configYaml = builder.configYaml;
        this.dryRun = builder.dryRun;
        this.environmentId = builder.environmentId;
        this.namespace = builder.namespace;
        this.regionId = builder.regionId;
        this.serviceMonitorName = builder.serviceMonitorName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvServiceMonitorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return configYaml
     */
    public String getConfigYaml() {
        return this.configYaml;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceMonitorName
     */
    public String getServiceMonitorName() {
        return this.serviceMonitorName;
    }

    public static final class Builder extends Request.Builder<UpdateEnvServiceMonitorRequest, Builder> {
        private String aliyunLang; 
        private String configYaml; 
        private Boolean dryRun; 
        private String environmentId; 
        private String namespace; 
        private String regionId; 
        private String serviceMonitorName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvServiceMonitorRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.configYaml = request.configYaml;
            this.dryRun = request.dryRun;
            this.environmentId = request.environmentId;
            this.namespace = request.namespace;
            this.regionId = request.regionId;
            this.serviceMonitorName = request.serviceMonitorName;
        } 

        /**
         * The language. Valid values: zh and en. Default value: zh.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * The YAML configuration string.
         */
        public Builder configYaml(String configYaml) {
            this.putBodyParameter("ConfigYaml", configYaml);
            this.configYaml = configYaml;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The namespace where the ServiceMonitor is located.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the ServiceMonitor.
         */
        public Builder serviceMonitorName(String serviceMonitorName) {
            this.putQueryParameter("ServiceMonitorName", serviceMonitorName);
            this.serviceMonitorName = serviceMonitorName;
            return this;
        }

        @Override
        public UpdateEnvServiceMonitorRequest build() {
            return new UpdateEnvServiceMonitorRequest(this);
        } 

    } 

}
