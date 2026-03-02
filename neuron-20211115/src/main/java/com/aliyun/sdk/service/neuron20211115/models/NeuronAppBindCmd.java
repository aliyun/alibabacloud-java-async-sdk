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
 * {@link NeuronAppBindCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppBindCmd</p>
 */
public class NeuronAppBindCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    private NeuronAppBindCmd(Builder builder) {
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppBindCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public Long getAppId() {
        return this.appId;
    }

    public static final class Builder {
        private Long appId; 

        private Builder() {
        } 

        private Builder(NeuronAppBindCmd model) {
            this.appId = model.appId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appId(Long appId) {
            this.appId = appId;
            return this;
        }

        public NeuronAppBindCmd build() {
            return new NeuronAppBindCmd(this);
        } 

    } 

}
