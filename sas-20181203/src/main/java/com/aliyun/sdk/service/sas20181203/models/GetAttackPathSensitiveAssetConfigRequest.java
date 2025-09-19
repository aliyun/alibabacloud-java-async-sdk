// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAttackPathSensitiveAssetConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAttackPathSensitiveAssetConfigRequest</p>
 */
public class GetAttackPathSensitiveAssetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathSensitiveAssetConfigId")
    private String attackPathSensitiveAssetConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configType;

    private GetAttackPathSensitiveAssetConfigRequest(Builder builder) {
        super(builder);
        this.attackPathSensitiveAssetConfigId = builder.attackPathSensitiveAssetConfigId;
        this.configType = builder.configType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttackPathSensitiveAssetConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackPathSensitiveAssetConfigId
     */
    public String getAttackPathSensitiveAssetConfigId() {
        return this.attackPathSensitiveAssetConfigId;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    public static final class Builder extends Request.Builder<GetAttackPathSensitiveAssetConfigRequest, Builder> {
        private String attackPathSensitiveAssetConfigId; 
        private String configType; 

        private Builder() {
            super();
        } 

        private Builder(GetAttackPathSensitiveAssetConfigRequest request) {
            super(request);
            this.attackPathSensitiveAssetConfigId = request.attackPathSensitiveAssetConfigId;
            this.configType = request.configType;
        } 

        /**
         * <p>ID of the created attack path sensitive asset setting.</p>
         * 
         * <strong>example:</strong>
         * <p>apsac-123</p>
         */
        public Builder attackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
            this.putQueryParameter("AttackPathSensitiveAssetConfigId", attackPathSensitiveAssetConfigId);
            this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
            return this;
        }

        /**
         * <p>Configuration type. Possible values:</p>
         * <ul>
         * <li>asset_instance: Asset.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asset_instance</p>
         */
        public Builder configType(String configType) {
            this.putQueryParameter("ConfigType", configType);
            this.configType = configType;
            return this;
        }

        @Override
        public GetAttackPathSensitiveAssetConfigRequest build() {
            return new GetAttackPathSensitiveAssetConfigRequest(this);
        } 

    } 

}
