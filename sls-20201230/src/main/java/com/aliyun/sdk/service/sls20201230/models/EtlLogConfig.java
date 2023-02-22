// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EtlLogConfig} extends {@link TeaModel}
 *
 * <p>EtlLogConfig</p>
 */
public class EtlLogConfig extends TeaModel {
    @NameInMap("endpoint")
    @Validation(required = true)
    private String endpoint;

    @NameInMap("logstoreName")
    @Validation(required = true)
    private String logstoreName;

    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    private EtlLogConfig(Builder builder) {
        this.endpoint = builder.endpoint;
        this.logstoreName = builder.logstoreName;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EtlLogConfig create() {
        return builder().build();
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return logstoreName
     */
    public String getLogstoreName() {
        return this.logstoreName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder {
        private String endpoint; 
        private String logstoreName; 
        private String projectName; 

        /**
         * endpoint
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * logstore名称
         */
        public Builder logstoreName(String logstoreName) {
            this.logstoreName = logstoreName;
            return this;
        }

        /**
         * 项目名称
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        public EtlLogConfig build() {
            return new EtlLogConfig(this);
        } 

    } 

}
