// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link UpdateDataConnectorRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataConnectorRequest</p>
 */
public class UpdateDataConnectorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthConfigId")
    private String authConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthConfigProduct")
    private String authConfigProduct;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthConfigVendor")
    private String authConfigVendor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorConfig")
    private String dataConnectorConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataConnectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataConnectorStatus")
    private String dataConnectorStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private UpdateDataConnectorRequest(Builder builder) {
        super(builder);
        this.authConfigId = builder.authConfigId;
        this.authConfigProduct = builder.authConfigProduct;
        this.authConfigVendor = builder.authConfigVendor;
        this.dataConnectorConfig = builder.dataConnectorConfig;
        this.dataConnectorId = builder.dataConnectorId;
        this.dataConnectorStatus = builder.dataConnectorStatus;
        this.lang = builder.lang;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataConnectorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authConfigId
     */
    public String getAuthConfigId() {
        return this.authConfigId;
    }

    /**
     * @return authConfigProduct
     */
    public String getAuthConfigProduct() {
        return this.authConfigProduct;
    }

    /**
     * @return authConfigVendor
     */
    public String getAuthConfigVendor() {
        return this.authConfigVendor;
    }

    /**
     * @return dataConnectorConfig
     */
    public String getDataConnectorConfig() {
        return this.dataConnectorConfig;
    }

    /**
     * @return dataConnectorId
     */
    public String getDataConnectorId() {
        return this.dataConnectorId;
    }

    /**
     * @return dataConnectorStatus
     */
    public String getDataConnectorStatus() {
        return this.dataConnectorStatus;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<UpdateDataConnectorRequest, Builder> {
        private String authConfigId; 
        private String authConfigProduct; 
        private String authConfigVendor; 
        private String dataConnectorConfig; 
        private String dataConnectorId; 
        private String dataConnectorStatus; 
        private String lang; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataConnectorRequest request) {
            super(request);
            this.authConfigId = request.authConfigId;
            this.authConfigProduct = request.authConfigProduct;
            this.authConfigVendor = request.authConfigVendor;
            this.dataConnectorConfig = request.dataConnectorConfig;
            this.dataConnectorId = request.dataConnectorId;
            this.dataConnectorStatus = request.dataConnectorStatus;
            this.lang = request.lang;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
        } 

        /**
         * <p>The configuration item ID of the collector access object in the multi-cloud configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Opera20_Salesforce_Prod</p>
         */
        public Builder authConfigId(String authConfigId) {
            this.putBodyParameter("AuthConfigId", authConfigId);
            this.authConfigId = authConfigId;
            return this;
        }

        /**
         * <p>The cloud service to which the authentication configuration belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>salesForceRestAPI</p>
         */
        public Builder authConfigProduct(String authConfigProduct) {
            this.putBodyParameter("AuthConfigProduct", authConfigProduct);
            this.authConfigProduct = authConfigProduct;
            return this;
        }

        /**
         * <p>The authentication vendor name.</p>
         * 
         * <strong>example:</strong>
         * <p>SALESFORCE</p>
         */
        public Builder authConfigVendor(String authConfigVendor) {
            this.putBodyParameter("AuthConfigVendor", authConfigVendor);
            this.authConfigVendor = authConfigVendor;
            return this;
        }

        /**
         * <p>The configuration information of the collector.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;regionId\&quot;:\&quot;cn-hangzhou\&quot;,\&quot;bucket\&quot;:\&quot;actiontrail-logs-1481501495248334-d776c375\&quot;,\&quot;format\&quot;:{\&quot;type\&quot;:\&quot;JSON\&quot;},\&quot;encoding\&quot;:\&quot;UTF-8\&quot;,\&quot;compressFormat\&quot;:\&quot;autoDetect\&quot;,\&quot;interval\&quot;:\&quot;5m\&quot;}</p>
         */
        public Builder dataConnectorConfig(String dataConnectorConfig) {
            this.putBodyParameter("DataConnectorConfig", dataConnectorConfig);
            this.dataConnectorConfig = dataConnectorConfig;
            return this;
        }

        /**
         * <p>The collector ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dc-07423146117d77db266f78bc41f4fd80</p>
         */
        public Builder dataConnectorId(String dataConnectorId) {
            this.putBodyParameter("DataConnectorId", dataConnectorId);
            this.dataConnectorId = dataConnectorId;
            return this;
        }

        /**
         * <p>The status of the collector. Valid values:</p>
         * <ul>
         * <li>enabled: enabled.</li>
         * <li>disabled: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder dataConnectorStatus(String dataConnectorStatus) {
            this.putBodyParameter("DataConnectorStatus", dataConnectorStatus);
            this.dataConnectorStatus = dataConnectorStatus;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The data management center of the threat analysis feature. Specify this parameter based on the region where your assets reside. Valid values:</p>
         * <ul>
         * <li>cn-hangzhou: Your assets belong to the Chinese mainland and Hong Kong (China).</li>
         * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the member account that the administrator switches to.</p>
         * 
         * <strong>example:</strong>
         * <p>113091674488****</p>
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public UpdateDataConnectorRequest build() {
            return new UpdateDataConnectorRequest(this);
        } 

    } 

}
