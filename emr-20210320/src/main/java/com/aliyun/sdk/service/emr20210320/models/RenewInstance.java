// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewInstance} extends {@link TeaModel}
 *
 * <p>RenewInstance</p>
 */
public class RenewInstance extends TeaModel {
    @NameInMap("EmrRenewDuration")
    private Integer emrRenewDuration;

    @NameInMap("EmrRenewDurationUnit")
    private String emrRenewDurationUnit;

    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("RenewDuration")
    private Integer renewDuration;

    @NameInMap("RenewDurationUnit")
    private String renewDurationUnit;

    private RenewInstance(Builder builder) {
        this.emrRenewDuration = builder.emrRenewDuration;
        this.emrRenewDurationUnit = builder.emrRenewDurationUnit;
        this.instanceId = builder.instanceId;
        this.renewDuration = builder.renewDuration;
        this.renewDurationUnit = builder.renewDurationUnit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RenewInstance create() {
        return builder().build();
    }

    /**
     * @return emrRenewDuration
     */
    public Integer getEmrRenewDuration() {
        return this.emrRenewDuration;
    }

    /**
     * @return emrRenewDurationUnit
     */
    public String getEmrRenewDurationUnit() {
        return this.emrRenewDurationUnit;
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
    public Integer getRenewDuration() {
        return this.renewDuration;
    }

    /**
     * @return renewDurationUnit
     */
    public String getRenewDurationUnit() {
        return this.renewDurationUnit;
    }

    public static final class Builder {
        private Integer emrRenewDuration; 
        private String emrRenewDurationUnit; 
        private String instanceId; 
        private Integer renewDuration; 
        private String renewDurationUnit; 

        /**
         * emr实例续费时长。
         */
        public Builder emrRenewDuration(Integer emrRenewDuration) {
            this.emrRenewDuration = emrRenewDuration;
            return this;
        }

        /**
         * emr实例续费时长单位。
         */
        public Builder emrRenewDurationUnit(String emrRenewDurationUnit) {
            this.emrRenewDurationUnit = emrRenewDurationUnit;
            return this;
        }

        /**
         * 节点ID。
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 续费时长。
         */
        public Builder renewDuration(Integer renewDuration) {
            this.renewDuration = renewDuration;
            return this;
        }

        /**
         * 付费时长单位。
         */
        public Builder renewDurationUnit(String renewDurationUnit) {
            this.renewDurationUnit = renewDurationUnit;
            return this;
        }

        public RenewInstance build() {
            return new RenewInstance(this);
        } 

    } 

}
