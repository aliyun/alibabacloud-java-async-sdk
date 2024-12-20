// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ArmsConfig} extends {@link TeaModel}
 *
 * <p>ArmsConfig</p>
 */
public class ArmsConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentVersion")
    private String agentVersion;

    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("licenseKey")
    private String licenseKey;

    private ArmsConfig(Builder builder) {
        this.agentVersion = builder.agentVersion;
        this.appId = builder.appId;
        this.licenseKey = builder.licenseKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArmsConfig create() {
        return builder().build();
    }

    /**
     * @return agentVersion
     */
    public String getAgentVersion() {
        return this.agentVersion;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return licenseKey
     */
    public String getLicenseKey() {
        return this.licenseKey;
    }

    public static final class Builder {
        private String agentVersion; 
        private String appId; 
        private String licenseKey; 

        /**
         * agentVersion.
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }

        /**
         * appId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * licenseKey.
         */
        public Builder licenseKey(String licenseKey) {
            this.licenseKey = licenseKey;
            return this;
        }

        public ArmsConfig build() {
            return new ArmsConfig(this);
        } 

    } 

}
