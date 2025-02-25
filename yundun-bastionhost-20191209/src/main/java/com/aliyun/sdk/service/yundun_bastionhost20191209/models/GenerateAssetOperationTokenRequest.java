// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateAssetOperationTokenRequest} extends {@link RequestModel}
 *
 * <p>GenerateAssetOperationTokenRequest</p>
 */
public class GenerateAssetOperationTokenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountId")
    private String assetAccountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountName")
    private String assetAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountPassword")
    private String assetAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountProtocolName")
    private String assetAccountProtocolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseSchema")
    private String databaseSchema;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoginAttribute")
    private String loginAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationMode")
    private String operationMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SsoClient")
    private String ssoClient;

    private GenerateAssetOperationTokenRequest(Builder builder) {
        super(builder);
        this.assetAccountId = builder.assetAccountId;
        this.assetAccountName = builder.assetAccountName;
        this.assetAccountPassword = builder.assetAccountPassword;
        this.assetAccountProtocolName = builder.assetAccountProtocolName;
        this.assetId = builder.assetId;
        this.assetType = builder.assetType;
        this.databaseSchema = builder.databaseSchema;
        this.instanceId = builder.instanceId;
        this.loginAttribute = builder.loginAttribute;
        this.operationMode = builder.operationMode;
        this.regionId = builder.regionId;
        this.ssoClient = builder.ssoClient;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAssetOperationTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assetAccountId
     */
    public String getAssetAccountId() {
        return this.assetAccountId;
    }

    /**
     * @return assetAccountName
     */
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    /**
     * @return assetAccountPassword
     */
    public String getAssetAccountPassword() {
        return this.assetAccountPassword;
    }

    /**
     * @return assetAccountProtocolName
     */
    public String getAssetAccountProtocolName() {
        return this.assetAccountProtocolName;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return assetType
     */
    public String getAssetType() {
        return this.assetType;
    }

    /**
     * @return databaseSchema
     */
    public String getDatabaseSchema() {
        return this.databaseSchema;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return loginAttribute
     */
    public String getLoginAttribute() {
        return this.loginAttribute;
    }

    /**
     * @return operationMode
     */
    public String getOperationMode() {
        return this.operationMode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ssoClient
     */
    public String getSsoClient() {
        return this.ssoClient;
    }

    public static final class Builder extends Request.Builder<GenerateAssetOperationTokenRequest, Builder> {
        private String assetAccountId; 
        private String assetAccountName; 
        private String assetAccountPassword; 
        private String assetAccountProtocolName; 
        private String assetId; 
        private String assetType; 
        private String databaseSchema; 
        private String instanceId; 
        private String loginAttribute; 
        private String operationMode; 
        private String regionId; 
        private String ssoClient; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAssetOperationTokenRequest request) {
            super(request);
            this.assetAccountId = request.assetAccountId;
            this.assetAccountName = request.assetAccountName;
            this.assetAccountPassword = request.assetAccountPassword;
            this.assetAccountProtocolName = request.assetAccountProtocolName;
            this.assetId = request.assetId;
            this.assetType = request.assetType;
            this.databaseSchema = request.databaseSchema;
            this.instanceId = request.instanceId;
            this.loginAttribute = request.loginAttribute;
            this.operationMode = request.operationMode;
            this.regionId = request.regionId;
            this.ssoClient = request.ssoClient;
        } 

        /**
         * <p>The ID of the account whose assets the O&amp;M token takes effect.</p>
         * <blockquote>
         * <p> You must specify at least one of the following parameters: AssetAccountId and AssetAccountName. If you specify both parameters, AssetAccountId takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder assetAccountId(String assetAccountId) {
            this.putQueryParameter("AssetAccountId", assetAccountId);
            this.assetAccountId = assetAccountId;
            return this;
        }

        /**
         * <p>The name of the host account. If you use a custom account, enter a real account name.</p>
         * <blockquote>
         * <p> When both AssetAccountId and AssetAccountName are specified, AssetAccountId takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder assetAccountName(String assetAccountName) {
            this.putQueryParameter("AssetAccountName", assetAccountName);
            this.assetAccountName = assetAccountName;
            return this;
        }

        /**
         * <p>The Base64-encoded password. This parameter is required if you want to apply for an O&amp;M token for a custom account.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdHBhc3N3b3Jk</p>
         */
        public Builder assetAccountPassword(String assetAccountPassword) {
            this.putQueryParameter("AssetAccountPassword", assetAccountPassword);
            this.assetAccountPassword = assetAccountPassword;
            return this;
        }

        /**
         * <p>The name of the protocol. Valid values:</p>
         * <ul>
         * <li>SSH</li>
         * <li>RDP</li>
         * <li>Oracle</li>
         * <li>PostgreSQL</li>
         * <li>MySQL</li>
         * <li>SQLServer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder assetAccountProtocolName(String assetAccountProtocolName) {
            this.putQueryParameter("AssetAccountProtocolName", assetAccountProtocolName);
            this.assetAccountProtocolName = assetAccountProtocolName;
            return this;
        }

        /**
         * <p>The ID of the asset for which you want to apply for an O&amp;M token.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder assetId(String assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * <p>The type of the asset for which you want to apply for an O&amp;M token. Valid values:</p>
         * <ul>
         * <li><strong>Host</strong></li>
         * <li><strong>Database</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Host</p>
         */
        public Builder assetType(String assetType) {
            this.putQueryParameter("AssetType", assetType);
            this.assetType = assetType;
            return this;
        }

        /**
         * DatabaseSchema.
         */
        public Builder databaseSchema(String databaseSchema) {
            this.putQueryParameter("DatabaseSchema", databaseSchema);
            this.databaseSchema = databaseSchema;
            return this;
        }

        /**
         * <p>The ID of the bastion host for which you want to apply an O&amp;M token.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the ID of the bastion host.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LoginAttribute.
         */
        public Builder loginAttribute(String loginAttribute) {
            this.putQueryParameter("LoginAttribute", loginAttribute);
            this.loginAttribute = loginAttribute;
            return this;
        }

        /**
         * OperationMode.
         */
        public Builder operationMode(String operationMode) {
            this.putQueryParameter("OperationMode", operationMode);
            this.operationMode = operationMode;
            return this;
        }

        /**
         * <p>The region ID of the bastion host.</p>
         * <blockquote>
         * <p> For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
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
         * SsoClient.
         */
        public Builder ssoClient(String ssoClient) {
            this.putQueryParameter("SsoClient", ssoClient);
            this.ssoClient = ssoClient;
            return this;
        }

        @Override
        public GenerateAssetOperationTokenRequest build() {
            return new GenerateAssetOperationTokenRequest(this);
        } 

    } 

}
