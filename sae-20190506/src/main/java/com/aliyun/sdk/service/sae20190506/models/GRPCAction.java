// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link GRPCAction} extends {@link TeaModel}
 *
 * <p>GRPCAction</p>
 */
public class GRPCAction extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("port")
    private Integer port;

    @com.aliyun.core.annotation.NameInMap("service")
    private String service;

    private GRPCAction(Builder builder) {
        this.port = builder.port;
        this.service = builder.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GRPCAction create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return port
     */
    public Integer getPort() {
        return this.port;
    }

    /**
     * @return service
     */
    public String getService() {
        return this.service;
    }

    public static final class Builder {
        private Integer port; 
        private String service; 

        private Builder() {
        } 

        private Builder(GRPCAction model) {
            this.port = model.port;
            this.service = model.service;
        } 

        /**
         * port.
         */
        public Builder port(Integer port) {
            this.port = port;
            return this;
        }

        /**
         * service.
         */
        public Builder service(String service) {
            this.service = service;
            return this;
        }

        public GRPCAction build() {
            return new GRPCAction(this);
        } 

    } 

}
