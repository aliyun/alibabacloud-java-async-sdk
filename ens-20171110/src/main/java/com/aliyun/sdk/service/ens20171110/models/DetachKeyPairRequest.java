// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DetachKeyPairRequest} extends {@link RequestModel}
 *
 * <p>DetachKeyPairRequest</p>
 */
public class DetachKeyPairRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairId")
    private String keyPairId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    private String keyPairName;

    private DetachKeyPairRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.keyPairId = builder.keyPairId;
        this.keyPairName = builder.keyPairName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachKeyPairRequest create() {
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

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public static final class Builder extends Request.Builder<DetachKeyPairRequest, Builder> {
        private java.util.List<String> instanceIds; 
        private String keyPairId; 
        private String keyPairName; 

        private Builder() {
            super();
        } 

        private Builder(DetachKeyPairRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.keyPairId = request.keyPairId;
            this.keyPairName = request.keyPairName;
        } 

        /**
         * <p>The instance IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-50f8q9mbfjzlkuk9znjglnne3&quot;]</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The key pair ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ssh-xxx</p>
         */
        public Builder keyPairId(String keyPairId) {
            this.putQueryParameter("KeyPairId", keyPairId);
            this.keyPairId = keyPairId;
            return this;
        }

        /**
         * <p>The name of the SSH key pair.</p>
         * 
         * <strong>example:</strong>
         * <p>test-kp</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        @Override
        public DetachKeyPairRequest build() {
            return new DetachKeyPairRequest(this);
        } 

    } 

}
