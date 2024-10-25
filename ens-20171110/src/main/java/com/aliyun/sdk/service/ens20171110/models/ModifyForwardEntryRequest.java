// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardEntryRequest</p>
 */
public class ModifyForwardEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String forwardEntryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String forwardEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535)
    private Integer healthCheckPort;

    private ModifyForwardEntryRequest(Builder builder) {
        super(builder);
        this.forwardEntryId = builder.forwardEntryId;
        this.forwardEntryName = builder.forwardEntryName;
        this.healthCheckPort = builder.healthCheckPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyForwardEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forwardEntryId
     */
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    /**
     * @return forwardEntryName
     */
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    /**
     * @return healthCheckPort
     */
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    public static final class Builder extends Request.Builder<ModifyForwardEntryRequest, Builder> {
        private String forwardEntryId; 
        private String forwardEntryName; 
        private Integer healthCheckPort; 

        private Builder() {
            super();
        } 

        private Builder(ModifyForwardEntryRequest request) {
            super(request);
            this.forwardEntryId = request.forwardEntryId;
            this.forwardEntryName = request.forwardEntryName;
            this.healthCheckPort = request.healthCheckPort;
        } 

        /**
         * <p>The ID of the DNAT entry.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dnat-5tfjp3537mi6iokl59g5c****</p>
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * <p>The name of the DNAT entry. The name must be 2 to 128 characters in length. It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>test0</p>
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * <p>The probe port. The port must be within the internal port range. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putQueryParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        @Override
        public ModifyForwardEntryRequest build() {
            return new ModifyForwardEntryRequest(this);
        } 

    } 

}
