// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.brain_industrial20200920.models;

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
 * {@link ActivateLicenseRequest} extends {@link RequestModel}
 *
 * <p>ActivateLicenseRequest</p>
 */
public class ActivateLicenseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    private ActivateLicenseRequest(Builder builder) {
        super(builder);
        this.fingerprint = builder.fingerprint;
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateLicenseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    public static final class Builder extends Request.Builder<ActivateLicenseRequest, Builder> {
        private String fingerprint; 
        private String id; 
        private String instanceId; 
        private String orderId; 

        private Builder() {
            super();
        } 

        private Builder(ActivateLicenseRequest request) {
            super(request);
            this.fingerprint = request.fingerprint;
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
        } 

        /**
         * Fingerprint.
         */
        public Builder fingerprint(String fingerprint) {
            this.putBodyParameter("Fingerprint", fingerprint);
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>ID</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.putBodyParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        @Override
        public ActivateLicenseRequest build() {
            return new ActivateLicenseRequest(this);
        } 

    } 

}
