// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateClientsRequest} extends {@link RequestModel}
 *
 * <p>CreateClientsRequest</p>
 */
public class CreateClientsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertSetting")
    private String alertSetting;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientInfo")
    private String clientInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
    private String crossAccountRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountType")
    private String crossAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
    private Long crossAccountUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseHttps")
    private Boolean useHttps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vaultId;

    private CreateClientsRequest(Builder builder) {
        super(builder);
        this.alertSetting = builder.alertSetting;
        this.clientInfo = builder.clientInfo;
        this.crossAccountRoleName = builder.crossAccountRoleName;
        this.crossAccountType = builder.crossAccountType;
        this.crossAccountUserId = builder.crossAccountUserId;
        this.resourceGroupId = builder.resourceGroupId;
        this.useHttps = builder.useHttps;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertSetting
     */
    public String getAlertSetting() {
        return this.alertSetting;
    }

    /**
     * @return clientInfo
     */
    public String getClientInfo() {
        return this.clientInfo;
    }

    /**
     * @return crossAccountRoleName
     */
    public String getCrossAccountRoleName() {
        return this.crossAccountRoleName;
    }

    /**
     * @return crossAccountType
     */
    public String getCrossAccountType() {
        return this.crossAccountType;
    }

    /**
     * @return crossAccountUserId
     */
    public Long getCrossAccountUserId() {
        return this.crossAccountUserId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return useHttps
     */
    public Boolean getUseHttps() {
        return this.useHttps;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<CreateClientsRequest, Builder> {
        private String alertSetting; 
        private String clientInfo; 
        private String crossAccountRoleName; 
        private String crossAccountType; 
        private Long crossAccountUserId; 
        private String resourceGroupId; 
        private Boolean useHttps; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientsRequest request) {
            super(request);
            this.alertSetting = request.alertSetting;
            this.clientInfo = request.clientInfo;
            this.crossAccountRoleName = request.crossAccountRoleName;
            this.crossAccountType = request.crossAccountType;
            this.crossAccountUserId = request.crossAccountUserId;
            this.resourceGroupId = request.resourceGroupId;
            this.useHttps = request.useHttps;
            this.vaultId = request.vaultId;
        } 

        /**
         * <p>The alert settings. Valid value: INHERITED, which indicates that the HBR client sends alert notifications by using the same method configured for the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>INHERITED</p>
         */
        public Builder alertSetting(String alertSetting) {
            this.putQueryParameter("AlertSetting", alertSetting);
            this.alertSetting = alertSetting;
            return this;
        }

        /**
         * <p>The installation information of the HBR clients.</p>
         * 
         * <strong>example:</strong>
         * <p>[  {    &quot;instanceId&quot;: &quot;i-bp116lr<strong><strong><strong>te9q2&quot;,    &quot;accessKeyId&quot;: &quot;&quot;,    &quot;accessKeySecret&quot;: &quot;&quot;,    &quot;clusterId&quot;: &quot;cl-000csy09q</strong></strong></strong>9rfz9&quot;,    &quot;sourceTypes&quot;: [      &quot;HANA&quot;    ]  },  {    &quot;instanceId&quot;: &quot;i-bp116lrux******hte9q4&quot;,    &quot;accessKeyId&quot;: &quot;&quot;,    &quot;accessKeySecret&quot;: &quot;&quot;,    &quot;clusterId&quot;: &quot;cl-000csy09q5094vw9rfz9&quot;,    &quot;sourceTypes&quot;: [      &quot;HANA&quot;    ]  }]</p>
         */
        public Builder clientInfo(String clientInfo) {
            this.putQueryParameter("ClientInfo", clientInfo);
            this.clientInfo = clientInfo;
            return this;
        }

        /**
         * <p>The name of the Resource Access Management (RAM) role that is created within the source Alibaba Cloud account and assigned to the current Alibaba Cloud account to authorize the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>hbrcrossrole</p>
         */
        public Builder crossAccountRoleName(String crossAccountRoleName) {
            this.putQueryParameter("CrossAccountRoleName", crossAccountRoleName);
            this.crossAccountRoleName = crossAccountRoleName;
            return this;
        }

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>SELF_ACCOUNT</strong>: Data is backed up within the same Alibaba Cloud account.</li>
         * <li><strong>CROSS_ACCOUNT</strong>: Data is backed up across Alibaba Cloud accounts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CROSS_ACCOUNT</p>
         */
        public Builder crossAccountType(String crossAccountType) {
            this.putQueryParameter("CrossAccountType", crossAccountType);
            this.crossAccountType = crossAccountType;
            return this;
        }

        /**
         * <p>The ID of the source Alibaba Cloud account that authorizes the current Alibaba Cloud account to back up data across Alibaba Cloud accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>158975xxxxx4625</p>
         */
        public Builder crossAccountUserId(Long crossAccountUserId) {
            this.putQueryParameter("CrossAccountUserId", crossAccountUserId);
            this.crossAccountUserId = crossAccountUserId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvx7d3c4kpny</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to transmit data over HTTPS. Valid values:</p>
         * <ul>
         * <li>true: transmits data over HTTPS.</li>
         * <li>false: transmits data over HTTP.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useHttps(Boolean useHttps) {
            this.putQueryParameter("UseHttps", useHttps);
            this.useHttps = useHttps;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0001ufe******kgm</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public CreateClientsRequest build() {
            return new CreateClientsRequest(this);
        } 

    } 

}
