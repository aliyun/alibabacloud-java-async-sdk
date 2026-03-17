// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link UpdateEdgeFunctionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEdgeFunctionRequest</p>
 */
public class UpdateEdgeFunctionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Code")
    private Code code;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomConfig")
    private java.util.Map<String, ?> customConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EdgeFunctionName")
    private String edgeFunctionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.Map<String, String> envs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateEdgeFunctionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.code = builder.code;
        this.customConfig = builder.customConfig;
        this.edgeFunctionName = builder.edgeFunctionName;
        this.envs = builder.envs;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEdgeFunctionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return code
     */
    public Code getCode() {
        return this.code;
    }

    /**
     * @return customConfig
     */
    public java.util.Map<String, ?> getCustomConfig() {
        return this.customConfig;
    }

    /**
     * @return edgeFunctionName
     */
    public String getEdgeFunctionName() {
        return this.edgeFunctionName;
    }

    /**
     * @return envs
     */
    public java.util.Map<String, String> getEnvs() {
        return this.envs;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEdgeFunctionRequest, Builder> {
        private String clientToken; 
        private Code code; 
        private java.util.Map<String, ?> customConfig; 
        private String edgeFunctionName; 
        private java.util.Map<String, String> envs; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEdgeFunctionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.code = request.code;
            this.customConfig = request.customConfig;
            this.edgeFunctionName = request.edgeFunctionName;
            this.envs = request.envs;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Code code) {
            String codeShrink = shrink(code, "Code", "json");
            this.putQueryParameter("Code", codeShrink);
            this.code = code;
            return this;
        }

        /**
         * CustomConfig.
         */
        public Builder customConfig(java.util.Map<String, ?> customConfig) {
            String customConfigShrink = shrink(customConfig, "CustomConfig", "json");
            this.putQueryParameter("CustomConfig", customConfigShrink);
            this.customConfig = customConfig;
            return this;
        }

        /**
         * <p>fc-xxxx。</p>
         * 
         * <strong>example:</strong>
         * <p>ef-****</p>
         */
        public Builder edgeFunctionName(String edgeFunctionName) {
            this.putQueryParameter("EdgeFunctionName", edgeFunctionName);
            this.edgeFunctionName = edgeFunctionName;
            return this;
        }

        /**
         * Envs.
         */
        public Builder envs(java.util.Map<String, String> envs) {
            String envsShrink = shrink(envs, "Envs", "json");
            this.putQueryParameter("Envs", envsShrink);
            this.envs = envs;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
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
        public UpdateEdgeFunctionRequest build() {
            return new UpdateEdgeFunctionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateEdgeFunctionRequest} extends {@link TeaModel}
     *
     * <p>UpdateEdgeFunctionRequest</p>
     */
    public static class Code extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("OssObjectName")
        private String ossObjectName;

        @com.aliyun.core.annotation.NameInMap("OssType")
        private String ossType;

        private Code(Builder builder) {
            this.ossBucketName = builder.ossBucketName;
            this.ossObjectName = builder.ossObjectName;
            this.ossType = builder.ossType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Code create() {
            return builder().build();
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return ossObjectName
         */
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        /**
         * @return ossType
         */
        public String getOssType() {
            return this.ossType;
        }

        public static final class Builder {
            private String ossBucketName; 
            private String ossObjectName; 
            private String ossType; 

            private Builder() {
            } 

            private Builder(Code model) {
                this.ossBucketName = model.ossBucketName;
                this.ossObjectName = model.ossObjectName;
                this.ossType = model.ossType;
            } 

            /**
             * OssBucketName.
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * OssObjectName.
             */
            public Builder ossObjectName(String ossObjectName) {
                this.ossObjectName = ossObjectName;
                return this;
            }

            /**
             * OssType.
             */
            public Builder ossType(String ossType) {
                this.ossType = ossType;
                return this;
            }

            public Code build() {
                return new Code(this);
            } 

        } 

    }
}
