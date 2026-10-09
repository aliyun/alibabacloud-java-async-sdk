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
         * <p>The detailed configuration to modify.</p>
         * <details>
         * <summary>Format for version 1</summary>
         * {"global":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":1000}}
         * </details>
         * 
         * <details>
         * <summary>Format for version 2</summary>
         * {"cn":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":3000},"intl":{"slsRegionId":"ap-southeast-1","logTime":180,"logStorage":2000}}
         * </details>
         * The fields are described as follows:
         * 
         * <ul>
         * <li>slsRegionId: The region ID to which logs are delivered.</li>
         * <li>logTime: The storage duration of logs. Unit: days.</li>
         * <li>logStorage: The log storage capacity. Unit: GB. The total capacity specified must not exceed the total capacity purchased by the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;global&quot;:{&quot;slsRegionId&quot;:&quot;cn-hangzhou&quot;,&quot;logTime&quot;:180,&quot;logStorage&quot;:1000}}</p>
         */
        public Builder detailConfig(String detailConfig) {
            this.putQueryParameter("DetailConfig", detailConfig);
            this.detailConfig = detailConfig;
            return this;
        }

        /**
         * <p>The log version. A value of 1 indicates one Logstore. A value of 2 indicates two Logstores.</p>
         * <blockquote>
         * <p>Notice: If ModifyType is set to version, set LogVersion to the target version. If ModifyType is set to config, set LogVersion to the current version of the user.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder logVersion(Integer logVersion) {
            this.putQueryParameter("LogVersion", logVersion);
            this.logVersion = logVersion;
            return this;
        }

        /**
         * <p>The modification type. Valid values:</p>
         * <ul>
         * <li><p>version: The version is changed. For example, the version is changed from 1 (logs are delivered to one Logstore) to 2 (logs are delivered to two Logstores).</p>
         * </li>
         * <li><p>config: The configuration is changed. For example, the log delivery region or the storage duration of logs is modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>version</p>
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
