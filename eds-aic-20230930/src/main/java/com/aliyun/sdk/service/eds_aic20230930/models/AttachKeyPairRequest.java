// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link AttachKeyPairRequest} extends {@link RequestModel}
 *
 * <p>AttachKeyPairRequest</p>
 */
public class AttachKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyPairId;

    private AttachKeyPairRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.keyPairId = builder.keyPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachKeyPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return keyPairId
     */
    public String getKeyPairId() {
        return this.keyPairId;
    }

    public static final class Builder extends Request.Builder<AttachKeyPairRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private String keyPairId; 

        private Builder() {
            super();
        } 

        private Builder(AttachKeyPairRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.keyPairId = request.keyPairId;
        } 

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
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

        @Override
        public AttachKeyPairRequest build() {
            return new AttachKeyPairRequest(this);
        } 

    } 

}
