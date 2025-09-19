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
 * {@link DeleteAttackPathSensitiveAssetConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteAttackPathSensitiveAssetConfigRequest</p>
 */
public class DeleteAttackPathSensitiveAssetConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackPathSensitiveAssetConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attackPathSensitiveAssetConfigId;

    private DeleteAttackPathSensitiveAssetConfigRequest(Builder builder) {
        super(builder);
        this.attackPathSensitiveAssetConfigId = builder.attackPathSensitiveAssetConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAttackPathSensitiveAssetConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAttackPathSensitiveAssetConfigRequest, Builder> {
        private String attackPathSensitiveAssetConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAttackPathSensitiveAssetConfigRequest request) {
            super(request);
            this.attackPathSensitiveAssetConfigId = request.attackPathSensitiveAssetConfigId;
        } 

        /**
         * <p>ID of the attack path sensitive asset configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apsac-123</p>
         */
        public Builder attackPathSensitiveAssetConfigId(String attackPathSensitiveAssetConfigId) {
            this.putQueryParameter("AttackPathSensitiveAssetConfigId", attackPathSensitiveAssetConfigId);
            this.attackPathSensitiveAssetConfigId = attackPathSensitiveAssetConfigId;
            return this;
        }

        @Override
        public DeleteAttackPathSensitiveAssetConfigRequest build() {
            return new DeleteAttackPathSensitiveAssetConfigRequest(this);
        } 

    } 

}
