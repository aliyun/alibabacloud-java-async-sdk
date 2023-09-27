// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExpertResourceSetting} extends {@link TeaModel}
 *
 * <p>ExpertResourceSetting</p>
 */
public class ExpertResourceSetting extends TeaModel {
    @NameInMap("jobmanagerResourceSettingSpec")
    private BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    @NameInMap("resourcePlan")
    private String resourcePlan;

    private ExpertResourceSetting(Builder builder) {
        this.jobmanagerResourceSettingSpec = builder.jobmanagerResourceSettingSpec;
        this.resourcePlan = builder.resourcePlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExpertResourceSetting create() {
        return builder().build();
    }

    /**
     * @return jobmanagerResourceSettingSpec
     */
    public BasicResourceSettingSpec getJobmanagerResourceSettingSpec() {
        return this.jobmanagerResourceSettingSpec;
    }

    /**
     * @return resourcePlan
     */
    public String getResourcePlan() {
        return this.resourcePlan;
    }

    public static final class Builder {
        private BasicResourceSettingSpec jobmanagerResourceSettingSpec; 
        private String resourcePlan; 

        /**
         * jobmanagerResourceSettingSpec.
         */
        public Builder jobmanagerResourceSettingSpec(BasicResourceSettingSpec jobmanagerResourceSettingSpec) {
            this.jobmanagerResourceSettingSpec = jobmanagerResourceSettingSpec;
            return this;
        }

        /**
         * resourcePlan.
         */
        public Builder resourcePlan(String resourcePlan) {
            this.resourcePlan = resourcePlan;
            return this;
        }

        public ExpertResourceSetting build() {
            return new ExpertResourceSetting(this);
        } 

    } 

}
