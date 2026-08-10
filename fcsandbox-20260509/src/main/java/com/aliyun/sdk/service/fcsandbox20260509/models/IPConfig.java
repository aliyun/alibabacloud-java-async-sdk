// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link IPConfig} extends {@link TeaModel}
 *
 * <p>IPConfig</p>
 */
public class IPConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ipAddress")
    private String ipAddress;

    private IPConfig(Builder builder) {
        this.description = builder.description;
        this.ipAddress = builder.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IPConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    public static final class Builder {
        private String description; 
        private String ipAddress; 

        private Builder() {
        } 

        private Builder(IPConfig model) {
            this.description = model.description;
            this.ipAddress = model.ipAddress;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * ipAddress.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public IPConfig build() {
            return new IPConfig(this);
        } 

    } 

}
