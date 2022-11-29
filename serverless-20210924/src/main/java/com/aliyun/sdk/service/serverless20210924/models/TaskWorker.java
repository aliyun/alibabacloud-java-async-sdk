// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskWorker} extends {@link TeaModel}
 *
 * <p>TaskWorker</p>
 */
public class TaskWorker extends TeaModel {
    @NameInMap("presetWorker")
    private String presetWorker;

    private TaskWorker(Builder builder) {
        this.presetWorker = builder.presetWorker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskWorker create() {
        return builder().build();
    }

    /**
     * @return presetWorker
     */
    public String getPresetWorker() {
        return this.presetWorker;
    }

    public static final class Builder {
        private String presetWorker; 

        /**
         * System preset worker. It will execute hardcoded logic.
         */
        public Builder presetWorker(String presetWorker) {
            this.presetWorker = presetWorker;
            return this;
        }

        public TaskWorker build() {
            return new TaskWorker(this);
        } 

    } 

}
