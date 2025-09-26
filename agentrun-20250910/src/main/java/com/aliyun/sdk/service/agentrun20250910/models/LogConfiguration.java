// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link LogConfiguration} extends {@link TeaModel}
 *
 * <p>LogConfiguration</p>
 */
public class LogConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private LogConfiguration(Builder builder) {
        this.logstore = builder.logstore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogConfiguration create() {
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

        private Builder(LogConfiguration model) {
            this.logstore = model.logstore;
            this.project = model.project;
        } 

        /**
         * <p>SLS日志库名称</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>SLS项目名称</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        public LogConfiguration build() {
            return new LogConfiguration(this);
        } 

    } 

}
