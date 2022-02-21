// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingTaskGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyScalingTaskGroupResponseBody</p>
 */
public class ModifyScalingTaskGroupResponseBody extends TeaModel {
    @NameInMap("HostGroupId")
    private String hostGroupId;

    private ModifyScalingTaskGroupResponseBody(Builder builder) {
        this.hostGroupId = builder.hostGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingTaskGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostGroupId
     */
    public String getHostGroupId() {
        return this.hostGroupId;
    }

    public static final class Builder {
        private String hostGroupId; 

        /**
         * HostGroupId.
         */
        public Builder hostGroupId(String hostGroupId) {
            this.hostGroupId = hostGroupId;
            return this;
        }

        public ModifyScalingTaskGroupResponseBody build() {
            return new ModifyScalingTaskGroupResponseBody(this);
        } 

    } 

}
