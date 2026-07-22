// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifySlsDispatchConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifySlsDispatchConfigRequest</p>
 */
public class ModifySlsDispatchConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DetailConfig")
    private String detailConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogVersion")
    private Integer logVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    private ModifySlsDispatchConfigRequest(Builder builder) {
        super(builder);
        this.detailConfig = builder.detailConfig;
        this.logVersion = builder.logVersion;
        this.modifyType = builder.modifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySlsDispatchConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detailConfig
     */
    public String getDetailConfig() {
        return this.detailConfig;
    }

    /**
     * @return logVersion
     */
    public Integer getLogVersion() {
        return this.logVersion;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    public static final class Builder extends Request.Builder<ModifySlsDispatchConfigRequest, Builder> {
        private String detailConfig; 
        private Integer logVersion; 
        private String modifyType; 

        private Builder() {
            super();
        } 

        private Builder(ModifySlsDispatchConfigRequest request) {
            super(request);
            this.detailConfig = request.detailConfig;
            this.logVersion = request.logVersion;
            this.modifyType = request.modifyType;
        } 

        /**
         * DetailConfig.
         */
        public Builder detailConfig(String detailConfig) {
            this.putQueryParameter("DetailConfig", detailConfig);
            this.detailConfig = detailConfig;
            return this;
        }

        /**
         * LogVersion.
         */
        public Builder logVersion(Integer logVersion) {
            this.putQueryParameter("LogVersion", logVersion);
            this.logVersion = logVersion;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        @Override
        public ModifySlsDispatchConfigRequest build() {
            return new ModifySlsDispatchConfigRequest(this);
        } 

    } 

}
