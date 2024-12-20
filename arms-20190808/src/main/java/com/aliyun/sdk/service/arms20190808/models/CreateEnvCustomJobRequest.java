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
 * {@link CreateEnvCustomJobRequest} extends {@link RequestModel}
 *
 * <p>CreateEnvCustomJobRequest</p>
 */
public class CreateEnvCustomJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConfigYaml")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configYaml;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomJobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customJobName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateEnvCustomJobRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.configYaml = builder.configYaml;
        this.customJobName = builder.customJobName;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvCustomJobRequest create() {
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
     * @return customJobName
     */
    public String getCustomJobName() {
        return this.customJobName;
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

    public static final class Builder extends Request.Builder<CreateEnvCustomJobRequest, Builder> {
        private String aliyunLang; 
        private String configYaml; 
        private String customJobName; 
        private String environmentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateEnvCustomJobRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.configYaml = request.configYaml;
            this.customJobName = request.customJobName;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
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
         * <p>The YAML configuration string of the custom job.</p>
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
         * <p>The name of the custom job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customJob1</p>
         */
        public Builder customJobName(String customJobName) {
            this.putQueryParameter("CustomJobName", customJobName);
            this.customJobName = customJobName;
            return this;
        }

        /**
         * <p>The ID of the environment instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxxxxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
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

        @Override
        public CreateEnvCustomJobRequest build() {
            return new CreateEnvCustomJobRequest(this);
        } 

    } 

}
