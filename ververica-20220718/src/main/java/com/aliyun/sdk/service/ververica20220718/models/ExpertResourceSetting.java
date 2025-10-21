// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
 * {@link ExpertResourceSetting} extends {@link TeaModel}
 *
 * <p>ExpertResourceSetting</p>
 */
public class ExpertResourceSetting extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("jobmanagerResourceSettingSpec")
    private BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    @com.aliyun.core.annotation.NameInMap("resourcePlan")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ExpertResourceSetting model) {
            this.jobmanagerResourceSettingSpec = model.jobmanagerResourceSettingSpec;
            this.resourcePlan = model.resourcePlan;
        } 

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
