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
 * {@link SLSLogDestination} extends {@link TeaModel}
 *
 * <p>SLSLogDestination</p>
 */
public class SLSLogDestination extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logStore")
    private String logStore;

    @com.aliyun.core.annotation.NameInMap("project")
    private String project;

    private SLSLogDestination(Builder builder) {
        this.logStore = builder.logStore;
        this.project = builder.project;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SLSLogDestination create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return logStore
     */
    public String getLogStore() {
        return this.logStore;
    }

    /**
     * @return project
     */
    public String getProject() {
        return this.project;
    }

    public static final class Builder {
        private String logStore; 
        private String project; 

        private Builder() {
        } 

        private Builder(SLSLogDestination model) {
            this.logStore = model.logStore;
            this.project = model.project;
        } 

        /**
         * <p>SLS日志库名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-logstore</p>
         */
        public Builder logStore(String logStore) {
            this.logStore = logStore;
            return this;
        }

        /**
         * <p>SLS项目名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-sls-project</p>
         */
        public Builder project(String project) {
            this.project = project;
            return this;
        }

        public SLSLogDestination build() {
            return new SLSLogDestination(this);
        } 

    } 

}
