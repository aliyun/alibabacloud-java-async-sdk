// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyForwardEntryRequest} extends {@link RequestModel}
 *
 * <p>ModifyForwardEntryRequest</p>
 */
public class ModifyForwardEntryRequest extends Request {
    @Query
    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    private String forwardEntryId;

    @Query
    @NameInMap("ForwardEntryName")
    @Validation(maxLength = 128)
    private String forwardEntryName;

    @Query
    @NameInMap("HealthCheckPort")
    @Validation(maximum = 65535)
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
         * ForwardEntryId.
         */
        public Builder forwardEntryId(String forwardEntryId) {
            this.putQueryParameter("ForwardEntryId", forwardEntryId);
            this.forwardEntryId = forwardEntryId;
            return this;
        }

        /**
         * ForwardEntryName.
         */
        public Builder forwardEntryName(String forwardEntryName) {
            this.putQueryParameter("ForwardEntryName", forwardEntryName);
            this.forwardEntryName = forwardEntryName;
            return this;
        }

        /**
         * HealthCheckPort.
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
