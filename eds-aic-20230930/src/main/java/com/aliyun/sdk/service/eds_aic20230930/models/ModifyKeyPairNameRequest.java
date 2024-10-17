// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyKeyPairNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyKeyPairNameRequest</p>
 */
public class ModifyKeyPairNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewKeyPairName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newKeyPairName;

    private ModifyKeyPairNameRequest(Builder builder) {
        super(builder);
        this.keyPairId = builder.keyPairId;
        this.newKeyPairName = builder.newKeyPairName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyKeyPairNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    /**
     * @return newKeyPairName
     */
    public String getNewKeyPairName() {
        return this.newKeyPairName;
    }

    public static final class Builder extends Request.Builder<ModifyKeyPairNameRequest, Builder> {
        private String keyPairId; 
        private String newKeyPairName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyKeyPairNameRequest request) {
            super(request);
            this.keyPairId = request.keyPairId;
            this.newKeyPairName = request.newKeyPairName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kp-6v2q33ae4tw3a****</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>newKeyPairName</p>
         */
        public Builder newKeyPairName(String newKeyPairName) {
            this.putQueryParameter("NewKeyPairName", newKeyPairName);
            this.newKeyPairName = newKeyPairName;
            return this;
        }

        @Override
        public ModifyKeyPairNameRequest build() {
            return new ModifyKeyPairNameRequest(this);
        } 

    } 

}
