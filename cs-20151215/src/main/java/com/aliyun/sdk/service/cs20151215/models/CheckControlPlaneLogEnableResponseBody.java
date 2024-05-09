// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckControlPlaneLogEnableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckControlPlaneLogEnableResponseBody</p>
 */
public class CheckControlPlaneLogEnableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("aliuid")
    private String aliuid;

    @com.aliyun.core.annotation.NameInMap("components")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > components;

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

    /**
     * @return aliuid
     */
    public String getAliuid() {
        return this.aliuid;
    }

    /**
     * @return components
     */
    public java.util.List < String > getComponents() {
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
        private java.util.List < String > components; 
        private String logProject; 
        private String logTtl; 

        /**
         * The ID of the Alibaba Cloud account to which the resource belongs.
         */
        public Builder aliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }

        /**
         * The control plane components for which log collection is enabled.
         */
        public Builder components(java.util.List < String > components) {
            this.components = components;
            return this;
        }

        /**
         * The name of the Simple Log Service project that you want to use to store the logs of control plane components.
         * <p>
         * 
         * Default value: k8s-log-$Cluster ID.
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * The retention period of the log data stored in the Logstore. Valid values: 1 to 3000. Unit: days.
         * <p>
         * 
         * Default value: 30.
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
