// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvPodMonitorRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvPodMonitorRequest</p>
 */
public class CreateEnvPodMonitorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configYaml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateEnvPodMonitorRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.configYaml = builder.configYaml;
        this.dryRun = builder.dryRun;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvPodMonitorRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateEnvPodMonitorRequest, Builder> {
        private String aliyunLang; 
        private String configYaml; 
        private Boolean dryRun; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvPodMonitorRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.configYaml = request.configYaml;
            this.dryRun = request.dryRun;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
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
         * The YAML configuration string of the PodMonitor.
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
         * The ID of the environment instance.
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
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

        @Override
        public CreateEnvPodMonitorRequest build() {
            return new CreateEnvPodMonitorRequest(this);
        } 

    } 

}
