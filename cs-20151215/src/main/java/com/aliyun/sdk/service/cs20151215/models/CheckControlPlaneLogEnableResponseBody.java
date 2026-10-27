// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CheckControlPlaneLogEnableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckControlPlaneLogEnableResponseBody</p>
 */
public class CheckControlPlaneLogEnableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliuid")
    private String aliuid;

    @com.aliyun.core.annotation.NameInMap("components")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> components;

    @com.aliyun.core.annotation.NameInMap("log_project")
    private String logProject;

    @com.aliyun.core.annotation.NameInMap("log_ttl")
    private String logTtl;

    private CheckControlPlaneLogEnableResponseBody(Builder builder) {
        this.aliuid = builder.aliuid;
        this.components = builder.components;
        this.logProject = builder.logProject;
        this.logTtl = builder.logTtl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckControlPlaneLogEnableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliuid
     */
    public String getAliuid() {
        return this.aliuid;
    }

    /**
     * @return components
     */
    public java.util.List<String> getComponents() {
        return this.components;
    }

    /**
     * @return logProject
     */
    public String getLogProject() {
        return this.logProject;
    }

    /**
     * @return logTtl
     */
    public String getLogTtl() {
        return this.logTtl;
    }

    public static final class Builder {
        private String aliuid; 
        private java.util.List<String> components; 
        private String logProject; 
        private String logTtl; 

        private Builder() {
        } 

        private Builder(CheckControlPlaneLogEnableResponseBody model) {
            this.aliuid = model.aliuid;
            this.components = model.components;
            this.logProject = model.logProject;
            this.logTtl = model.logTtl;
        } 

        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>162981*****</p>
         */
        public Builder aliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }

        /**
         * <p>The list of components for which control plane logging is currently enabled.</p>
         * <p>This parameter is required.</p>
         */
        public Builder components(java.util.List<String> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The name of the SLS project where control plane component logs are stored.</p>
         * <p>Default value: k8s-log-$ClusterId.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-log-c5b5e80b0b64a4bf6939d2d8fbbc5****</p>
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * <p>The retention period of logs in the SLS Logstore. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder logTtl(String logTtl) {
            this.logTtl = logTtl;
            return this;
        }

        public CheckControlPlaneLogEnableResponseBody build() {
            return new CheckControlPlaneLogEnableResponseBody(this);
        } 

    } 

}
