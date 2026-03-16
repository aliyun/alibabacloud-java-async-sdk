// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ArmsConfiguration} extends {@link TeaModel}
 *
 * <p>ArmsConfiguration</p>
 */
public class ArmsConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("armsLicenseKey")
    private String armsLicenseKey;

    @com.aliyun.core.annotation.NameInMap("cmsWorkspace")
    private String cmsWorkspace;

    @com.aliyun.core.annotation.NameInMap("enableArms")
    private Boolean enableArms;

    private ArmsConfiguration(Builder builder) {
        this.armsLicenseKey = builder.armsLicenseKey;
        this.cmsWorkspace = builder.cmsWorkspace;
        this.enableArms = builder.enableArms;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArmsConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return armsLicenseKey
     */
    public String getArmsLicenseKey() {
        return this.armsLicenseKey;
    }

    /**
     * @return cmsWorkspace
     */
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    /**
     * @return enableArms
     */
    public Boolean getEnableArms() {
        return this.enableArms;
    }

    public static final class Builder {
        private String armsLicenseKey; 
        private String cmsWorkspace; 
        private Boolean enableArms; 

        private Builder() {
        } 

        private Builder(ArmsConfiguration model) {
            this.armsLicenseKey = model.armsLicenseKey;
            this.cmsWorkspace = model.cmsWorkspace;
            this.enableArms = model.enableArms;
        } 

        /**
         * <p>应用实时监控服务（ARMS）的许可证密钥</p>
         * 
         * <strong>example:</strong>
         * <p>arms-license-key-123456</p>
         */
        public Builder armsLicenseKey(String armsLicenseKey) {
            this.armsLicenseKey = armsLicenseKey;
            return this;
        }

        /**
         * cmsWorkspace.
         */
        public Builder cmsWorkspace(String cmsWorkspace) {
            this.cmsWorkspace = cmsWorkspace;
            return this;
        }

        /**
         * <p>是否启用应用实时监控服务（ARMS）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableArms(Boolean enableArms) {
            this.enableArms = enableArms;
            return this;
        }

        public ArmsConfiguration build() {
            return new ArmsConfiguration(this);
        } 

    } 

}
