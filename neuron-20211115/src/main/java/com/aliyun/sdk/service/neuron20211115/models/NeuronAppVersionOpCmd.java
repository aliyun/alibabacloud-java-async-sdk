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
 * {@link NeuronAppVersionOpCmd} extends {@link TeaModel}
 *
 * <p>NeuronAppVersionOpCmd</p>
 */
public class NeuronAppVersionOpCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("appVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appVersionId;

    private NeuronAppVersionOpCmd(Builder builder) {
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NeuronAppVersionOpCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appVersionId
     */
    public Long getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder {
        private Long appVersionId; 

        private Builder() {
        } 

        private Builder(NeuronAppVersionOpCmd model) {
            this.appVersionId = model.appVersionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder appVersionId(Long appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }

        public NeuronAppVersionOpCmd build() {
            return new NeuronAppVersionOpCmd(this);
        } 

    } 

}
