// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ScalingActivityResultDTO} extends {@link TeaModel}
 *
 * <p>ScalingActivityResultDTO</p>
 */
public class ScalingActivityResultDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    private ScalingActivityResultDTO(Builder builder) {
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingActivityResultDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder {
        private String instanceId; 

        private Builder() {
        } 

        private Builder(ScalingActivityResultDTO model) {
            this.instanceId = model.instanceId;
        } 

        /**
         * <p>实例ID。</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        public ScalingActivityResultDTO build() {
            return new ScalingActivityResultDTO(this);
        } 

    } 

}
