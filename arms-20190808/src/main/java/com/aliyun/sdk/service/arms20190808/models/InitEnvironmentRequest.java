// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link InitEnvironmentRequest} extends {@link RequestModel}
 *
 * <p>InitEnvironmentRequest</p>
 */
public class InitEnvironmentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunLang")
    private String aliyunLang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateAuthToken")
    private Boolean createAuthToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ManagedType")
    private String managedType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private InitEnvironmentRequest(Builder builder) {
        super(builder);
        this.aliyunLang = builder.aliyunLang;
        this.createAuthToken = builder.createAuthToken;
        this.environmentId = builder.environmentId;
        this.managedType = builder.managedType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitEnvironmentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunLang
     */
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    /**
     * @return createAuthToken
     */
    public Boolean getCreateAuthToken() {
        return this.createAuthToken;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return managedType
     */
    public String getManagedType() {
        return this.managedType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<InitEnvironmentRequest, Builder> {
        private String aliyunLang; 
        private Boolean createAuthToken; 
        private String environmentId; 
        private String managedType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InitEnvironmentRequest request) {
            super(request);
            this.aliyunLang = request.aliyunLang;
            this.createAuthToken = request.createAuthToken;
            this.environmentId = request.environmentId;
            this.managedType = request.managedType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The language. Valid values: zh and en. Default value: zh.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder aliyunLang(String aliyunLang) {
            this.putQueryParameter("AliyunLang", aliyunLang);
            this.aliyunLang = aliyunLang;
            return this;
        }

        /**
         * <p>Specifies whether to create a token to improve data security.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder createAuthToken(Boolean createAuthToken) {
            this.putQueryParameter("CreateAuthToken", createAuthToken);
            this.createAuthToken = createAuthToken;
            return this;
        }

        /**
         * <p>The ID of the environment instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>Whether agents or exporters are managed. Valid values:</p>
         * <ul>
         * <li>none: No. By default, no managed agents or exporters are provided for ACK clusters.</li>
         * <li>agent: Agents are managed. By default, managed agents are provided for ASK clusters, ACS clusters, and ACK One clusters.</li>
         * <li>agent-exproter: Agents and exporters are managed. By default, managed agents and exporters are provided for cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>agent</p>
         */
        public Builder managedType(String managedType) {
            this.putQueryParameter("ManagedType", managedType);
            this.managedType = managedType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public InitEnvironmentRequest build() {
            return new InitEnvironmentRequest(this);
        } 

    } 

}
