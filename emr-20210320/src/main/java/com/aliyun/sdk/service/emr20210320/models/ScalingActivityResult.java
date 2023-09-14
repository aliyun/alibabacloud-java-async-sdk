// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingActivityResult} extends {@link TeaModel}
 *
 * <p>ScalingActivityResult</p>
 */
public class ScalingActivityResult extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    private ScalingActivityResult(Builder builder) {
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingActivityResult create() {
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

        public ScalingActivityResult build() {
            return new ScalingActivityResult(this);
        } 

    } 

}
