// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link RiskSceneConfig} extends {@link TeaModel}
 *
 * <p>RiskSceneConfig</p>
 */
public class RiskSceneConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DetectChannel")
    private java.util.List<String> detectChannel;

    @com.aliyun.core.annotation.NameInMap("OfficeChannel")
    private java.util.List<String> officeChannel;

    private RiskSceneConfig(Builder builder) {
        this.detectChannel = builder.detectChannel;
        this.officeChannel = builder.officeChannel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RiskSceneConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return detectChannel
     */
    public java.util.List<String> getDetectChannel() {
        return this.detectChannel;
    }

    /**
     * @return officeChannel
     */
    public java.util.List<String> getOfficeChannel() {
        return this.officeChannel;
    }

    public static final class Builder {
        private java.util.List<String> detectChannel; 
        private java.util.List<String> officeChannel; 

        private Builder() {
        } 

        private Builder(RiskSceneConfig model) {
            this.detectChannel = model.detectChannel;
            this.officeChannel = model.officeChannel;
        } 

        /**
         * DetectChannel.
         */
        public Builder detectChannel(java.util.List<String> detectChannel) {
            this.detectChannel = detectChannel;
            return this;
        }

        /**
         * OfficeChannel.
         */
        public Builder officeChannel(java.util.List<String> officeChannel) {
            this.officeChannel = officeChannel;
            return this;
        }

        public RiskSceneConfig build() {
            return new RiskSceneConfig(this);
        } 

    } 

}
