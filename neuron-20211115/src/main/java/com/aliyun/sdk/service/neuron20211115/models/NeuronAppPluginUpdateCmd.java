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
 * {@link NeuronAppPluginUpdateCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppPluginUpdateCmd</p>
 */
public class NeuronAppPluginUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    @com.aliyun.core.annotation.Validation(required = true)
    private MobiPluginConfig config;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    private NeuronAppPluginUpdateCmd(Builder builder) {
        this.config = builder.config;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppPluginUpdateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public MobiPluginConfig getConfig() {
        return this.config;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    public static final class Builder {
        private MobiPluginConfig config; 
        private Long id; 

        private Builder() {
        } 

        private Builder(NeuronAppPluginUpdateCmd model) {
            this.config = model.config;
            this.id = model.id;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder config(MobiPluginConfig config) {
            this.config = config;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public NeuronAppPluginUpdateCmd build() {
            return new NeuronAppPluginUpdateCmd(this);
        } 

    } 

}
