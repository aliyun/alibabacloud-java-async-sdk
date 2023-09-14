// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstanceParam} extends {@link TeaModel}
 *
 * <p>RenewInstanceParam</p>
 */
public class RenewInstanceParam extends TeaModel {
    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RenewDuration")
    private Long renewDuration;

    @NameInMap("RenewDurationUnit")
    private String renewDurationUnit;

    private RenewInstanceParam(Builder builder) {
        this.instanceId = builder.instanceId;
        this.renewDuration = builder.renewDuration;
        this.renewDurationUnit = builder.renewDurationUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstanceParam create() {
        return builder().build();
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return renewDuration
     */
    public Long getRenewDuration() {
        return this.renewDuration;
    }

    /**
     * @return renewDurationUnit
     */
    public String getRenewDurationUnit() {
        return this.renewDurationUnit;
    }

    public static final class Builder {
        private String instanceId; 
        private Long renewDuration; 
        private String renewDurationUnit; 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RenewDuration.
         */
        public Builder renewDuration(Long renewDuration) {
            this.renewDuration = renewDuration;
            return this;
        }

        /**
         * RenewDurationUnit.
         */
        public Builder renewDurationUnit(String renewDurationUnit) {
            this.renewDurationUnit = renewDurationUnit;
            return this;
        }

        public RenewInstanceParam build() {
            return new RenewInstanceParam(this);
        } 

    } 

}
