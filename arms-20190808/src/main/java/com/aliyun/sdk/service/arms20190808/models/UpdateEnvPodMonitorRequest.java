// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvPodMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvPodMonitorRequest</p>
 */
public class UpdateEnvPodMonitorRequest extends Request {
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
    @NameInMap("PodMonitorName")
    @Validation(required = true)
    private String podMonitorName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateEnvPodMonitorRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.configYaml = builder.configYaml;
        this.dryRun = builder.dryRun;
        this.environmentId = builder.environmentId;
        this.namespace = builder.namespace;
        this.podMonitorName = builder.podMonitorName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvPodMonitorRequest create() {
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
     * @return podMonitorName
     */
    public String getPodMonitorName() {
        return this.podMonitorName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEnvPodMonitorRequest, Builder> {
        private String aliyunLang; 
        private String configYaml; 
        private Boolean dryRun; 
        private String environmentId; 
        private String namespace; 
        private String podMonitorName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvPodMonitorRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.configYaml = request.configYaml;
            this.dryRun = request.dryRun;
            this.environmentId = request.environmentId;
            this.namespace = request.namespace;
            this.podMonitorName = request.podMonitorName;
            this.regionId = request.regionId;
        } 

        /**
         * Locale, the default is Chinese zh | en.
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * yaml configuration string.
         */
        public Builder configYaml(String configYaml) {
            this.putBodyParameter("ConfigYaml", configYaml);
            this.configYaml = configYaml;
            return this;
        }

        /**
         * Trial run: Check whether the format is legal and whether it can match targets.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Environment ID.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * The namespace where podMonitor is located.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * PodMonitor name.
         */
        public Builder podMonitorName(String podMonitorName) {
            this.putQueryParameter("PodMonitorName", podMonitorName);
            this.podMonitorName = podMonitorName;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateEnvPodMonitorRequest build() {
            return new UpdateEnvPodMonitorRequest(this);
        } 

    } 

}