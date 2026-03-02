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
 * {@link NeuronAppUnBindCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppUnBindCmd</p>
 */
public class NeuronAppUnBindCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appId;

    @com.aliyun.core.annotation.NameInMap("reason")
    private String reason;

    private NeuronAppUnBindCmd(Builder builder) {
        this.appId = builder.appId;
        this.reason = builder.reason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppUnBindCmd create() {
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

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    public static final class Builder {
        private Long appId; 
        private String reason; 

        private Builder() {
        } 

        private Builder(NeuronAppUnBindCmd model) {
            this.appId = model.appId;
            this.reason = model.reason;
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

        /**
         * reason.
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        public NeuronAppUnBindCmd build() {
            return new NeuronAppUnBindCmd(this);
        } 

    } 

}
