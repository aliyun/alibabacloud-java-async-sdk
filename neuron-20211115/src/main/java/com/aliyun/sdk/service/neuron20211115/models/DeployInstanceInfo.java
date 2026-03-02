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
 * {@link DeployInstanceInfo} extends {@link TeaModel}
 *
 * <p>DeployInstanceInfo</p>
 */
public class DeployInstanceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ip")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ip;

    @com.aliyun.core.annotation.NameInMap("status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private DeployInstanceInfo(Builder builder) {
        this.ip = builder.ip;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeployInstanceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String ip; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeployInstanceInfo model) {
            this.ip = model.ip;
            this.status = model.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.1.1.1</p>
         */
        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EXECUTING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeployInstanceInfo build() {
            return new DeployInstanceInfo(this);
        } 

    } 

}
