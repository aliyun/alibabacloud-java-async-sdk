// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.milvus20231012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceConfigRequest</p>
 */
public class ModifyInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserConfig")
    private String userConfig;

    private ModifyInstanceConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.reason = builder.reason;
        this.userConfig = builder.userConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return userConfig
     */
    public String getUserConfig() {
        return this.userConfig;
    }

    public static final class Builder extends Request.Builder<ModifyInstanceConfigRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String reason; 
        private String userConfig; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.reason = request.reason;
            this.userConfig = request.userConfig;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-123xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>for test</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * UserConfig.
         */
        public Builder userConfig(String userConfig) {
            this.putQueryParameter("UserConfig", userConfig);
            this.userConfig = userConfig;
            return this;
        }

        @Override
        public ModifyInstanceConfigRequest build() {
            return new ModifyInstanceConfigRequest(this);
        } 

    } 

}
