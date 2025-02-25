// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobLogConfig} extends {@link TeaModel}
 *
 * <p>JobLogConfig</p>
 */
public class JobLogConfig extends TeaModel {
    @NameInMap("logstore")
    private String logstore;

    @NameInMap("project")
    private String project;

    private JobLogConfig(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobLogConfig create() {
        return builder().build();
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder {
        private String logstore; 
        private String project; 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * project.
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        public JobLogConfig build() {
            return new JobLogConfig(this);
        } 

    } 

}
