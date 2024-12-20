// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link UpdateEnvServiceMonitorRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvServiceMonitorRequest</p>
 */
public class UpdateEnvServiceMonitorRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceMonitorName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The language. Valid values: zh and en. Default value: zh.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>The YAML configuration string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Refer to supplementary instructions.</p>
         */
        public Builder configYaml(String configYaml) {
            this.putBodyParameter("ConfigYaml", configYaml);
            this.configYaml = configYaml;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The namespace where the ServiceMonitor is located.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>arms-prom</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the ServiceMonitor.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceMonitor1</p>
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
