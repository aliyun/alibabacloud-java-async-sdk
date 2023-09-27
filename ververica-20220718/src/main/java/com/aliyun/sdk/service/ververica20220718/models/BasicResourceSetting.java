// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BasicResourceSetting} extends {@link TeaModel}
 *
 * <p>BasicResourceSetting</p>
 */
public class BasicResourceSetting extends TeaModel {
    @NameInMap("jobmanagerResourceSettingSpec")
    private BasicResourceSettingSpec jobmanagerResourceSettingSpec;

    @NameInMap("parallelism")
    private Long parallelism;

    @NameInMap("taskmanagerResourceSettingSpec")
    private BasicResourceSettingSpec taskmanagerResourceSettingSpec;

    private BasicResourceSetting(Builder builder) {
        this.jobmanagerResourceSettingSpec = builder.jobmanagerResourceSettingSpec;
        this.parallelism = builder.parallelism;
        this.taskmanagerResourceSettingSpec = builder.taskmanagerResourceSettingSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BasicResourceSetting create() {
        return builder().build();
    }

    /**
     * @return jobmanagerResourceSettingSpec
     */
    public BasicResourceSettingSpec getJobmanagerResourceSettingSpec() {
        return this.jobmanagerResourceSettingSpec;
    }

    /**
     * @return parallelism
     */
    public Long getParallelism() {
        return this.parallelism;
    }

    /**
     * @return taskmanagerResourceSettingSpec
     */
    public BasicResourceSettingSpec getTaskmanagerResourceSettingSpec() {
        return this.taskmanagerResourceSettingSpec;
    }

    public static final class Builder {
        private BasicResourceSettingSpec jobmanagerResourceSettingSpec; 
        private Long parallelism; 
        private BasicResourceSettingSpec taskmanagerResourceSettingSpec; 

        /**
         * jobmanagerResourceSettingSpec.
         */
        public Builder jobmanagerResourceSettingSpec(BasicResourceSettingSpec jobmanagerResourceSettingSpec) {
            this.jobmanagerResourceSettingSpec = jobmanagerResourceSettingSpec;
            return this;
        }

        /**
         * parallelism.
         */
        public Builder parallelism(Long parallelism) {
            this.parallelism = parallelism;
            return this;
        }

        /**
         * taskmanagerResourceSettingSpec.
         */
        public Builder taskmanagerResourceSettingSpec(BasicResourceSettingSpec taskmanagerResourceSettingSpec) {
            this.taskmanagerResourceSettingSpec = taskmanagerResourceSettingSpec;
            return this;
        }

        public BasicResourceSetting build() {
            return new BasicResourceSetting(this);
        } 

    } 

}
