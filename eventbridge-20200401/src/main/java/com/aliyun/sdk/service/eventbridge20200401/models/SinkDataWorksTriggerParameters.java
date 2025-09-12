// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link SinkDataWorksTriggerParameters} extends {@link TeaModel}
 *
 * <p>SinkDataWorksTriggerParameters</p>
 */
public class SinkDataWorksTriggerParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    private SinkDataWorksTriggerParameters(Builder builder) {
        this.enable = builder.enable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SinkDataWorksTriggerParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    public static final class Builder {
        private String enable; 

        private Builder() {
        } 

        private Builder(SinkDataWorksTriggerParameters model) {
            this.enable = model.enable;
        } 

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.enable = enable;
            return this;
        }

        public SinkDataWorksTriggerParameters build() {
            return new SinkDataWorksTriggerParameters(this);
        } 

    } 

}
