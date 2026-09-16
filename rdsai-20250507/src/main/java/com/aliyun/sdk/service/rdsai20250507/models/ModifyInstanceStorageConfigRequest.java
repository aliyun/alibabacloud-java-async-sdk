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
 * {@link ModifyInstanceStorageConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyInstanceStorageConfigRequest</p>
 */
public class ModifyInstanceStorageConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BranchName")
    private String branchName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyInstanceStorageConfigRequest(Builder builder) {
        super(builder);
        this.branchName = builder.branchName;
        this.clientToken = builder.clientToken;
        this.configList = builder.configList;
        this.instanceName = builder.instanceName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceStorageConfigRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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

    public static final class Builder extends Request.Builder<ModifyInstanceStorageConfigRequest, Builder> {
        private String branchName; 
        private String clientToken; 
        private java.util.List<ConfigList> configList; 
        private String instanceName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyInstanceStorageConfigRequest request) {
            super(request);
            this.branchName = request.branchName;
            this.clientToken = request.clientToken;
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, which ensures that the request is not repeated.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The list of storage configurations.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            String configListShrink = shrink(configList, "ConfigList", "json");
            this.putQueryParameter("ConfigList", configListShrink);
            this.configList = configList;
            return this;
        }

        /**
         * <p>The instance ID of the AI application.</p>
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
         * <p>The region ID.</p>
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
        public ModifyInstanceStorageConfigRequest build() {
            return new ModifyInstanceStorageConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyInstanceStorageConfigRequest} extends {@link TeaModel}
     *
     * <p>ModifyInstanceStorageConfigRequest</p>
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
             * <p>The name of the configuration item. Valid values:</p>
             * <ul>
             * <li><strong>AWS_SESSION_TOKEN</strong> (optional): the temporary access token (Session Token) for OSS. If this parameter is not specified, AccessKey ID and AccessKey Secret are used for authentication.</li>
             * <li><strong>AWS_ACCESS_KEY_ID</strong>: the AccessKey ID for OSS.</li>
             * <li><strong>AWS_SECRET_ACCESS_KEY</strong>: the AccessKey Secret for OSS.</li>
             * <li><strong>GLOBAL_S3_BUCKET</strong>: the bucket name of OSS.</li>
             * <li><strong>TENANT_ID</strong>: the OSS directory name. You do not need to create it in advance.</li>
             * <li><strong>GLOBAL_S3_ENDPOINT</strong>: the endpoint of OSS.</li>
             * <li><strong>REGION</strong>: the region of OSS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TENANT_ID</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>test-prefix</p>
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
