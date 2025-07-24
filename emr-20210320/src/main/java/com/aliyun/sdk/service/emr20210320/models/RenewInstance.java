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
 * {@link RenewInstance} extends {@link TeaModel}
 *
 * <p>RenewInstance</p>
 */
public class RenewInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EmrRenewDuration")
    private Integer emrRenewDuration;

    @com.aliyun.core.annotation.NameInMap("EmrRenewDurationUnit")
    private String emrRenewDurationUnit;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RenewDuration")
    private Integer renewDuration;

    @com.aliyun.core.annotation.NameInMap("RenewDurationUnit")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RenewInstance model) {
            this.emrRenewDuration = model.emrRenewDuration;
            this.emrRenewDurationUnit = model.emrRenewDurationUnit;
            this.instanceId = model.instanceId;
            this.renewDuration = model.renewDuration;
            this.renewDurationUnit = model.renewDurationUnit;
        } 

        /**
         * <p>emr实例续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder emrRenewDuration(Integer emrRenewDuration) {
            this.emrRenewDuration = emrRenewDuration;
            return this;
        }

        /**
         * <p>emr实例续费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder emrRenewDurationUnit(String emrRenewDurationUnit) {
            this.emrRenewDurationUnit = emrRenewDurationUnit;
            return this;
        }

        /**
         * <p>节点ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1cudc25w2bfwl5****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>续费时长。</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder renewDuration(Integer renewDuration) {
            this.renewDuration = renewDuration;
            return this;
        }

        /**
         * <p>付费时长单位。</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
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
