// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingActivityResultDTO} extends {@link TeaModel}
 *
 * <p>ScalingActivityResultDTO</p>
 */
public class ScalingActivityResultDTO extends TeaModel {
    @NameInMap("InstanceId")
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

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder {
        private String instanceId; 

        /**
         * 实例ID。
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
