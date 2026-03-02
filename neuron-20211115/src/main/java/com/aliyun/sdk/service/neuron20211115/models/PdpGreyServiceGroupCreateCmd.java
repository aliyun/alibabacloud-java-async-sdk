// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PdpGreyServiceGroupCreateCmd} extends {@link TeaModel}
 *
 * <p>PdpGreyServiceGroupCreateCmd</p>
 */
public class PdpGreyServiceGroupCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    @com.aliyun.core.annotation.Validation(required = true)
    private String env;

    @com.aliyun.core.annotation.NameInMap("serviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long serviceId;

    private PdpGreyServiceGroupCreateCmd(Builder builder) {
        this.env = builder.env;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PdpGreyServiceGroupCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String env; 
        private Long serviceId; 

        private Builder() {
        } 

        private Builder(PdpGreyServiceGroupCreateCmd model) {
            this.env = model.env;
            this.serviceId = model.serviceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TEST</p>
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public PdpGreyServiceGroupCreateCmd build() {
            return new PdpGreyServiceGroupCreateCmd(this);
        } 

    } 

}
