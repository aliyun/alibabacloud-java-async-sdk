// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckControlPlaneLogEnableResponseBody} extends {@link TeaModel}
 *
 * <p>CheckControlPlaneLogEnableResponseBody</p>
 */
public class CheckControlPlaneLogEnableResponseBody extends TeaModel {
    @NameInMap("aliuid")
    private String aliuid;

    @NameInMap("components")
    @Validation(required = true)
    private java.util.List < String > components;

    @NameInMap("log_project")
    private String logProject;

    @NameInMap("log_ttl")
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
         * aliuid.
         */
        public Builder aliuid(String aliuid) {
            this.aliuid = aliuid;
            return this;
        }

        /**
         * components.
         */
        public Builder components(java.util.List < String > components) {
            this.components = components;
            return this;
        }

        /**
         * log_project.
         */
        public Builder logProject(String logProject) {
            this.logProject = logProject;
            return this;
        }

        /**
         * log_ttl.
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
