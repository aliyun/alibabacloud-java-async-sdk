// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link SLSTriggerLogConfig} extends {@link TeaModel}
 *
 * <p>SLSTriggerLogConfig</p>
 */
public class SLSTriggerLogConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private SLSTriggerLogConfig(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSTriggerLogConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(SLSTriggerLogConfig model) {
            this.logstore = model.logstore;
            this.project = model.project;
        } 

        /**
         * <p>The name of the Logstore. Exceptions and function execution statistics during function triggering are recorded in the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-logstore-name</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>The name of the project. Exceptions that occur during function triggering and execution statistics are recorded in the Logstore under the project.</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-project-name</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        public SLSTriggerLogConfig build() {
            return new SLSTriggerLogConfig(this);
        } 

    } 

}
