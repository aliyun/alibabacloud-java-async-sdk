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
 * {@link ModifyInstanceAuthConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceAuthConfigRequest</p>
 */
public class ModifyInstanceAuthConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyInstanceAuthConfigRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.configList = builder.configList;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceAuthConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchName
     */
    public String getBranchName() {
        return this.branchName;
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
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

    public static final class Builder extends Request.Builder<ModifyInstanceAuthConfigRequest, Builder> {
        private String branchName; 
        private java.util.List<ConfigList> configList; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceAuthConfigRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.configList = request.configList;
            this.instanceName = request.instanceName;
            this.regionId = request.regionId;
        } 

        /**
         * BranchName.
         */
        public Builder branchName(String branchName) {
            this.putQueryParameter("BranchName", branchName);
            this.branchName = branchName;
            return this;
        }

        /**
         * <p>The list of authentication configurations.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            String configListShrink = shrink(configList, "ConfigList", "json");
            this.putQueryParameter("ConfigList", configListShrink);
            this.configList = configList;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
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
         * <p>The region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyInstanceAuthConfigRequest build() {
            return new ModifyInstanceAuthConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceAuthConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceAuthConfigRequest</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The configuration item name. Valid values:</p>
             * <ul>
             * <li><strong>GOTRUE_EXTERNAL_EMAIL_ENABLED</strong>: specifies whether to allow external email addresses.</li>
             * <li><strong>GOTRUE_SITE_URL</strong>: the website URL displayed when the AI application sends emails.</li>
             * <li><strong>GOTRUE_SMTP_PORT</strong>: the port of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_SENDER_NAME</strong>: the name of the email sender.</li>
             * <li><strong>GOTRUE_SMTP_USER</strong>: the username of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_PASS</strong>: the secret key of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_ADMIN_EMAIL</strong>: the email address of the SMTP provider.</li>
             * <li><strong>GOTRUE_SMTP_HOST</strong>: the host address of the SMTP provider.</li>
             * <li><strong>GOTRUE_MAILER_AUTOCONFIRM</strong>: specifies whether to enable automatic confirmation.</li>
             * <li><strong>GOTRUE_MAILER_OTP_EXP</strong>: the validity period of the one-time password (OTP). Unit: seconds.</li>
             * <li><strong>GOTRUE_MAILER_OTP_LENGTH</strong>: the length of the one-time password (OTP) verification code. The value must be an integer greater than or equal to 6.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>GOTRUE_SITE_URL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://8.152">http://8.152</a>. XXX.XXX</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
